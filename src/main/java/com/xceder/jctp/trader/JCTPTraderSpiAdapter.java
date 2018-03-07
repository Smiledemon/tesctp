package com.xceder.jctp.trader;

import com.xceder.ctp.thostftdcuserapistruct.*;
import com.xceder.ctp.thosttraderapi.CThostFtdcTraderSpi;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Virtual;

public class JCTPTraderSpiAdapter extends CThostFtdcTraderSpi {
    private JCTPTraderSpi traderSpi;

    public JCTPTraderSpiAdapter(JCTPTraderSpi traderSpi) {
        this.traderSpi = traderSpi;
    }

    @Virtual(0)
    public void OnFrontConnected() {
        this.traderSpi.onFrontConnected();
    }

    @Virtual(1)
    public void OnFrontDisconnected(int nReason) {
        this.traderSpi.onFrontDisconnected(nReason);
    }

    @Virtual(2)
    public void OnHeartBeatWarning(int nTimeLapse) {
        this.traderSpi.onHeartBeatWarning(nTimeLapse);
    }

    @Virtual(3)
    public void OnRspAuthenticate(Pointer<CThostFtdcRspAuthenticateField> pRspAuthenticateField, Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID, boolean bIsLast) {
        this.traderSpi.onRspAuthenticate((CThostFtdcRspAuthenticateField)this.getField(pRspAuthenticateField), (CThostFtdcRspInfoField)this.getField(pRspInfo), nRequestID, bIsLast);
    }

    @Virtual(4)
    public void OnRspUserLogin(Pointer<CThostFtdcRspUserLoginField> pRspUserLogin, Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID, boolean bIsLast) {
        this.traderSpi.onRspUserLogin((CThostFtdcRspUserLoginField)this.getField(pRspUserLogin), (CThostFtdcRspInfoField)this.getField(pRspInfo), nRequestID, bIsLast);
    }

    @Virtual(5)
    public void OnRspUserLogout(Pointer<CThostFtdcUserLogoutField> pUserLogout, Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID, boolean bIsLast) {
        this.traderSpi.onRspUserLogout((CThostFtdcUserLogoutField)this.getField(pUserLogout), (CThostFtdcRspInfoField)this.getField(pRspInfo), nRequestID, bIsLast);
    }

    @Virtual(6)
    public void OnRspUserPasswordUpdate(Pointer<CThostFtdcUserPasswordUpdateField> pUserPasswordUpdate, Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID, boolean bIsLast) {
        this.traderSpi.onRspUserPasswordUpdate((CThostFtdcUserPasswordUpdateField)this.getField(pUserPasswordUpdate), (CThostFtdcRspInfoField)this.getField(pRspInfo), nRequestID, bIsLast);
    }

    @Virtual(7)
    public void OnRspTradingAccountPasswordUpdate(Pointer<CThostFtdcTradingAccountPasswordUpdateField> pTradingAccountPasswordUpdate, Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID, boolean bIsLast) {
        this.traderSpi.onRspTradingAccountPasswordUpdate((CThostFtdcTradingAccountPasswordUpdateField)this.getField(pTradingAccountPasswordUpdate), (CThostFtdcRspInfoField)this.getField(pRspInfo), nRequestID, bIsLast);
    }

    @Virtual(8)
    public void OnRspOrderInsert(Pointer<CThostFtdcInputOrderField> pInputOrder, Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID, boolean bIsLast) {
        this.traderSpi.onRspOrderInsert((CThostFtdcInputOrderField)this.getField(pInputOrder), (CThostFtdcRspInfoField)this.getField(pRspInfo), nRequestID, bIsLast);
    }

    @Virtual(9)
    public void OnRspParkedOrderInsert(Pointer<CThostFtdcParkedOrderField> pParkedOrder, Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID, boolean bIsLast) {
        this.traderSpi.onRspParkedOrderInsert((CThostFtdcParkedOrderField)this.getField(pParkedOrder), (CThostFtdcRspInfoField)this.getField(pRspInfo), nRequestID, bIsLast);
    }

