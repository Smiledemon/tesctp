package com.xceder.ctp.test;

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
 * Time: 下午5:03
 */
public class TestTrade {
    public static void main( String[] args )
    {
        System.out.println( "Start TestTrade------------------------" ) ;

        BridJ.register(CThostFtdcTraderApi.class);

        Pointer<CThostFtdcTraderApi> PointerThostFtdcTraderApi = CThostFtdcTraderApi.CreateFtdcTraderApi( Pointer.pointerToCString( "" )  ) ;
        CThostFtdcTraderApi ftdcTraderApi = PointerThostFtdcTraderApi.get( ) ;

        /**
         * 如果不加入这段代码，会导致 BridJ类中的public static synchronized Object getJavaObjectFromNativePeer(long peer) {
         * 获取不到strongNativeObjects的对应对象。
         */
        BridJ.protectFromGC( ftdcTraderApi ) ;

        CThostFtdcTraderSpi tradeSpi = new TestTradeSpi( ftdcTraderApi ) ;

        /**
         * 如果不加入这段代码，会导致 BridJ类中的public static synchronized Object getJavaObjectFromNativePeer(long peer) {
         * 获取不到strongNativeObjects的对应对象。
         */
        BridJ.protectFromGC( tradeSpi ) ;

        ftdcTraderApi.RegisterSpi( Pointer.pointerTo( tradeSpi ) ) ;

        ftdcTraderApi.RegisterFront( Pointer.pointerToCString( "tcp://222.66.235.70:61205" ) );
        //ftdcTraderApi.RegisterFront( Pointer.pointerToCString( "tcp://183.129.188.37:41205" ) );              // 中大期货
        //ftdcTraderApi.RegisterFront( Pointer.pointerToCString( "tcp://sim-front1.ctp.shcifco.com:31205" ) );  // 上海中期
        ftdcTraderApi.Init();

        ftdcTraderApi.Join( ) ;

        System.out.println( "End TestTrade------------------------" ) ;
    }
}
