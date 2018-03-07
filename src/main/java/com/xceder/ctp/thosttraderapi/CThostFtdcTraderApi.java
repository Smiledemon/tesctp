package com.xceder.ctp.thosttraderapi;

import com.xceder.ctp.thostftdcuserapidatatype.ThostFtdcUserApiDataTypeLibrary;
import com.xceder.ctp.thostftdcuserapistruct.*;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Name;
import org.bridj.ann.Ptr;
import org.bridj.ann.Virtual;
import org.bridj.cpp.CPPObject;

@Library("thosttraderapi")
public class CThostFtdcTraderApi extends CPPObject {
    public CThostFtdcTraderApi() {
    }

    public static native Pointer<CThostFtdcTraderApi> CreateFtdcTraderApi(Pointer<Byte> var0, boolean var1);

    @Virtual(0)
    public native void Release();

    @Virtual(1)
    public native void Init();

    @Virtual(2)
    public native int Join();

    @Virtual(3)
    public Pointer<Byte> GetTradingDay() {
        return Pointer.pointerToAddress(this.GetTradingDay$2(), Byte.class);
    }

    @Ptr
    @Name("GetTradingDay")
    @Virtual(3)
    protected native long GetTradingDay$2();

    @Virtual(4)
    public void RegisterFront(Pointer<Byte> pszFrontAddress) {
        this.RegisterFront(Pointer.getPeer(pszFrontAddress));
    }

    @Virtual(4)
    protected native void RegisterFront(@Ptr long var1);

    @Virtual(5)
    public void RegisterNameServer(Pointer<Byte> pszNsAddress) {
        this.RegisterNameServer(Pointer.getPeer(pszNsAddress));
    }

    @Virtual(5)
    protected native void RegisterNameServer(@Ptr long var1);

    @Virtual(6)
    public void RegisterSpi(Pointer<CThostFtdcTraderSpi> pSpi) {
        this.RegisterSpi(Pointer.getPeer(pSpi));
    }

    @Virtual(6)
    protected native void RegisterSpi(@Ptr long var1);

    @Virtual(7)
    public void SubscribePrivateTopic(IntValuedEnum<ThostFtdcUserApiDataTypeLibrary.THOST_TE_RESUME_TYPE> nResumeType) {
        this.SubscribePrivateTopic((int)nResumeType.value());
    }

    @Virtual(7)
    protected native void SubscribePrivateTopic(int var1);

    @Virtual(8)
    public void SubscribePublicTopic(IntValuedEnum<ThostFtdcUserApiDataTypeLibrary.THOST_TE_RESUME_TYPE> nResumeType) {
        this.SubscribePublicTopic((int)nResumeType.value());
    }

    @Virtual(8)
    protected native void SubscribePublicTopic(int var1);

    @Virtual(9)
    public int ReqAuthenticate(Pointer<CThostFtdcReqAuthenticateField> pReqAuthenticateField, int nRequestID) {
        return this.ReqAuthenticate(Pointer.getPeer(pReqAuthenticateField), nRequestID);
    }

    @Virtual(9)
    protected native int ReqAuthenticate(@Ptr long var1, int var3);

    @Virtual(10)
    public int ReqUserLogin(Pointer<CThostFtdcReqUserLoginField> pReqUserLoginField, int nRequestID) {
        return this.ReqUserLogin(Pointer.getPeer(pReqUserLoginField), nRequestID);
    }

    @Virtual(10)
    protected native int ReqUserLogin(@Ptr long var1, int var3);

    @Virtual(11)
    public int ReqUserLogout(Pointer<CThostFtdcUserLogoutField> pUserLogout, int nRequestID) {
        return this.ReqUserLogout(Pointer.getPeer(pUserLogout), nRequestID);
    }

    @Virtual(11)
    protected native int ReqUserLogout(@Ptr long var1, int var3);

    @Virtual(12)
    public int ReqUserPasswordUpdate(Pointer<CThostFtdcUserPasswordUpdateField> pUserPasswordUpdate, int nRequestID) {
        return this.ReqUserPasswordUpdate(Pointer.getPeer(pUserPasswordUpdate), nRequestID);
    }