    @Virtual(10)
    public void OnRspParkedOrderAction(Pointer<CThostFtdcParkedOrderActionField> pParkedOrderAction, Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID, boolean bIsLast) {
        this.traderSpi.onRspParkedOrderAction((CThostFtdcParkedOrderActionField)this.getField(pParkedOrderAction), (CThostFtdcRspInfoField)this.getField(pRspInfo), nRequestID, bIsLast);
    }

    @Virtual(11)
    public void OnRspOrderAction(Pointer<CThostFtdcInputOrderActionField> pInputOrderAction, Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID, boolean bIsLast) {
        this.traderSpi.onRspOrderAction((CThostFtdcInputOrderActionField)this.getField(pInputOrderAction), (CThostFtdcRspInfoField)this.getField(pRspInfo), nRequestID, bIsLast);
    }

    @Virtual(12)
    public void OnRspQueryMaxOrderVolume(Pointer<CThostFtdcQueryMaxOrderVolumeField> pQueryMaxOrderVolume, Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID, boolean bIsLast) {
        this.traderSpi.onRspQueryMaxOrderVolume((CThostFtdcQueryMaxOrderVolumeField)this.getField(pQueryMaxOrderVolume), (CThostFtdcRspInfoField)this.getField(pRspInfo), nRequestID, bIsLast);
    }

    @Virtual(13)
    public void OnRspSettlementInfoConfirm(Pointer<CThostFtdcSettlementInfoConfirmField> pSettlementInfoConfirm, Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID, boolean bIsLast) {
        this.traderSpi.onRspSettlementInfoConfirm((CThostFtdcSettlementInfoConfirmField)this.getField(pSettlementInfoConfirm), (CThostFtdcRspInfoField)this.getField(pRspInfo), nRequestID, bIsLast);
    }

    @Virtual(14)
    public void OnRspRemoveParkedOrder(Pointer<CThostFtdcRemoveParkedOrderField> pRemoveParkedOrder, Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID, boolean bIsLast) {
        this.traderSpi.onRspRemoveParkedOrder((CThostFtdcRemoveParkedOrderField)this.getField(pRemoveParkedOrder), (CThostFtdcRspInfoField)this.getField(pRspInfo), nRequestID, bIsLast);
    }

    @Virtual(15)
    public void OnRspRemoveParkedOrderAction(Pointer<CThostFtdcRemoveParkedOrderActionField> pRemoveParkedOrderAction, Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID, boolean bIsLast) {
        this.traderSpi.onRspRemoveParkedOrderAction((CThostFtdcRemoveParkedOrderActionField)this.getField(pRemoveParkedOrderAction), (CThostFtdcRspInfoField)pRspInfo.get(), nRequestID, bIsLast);
    }

    @Virtual(16)
    public void OnRspQryOrder(Pointer<CThostFtdcOrderField> pOrder, Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID, boolean bIsLast) {
        this.traderSpi.onRspQryOrder((CThostFtdcOrderField)this.getField(pOrder), (CThostFtdcRspInfoField)this.getField(pRspInfo), nRequestID, bIsLast);
    }

    @Virtual(17)
    public void OnRspQryTrade(Pointer<CThostFtdcTradeField> pTrade, Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID, boolean bIsLast) {
        this.traderSpi.onRspQryTrade((CThostFtdcTradeField)this.getField(pTrade), (CThostFtdcRspInfoField)this.getField(pRspInfo), nRequestID, bIsLast);
    }

    @Virtual(18)
    public void OnRspQryInvestorPosition(Pointer<CThostFtdcInvestorPositionField> pInvestorPosition, Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID, boolean bIsLast) {
        this.traderSpi.onRspQryInvestorPosition((CThostFtdcInvestorPositionField)this.getField(pInvestorPosition), (CThostFtdcRspInfoField)this.getField(pRspInfo), nRequestID, bIsLast);
    }

    @Virtual(19)
    public void OnRspQryTradingAccount(Pointer<CThostFtdcTradingAccountField> pTradingAccount, Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID, boolean bIsLast) {
        this.traderSpi.onRspQryTradingAccount((CThostFtdcTradingAccountField)this.getField(pTradingAccount), (CThostFtdcRspInfoField)this.getField(pRspInfo), nRequestID, bIsLast);
    }

