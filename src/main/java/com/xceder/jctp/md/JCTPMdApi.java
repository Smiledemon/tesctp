package com.xceder.jctp.md;

import com.xceder.ctp.thostftdcuserapistruct.CThostFtdcReqUserLoginField;
import com.xceder.ctp.thostftdcuserapistruct.CThostFtdcUserLogoutField;
import com.xceder.ctp.thostmduserapi.CThostFtdcMdApi;
import com.xceder.ctp.thostmduserapi.CThostFtdcMdSpi;
import com.xceder.jctp.util.JCTPLibraryUtil;
import org.bridj.BridJ;
import org.bridj.Pointer;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: xiaopan
 * Date: 2018-03-07
 * Time: 下午2:25
 */
public class JCTPMdApi {
    CThostFtdcMdApi mdApi;

    static {
        JCTPLibraryUtil.initLibrary();
        BridJ.register(CThostFtdcMdApi.class);
    }

    public JCTPMdApi(CThostFtdcMdApi mdApi) {
        this.mdApi = mdApi;
    }

    public static JCTPMdApi createFtdcTraderApi() {
        return createFtdcTraderApi("", false);
    }

    public static JCTPMdApi createFtdcTraderApi(String pszFlowPath, boolean bIsUsingUdp) {
        Pointer<CThostFtdcMdApi> mdApiPtr = CThostFtdcMdApi.CreateFtdcMdApi(Pointer.pointerToCString(pszFlowPath), false);
        CThostFtdcMdApi cThostFtdcMdApi = (CThostFtdcMdApi)mdApiPtr.get();
        return new JCTPMdApi(cThostFtdcMdApi);
    }

    public void Release() {
        this.mdApi.Release();
        JCTPLibraryUtil.release();
    }

    public void Init() {
        this.mdApi.Init();
    }

    public int Join() {
        return this.mdApi.Join();
    }

    public String getTradingDay() {
        Pointer<Byte> tradingDay = this.mdApi.GetTradingDay();
        return tradingDay.getCString();
    }

    public void registerFront(String pszFrontAddress) {
        this.mdApi.RegisterFront(Pointer.pointerToCString(pszFrontAddress));
    }

    public void registerNameServer(String pszNsAddress) {
        this.mdApi.RegisterNameServer(Pointer.pointerToCString(pszNsAddress));
    }

    public void registerSpi(JCTPMdSpi pSpi) {
        CThostFtdcMdSpi mdSpi = new JCTPMdSpiAdapter(pSpi);
        this.mdApi.RegisterSpi(Pointer.pointerTo(mdSpi));
    }

    public int subscribeMarketData(String... ppInstrumentID) {
        return this.mdApi.SubscribeMarketData(Pointer.pointerToCStrings(ppInstrumentID), ppInstrumentID.length);
    }

    public int unSubscribeMarketData(String... ppInstrumentID) {
        return this.mdApi.UnSubscribeMarketData(Pointer.pointerToCStrings(ppInstrumentID), ppInstrumentID.length);
    }

    public int reqUserLogin(CThostFtdcReqUserLoginField pReqUserLoginField, int nRequestID) {
        return this.mdApi.ReqUserLogin(Pointer.pointerTo(pReqUserLoginField), nRequestID);
    }

    public int reqUserLogout(CThostFtdcUserLogoutField pUserLogout, int nRequestID) {
        return this.mdApi.ReqUserLogout(Pointer.pointerTo(pUserLogout), nRequestID);
    }
}
