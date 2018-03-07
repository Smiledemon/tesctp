package com.xceder.jctp.md;

import com.xceder.ctp.thostftdcuserapistruct.*;


/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: xiaopan
 * Date: 2018-03-07
 * Time: 下午2:26
 */
public class JCTPMdSpi {
    public JCTPMdSpi() {
    }

    public void onFrontConnected() {
    }

    public void onFrontDisconnected(int nReason) {
    }

    public void onHeartBeatWarning(int nTimeLapse) {
    }

    public void onRspUserLogin(CThostFtdcRspUserLoginField pRspUserLogin, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
    }

    public void onRspUserLogout(CThostFtdcUserLogoutField pUserLogout, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
    }

    public void onRspError(CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
    }

    public void onRspSubMarketData(CThostFtdcSpecificInstrumentField pSpecificInstrument, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
    }

    public void onRspUnSubMarketData(CThostFtdcSpecificInstrumentField pSpecificInstrument, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
    }

    public void onRtnDepthMarketData(CThostFtdcDepthMarketDataField pDepthMarketData) {
    }
}