    @Virtual(20)
    public void OnRspQryInvestor(Pointer<CThostFtdcInvestorField> pInvestor, Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID, boolean bIsLast) {
        this.traderSpi.onRspQryInvestor((CThostFtdcInvestorField)this.getField(pInvestor), (CThostFtdcRspInfoField)this.getField(pRspInfo), nRequestID, bIsLast);
    }

    @Virtual(21)
    public void OnRspQryTradingCode(Pointer<CThostFtdcTradingCodeField> pTradingCode, Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID, boolean bIsLast) {
        this.traderSpi.onRspQryTradingCode((CThostFtdcTradingCodeField)this.getField(pTradingCode), (CThostFtdcRspInfoField)this.getField(pRspInfo), nRequestID, bIsLast);
    }

    @Virtual(22)
    public void OnRspQryInstrumentMarginRate(Pointer<CThostFtdcInstrumentMarginRateField> pInstrumentMarginRate, Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID, boolean bIsLast) {
        this.traderSpi.onRspQryInstrumentMarginRate((CThostFtdcInstrumentMarginRateField)this.getField(pInstrumentMarginRate), (CThostFtdcRspInfoField)this.getField(pRspInfo), nRequestID, bIsLast);
    }

    @Virtual(23)
    public void OnRspQryInstrumentCommissionRate(Pointer<CThostFtdcInstrumentCommissionRateField> pInstrumentCommissionRate, Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID, boolean bIsLast) {
        this.traderSpi.onRspQryInstrumentCommissionRate((CThostFtdcInstrumentCommissionRateField)this.getField(pInstrumentCommissionRate), (CThostFtdcRspInfoField)this.getField(pRspInfo), nRequestID, bIsLast);
    }

    @Virtual(24)
    public void OnRspQryExchange(Pointer<CThostFtdcExchangeField> pExchange, Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID, boolean bIsLast) {
        this.traderSpi.onRspQryExchange((CThostFtdcExchangeField)this.getField(pExchange), (CThostFtdcRspInfoField)this.getField(pRspInfo), nRequestID, bIsLast);
    }

    @Virtual(25)
    public void OnRspQryInstrument(Pointer<CThostFtdcInstrumentField> pInstrument, Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID, boolean bIsLast) {
        this.traderSpi.onRspQryInstrument((CThostFtdcInstrumentField)this.getField(pInstrument), (CThostFtdcRspInfoField)this.getField(pRspInfo), nRequestID, bIsLast);
    }

    @Virtual(26)
    public void OnRspQryDepthMarketData(Pointer<CThostFtdcDepthMarketDataField> pDepthMarketData, Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID, boolean bIsLast) {
        this.traderSpi.onRspQryDepthMarketData((CThostFtdcDepthMarketDataField)this.getField(pDepthMarketData), (CThostFtdcRspInfoField)this.getField(pRspInfo), nRequestID, bIsLast);
    }

    @Virtual(27)
    public void OnRspQrySettlementInfo(Pointer<CThostFtdcSettlementInfoField> pSettlementInfo, Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID, boolean bIsLast) {
        this.traderSpi.onRspQrySettlementInfo((CThostFtdcSettlementInfoField)this.getField(pSettlementInfo), (CThostFtdcRspInfoField)this.getField(pRspInfo), nRequestID, bIsLast);
    }

    @Virtual(28)
    public void OnRspQryTransferBank(Pointer<CThostFtdcTransferBankField> pTransferBank, Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID, boolean bIsLast) {
        this.traderSpi.onRspQryTransferBank((CThostFtdcTransferBankField)this.getField(pTransferBank), (CThostFtdcRspInfoField)this.getField(pRspInfo), nRequestID, bIsLast);
    }