    @Virtual(12)
    protected native int ReqUserPasswordUpdate(@Ptr long var1, int var3);

    @Virtual(13)
    public int ReqTradingAccountPasswordUpdate(Pointer<CThostFtdcTradingAccountPasswordUpdateField> pTradingAccountPasswordUpdate, int nRequestID) {
        return this.ReqTradingAccountPasswordUpdate(Pointer.getPeer(pTradingAccountPasswordUpdate), nRequestID);
    }

    @Virtual(13)
    protected native int ReqTradingAccountPasswordUpdate(@Ptr long var1, int var3);

    @Virtual(14)
    public int ReqOrderInsert(Pointer<CThostFtdcInputOrderField> pInputOrder, int nRequestID) {
        return this.ReqOrderInsert(Pointer.getPeer(pInputOrder), nRequestID);
    }

    @Virtual(14)
    protected native int ReqOrderInsert(@Ptr long var1, int var3);

    @Virtual(15)
    public int ReqParkedOrderInsert(Pointer<CThostFtdcParkedOrderField> pParkedOrder, int nRequestID) {
        return this.ReqParkedOrderInsert(Pointer.getPeer(pParkedOrder), nRequestID);
    }

    @Virtual(15)
    protected native int ReqParkedOrderInsert(@Ptr long var1, int var3);

    @Virtual(16)
    public int ReqParkedOrderAction(Pointer<CThostFtdcParkedOrderActionField> pParkedOrderAction, int nRequestID) {
        return this.ReqParkedOrderAction(Pointer.getPeer(pParkedOrderAction), nRequestID);
    }

    @Virtual(16)
    protected native int ReqParkedOrderAction(@Ptr long var1, int var3);

    @Virtual(17)
    public int ReqOrderAction(Pointer<CThostFtdcInputOrderActionField> pInputOrderAction, int nRequestID) {
        return this.ReqOrderAction(Pointer.getPeer(pInputOrderAction), nRequestID);
    }

    @Virtual(17)
    protected native int ReqOrderAction(@Ptr long var1, int var3);

    @Virtual(18)
    public int ReqQueryMaxOrderVolume(Pointer<CThostFtdcQueryMaxOrderVolumeField> pQueryMaxOrderVolume, int nRequestID) {
        return this.ReqQueryMaxOrderVolume(Pointer.getPeer(pQueryMaxOrderVolume), nRequestID);
    }

    @Virtual(18)
    protected native int ReqQueryMaxOrderVolume(@Ptr long var1, int var3);

    @Virtual(19)
    public int ReqSettlementInfoConfirm(Pointer<CThostFtdcSettlementInfoConfirmField> pSettlementInfoConfirm, int nRequestID) {
        return this.ReqSettlementInfoConfirm(Pointer.getPeer(pSettlementInfoConfirm), nRequestID);
    }

    @Virtual(19)
    protected native int ReqSettlementInfoConfirm(@Ptr long var1, int var3);

    @Virtual(20)
    public int ReqRemoveParkedOrder(Pointer<CThostFtdcRemoveParkedOrderField> pRemoveParkedOrder, int nRequestID) {
        return this.ReqRemoveParkedOrder(Pointer.getPeer(pRemoveParkedOrder), nRequestID);
    }

    @Virtual(20)
    protected native int ReqRemoveParkedOrder(@Ptr long var1, int var3);

    @Virtual(21)
    public int ReqRemoveParkedOrderAction(Pointer<CThostFtdcRemoveParkedOrderActionField> pRemoveParkedOrderAction, int nRequestID) {
        return this.ReqRemoveParkedOrderAction(Pointer.getPeer(pRemoveParkedOrderAction), nRequestID);
    }

    @Virtual(21)
    protected native int ReqRemoveParkedOrderAction(@Ptr long var1, int var3);

