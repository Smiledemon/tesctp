package com.xceder.jctp.trader;

import com.xceder.ctp.thostftdcuserapidatatype.ThostFtdcUserApiDataTypeLibrary;
import com.xceder.ctp.thostftdcuserapistruct.*;
import com.xceder.ctp.thosttraderapi.CThostFtdcTraderApi;
import com.xceder.ctp.thosttraderapi.CThostFtdcTraderSpi;
import com.xceder.jctp.util.JCTPLibraryUtil;
import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;

public class JCTPTraderApi {
    CThostFtdcTraderApi traderApi;

    static {
        JCTPLibraryUtil.initLibrary();
        BridJ.register(CThostFtdcTraderApi.class);
    }

    public JCTPTraderApi(CThostFtdcTraderApi traderApi) {
        this.traderApi = traderApi;
    }

    public static JCTPTraderApi createFtdcTraderApi() {
        return createFtdcTraderApi("");
    }

    public static JCTPTraderApi createFtdcTraderApi(String pszFlowPath) {
        Pointer<CThostFtdcTraderApi> traderApiPtr = CThostFtdcTraderApi.CreateFtdcTraderApi(Pointer.pointerToCString(pszFlowPath), false);
        CThostFtdcTraderApi cThostFtdcTraderApi = (CThostFtdcTraderApi)traderApiPtr.get();
        return new JCTPTraderApi(cThostFtdcTraderApi);
    }

    public void release() {
        this.traderApi.Release();
    }

    public void init() {
        this.traderApi.Init();
    }

    public int join() {
        return this.traderApi.Join();
    }

    public String getTradingDay() {
        Pointer<Byte> tradingDay = this.traderApi.GetTradingDay();
        return tradingDay.getCString();
    }

    public void registerFront(String pszFrontAddress) {
        this.traderApi.RegisterFront(Pointer.pointerToCString(pszFrontAddress));
    }

    public void registerNameServer(String pszNsAddress) {
        this.traderApi.RegisterNameServer(Pointer.pointerToCString(pszNsAddress));
    }

    public void registerSpi(JCTPTraderSpi pSpi) {
        CThostFtdcTraderSpi spiAdapter = new JCTPTraderSpiAdapter(pSpi);
        this.traderApi.RegisterSpi(Pointer.pointerTo(spiAdapter));
    }

    public void subscribePrivateTopic(IntValuedEnum<ThostFtdcUserApiDataTypeLibrary.THOST_TE_RESUME_TYPE> nResumeType) {
        this.traderApi.SubscribePrivateTopic(nResumeType);
    }

    public void subscribePublicTopic(IntValuedEnum<ThostFtdcUserApiDataTypeLibrary.THOST_TE_RESUME_TYPE> nResumeType) {
        this.traderApi.SubscribePublicTopic(nResumeType);
    }

    public int reqAuthenticate(CThostFtdcReqAuthenticateField pReqAuthenticateField, int nRequestID) {
        return this.traderApi.ReqAuthenticate(Pointer.pointerTo(pReqAuthenticateField), nRequestID);
    }

    public int reqUserLogin(CThostFtdcReqUserLoginField pReqUserLoginField, int nRequestID) {
        return this.traderApi.ReqUserLogin(Pointer.pointerTo(pReqUserLoginField), nRequestID);
    }

    public int reqUserLogout(CThostFtdcUserLogoutField pUserLogout, int nRequestID) {
        return this.traderApi.ReqUserLogout(Pointer.pointerTo(pUserLogout), nRequestID);
    }

    public int reqUserPasswordUpdate(CThostFtdcUserPasswordUpdateField pUserPasswordUpdate, int nRequestID) {
        return this.traderApi.ReqUserPasswordUpdate(Pointer.pointerTo(pUserPasswordUpdate), nRequestID);
    }

    public int reqTradingAccountPasswordUpdate(CThostFtdcTradingAccountPasswordUpdateField pTradingAccountPasswordUpdate, int nRequestID) {
        return this.traderApi.ReqTradingAccountPasswordUpdate(Pointer.pointerTo(pTradingAccountPasswordUpdate), nRequestID);
    }

    public int reqOrderInsert(CThostFtdcInputOrderField pInputOrder, int nRequestID) {
        return this.traderApi.ReqOrderInsert(Pointer.pointerTo(pInputOrder), nRequestID);
    }

    public int reqParkedOrderInsert(CThostFtdcParkedOrderField pParkedOrder, int nRequestID) {
        return this.traderApi.ReqParkedOrderInsert(Pointer.pointerTo(pParkedOrder), nRequestID);
    }

    public int reqParkedOrderAction(CThostFtdcParkedOrderActionField pParkedOrderAction, int nRequestID) {
        return this.traderApi.ReqParkedOrderAction(Pointer.pointerTo(pParkedOrderAction), nRequestID);
    }