    @Virtual(29)
    public void OnRspQryInvestorPositionDetail(Pointer<CThostFtdcInvestorPositionDetailField> pInvestorPositionDetail, Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID, boolean bIsLast) {
        this.traderSpi.onRspQryInvestorPositionDetail((CThostFtdcInvestorPositionDetailField)this.getField(pInvestorPositionDetail), (CThostFtdcRspInfoField)this.getField(pRspInfo), nRequestID, bIsLast);
    }

    @Virtual(30)
    public void OnRspQryNotice(Pointer<CThostFtdcNoticeField> pNotice, Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID, boolean bIsLast) {
        this.traderSpi.onRspQryNotice((CThostFtdcNoticeField)this.getField(pNotice), (CThostFtdcRspInfoField)this.getField(pRspInfo), nRequestID, bIsLast);
    }

    @Virtual(31)
    public void OnRspQrySettlementInfoConfirm(Pointer<CThostFtdcSettlementInfoConfirmField> pSettlementInfoConfirm, Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID, boolean bIsLast) {
        this.traderSpi.onRspQrySettlementInfoConfirm((CThostFtdcSettlementInfoConfirmField)this.getField(pSettlementInfoConfirm), (CThostFtdcRspInfoField)this.getField(pRspInfo), nRequestID, bIsLast);
    }

    @Virtual(32)
    public void OnRspQryInvestorPositionCombineDetail(Pointer<CThostFtdcInvestorPositionCombineDetailField> pInvestorPositionCombineDetail, Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID, boolean bIsLast) {
        this.traderSpi.onRspQryInvestorPositionCombineDetail((CThostFtdcInvestorPositionCombineDetailField)this.getField(pInvestorPositionCombineDetail), (CThostFtdcRspInfoField)this.getField(pRspInfo), nRequestID, bIsLast);
    }

    @Virtual(33)
    public void OnRspQryCFMMCTradingAccountKey(Pointer<CThostFtdcCFMMCTradingAccountKeyField> pCFMMCTradingAccountKey, Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID, boolean bIsLast) {
        this.traderSpi.onRspQryCFMMCTradingAccountKey((CThostFtdcCFMMCTradingAccountKeyField)this.getField(pCFMMCTradingAccountKey), (CThostFtdcRspInfoField)this.getField(pRspInfo), nRequestID, bIsLast);
    }

    @Virtual(34)
    public void OnRspQryEWarrantOffset(Pointer<CThostFtdcEWarrantOffsetField> pEWarrantOffset, Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID, boolean bIsLast) {
        this.traderSpi.onRspQryEWarrantOffset((CThostFtdcEWarrantOffsetField)this.getField(pEWarrantOffset), (CThostFtdcRspInfoField)this.getField(pRspInfo), nRequestID, bIsLast);
    }

    @Virtual(35)
    public void OnRspQryTransferSerial(Pointer<CThostFtdcTransferSerialField> pTransferSerial, Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID, boolean bIsLast) {
        this.traderSpi.onRspQryTransferSerial((CThostFtdcTransferSerialField)this.getField(pTransferSerial), (CThostFtdcRspInfoField)this.getField(pRspInfo), nRequestID, bIsLast);
    }

    @Virtual(36)
    public void OnRspQryAccountregister(Pointer<CThostFtdcAccountregisterField> pAccountregister, Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID, boolean bIsLast) {
        this.traderSpi.onRspQryAccountregister((CThostFtdcAccountregisterField)this.getField(pAccountregister), (CThostFtdcRspInfoField)this.getField(pRspInfo), nRequestID, bIsLast);
    }

    @Virtual(37)
    public void OnRspError(Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID, boolean bIsLast) {
        this.traderSpi.onRspError((CThostFtdcRspInfoField)this.getField(pRspInfo), nRequestID, bIsLast);
    }

    @Virtual(38)
    public void OnRtnOrder(Pointer<CThostFtdcOrderField> pOrder) {
        this.traderSpi.onRtnOrder((CThostFtdcOrderField)this.getField(pOrder));
    }

    @Virtual(39)
    public void OnRtnTrade(Pointer<CThostFtdcTradeField> pTrade) {
        this.traderSpi.onRtnTrade((CThostFtdcTradeField)this.getField(pTrade));
    }