    @Virtual(22)
    public int ReqQryOrder(Pointer<CThostFtdcQryOrderField> pQryOrder, int nRequestID) {
        return this.ReqQryOrder(Pointer.getPeer(pQryOrder), nRequestID);
    }

    @Virtual(22)
    protected native int ReqQryOrder(@Ptr long var1, int var3);

    @Virtual(23)
    public int ReqQryTrade(Pointer<CThostFtdcQryTradeField> pQryTrade, int nRequestID) {
        return this.ReqQryTrade(Pointer.getPeer(pQryTrade), nRequestID);
    }

    @Virtual(23)
    protected native int ReqQryTrade(@Ptr long var1, int var3);

    @Virtual(24)
    public int ReqQryInvestorPosition(Pointer<CThostFtdcQryInvestorPositionField> pQryInvestorPosition, int nRequestID) {
        return this.ReqQryInvestorPosition(Pointer.getPeer(pQryInvestorPosition), nRequestID);
    }

    @Virtual(24)
    protected native int ReqQryInvestorPosition(@Ptr long var1, int var3);

    @Virtual(25)
    public int ReqQryTradingAccount(Pointer<CThostFtdcQryTradingAccountField> pQryTradingAccount, int nRequestID) {
        return this.ReqQryTradingAccount(Pointer.getPeer(pQryTradingAccount), nRequestID);
    }

    @Virtual(25)
    protected native int ReqQryTradingAccount(@Ptr long var1, int var3);

    @Virtual(26)
    public int ReqQryInvestor(Pointer<CThostFtdcQryInvestorField> pQryInvestor, int nRequestID) {
        return this.ReqQryInvestor(Pointer.getPeer(pQryInvestor), nRequestID);
    }

    @Virtual(26)
    protected native int ReqQryInvestor(@Ptr long var1, int var3);

    @Virtual(27)
    public int ReqQryTradingCode(Pointer<CThostFtdcQryTradingCodeField> pQryTradingCode, int nRequestID) {
        return this.ReqQryTradingCode(Pointer.getPeer(pQryTradingCode), nRequestID);
    }

    @Virtual(27)
    protected native int ReqQryTradingCode(@Ptr long var1, int var3);

    @Virtual(28)
    public int ReqQryInstrumentMarginRate(Pointer<CThostFtdcQryInstrumentMarginRateField> pQryInstrumentMarginRate, int nRequestID) {
        return this.ReqQryInstrumentMarginRate(Pointer.getPeer(pQryInstrumentMarginRate), nRequestID);
    }

    @Virtual(28)
    protected native int ReqQryInstrumentMarginRate(@Ptr long var1, int var3);

    @Virtual(29)
    public int ReqQryInstrumentCommissionRate(Pointer<CThostFtdcQryInstrumentCommissionRateField> pQryInstrumentCommissionRate, int nRequestID) {
        return this.ReqQryInstrumentCommissionRate(Pointer.getPeer(pQryInstrumentCommissionRate), nRequestID);
    }

    @Virtual(29)
    protected native int ReqQryInstrumentCommissionRate(@Ptr long var1, int var3);

    @Virtual(30)
    public int ReqQryExchange(Pointer<CThostFtdcQryExchangeField> pQryExchange, int nRequestID) {
        return this.ReqQryExchange(Pointer.getPeer(pQryExchange), nRequestID);
    }

    @Virtual(30)
    protected native int ReqQryExchange(@Ptr long var1, int var3);

    @Virtual(31)
    public int ReqQryInstrument(Pointer<CThostFtdcQryInstrumentField> pQryInstrument, int nRequestID) {
        return this.ReqQryInstrument(Pointer.getPeer(pQryInstrument), nRequestID);
    }

    @Virtual(31)
    protected native int ReqQryInstrument(@Ptr long var1, int var3);

    @Virtual(32)
    public int ReqQryDepthMarketData(Pointer<CThostFtdcQryDepthMarketDataField> pQryDepthMarketData, int nRequestID) {
        return this.ReqQryDepthMarketData(Pointer.getPeer(pQryDepthMarketData), nRequestID);
    }