    public int reqOrderAction(CThostFtdcInputOrderActionField pInputOrderAction, int nRequestID) {
        return this.traderApi.ReqOrderAction(Pointer.pointerTo(pInputOrderAction), nRequestID);
    }

    public int reqQueryMaxOrderVolume(CThostFtdcQueryMaxOrderVolumeField pQueryMaxOrderVolume, int nRequestID) {
        return this.traderApi.ReqQueryMaxOrderVolume(Pointer.pointerTo(pQueryMaxOrderVolume), nRequestID);
    }

    public int reqSettlementInfoConfirm(CThostFtdcSettlementInfoConfirmField pSettlementInfoConfirm, int nRequestID) {
        return this.traderApi.ReqSettlementInfoConfirm(Pointer.pointerTo(pSettlementInfoConfirm), nRequestID);
    }

    public int reqRemoveParkedOrder(CThostFtdcRemoveParkedOrderField pRemoveParkedOrder, int nRequestID) {
        return this.traderApi.ReqRemoveParkedOrder(Pointer.pointerTo(pRemoveParkedOrder), nRequestID);
    }

    public int reqRemoveParkedOrderAction(CThostFtdcRemoveParkedOrderActionField pRemoveParkedOrderAction, int nRequestID) {
        return this.traderApi.ReqRemoveParkedOrderAction(Pointer.pointerTo(pRemoveParkedOrderAction), nRequestID);
    }

    public int reqQryOrder(CThostFtdcQryOrderField pQryOrder, int nRequestID) {
        return this.traderApi.ReqQryOrder(Pointer.pointerTo(pQryOrder), nRequestID);
    }

    public int reqQryTrade(CThostFtdcQryTradeField pQryTrade, int nRequestID) {
        return this.traderApi.ReqQryTrade(Pointer.pointerTo(pQryTrade), nRequestID);
    }

    public int reqQryInvestorPosition(CThostFtdcQryInvestorPositionField pQryInvestorPosition, int nRequestID) {
        return this.traderApi.ReqQryInvestorPosition(Pointer.pointerTo(pQryInvestorPosition), nRequestID);
    }

    public int reqQryTradingAccount(CThostFtdcQryTradingAccountField pQryTradingAccount, int nRequestID) {
        return this.traderApi.ReqQryTradingAccount(Pointer.pointerTo(pQryTradingAccount), nRequestID);
    }

    public int reqQryInvestor(CThostFtdcQryInvestorField pQryInvestor, int nRequestID) {
        return this.traderApi.ReqQryInvestor(Pointer.pointerTo(pQryInvestor), nRequestID);
    }

    public int reqQryTradingCode(CThostFtdcQryTradingCodeField pQryTradingCode, int nRequestID) {
        return this.traderApi.ReqQryTradingCode(Pointer.pointerTo(pQryTradingCode), nRequestID);
    }

    public int reqQryInstrumentMarginRate(CThostFtdcQryInstrumentMarginRateField pQryInstrumentMarginRate, int nRequestID) {
        return this.traderApi.ReqQryInstrumentMarginRate(Pointer.pointerTo(pQryInstrumentMarginRate), nRequestID);
    }

    public int reqQryInstrumentCommissionRate(CThostFtdcQryInstrumentCommissionRateField pQryInstrumentCommissionRate, int nRequestID) {
        return this.traderApi.ReqQryInstrumentCommissionRate(Pointer.pointerTo(pQryInstrumentCommissionRate), nRequestID);
    }

    public int reqQryExchange(CThostFtdcQryExchangeField pQryExchange, int nRequestID) {
        return this.traderApi.ReqQryExchange(Pointer.pointerTo(pQryExchange), nRequestID);
    }

    public int reqQryInstrument(CThostFtdcQryInstrumentField pQryInstrument, int nRequestID) {
        return this.traderApi.ReqQryInstrument(Pointer.pointerTo(pQryInstrument), nRequestID);
    }

    public int reqQryDepthMarketData(CThostFtdcQryDepthMarketDataField pQryDepthMarketData, int nRequestID) {
        return this.traderApi.ReqQryDepthMarketData(Pointer.pointerTo(pQryDepthMarketData), nRequestID);
    }

    public int reqQrySettlementInfo(CThostFtdcQrySettlementInfoField pQrySettlementInfo, int nRequestID) {
        return this.traderApi.ReqQrySettlementInfo(Pointer.pointerTo(pQrySettlementInfo), nRequestID);
    }

    public int reqQryTransferBank(CThostFtdcQryTransferBankField pQryTransferBank, int nRequestID) {
        return this.traderApi.ReqQryTransferBank(Pointer.pointerTo(pQryTransferBank), nRequestID);
    }

