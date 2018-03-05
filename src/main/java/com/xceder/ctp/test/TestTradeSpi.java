package com.xceder.ctp.test;

import com.xceder.ctp.api.trade.*;
import org.bridj.Pointer;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: xiaopan
 * Date: 2018-02-27
 * Time: 下午5:03
 */
public class TestTradeSpi extends CThostFtdcTraderSpi {
    private String m_brokerID = "1026" ;
    private String m_userID = "00000023" ;
    //private String m_brokerID = "1019" ;
    //private String m_userID = "00000080" ;    // 中大期货
    //private String m_brokerID = "1002" ;
    //private String m_userID = "00000063" ;

    private String m_password = "123456" ;
    private String m_testInstrumentID = "IF1306" ;
    private double m_testLimitPrice = 2569.40 ;
    private int m_frontID ;
    private int m_sessionID ;

    private CThostFtdcTraderApi m_api ;

    public TestTradeSpi(CThostFtdcTraderApi m_api) {
        this.m_api = m_api;
    }

    @Override
    public void OnFrontConnected() {

        System.out.println( "TestTradeSpi OnFrontConnected" );

        CThostFtdcReqUserLoginField login = new CThostFtdcReqUserLoginField( ) ;
        login.BrokerID().setCString(this.m_brokerID);
        login.UserID().setCString( this.m_userID );
        login.Password().setCString( this.m_password );

        this.m_api.ReqUserLogin( Pointer.pointerTo( login ) , 1 ) ;
    }

    @Override
    public void OnFrontDisconnected(int nReason) {
        System.out.println( "TestTradeSpi OnFrontDisconnected" );
    }

    @Override
    public void OnRspUserLogin(Pointer<CThostFtdcRspUserLoginField> pRspUserLogin, Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID, boolean bIsLast) {
        System.out.println( "TestTradeSpi OnRspUserLogin" ) ;

        CThostFtdcRspInfoField rspInfo = pRspInfo.get( ) ;
        System.out.println("RspInfo.ErrorID = " + rspInfo.ErrorID() + " ErrorMsg = " + rspInfo.ErrorMsg().getCString()) ;

        CThostFtdcRspUserLoginField rspLogin = pRspUserLogin.get( ) ;

        String msg = String.format( "BrokerID = %s UserID = %s TradingDay = %s FrontID = %d SessionID = %d MaxOrderRef = %s"  ,
                rspLogin.BrokerID( ).getCString( ) ,
                rspLogin.UserID().getCString() ,
                rspLogin.TradingDay().getCString() ,
                rspLogin.FrontID() ,
                rspLogin.SessionID() ,
                rspLogin.MaxOrderRef().getCString( )
        ) ;


        System.out.println( msg ) ;

        this.m_frontID = rspLogin.FrontID( ) ;
        this.m_sessionID = rspLogin.SessionID( ) ;
        CThostFtdcQryTradingAccountField account = new CThostFtdcQryTradingAccountField( ) ;
        account.BrokerID( ).setCString( this.m_brokerID ) ;
        account.InvestorID( ).setCString( this.m_userID ) ;
        int ncoder = this.m_api.ReqQryTradingAccount( Pointer.pointerTo( account ) , 4 ) ;

        try
        {
            Thread.sleep( 1000 ) ;
        }
        catch( Exception e )
        {
            System.out.println( e ) ;
        }
    }

    @Override
    public void OnRspError(Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID, boolean bIsLast) {
        System.out.println( "TestTradeSpi OnRspError" );

        CThostFtdcRspInfoField rspInfo = pRspInfo.get( ) ;
        System.out.println("RspInfo.ErrorID = " + rspInfo.ErrorID() + " ErrorMsg = " + rspInfo.ErrorMsg().getCString()) ;
    }

}
