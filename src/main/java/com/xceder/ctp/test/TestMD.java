package com.xceder.ctp.test;


import com.xceder.ctp.api.market.CThostFtdcMdApi;
import com.xceder.ctp.api.market.CThostFtdcMdSpi;
import com.xceder.ctp.api.trade.CThostFtdcTraderApi;
import com.xceder.ctp.api.trade.CThostFtdcTraderSpi;
import org.bridj.BridJ;
import org.bridj.Pointer;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: xiaopan
 * Date: 2018-02-27
 * Time: 下午4:51
 */
public class TestMD {
    public static void main(String[] args) {
        System.out.println( "Start TestMD------------------------" ) ;

        BridJ.register(CThostFtdcMdApi.class);
        BridJ.register(CThostFtdcTraderApi.class);

        Pointer<CThostFtdcMdApi> PointerThostFtdcMdApi = CThostFtdcMdApi.CreateFtdcMdApi( Pointer.pointerToCString( "" ) , false,true) ;
        CThostFtdcMdApi ftdcMdApi = PointerThostFtdcMdApi.get( ) ;

        //  ======================================================================================================================================================
        //  test
        Pointer<CThostFtdcTraderApi> PointerThostFtdcTraderApi = CThostFtdcTraderApi.CreateFtdcTraderApi( Pointer.pointerToCString( "" )) ;
        CThostFtdcTraderApi ftdcTraderApi = PointerThostFtdcTraderApi.get( )     ;

        /**
         * 如果不加入这段代码，会导致 BridJ类中的public static synchronized Object getJavaObjectFromNativePeer(long peer) {
         * 获取不到strongNativeObjects的对应对象。
         */
        BridJ.protectFromGC( ftdcTraderApi ) ;
        CThostFtdcTraderSpi tradeSpi = new TestTradeSpi( ftdcTraderApi ) ;

        /*
         * 如果不加入这段代码，会导致 BridJ类中的public static synchronized Object getJavaObjectFromNativePeer(long peer) {
         * 获取不到strongNativeObjects的对应对象。
         */
        BridJ.protectFromGC( tradeSpi ) ;
        ftdcTraderApi.RegisterSpi( Pointer.pointerTo( tradeSpi ) ) ;

        ftdcTraderApi.RegisterFront( Pointer.pointerToCString( "tcp://222.66.235.70:61205" ) );
        ftdcTraderApi.Init();
        //  =======================================================================================================================================================


        /**
         * 如果不加入这段代码，会导致 BridJ类中的public static synchronized Object getJavaObjectFromNativePeer(long peer) {
         * 获取不到strongNativeObjects的对应对象。
         */
        BridJ.protectFromGC( ftdcMdApi ) ;

        CThostFtdcMdSpi mdSpi = new TestMdSpi(ftdcMdApi ) ;

        /**
         * 如果不加入这段代码，会导致 iridJ类中的public static synchronized Object getJavaObjectFromNativePeer(long peer) {
         * 获取不到strongNativeObjects的对应对象。
         */
        BridJ.protectFromGC( mdSpi ) ;            

        ftdcMdApi.RegisterSpi( Pointer.pointerTo( mdSpi ) ) ;

        ftdcMdApi.RegisterFront( Pointer.pointerToCString( "tcp://sim-md1.ctp.shcifco.com:31213" ) );
        ftdcMdApi.Init();

        ftdcMdApi.Join( ) ;

        System.out.println( "End TestMD------------------------" ) ;
    }
}
