package com.xceder.jctp.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: xiaopan
 * Date: 2018-03-07
 * Time: 下午2:42
 */
public class JCTPUtil {
    public JCTPUtil() {
    }

    public static boolean isAbsolutePath(String path) {
        String regexVal = "[a-z|A-Z]:([\\\\|/]\\w+)+[\\\\|/]\\w*(.\\w*|)";
        Pattern pattern = Pattern.compile(regexVal);
        Matcher matcher = pattern.matcher(path);
        return matcher.find();
    }

    public static boolean isRelativePath(String path) {
        boolean result = true;
        if (path.indexOf("/") == -1 && path.indexOf("\\") == -1) {
            result = false;
        }

        char[] charArray = path.toCharArray();
        if (result && (charArray[0] == '/' || charArray[0] == '\\')) {
            result = false;
        }

        return result;
    }

    public static int count(String sourceStr, String searchStr) {
        int count = 0;
        Pattern pattern = Pattern.compile(searchStr);

        for(Matcher matcher = pattern.matcher(sourceStr); matcher.find(); ++count) {
            ;
        }

        return count;
    }
}

