package com.xceder.ctp.test;


import com.xceder.ctp.api.market.*;
import org.bridj.Pointer;


/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: xiaopan
 * Date: 2018-02-27
 * Time: 下午4:02
 */
public class TestMdSpi extends CThostFtdcMdSpi {
    CThostFtdcMdApi api;

    public TestMdSpi(CThostFtdcMdApi api) {
        this.api = api;
    }

    @Override
    public void OnFrontConnected() {
        System.out.println("连接成功....");
        CThostFtdcReqUserLoginField loginFiel = new CThostFtdcReqUserLoginField();
        this.api.ReqUserLogin(Pointer.<CThostFtdcReqUserLoginField>pointerToArray(loginFiel), 1);
    }

    @Override
    public void OnFrontDisconnected(int nReason) {
        System.out.println("连接失败..." + nReason);
    }

    @Override
    public void OnRspError(Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID, boolean bIsLast) {
        System.out.println("onRspError");
    }

    @Override
    public void OnRspUserLogin(Pointer<CThostFtdcRspUserLoginField> pRspUserLogin, Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID, boolean bIsLast) {
        int nRet = this.api.UnSubscribeMarketData(Pointer.pointerToCStrings("IF1305"),1);
        nRet = this.api.SubscribeMarketData(Pointer.pointerToCStrings("cu1309"),1);

        System.out.println("OnRspUserLogin"+nRet);
    }

    @Override
    public void OnRspUserLogout(Pointer<CThostFtdcUserLogoutField> pUserLogout, Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID, boolean bIsLast) {
        System.out.println("OnRspUserLogout");
    }

    private String ToString_CThostFtdcDepthMarketDataFiel(CThostFtdcDepthMarketDataField data){
       return String.format("%s %s.%03d %f %d %f %d %f %d" ,
               data.InstrumentID().getCString( )  ,
               data.UpdateTime().getCString( ) ,
               data.UpdateMillisec( ) ,
               data.LastPrice( ) ,
               data.Volume( ) ,
               data.AskPrice1( ) ,
               data.AskVolume1( ) ,
               data.BidPrice1( ) ,
               data.BidVolume1( ));
    }
}
