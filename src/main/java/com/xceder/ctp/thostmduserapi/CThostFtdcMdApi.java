package com.xceder.ctp.thostmduserapi;

import com.xceder.ctp.thostftdcuserapistruct.CThostFtdcReqUserLoginField;
import com.xceder.ctp.thostftdcuserapistruct.CThostFtdcUserLogoutField;
import org.bridj.Pointer;
import org.bridj.ann.*;
import org.bridj.cpp.CPPObject;

@Library("thostmduserapi")
public class CThostFtdcMdApi extends CPPObject {
    public CThostFtdcMdApi() {
    }

    public static native Pointer<CThostFtdcMdApi> CreateFtdcMdApi(Pointer<Byte> var0, boolean var1);

    public static native Pointer<CThostFtdcMdApi> CreateFtdcMdApi();

    @Virtual(0)
    public native void Release();

    @Virtual(1)
    public native void Init();

    @Virtual(2)
    public native int Join();

    @Virtual(3)
    public Pointer<Byte> GetTradingDay() {
        return Pointer.pointerToAddress(this.GetTradingDay$2(), Byte.class);
    }

    @Ptr
    @Name("GetTradingDay")
    @Virtual(3)
    protected native long GetTradingDay$2();

    @Virtual(4)
    public void RegisterFront(Pointer<Byte> pszFrontAddress) {
        this.RegisterFront(Pointer.getPeer(pszFrontAddress));
    }

    @Virtual(4)
    protected native void RegisterFront(@Ptr long var1);

    @Virtual(5)
    public void RegisterNameServer(Pointer<Byte> pszNsAddress) {
        this.RegisterNameServer(Pointer.getPeer(pszNsAddress));
    }

    @Virtual(5)
    protected native void RegisterNameServer(@Ptr long var1);

    @Virtual(6)
    public void RegisterSpi(Pointer<CThostFtdcMdSpi> pSpi) {
        this.RegisterSpi(Pointer.getPeer(pSpi));
    }

    @Virtual(6)
    protected native void RegisterSpi(@Ptr long var1);

    @Virtual(7)
    public int SubscribeMarketData(Pointer<Pointer<Byte>> ppInstrumentID, int nCount) {
        return this.SubscribeMarketData(Pointer.getPeer(ppInstrumentID), nCount);
    }

    @Virtual(7)
    protected native int SubscribeMarketData(@Ptr long var1, int var3);

    @Virtual(8)
    public int UnSubscribeMarketData(Pointer<Pointer<Byte>> ppInstrumentID, int nCount) {
        return this.UnSubscribeMarketData(Pointer.getPeer(ppInstrumentID), nCount);
    }

    @Virtual(8)
    protected native int UnSubscribeMarketData(@Ptr long var1, int var3);

    @Virtual(9)
    public int ReqUserLogin(Pointer<CThostFtdcReqUserLoginField> pReqUserLoginField, int nRequestID) {
        return this.ReqUserLogin(Pointer.getPeer(pReqUserLoginField), nRequestID);
    }

    @Virtual(9)
    protected native int ReqUserLogin(@Ptr long var1, int var3);

    @Virtual(10)
    public int ReqUserLogout(Pointer<CThostFtdcUserLogoutField> pUserLogout, int nRequestID) {
        return this.ReqUserLogout(Pointer.getPeer(pUserLogout), nRequestID);
    }

    @Virtual(10)
    protected native int ReqUserLogout(@Ptr long var1, int var3);

    protected CThostFtdcMdApi(Pointer pointer) {
        super(pointer);
    }
}
