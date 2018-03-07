package com.xceder.demo.CTPImp;


import com.xceder.ctp.thostftdcuserapistruct.*;
import com.xceder.jctp.md.JCTPMdApi;
import com.xceder.jctp.md.JCTPMdSpi;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: xiaopan
 * Date: 2018-03-07
 * Time: 下午1:17
 */
public class MyMdSpi extends JCTPMdSpi {
    private JCTPMdApi mdApi;

    public MyMdSpi(JCTPMdApi mdApi) {
        this.mdApi = mdApi;
    }

    @Override
    public void onFrontConnected() {
        CThostFtdcReqUserLoginField userLoginField = new CThostFtdcReqUserLoginField();
        userLoginField.setBrokerID("9999");
        mdApi.reqUserLogin(userLoginField,112);
    }

    @Override
    public void onRspUserLogin(CThostFtdcRspUserLoginField pRspUserLogin, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
        System.out.println("登录回调");
        System.out.println(mdApi.getTradingDay());

        int subResult=-1;
        subResult=mdApi.subscribeMarketData("IF1303");
        System.out.println(subResult==0?"订阅成功":"订阅失败");
    }

    @Override
    public void onRtnDepthMarketData(CThostFtdcDepthMarketDataField pDepthMarketData) {
        System.out.println(pDepthMarketData.getInstrumentID()+"开盘价:"+pDepthMarketData.getOpenPrice());
    }

    @Override
    public void onRspSubMarketData(CThostFtdcSpecificInstrumentField pSpecificInstrument, CThostFtdcRspInfoField pRspInfo, int nRequestID,
                                   boolean bIsLast) {
        System.out.println("订阅回报:" + bIsLast);
        System.out.println(pRspInfo.getErrorID());
//		System.out.println("InstrumentID:" + pSpecificInstrument.InstrumentID());
    }

    @Override
    public void onHeartBeatWarning(int nTimeLapse) {
    }

    @Override
    public void onFrontDisconnected(int nReason) {
    }

    @Override
    public void onRspError(CThostFtdcRspInfoField pRspInfo, int nRequestID,
                           boolean bIsLast) {
        // TODO Auto-generated method stub
    }

    @Override
    public void onRspUnSubMarketData(
            CThostFtdcSpecificInstrumentField pSpecificInstrument,
            CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
        // TODO Auto-generated method stub
    }

    @Override
    public void onRspUserLogout(CThostFtdcUserLogoutField pUserLogout,
                                CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
        // TODO Auto-generated method stub
    }
}