    public int reqQryInvestorPositionDetail(CThostFtdcQryInvestorPositionDetailField pQryInvestorPositionDetail, int nRequestID) {
        return this.traderApi.ReqQryInvestorPositionDetail(Pointer.pointerTo(pQryInvestorPositionDetail), nRequestID);
    }

    public int reqQryNotice(CThostFtdcQryNoticeField pQryNotice, int nRequestID) {
        return this.traderApi.ReqQryNotice(Pointer.pointerTo(pQryNotice), nRequestID);
    }

    public int reqQrySettlementInfoConfirm(CThostFtdcQrySettlementInfoConfirmField pQrySettlementInfoConfirm, int nRequestID) {
        return this.traderApi.ReqQrySettlementInfoConfirm(Pointer.pointerTo(pQrySettlementInfoConfirm), nRequestID);
    }

    public int reqQryInvestorPositionCombineDetail(CThostFtdcQryInvestorPositionCombineDetailField pQryInvestorPositionCombineDetail, int nRequestID) {
        return this.traderApi.ReqQryInvestorPositionCombineDetail(Pointer.pointerTo(pQryInvestorPositionCombineDetail), nRequestID);
    }

    public int reqQryCFMMCTradingAccountKey(CThostFtdcQryCFMMCTradingAccountKeyField pQryCFMMCTradingAccountKey, int nRequestID) {
        return this.traderApi.ReqQryCFMMCTradingAccountKey(Pointer.pointerTo(pQryCFMMCTradingAccountKey), nRequestID);
    }

    public int reqQryEWarrantOffset(CThostFtdcQryEWarrantOffsetField pQryEWarrantOffset, int nRequestID) {
        return this.traderApi.ReqQryEWarrantOffset(Pointer.pointerTo(pQryEWarrantOffset), nRequestID);
    }

    public int reqQryTransferSerial(CThostFtdcQryTransferSerialField pQryTransferSerial, int nRequestID) {
        return this.traderApi.ReqQryTransferSerial(Pointer.pointerTo(pQryTransferSerial), nRequestID);
    }

    public int reqQryAccountregister(CThostFtdcQryAccountregisterField pQryAccountregister, int nRequestID) {
        return this.traderApi.ReqQryAccountregister(Pointer.pointerTo(pQryAccountregister), nRequestID);
    }

    public int reqQryContractBank(CThostFtdcQryContractBankField pQryContractBank, int nRequestID) {
        return this.traderApi.ReqQryContractBank(Pointer.pointerTo(pQryContractBank), nRequestID);
    }

    public int reqQryParkedOrder(CThostFtdcQryParkedOrderField pQryParkedOrder, int nRequestID) {
        return this.traderApi.ReqQryParkedOrder(Pointer.pointerTo(pQryParkedOrder), nRequestID);
    }

    public int reqQryParkedOrderAction(CThostFtdcQryParkedOrderActionField pQryParkedOrderAction, int nRequestID) {
        return this.traderApi.ReqQryParkedOrderAction(Pointer.pointerTo(pQryParkedOrderAction), nRequestID);
    }

    public int reqQryTradingNotice(CThostFtdcQryTradingNoticeField pQryTradingNotice, int nRequestID) {
        return this.traderApi.ReqQryTradingNotice(Pointer.pointerTo(pQryTradingNotice), nRequestID);
    }

    public int reqQryBrokerTradingParams(CThostFtdcQryBrokerTradingParamsField pQryBrokerTradingParams, int nRequestID) {
        return this.traderApi.ReqQryBrokerTradingParams(Pointer.pointerTo(pQryBrokerTradingParams), nRequestID);
    }

    public int reqQryBrokerTradingAlgos(CThostFtdcQryBrokerTradingAlgosField pQryBrokerTradingAlgos, int nRequestID) {
        return this.traderApi.ReqQryBrokerTradingAlgos(Pointer.pointerTo(pQryBrokerTradingAlgos), nRequestID);
    }

    public int reqFromBankToFutureByFuture(CThostFtdcReqTransferField pReqTransfer, int nRequestID) {
        return this.traderApi.ReqFromBankToFutureByFuture(Pointer.pointerTo(pReqTransfer), nRequestID);
    }

    public int reqFromFutureToBankByFuture(CThostFtdcReqTransferField pReqTransfer, int nRequestID) {
        return this.traderApi.ReqFromFutureToBankByFuture(Pointer.pointerTo(pReqTransfer), nRequestID);
    }

    public int reqQueryBankAccountMoneyByFuture(CThostFtdcReqQueryAccountField pReqQueryAccount, int nRequestID) {
        return this.traderApi.ReqQueryBankAccountMoneyByFuture(Pointer.pointerTo(pReqQueryAccount), nRequestID);
    }
}