    @Virtual(40)
    public void OnErrRtnOrderInsert(Pointer<CThostFtdcInputOrderField> pInputOrder, Pointer<CThostFtdcRspInfoField> pRspInfo) {
        this.traderSpi.onErrRtnOrderInsert((CThostFtdcInputOrderField)this.getField(pInputOrder), (CThostFtdcRspInfoField)this.getField(pRspInfo));
    }

    @Virtual(41)
    public void OnErrRtnOrderAction(Pointer<CThostFtdcOrderActionField> pOrderAction, Pointer<CThostFtdcRspInfoField> pRspInfo) {
        this.traderSpi.onErrRtnOrderAction((CThostFtdcOrderActionField)this.getField(pOrderAction), (CThostFtdcRspInfoField)this.getField(pRspInfo));
    }

    @Virtual(42)
    public void OnRtnInstrumentStatus(Pointer<CThostFtdcInstrumentStatusField> pInstrumentStatus) {
        this.traderSpi.onRtnInstrumentStatus((CThostFtdcInstrumentStatusField)this.getField(pInstrumentStatus));
    }

    @Virtual(43)
    public void OnRtnTradingNotice(Pointer<CThostFtdcTradingNoticeInfoField> pTradingNoticeInfo) {
        this.traderSpi.onRtnTradingNotice((CThostFtdcTradingNoticeInfoField)this.getField(pTradingNoticeInfo));
    }

    @Virtual(44)
    public void OnRtnErrorConditionalOrder(Pointer<CThostFtdcErrorConditionalOrderField> pErrorConditionalOrder) {
        this.traderSpi.onRtnErrorConditionalOrder((CThostFtdcErrorConditionalOrderField)this.getField(pErrorConditionalOrder));
    }

    @Virtual(45)
    public void OnRspQryContractBank(Pointer<CThostFtdcContractBankField> pContractBank, Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID, boolean bIsLast) {
        this.traderSpi.onRspQryContractBank((CThostFtdcContractBankField)this.getField(pContractBank), (CThostFtdcRspInfoField)this.getField(pRspInfo), nRequestID, bIsLast);
    }

    @Virtual(46)
    public void OnRspQryParkedOrder(Pointer<CThostFtdcParkedOrderField> pParkedOrder, Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID, boolean bIsLast) {
        this.traderSpi.onRspQryParkedOrder((CThostFtdcParkedOrderField)this.getField(pParkedOrder), (CThostFtdcRspInfoField)this.getField(pRspInfo), nRequestID, bIsLast);
    }

    @Virtual(47)
    public void OnRspQryParkedOrderAction(Pointer<CThostFtdcParkedOrderActionField> pParkedOrderAction, Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID, boolean bIsLast) {
        this.traderSpi.onRspQryParkedOrderAction((CThostFtdcParkedOrderActionField)this.getField(pParkedOrderAction), (CThostFtdcRspInfoField)this.getField(pRspInfo), nRequestID, bIsLast);
    }

    @Virtual(48)
    public void OnRspQryTradingNotice(Pointer<CThostFtdcTradingNoticeField> pTradingNotice, Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID, boolean bIsLast) {
        this.traderSpi.onRspQryTradingNotice((CThostFtdcTradingNoticeField)this.getField(pTradingNotice), (CThostFtdcRspInfoField)this.getField(pRspInfo), nRequestID, bIsLast);
    }

    @Virtual(49)
    public void OnRspQryBrokerTradingParams(Pointer<CThostFtdcBrokerTradingParamsField> pBrokerTradingParams, Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID, boolean bIsLast) {
        this.traderSpi.onRspQryBrokerTradingParams((CThostFtdcBrokerTradingParamsField)this.getField(pBrokerTradingParams), (CThostFtdcRspInfoField)this.getField(pRspInfo), nRequestID, bIsLast);
    }

    @Virtual(50)
    public void OnRspQryBrokerTradingAlgos(Pointer<CThostFtdcBrokerTradingAlgosField> pBrokerTradingAlgos, Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID, boolean bIsLast) {
        this.traderSpi.onRspQryBrokerTradingAlgos((CThostFtdcBrokerTradingAlgosField)this.getField(pBrokerTradingAlgos), (CThostFtdcRspInfoField)this.getField(pRspInfo), nRequestID, bIsLast);
    }

