package com.xceder.jctp.md;

import com.xceder.ctp.thostftdcuserapistruct.*;
import com.xceder.ctp.thostmduserapi.CThostFtdcMdSpi;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.ann.Virtual;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: xiaopan
 * Date: 2018-03-07
 * Time: 下午2:26
 */
public final class JCTPMdSpiAdapter extends CThostFtdcMdSpi {
    JCTPMdSpi mdSpi;

    public JCTPMdSpiAdapter(JCTPMdSpi mdSpi) {
        BridJ.protectFromGC(this);
        this.mdSpi = mdSpi;
    }

    @Override
    @Virtual(0)
    public void OnFrontConnected() {
        this.mdSpi.onFrontConnected();
    }

    @Override
    @Virtual(1)
    public void OnFrontDisconnected(int nReason) {
        this.mdSpi.onFrontDisconnected(nReason);
    }

    @Override
    @Virtual(2)
    public void OnHeartBeatWarning(int nTimeLapse) {
        this.mdSpi.onHeartBeatWarning(nTimeLapse);
    }

    @Override
    @Virtual(3)
    public void OnRspUserLogin(Pointer<CThostFtdcRspUserLoginField> pRspUserLogin, Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID, boolean bIsLast) {
        this.mdSpi.onRspUserLogin((CThostFtdcRspUserLoginField)pRspUserLogin.get(), (CThostFtdcRspInfoField)pRspInfo.get(), nRequestID, bIsLast);
    }

    @Override
    @Virtual(4)
    public void OnRspUserLogout(Pointer<CThostFtdcUserLogoutField> pUserLogout, Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID, boolean bIsLast) {
        this.mdSpi.onRspUserLogout((CThostFtdcUserLogoutField)pUserLogout.get(), (CThostFtdcRspInfoField)pRspInfo.get(), nRequestID, bIsLast);
    }

    @Override
    @Virtual(5)
    public void OnRspError(Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID, boolean bIsLast) {
        this.mdSpi.onRspError((CThostFtdcRspInfoField)pRspInfo.get(), nRequestID, bIsLast);
    }

    @Override
    @Virtual(6)
    public void OnRspSubMarketData(Pointer<CThostFtdcSpecificInstrumentField> pSpecificInstrument, Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID, boolean bIsLast) {
        this.mdSpi.onRspSubMarketData((CThostFtdcSpecificInstrumentField)pSpecificInstrument.get(), (CThostFtdcRspInfoField)pRspInfo.get(), nRequestID, bIsLast);
    }

    @Override
    @Virtual(7)
    public void OnRspUnSubMarketData(Pointer<CThostFtdcSpecificInstrumentField> pSpecificInstrument, Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID, boolean bIsLast) {
        this.mdSpi.onRspUnSubMarketData((CThostFtdcSpecificInstrumentField)pSpecificInstrument.get(), (CThostFtdcRspInfoField)pRspInfo.get(), nRequestID, bIsLast);
    }

    @Override
    @Virtual(8)
    public void OnRtnDepthMarketData(Pointer<CThostFtdcDepthMarketDataField> pDepthMarketData) {
        this.mdSpi.onRtnDepthMarketData((CThostFtdcDepthMarketDataField)pDepthMarketData.get());
    }
}