    @Virtual(32)
    protected native int ReqQryDepthMarketData(@Ptr long var1, int var3);

    @Virtual(33)
    public int ReqQrySettlementInfo(Pointer<CThostFtdcQrySettlementInfoField> pQrySettlementInfo, int nRequestID) {
        return this.ReqQrySettlementInfo(Pointer.getPeer(pQrySettlementInfo), nRequestID);
    }

    @Virtual(33)
    protected native int ReqQrySettlementInfo(@Ptr long var1, int var3);

    @Virtual(34)
    public int ReqQryTransferBank(Pointer<CThostFtdcQryTransferBankField> pQryTransferBank, int nRequestID) {
        return this.ReqQryTransferBank(Pointer.getPeer(pQryTransferBank), nRequestID);
    }

    @Virtual(34)
    protected native int ReqQryTransferBank(@Ptr long var1, int var3);

    @Virtual(35)
    public int ReqQryInvestorPositionDetail(Pointer<CThostFtdcQryInvestorPositionDetailField> pQryInvestorPositionDetail, int nRequestID) {
        return this.ReqQryInvestorPositionDetail(Pointer.getPeer(pQryInvestorPositionDetail), nRequestID);
    }

    @Virtual(35)
    protected native int ReqQryInvestorPositionDetail(@Ptr long var1, int var3);

    @Virtual(36)
    public int ReqQryNotice(Pointer<CThostFtdcQryNoticeField> pQryNotice, int nRequestID) {
        return this.ReqQryNotice(Pointer.getPeer(pQryNotice), nRequestID);
    }

    @Virtual(36)
    protected native int ReqQryNotice(@Ptr long var1, int var3);

    @Virtual(37)
    public int ReqQrySettlementInfoConfirm(Pointer<CThostFtdcQrySettlementInfoConfirmField> pQrySettlementInfoConfirm, int nRequestID) {
        return this.ReqQrySettlementInfoConfirm(Pointer.getPeer(pQrySettlementInfoConfirm), nRequestID);
    }

    @Virtual(37)
    protected native int ReqQrySettlementInfoConfirm(@Ptr long var1, int var3);

    @Virtual(38)
    public int ReqQryInvestorPositionCombineDetail(Pointer<CThostFtdcQryInvestorPositionCombineDetailField> pQryInvestorPositionCombineDetail, int nRequestID) {
        return this.ReqQryInvestorPositionCombineDetail(Pointer.getPeer(pQryInvestorPositionCombineDetail), nRequestID);
    }

    @Virtual(38)
    protected native int ReqQryInvestorPositionCombineDetail(@Ptr long var1, int var3);

    @Virtual(39)
    public int ReqQryCFMMCTradingAccountKey(Pointer<CThostFtdcQryCFMMCTradingAccountKeyField> pQryCFMMCTradingAccountKey, int nRequestID) {
        return this.ReqQryCFMMCTradingAccountKey(Pointer.getPeer(pQryCFMMCTradingAccountKey), nRequestID);
    }

    @Virtual(39)
    protected native int ReqQryCFMMCTradingAccountKey(@Ptr long var1, int var3);

    @Virtual(40)
    public int ReqQryEWarrantOffset(Pointer<CThostFtdcQryEWarrantOffsetField> pQryEWarrantOffset, int nRequestID) {
        return this.ReqQryEWarrantOffset(Pointer.getPeer(pQryEWarrantOffset), nRequestID);
    }

    @Virtual(40)
    protected native int ReqQryEWarrantOffset(@Ptr long var1, int var3);

    @Virtual(41)
    public int ReqQryTransferSerial(Pointer<CThostFtdcQryTransferSerialField> pQryTransferSerial, int nRequestID) {
        return this.ReqQryTransferSerial(Pointer.getPeer(pQryTransferSerial), nRequestID);
    }

    @Virtual(41)
    protected native int ReqQryTransferSerial(@Ptr long var1, int var3);