    @Virtual(51)
    public void OnRtnFromBankToFutureByBank(Pointer<CThostFtdcRspTransferField> pRspTransfer) {
        this.traderSpi.onRtnFromBankToFutureByBank((CThostFtdcRspTransferField)this.getField(pRspTransfer));
    }

    @Virtual(52)
    public void OnRtnFromFutureToBankByBank(Pointer<CThostFtdcRspTransferField> pRspTransfer) {
        this.traderSpi.onRtnFromFutureToBankByBank((CThostFtdcRspTransferField)this.getField(pRspTransfer));
    }

    @Virtual(53)
    public void OnRtnRepealFromBankToFutureByBank(Pointer<CThostFtdcRspRepealField> pRspRepeal) {
        this.traderSpi.onRtnRepealFromBankToFutureByBank((CThostFtdcRspRepealField)this.getField(pRspRepeal));
    }

    @Virtual(54)
    public void OnRtnRepealFromFutureToBankByBank(Pointer<CThostFtdcRspRepealField> pRspRepeal) {
        this.traderSpi.onRtnRepealFromFutureToBankByBank((CThostFtdcRspRepealField)this.getField(pRspRepeal));
    }

    @Virtual(55)
    public void OnRtnFromBankToFutureByFuture(Pointer<CThostFtdcRspTransferField> pRspTransfer) {
        this.traderSpi.onRtnFromBankToFutureByFuture((CThostFtdcRspTransferField)this.getField(pRspTransfer));
    }

    @Virtual(56)
    public void OnRtnFromFutureToBankByFuture(Pointer<CThostFtdcRspTransferField> pRspTransfer) {
        this.traderSpi.onRtnFromFutureToBankByFuture((CThostFtdcRspTransferField)this.getField(pRspTransfer));
    }

    @Virtual(57)
    public void OnRtnRepealFromBankToFutureByFutureManual(Pointer<CThostFtdcRspRepealField> pRspRepeal) {
        this.traderSpi.onRtnRepealFromBankToFutureByFutureManual((CThostFtdcRspRepealField)this.getField(pRspRepeal));
    }

    @Virtual(58)
    public void OnRtnRepealFromFutureToBankByFutureManual(Pointer<CThostFtdcRspRepealField> pRspRepeal) {
        this.traderSpi.onRtnRepealFromFutureToBankByFutureManual((CThostFtdcRspRepealField)this.getField(pRspRepeal));
    }

    @Virtual(59)
    public void OnRtnQueryBankBalanceByFuture(Pointer<CThostFtdcNotifyQueryAccountField> pNotifyQueryAccount) {
        this.traderSpi.onRtnQueryBankBalanceByFuture((CThostFtdcNotifyQueryAccountField)this.getField(pNotifyQueryAccount));
    }

    @Virtual(60)
    public void OnErrRtnBankToFutureByFuture(Pointer<CThostFtdcReqTransferField> pReqTransfer, Pointer<CThostFtdcRspInfoField> pRspInfo) {
        this.traderSpi.onErrRtnBankToFutureByFuture((CThostFtdcReqTransferField)this.getField(pReqTransfer), (CThostFtdcRspInfoField)this.getField(pRspInfo));
    }

    @Virtual(61)
    public void OnErrRtnFutureToBankByFuture(Pointer<CThostFtdcReqTransferField> pReqTransfer, Pointer<CThostFtdcRspInfoField> pRspInfo) {
        this.traderSpi.onErrRtnFutureToBankByFuture((CThostFtdcReqTransferField)this.getField(pReqTransfer), (CThostFtdcRspInfoField)this.getField(pRspInfo));
    }

    @Virtual(62)
    public void OnErrRtnRepealBankToFutureByFutureManual(Pointer<CThostFtdcReqRepealField> pReqRepeal, Pointer<CThostFtdcRspInfoField> pRspInfo) {
        this.traderSpi.onErrRtnRepealBankToFutureByFutureManual((CThostFtdcReqRepealField)this.getField(pReqRepeal), (CThostFtdcRspInfoField)this.getField(pRspInfo));
    }

