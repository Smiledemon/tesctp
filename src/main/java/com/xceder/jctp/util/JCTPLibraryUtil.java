package com.xceder.jctp.util;

import org.bridj.BridJ;
import org.bridj.Platform;

import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: xiaopan
 * Date: 2018-03-07
 * Time: 下午2:37
 */
public class JCTPLibraryUtil {
    private static final String OS_NAME = System.getProperty("os.name","");
    private static boolean inited;
    private static final String CTP_NAME= "CTP";
    private static final String CTP_LIB_PATH = "" +
            "";
    private static final String[] CTP_LIBS=new String[]{"thosttraderapi","thostmduserapi"};
    private static File extractedLibrariesTempDir;
    private static final int maxTempFileAttempts = 20;
    private static Set<File> temporaryExtractedLibraryCanonicalFiles;

    static {
        try {
            extractedLibrariesTempDir = createTempDir("CTPExtractedLibraries");
        } catch (IOException var1) {
            var1.printStackTrace();
        }

        temporaryExtractedLibraryCanonicalFiles = Collections.synchronizedSet(new LinkedHashSet());
    }

    public JCTPLibraryUtil() {
    }

    public static synchronized void initLibrary() {
        if (!inited) {
            inited = true;
            String[] var3 = CTP_LIBS;
            int var2 = CTP_LIBS.length;

            for(int var1 = 0; var1 < var2; ++var1) {
                String ctpLib = var3[var1];
                boolean loaded = false;
                String lib = null;
                if (!loaded) {
                    String ctpLibFilePath = "com/xceder/ctp/lib/" + ctpLib;
                    if (Platform.isWindows()) {
                        ctpLibFilePath = ctpLibFilePath.concat(".so");
                    } else {
                        Platform.isLinux();
                    }

                    try {
                        File libFile = extractEmbeddedLibraryResource(ctpLibFilePath);
                        if (libFile == null) {
                            throw new FileNotFoundException("Failed to extract embedded library '" + ctpLibFilePath + ")");
                        }

                        System.load(libFile.toString());
                        BridJ.setNativeLibraryFile(ctpLib, libFile);
                        loaded = true;
                    } catch (IOException var8) {
                        BridJ.error("Failed to load 'CTP'", var8);
                    }

                    if (!loaded) {
                        System.loadLibrary(ctpLib);
                    }
                }
            }

        }
    }

    public static synchronized void release() {
        BridJ.releaseAll();
        String[] var3 = CTP_LIBS;
        int var2 = CTP_LIBS.length;

        for(int var1 = 0; var1 < var2; ++var1) {
            String ctpLibName = var3[var1];
            unloadNativeLibs(ctpLibName);
        }

        Iterator var5 = temporaryExtractedLibraryCanonicalFiles.iterator();

        while(var5.hasNext()) {
            File libraryFile = (File)var5.next();
            libraryFile.delete();
        }

    }

    private static File extractEmbeddedLibraryResource(String path) throws IOException {
        byte[] b = new byte[8196];
        InputStream in = Platform.getResourceAsStream(path);
        if (in == null) {
            File f = new File(path);
            if (!f.exists()) {
                f = new File(f.getName());
            }

            if (f.exists()) {
                return f.getCanonicalFile();
            }
        }

        String fileName = (new File(path)).getName();
        File libFile = new File(extractedLibrariesTempDir, fileName);
        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(libFile));

        int len;
        while((len = in.read(b)) > 0) {
            out.write(b, 0, len);
        }

        out.close();
        in.close();
        addTemporaryExtractedLibraryFileToDeleteOnExit(libFile);
        addTemporaryExtractedLibraryFileToDeleteOnExit(libFile.getParentFile());
        return libFile;
    }

    private static File createTempDir(String prefix) throws IOException {
        for(int i = 0; i < 20; ++i) {
            File dir = File.createTempFile(prefix, "");
            if (dir.delete() && dir.mkdirs()) {
                return dir;
            }
        }

        throw new RuntimeException("Failed to create temp dir with prefix '" + prefix + "' despite " + 20 + " attempts!");
    }

    private static void addTemporaryExtractedLibraryFileToDeleteOnExit(File file) throws IOException {
        File canonicalFile = file.getCanonicalFile();
        temporaryExtractedLibraryCanonicalFiles.add(canonicalFile);
        canonicalFile.deleteOnExit();
    }

    public static boolean isInited() {
        return inited;
    }

    private static void unloadNativeLibs(String soName) {
        try {
            ClassLoader classLoader = JCTPLibraryUtil.class.getClassLoader();
            Field field = ClassLoader.class.getDeclaredField("nativeLibraries");
            field.setAccessible(true);
            Vector libs = (Vector)field.get(classLoader);
            Iterator it = libs.iterator();
            if (Platform.isWindows()) {
                soName = soName.concat(".so");
            } else {
                Platform.isLinux();
            }

            while(it.hasNext()) {
                Object o = it.next();
                Field[] fs = o.getClass().getDeclaredFields();
                boolean hasInit = false;

                for(int k = 0; k < fs.length; ++k) {
                    if (fs[k].getName().equals("name")) {
                        fs[k].setAccessible(true);
                        String soPath = fs[k].get(o).toString();
                        if (soPath.endsWith(soName)) {
                            hasInit = true;
                        }
                    }
                }

                if (hasInit) {
                    Method finalize = o.getClass().getDeclaredMethod("finalize");
                    finalize.setAccessible(true);
                    finalize.invoke(o);
                }
            }

        } catch (Exception var10) {
            throw new RuntimeException(var10);
        }
    }
}