    @Virtual(42)
    public int ReqQryAccountregister(Pointer<CThostFtdcQryAccountregisterField> pQryAccountregister, int nRequestID) {
        return this.ReqQryAccountregister(Pointer.getPeer(pQryAccountregister), nRequestID);
    }

    @Virtual(42)
    protected native int ReqQryAccountregister(@Ptr long var1, int var3);

    @Virtual(43)
    public int ReqQryContractBank(Pointer<CThostFtdcQryContractBankField> pQryContractBank, int nRequestID) {
        return this.ReqQryContractBank(Pointer.getPeer(pQryContractBank), nRequestID);
    }

    @Virtual(43)
    protected native int ReqQryContractBank(@Ptr long var1, int var3);

    @Virtual(44)
    public int ReqQryParkedOrder(Pointer<CThostFtdcQryParkedOrderField> pQryParkedOrder, int nRequestID) {
        return this.ReqQryParkedOrder(Pointer.getPeer(pQryParkedOrder), nRequestID);
    }

    @Virtual(44)
    protected native int ReqQryParkedOrder(@Ptr long var1, int var3);

    @Virtual(45)
    public int ReqQryParkedOrderAction(Pointer<CThostFtdcQryParkedOrderActionField> pQryParkedOrderAction, int nRequestID) {
        return this.ReqQryParkedOrderAction(Pointer.getPeer(pQryParkedOrderAction), nRequestID);
    }

    @Virtual(45)
    protected native int ReqQryParkedOrderAction(@Ptr long var1, int var3);

    @Virtual(46)
    public int ReqQryTradingNotice(Pointer<CThostFtdcQryTradingNoticeField> pQryTradingNotice, int nRequestID) {
        return this.ReqQryTradingNotice(Pointer.getPeer(pQryTradingNotice), nRequestID);
    }

    @Virtual(46)
    protected native int ReqQryTradingNotice(@Ptr long var1, int var3);

    @Virtual(47)
    public int ReqQryBrokerTradingParams(Pointer<CThostFtdcQryBrokerTradingParamsField> pQryBrokerTradingParams, int nRequestID) {
        return this.ReqQryBrokerTradingParams(Pointer.getPeer(pQryBrokerTradingParams), nRequestID);
    }

    @Virtual(47)
    protected native int ReqQryBrokerTradingParams(@Ptr long var1, int var3);

    @Virtual(48)
    public int ReqQryBrokerTradingAlgos(Pointer<CThostFtdcQryBrokerTradingAlgosField> pQryBrokerTradingAlgos, int nRequestID) {
        return this.ReqQryBrokerTradingAlgos(Pointer.getPeer(pQryBrokerTradingAlgos), nRequestID);
    }

    @Virtual(48)
    protected native int ReqQryBrokerTradingAlgos(@Ptr long var1, int var3);

    @Virtual(49)
    public int ReqFromBankToFutureByFuture(Pointer<CThostFtdcReqTransferField> pReqTransfer, int nRequestID) {
        return this.ReqFromBankToFutureByFuture(Pointer.getPeer(pReqTransfer), nRequestID);
    }

    @Virtual(49)
    protected native int ReqFromBankToFutureByFuture(@Ptr long var1, int var3);

    @Virtual(50)
    public int ReqFromFutureToBankByFuture(Pointer<CThostFtdcReqTransferField> pReqTransfer, int nRequestID) {
        return this.ReqFromFutureToBankByFuture(Pointer.getPeer(pReqTransfer), nRequestID);
    }

    @Virtual(50)
    protected native int ReqFromFutureToBankByFuture(@Ptr long var1, int var3);

    @Virtual(51)
    public int ReqQueryBankAccountMoneyByFuture(Pointer<CThostFtdcReqQueryAccountField> pReqQueryAccount, int nRequestID) {
        return this.ReqQueryBankAccountMoneyByFuture(Pointer.getPeer(pReqQueryAccount), nRequestID);
    }

    @Virtual(51)
    protected native int ReqQueryBankAccountMoneyByFuture(@Ptr long var1, int var3);

    public CThostFtdcTraderApi(Pointer pointer) {
        super(pointer);
    }
}