    @Virtual(63)
    public void OnErrRtnRepealFutureToBankByFutureManual(Pointer<CThostFtdcReqRepealField> pReqRepeal, Pointer<CThostFtdcRspInfoField> pRspInfo) {
        this.traderSpi.onErrRtnRepealFutureToBankByFutureManual((CThostFtdcReqRepealField)this.getField(pReqRepeal), (CThostFtdcRspInfoField)this.getField(pRspInfo));
    }

    @Virtual(64)
    public void OnErrRtnQueryBankBalanceByFuture(Pointer<CThostFtdcReqQueryAccountField> pReqQueryAccount, Pointer<CThostFtdcRspInfoField> pRspInfo) {
        this.traderSpi.onErrRtnQueryBankBalanceByFuture((CThostFtdcReqQueryAccountField)this.getField(pReqQueryAccount), (CThostFtdcRspInfoField)this.getField(pRspInfo));
    }

    @Virtual(65)
    public void OnRtnRepealFromBankToFutureByFuture(Pointer<CThostFtdcRspRepealField> pRspRepeal) {
        this.traderSpi.onRtnRepealFromBankToFutureByFuture((CThostFtdcRspRepealField)this.getField(pRspRepeal));
    }

    @Virtual(66)
    public void OnRtnRepealFromFutureToBankByFuture(Pointer<CThostFtdcRspRepealField> pRspRepeal) {
        this.traderSpi.onRtnRepealFromFutureToBankByFuture((CThostFtdcRspRepealField)this.getField(pRspRepeal));
    }

    @Virtual(67)
    public void OnRspFromBankToFutureByFuture(Pointer<CThostFtdcReqTransferField> pReqTransfer, Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID, boolean bIsLast) {
        this.traderSpi.onRspFromBankToFutureByFuture((CThostFtdcReqTransferField)this.getField(pReqTransfer), (CThostFtdcRspInfoField)this.getField(pRspInfo), nRequestID, bIsLast);
    }

    @Virtual(68)
    public void OnRspFromFutureToBankByFuture(Pointer<CThostFtdcReqTransferField> pReqTransfer, Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID, boolean bIsLast) {
        this.traderSpi.onRspFromFutureToBankByFuture((CThostFtdcReqTransferField)this.getField(pReqTransfer), (CThostFtdcRspInfoField)this.getField(pRspInfo), nRequestID, bIsLast);
    }

    @Virtual(69)
    public void OnRspQueryBankAccountMoneyByFuture(Pointer<CThostFtdcReqQueryAccountField> pReqQueryAccount, Pointer<CThostFtdcRspInfoField> pRspInfo, int nRequestID, boolean bIsLast) {
        this.traderSpi.onRspQueryBankAccountMoneyByFuture((CThostFtdcReqQueryAccountField)this.getField(pReqQueryAccount), (CThostFtdcRspInfoField)this.getField(pRspInfo), nRequestID, bIsLast);
    }

    @Virtual(70)
    public void OnRtnOpenAccountByBank(Pointer<CThostFtdcOpenAccountField> pOpenAccount) {
        this.traderSpi.onRtnOpenAccountByBank((CThostFtdcOpenAccountField)this.getField(pOpenAccount));
    }

    @Virtual(71)
    public void OnRtnCancelAccountByBank(Pointer<CThostFtdcCancelAccountField> pCancelAccount) {
        this.traderSpi.onRtnCancelAccountByBank((CThostFtdcCancelAccountField)this.getField(pCancelAccount));
    }

    @Virtual(72)
    public void OnRtnChangeAccountByBank(Pointer<CThostFtdcChangeAccountField> pChangeAccount) {
        this.traderSpi.onRtnChangeAccountByBank((CThostFtdcChangeAccountField)this.getField(pChangeAccount));
    }

    private <T extends StructObject> T getField(Pointer<T> field) {
        return field == null ? null : (T) (StructObject) field.get();
    }
}