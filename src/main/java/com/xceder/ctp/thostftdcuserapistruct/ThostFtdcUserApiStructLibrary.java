package com.xceder.ctp.thostftdcuserapistruct;

import org.bridj.BridJ;
import org.bridj.CRuntime;
import org.bridj.ann.Runtime;

@Runtime(CRuntime.class)
public class ThostFtdcUserApiStructLibrary {
    static {
        BridJ.register();
    }

    public ThostFtdcUserApiStructLibrary() {
    }
}