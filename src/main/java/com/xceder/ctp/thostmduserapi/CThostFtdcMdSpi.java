package com.xceder.ctp.thostmduserapi;

import com.xceder.ctp.thostftdcuserapistruct.*;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Virtual;
import org.bridj.cpp.CPPObject;

@Library("Thostmduserapi")
public class CThostFtdcMdSpi extends CPPObject {
    public CThostFtdcMdSpi() {
    }

    @Virtual(0)
    public void OnFrontConnected() {
    }

    @Virtual(1)
    public native void OnFrontDisconnected(int var1);

    @Virtual(2)
    public native void OnHeartBeatWarning(int var1);

    @Virtual(3)
    public void OnRspUserLogin(Pointer<CThostFtdcRspUserLoginField> pRspUserLogin, Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID, boolean bIsLast) {
    }

    @Virtual(4)
    public void OnRspUserLogout(Pointer<CThostFtdcUserLogoutField> pUserLogout, Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID, boolean bIsLast) {
    }

    @Virtual(5)
    public void OnRspError(Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID, boolean bIsLast) {
    }

    @Virtual(6)
    public void OnRspSubMarketData(Pointer<CThostFtdcSpecificInstrumentField> pSpecificInstrument, Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID, boolean bIsLast) {
    }

    @Virtual(7)
    public void OnRspUnSubMarketData(Pointer<CThostFtdcSpecificInstrumentField> pSpecificInstrument, Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID, boolean bIsLast) {
    }

    @Virtual(8)
    public void OnRtnDepthMarketData(Pointer<CThostFtdcDepthMarketDataField> pDepthMarketData) {
    }

    public CThostFtdcMdSpi(Pointer pointer) {
        super(pointer);
    }
}
