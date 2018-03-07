package com.xceder.ctp.thostmduserapi;

import org.bridj.BridJ;
import org.bridj.ann.Library;
import org.bridj.ann.Runtime;
import org.bridj.cpp.CPPRuntime;

@Library("src/main/java/com/xceder/ctp/lib/thostmduserapi")
@Runtime(CPPRuntime.class)
public class ThostmduserapiLibrary {
    static {
        BridJ.register();
    }

    public ThostmduserapiLibrary() {
    }
}
