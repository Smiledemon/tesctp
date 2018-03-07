package com.xceder.demo;


import com.xceder.ctp.thostftdcuserapidatatype.ThostFtdcUserApiDataTypeLibrary;
import com.xceder.demo.CTPImp.MyMdSpi;
import com.xceder.demo.CTPImp.MyTraderSpi;
import com.xceder.demo.bean.UserInfo;
import com.xceder.jctp.md.JCTPMdApi;
import com.xceder.jctp.md.JCTPMdSpi;
import com.xceder.jctp.trader.JCTPTraderApi;
import com.xceder.jctp.trader.JCTPTraderSpi;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: xiaopan
 * Date: 2018-03-07
 * Time: 下午1:12
 */
public class Main {
    private JCTPMdApi mdApi;
    private JCTPMdSpi mdSpi;

    JCTPTraderApi traderApi;
    JCTPTraderSpi traderSpi;

    public void mdTest(){
        mdApi=JCTPMdApi.createFtdcTraderApi();
        mdSpi=new MyMdSpi(mdApi);
        mdApi.registerSpi(mdSpi);
        mdApi.registerFront(UserInfo.MD_FRONTADDR);
        mdApi.Init();
        mdApi.Join();
    }

    public void traderTest(){
        traderApi=JCTPTraderApi.createFtdcTraderApi();
        traderSpi=new MyTraderSpi(traderApi);
        traderApi.registerSpi(traderSpi);
        traderApi.subscribePublicTopic(ThostFtdcUserApiDataTypeLibrary.THOST_TE_RESUME_TYPE.THOST_TERT_RESTART);
        traderApi.subscribePrivateTopic(ThostFtdcUserApiDataTypeLibrary.THOST_TE_RESUME_TYPE.THOST_TERT_RESTART);
        traderApi.registerFront(UserInfo.TRADER_FRONTADDR);

        traderApi.init();
        traderApi.join();
    }

    public static void main(String[] args) {
        Main handle =new Main();

        handle.mdTest();
    }
}
