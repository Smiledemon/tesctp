package com.xceder.ctp.thostftdcuserapistruct;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: xiaopan
 * Date: 2018-03-07
 * Time: 下午3:34
 */
public class CThostFtdcErrorConditionalOrderField extends StructObject {
    public CThostFtdcErrorConditionalOrderField() {
    }

    @Array({11L})
    @Field(0)
    private Pointer<Byte> BrokerID() {
        return this.io.getPointerField(this, 0);
    }

    @Array({11L})
    @Field(0)
    public void setBrokerID(String brokerID) {
        this.io.getPointerField(this, 0).setCString(brokerID);
    }

    public String getBrokerID() {
        return this.BrokerID().getCString();
    }

    @Array({13L})
    @Field(1)
    private Pointer<Byte> InvestorID() {
        return this.io.getPointerField(this, 1);
    }

    @Array({13L})
    @Field(1)
    public void setInvestorID(String investorID) {
        this.io.getPointerField(this, 1).setCString(investorID);
    }

    public String getInvestorID() {
        return this.InvestorID().getCString();
    }

    @Array({31L})
    @Field(2)
    private Pointer<Byte> InstrumentID() {
        return this.io.getPointerField(this, 2);
    }

    @Array({31L})
    @Field(2)
    public void setInstrumentID(String instrumentID) {
        this.io.getPointerField(this, 2).setCString(instrumentID);
    }

    public String getInstrumentID() {
        return this.InstrumentID().getCString();
    }

    @Array({13L})
    @Field(3)
    private Pointer<Byte> OrderRef() {
        return this.io.getPointerField(this, 3);
    }

    @Array({13L})
    @Field(3)
    public void setOrderRef(String orderRef) {
        this.io.getPointerField(this, 3).setCString(orderRef);
    }

    public String getOrderRef() {
        return this.OrderRef().getCString();
    }

    @Array({16L})
    @Field(4)
    private Pointer<Byte> UserID() {
        return this.io.getPointerField(this, 4);
    }

    @Array({16L})
    @Field(4)
    public void setUserID(String userID) {
        this.io.getPointerField(this, 4).setCString(userID);
    }

    public String getUserID() {
        return this.UserID().getCString();
    }

    @Field(5)
    private byte OrderPriceType() {
        return this.io.getByteField(this, 5);
    }

    public char getOrderPriceType() {
        return (char)this.OrderPriceType();
    }

    @Field(5)
    private CThostFtdcErrorConditionalOrderField OrderPriceType(byte OrderPriceType) {
        this.io.setByteField(this, 5, OrderPriceType);
        return this;
    }

    public void setOrderPriceType(char orderPriceType) {
        this.OrderPriceType((byte)orderPriceType);
    }

    @Field(6)
    private byte Direction() {
        return this.io.getByteField(this, 6);
    }

    public char getDirection() {
        return (char)this.Direction();
    }

    @Field(6)
    private CThostFtdcErrorConditionalOrderField Direction(byte Direction) {
        this.io.setByteField(this, 6, Direction);
        return this;
    }

    public void setDirection(char direction) {
        this.Direction((byte)direction);
    }

    @Array({5L})
    @Field(7)
    private Pointer<Byte> CombOffsetFlag() {
        return this.io.getPointerField(this, 7);
    }

    @Array({5L})
    @Field(7)
    public void setCombOffsetFlag(String combOffsetFlag) {
        this.io.getPointerField(this, 7).setCString(combOffsetFlag);
    }

    public String getCombOffsetFlag() {
        return this.CombOffsetFlag().getCString();
    }

    @Array({5L})
    @Field(8)
    private Pointer<Byte> CombHedgeFlag() {
        return this.io.getPointerField(this, 8);
    }

    @Array({5L})
    @Field(8)
    public void setCombHedgeFlag(String combHedgeFlag) {
        this.io.getPointerField(this, 8).setCString(combHedgeFlag);
    }

    public String getCombHedgeFlag() {
        return this.CombHedgeFlag().getCString();
    }

    @Field(9)
    private double LimitPrice() {
        return this.io.getDoubleField(this, 9);
    }

    public double getLimitPrice() {
        return this.LimitPrice();
    }

    @Field(9)
    private CThostFtdcErrorConditionalOrderField LimitPrice(double LimitPrice) {
        this.io.setDoubleField(this, 9, LimitPrice);
        return this;
    }

    public void setLimitPrice(double limitPrice) {
        this.LimitPrice(limitPrice);
    }

    @Field(10)
    private int VolumeTotalOriginal() {
        return this.io.getIntField(this, 10);
    }

    public int getVolumeTotalOriginal() {
        return this.VolumeTotalOriginal();
    }

    @Field(10)
    private CThostFtdcErrorConditionalOrderField VolumeTotalOriginal(int VolumeTotalOriginal) {
        this.io.setIntField(this, 10, VolumeTotalOriginal);
        return this;
    }

    public void setVolumeTotalOriginal(int volumeTotalOriginal) {
        this.VolumeTotalOriginal(volumeTotalOriginal);
    }

    @Field(11)
    private byte TimeCondition() {
        return this.io.getByteField(this, 11);
    }

    public char getTimeCondition() {
        return (char)this.TimeCondition();
    }

    @Field(11)
    private CThostFtdcErrorConditionalOrderField TimeCondition(byte TimeCondition) {
        this.io.setByteField(this, 11, TimeCondition);
        return this;
    }

    public void setTimeCondition(char timeCondition) {
        this.TimeCondition((byte)timeCondition);
    }

    @Array({9L})
    @Field(12)
    private Pointer<Byte> GTDDate() {
        return this.io.getPointerField(this, 12);
    }

    @Array({9L})
    @Field(12)
    public void setGTDDate(String gTDDate) {
        this.io.getPointerField(this, 12).setCString(gTDDate);
    }

    public String getGTDDate() {
        return this.GTDDate().getCString();
    }

    @Field(13)
    private byte VolumeCondition() {
        return this.io.getByteField(this, 13);
    }

    public char getVolumeCondition() {
        return (char)this.VolumeCondition();
    }

    @Field(13)
    private CThostFtdcErrorConditionalOrderField VolumeCondition(byte VolumeCondition) {
        this.io.setByteField(this, 13, VolumeCondition);
        return this;
    }

    public void setVolumeCondition(char volumeCondition) {
        this.VolumeCondition((byte)volumeCondition);
    }

    @Field(14)
    private int MinVolume() {
        return this.io.getIntField(this, 14);
    }

    public int getMinVolume() {
        return this.MinVolume();
    }

    @Field(14)
    private CThostFtdcErrorConditionalOrderField MinVolume(int MinVolume) {
        this.io.setIntField(this, 14, MinVolume);
        return this;
    }

    public void setMinVolume(int minVolume) {
        this.MinVolume(minVolume);
    }

    @Field(15)
    private byte ContingentCondition() {
        return this.io.getByteField(this, 15);
    }

    public char getContingentCondition() {
        return (char)this.ContingentCondition();
    }

    @Field(15)
    private CThostFtdcErrorConditionalOrderField ContingentCondition(byte ContingentCondition) {
        this.io.setByteField(this, 15, ContingentCondition);
        return this;
    }

    public void setContingentCondition(char contingentCondition) {
        this.ContingentCondition((byte)contingentCondition);
    }

    @Field(16)
    private double StopPrice() {
        return this.io.getDoubleField(this, 16);
    }

    public double getStopPrice() {
        return this.StopPrice();
    }

    @Field(16)
    private CThostFtdcErrorConditionalOrderField StopPrice(double StopPrice) {
        this.io.setDoubleField(this, 16, StopPrice);
        return this;
    }

    public void setStopPrice(double stopPrice) {
        this.StopPrice(stopPrice);
    }

    @Field(17)
    private byte ForceCloseReason() {
        return this.io.getByteField(this, 17);
    }

    public char getForceCloseReason() {
        return (char)this.ForceCloseReason();
    }

    @Field(17)
    private CThostFtdcErrorConditionalOrderField ForceCloseReason(byte ForceCloseReason) {
        this.io.setByteField(this, 17, ForceCloseReason);
        return this;
    }

    public void setForceCloseReason(char forceCloseReason) {
        this.ForceCloseReason((byte)forceCloseReason);
    }

    @Field(18)
    private int IsAutoSuspend() {
        return this.io.getIntField(this, 18);
    }

    public int getIsAutoSuspend() {
        return this.IsAutoSuspend();
    }

    @Field(18)
    private CThostFtdcErrorConditionalOrderField IsAutoSuspend(int IsAutoSuspend) {
        this.io.setIntField(this, 18, IsAutoSuspend);
        return this;
    }

    public void setIsAutoSuspend(int isAutoSuspend) {
        this.IsAutoSuspend(isAutoSuspend);
    }

    @Array({21L})
    @Field(19)
    private Pointer<Byte> BusinessUnit() {
        return this.io.getPointerField(this, 19);
    }

    @Array({21L})
    @Field(19)
    public void setBusinessUnit(String businessUnit) {
        this.io.getPointerField(this, 19).setCString(businessUnit);
    }

    public String getBusinessUnit() {
        return this.BusinessUnit().getCString();
    }

    @Field(20)
    private int RequestID() {
        return this.io.getIntField(this, 20);
    }

    public int getRequestID() {
        return this.RequestID();
    }

    @Field(20)
    private CThostFtdcErrorConditionalOrderField RequestID(int RequestID) {
        this.io.setIntField(this, 20, RequestID);
        return this;
    }

    public void setRequestID(int requestID) {
        this.RequestID(requestID);
    }

    @Array({13L})
    @Field(21)
    private Pointer<Byte> OrderLocalID() {
        return this.io.getPointerField(this, 21);
    }

    @Array({13L})
    @Field(21)
    public void setOrderLocalID(String orderLocalID) {
        this.io.getPointerField(this, 21).setCString(orderLocalID);
    }

    public String getOrderLocalID() {
        return this.OrderLocalID().getCString();
    }

    @Array({9L})
    @Field(22)
    private Pointer<Byte> ExchangeID() {
        return this.io.getPointerField(this, 22);
    }

    @Array({9L})
    @Field(22)
    public void setExchangeID(String exchangeID) {
        this.io.getPointerField(this, 22).setCString(exchangeID);
    }

    public String getExchangeID() {
        return this.ExchangeID().getCString();
    }

    @Array({11L})
    @Field(23)
    private Pointer<Byte> ParticipantID() {
        return this.io.getPointerField(this, 23);
    }

    @Array({11L})
    @Field(23)
    public void setParticipantID(String participantID) {
        this.io.getPointerField(this, 23).setCString(participantID);
    }

    public String getParticipantID() {
        return this.ParticipantID().getCString();
    }

    @Array({11L})
    @Field(24)
    private Pointer<Byte> ClientID() {
        return this.io.getPointerField(this, 24);
    }

    @Array({11L})
    @Field(24)
    public void setClientID(String clientID) {
        this.io.getPointerField(this, 24).setCString(clientID);
    }

    public String getClientID() {
        return this.ClientID().getCString();
    }

    @Array({31L})
    @Field(25)
    private Pointer<Byte> ExchangeInstID() {
        return this.io.getPointerField(this, 25);
    }

    @Array({31L})
    @Field(25)
    public void setExchangeInstID(String exchangeInstID) {
        this.io.getPointerField(this, 25).setCString(exchangeInstID);
    }

    public String getExchangeInstID() {
        return this.ExchangeInstID().getCString();
    }

    @Array({21L})
    @Field(26)
    private Pointer<Byte> TraderID() {
        return this.io.getPointerField(this, 26);
    }

    @Array({21L})
    @Field(26)
    public void setTraderID(String traderID) {
        this.io.getPointerField(this, 26).setCString(traderID);
    }

    public String getTraderID() {
        return this.TraderID().getCString();
    }

    @Field(27)
    private int InstallID() {
        return this.io.getIntField(this, 27);
    }

    public int getInstallID() {
        return this.InstallID();
    }

    @Field(27)
    private CThostFtdcErrorConditionalOrderField InstallID(int InstallID) {
        this.io.setIntField(this, 27, InstallID);
        return this;
    }

    public void setInstallID(int installID) {
        this.InstallID(installID);
    }

    @Field(28)
    private byte OrderSubmitStatus() {
        return this.io.getByteField(this, 28);
    }

    public char getOrderSubmitStatus() {
        return (char)this.OrderSubmitStatus();
    }

    @Field(28)
    private CThostFtdcErrorConditionalOrderField OrderSubmitStatus(byte OrderSubmitStatus) {
        this.io.setByteField(this, 28, OrderSubmitStatus);
        return this;
    }

    public void setOrderSubmitStatus(char orderSubmitStatus) {
        this.OrderSubmitStatus((byte)orderSubmitStatus);
    }

    @Field(29)
    private int NotifySequence() {
        return this.io.getIntField(this, 29);
    }

    public int getNotifySequence() {
        return this.NotifySequence();
    }

    @Field(29)
    private CThostFtdcErrorConditionalOrderField NotifySequence(int NotifySequence) {
        this.io.setIntField(this, 29, NotifySequence);
        return this;
    }

    public void setNotifySequence(int notifySequence) {
        this.NotifySequence(notifySequence);
    }

    @Array({9L})
    @Field(30)
    private Pointer<Byte> TradingDay() {
        return this.io.getPointerField(this, 30);
    }

    @Array({9L})
    @Field(30)
    public void setTradingDay(String tradingDay) {
        this.io.getPointerField(this, 30).setCString(tradingDay);
    }

    public String getTradingDay() {
        return this.TradingDay().getCString();
    }

    @Field(31)
    private int SettlementID() {
        return this.io.getIntField(this, 31);
    }

    public int getSettlementID() {
        return this.SettlementID();
    }

    @Field(31)
    private CThostFtdcErrorConditionalOrderField SettlementID(int SettlementID) {
        this.io.setIntField(this, 31, SettlementID);
        return this;
    }

    public void setSettlementID(int settlementID) {
        this.SettlementID(settlementID);
    }

    @Array({21L})
    @Field(32)
    private Pointer<Byte> OrderSysID() {
        return this.io.getPointerField(this, 32);
    }

    @Array({21L})
    @Field(32)
    public void setOrderSysID(String orderSysID) {
        this.io.getPointerField(this, 32).setCString(orderSysID);
    }

    public String getOrderSysID() {
        return this.OrderSysID().getCString();
    }

    @Field(33)
    private byte OrderSource() {
        return this.io.getByteField(this, 33);
    }

    public char getOrderSource() {
        return (char)this.OrderSource();
    }

    @Field(33)
    private CThostFtdcErrorConditionalOrderField OrderSource(byte OrderSource) {
        this.io.setByteField(this, 33, OrderSource);
        return this;
    }

    public void setOrderSource(char orderSource) {
        this.OrderSource((byte)orderSource);
    }

    @Field(34)
    private byte OrderStatus() {
        return this.io.getByteField(this, 34);
    }

    public char getOrderStatus() {
        return (char)this.OrderStatus();
    }

    @Field(34)
    private CThostFtdcErrorConditionalOrderField OrderStatus(byte OrderStatus) {
        this.io.setByteField(this, 34, OrderStatus);
        return this;
    }

    public void setOrderStatus(char orderStatus) {
        this.OrderStatus((byte)orderStatus);
    }

    @Field(35)
    private byte OrderType() {
        return this.io.getByteField(this, 35);
    }

    public char getOrderType() {
        return (char)this.OrderType();
    }

    @Field(35)
    private CThostFtdcErrorConditionalOrderField OrderType(byte OrderType) {
        this.io.setByteField(this, 35, OrderType);
        return this;
    }

    public void setOrderType(char orderType) {
        this.OrderType((byte)orderType);
    }

    @Field(36)
    private int VolumeTraded() {
        return this.io.getIntField(this, 36);
    }

    public int getVolumeTraded() {
        return this.VolumeTraded();
    }

    @Field(36)
    private CThostFtdcErrorConditionalOrderField VolumeTraded(int VolumeTraded) {
        this.io.setIntField(this, 36, VolumeTraded);
        return this;
    }

    public void setVolumeTraded(int volumeTraded) {
        this.VolumeTraded(volumeTraded);
    }

    @Field(37)
    private int VolumeTotal() {
        return this.io.getIntField(this, 37);
    }

    public int getVolumeTotal() {
        return this.VolumeTotal();
    }

    @Field(37)
    private CThostFtdcErrorConditionalOrderField VolumeTotal(int VolumeTotal) {
        this.io.setIntField(this, 37, VolumeTotal);
        return this;
    }

    public void setVolumeTotal(int volumeTotal) {
        this.VolumeTotal(volumeTotal);
    }

    @Array({9L})
    @Field(38)
    private Pointer<Byte> InsertDate() {
        return this.io.getPointerField(this, 38);
    }

    @Array({9L})
    @Field(38)
    public void setInsertDate(String insertDate) {
        this.io.getPointerField(this, 38).setCString(insertDate);
    }

    public String getInsertDate() {
        return this.InsertDate().getCString();
    }

    @Array({9L})
    @Field(39)
    private Pointer<Byte> InsertTime() {
        return this.io.getPointerField(this, 39);
    }

    @Array({9L})
    @Field(39)
    public void setInsertTime(String insertTime) {
        this.io.getPointerField(this, 39).setCString(insertTime);
    }

    public String getInsertTime() {
        return this.InsertTime().getCString();
    }

    @Array({9L})
    @Field(40)
    private Pointer<Byte> ActiveTime() {
        return this.io.getPointerField(this, 40);
    }

    @Array({9L})
    @Field(40)
    public void setActiveTime(String activeTime) {
        this.io.getPointerField(this, 40).setCString(activeTime);
    }

    public String getActiveTime() {
        return this.ActiveTime().getCString();
    }

    @Array({9L})
    @Field(41)
    private Pointer<Byte> SuspendTime() {
        return this.io.getPointerField(this, 41);
    }

    @Array({9L})
    @Field(41)
    public void setSuspendTime(String suspendTime) {
        this.io.getPointerField(this, 41).setCString(suspendTime);
    }

    public String getSuspendTime() {
        return this.SuspendTime().getCString();
    }

    @Array({9L})
    @Field(42)
    private Pointer<Byte> UpdateTime() {
        return this.io.getPointerField(this, 42);
    }

    @Array({9L})
    @Field(42)
    public void setUpdateTime(String updateTime) {
        this.io.getPointerField(this, 42).setCString(updateTime);
    }

    public String getUpdateTime() {
        return this.UpdateTime().getCString();
    }

    @Array({9L})
    @Field(43)
    private Pointer<Byte> CancelTime() {
        return this.io.getPointerField(this, 43);
    }

    @Array({9L})
    @Field(43)
    public void setCancelTime(String cancelTime) {
        this.io.getPointerField(this, 43).setCString(cancelTime);
    }

    public String getCancelTime() {
        return this.CancelTime().getCString();
    }

    @Array({21L})
    @Field(44)
    private Pointer<Byte> ActiveTraderID() {
        return this.io.getPointerField(this, 44);
    }

    @Array({21L})
    @Field(44)
    public void setActiveTraderID(String activeTraderID) {
        this.io.getPointerField(this, 44).setCString(activeTraderID);
    }

    public String getActiveTraderID() {
        return this.ActiveTraderID().getCString();
    }

    @Array({11L})
    @Field(45)
    private Pointer<Byte> ClearingPartID() {
        return this.io.getPointerField(this, 45);
    }

    @Array({11L})
    @Field(45)
    public void setClearingPartID(String clearingPartID) {
        this.io.getPointerField(this, 45).setCString(clearingPartID);
    }

    public String getClearingPartID() {
        return this.ClearingPartID().getCString();
    }

    @Field(46)
    private int SequenceNo() {
        return this.io.getIntField(this, 46);
    }

    public int getSequenceNo() {
        return this.SequenceNo();
    }

    @Field(46)
    private CThostFtdcErrorConditionalOrderField SequenceNo(int SequenceNo) {
        this.io.setIntField(this, 46, SequenceNo);
        return this;
    }

    public void setSequenceNo(int sequenceNo) {
        this.SequenceNo(sequenceNo);
    }

    @Field(47)
    private int FrontID() {
        return this.io.getIntField(this, 47);
    }

    public int getFrontID() {
        return this.FrontID();
    }

    @Field(47)
    private CThostFtdcErrorConditionalOrderField FrontID(int FrontID) {
        this.io.setIntField(this, 47, FrontID);
        return this;
    }

    public void setFrontID(int frontID) {
        this.FrontID(frontID);
    }

    @Field(48)
    private int SessionID() {
        return this.io.getIntField(this, 48);
    }

    public int getSessionID() {
        return this.SessionID();
    }

    @Field(48)
    private CThostFtdcErrorConditionalOrderField SessionID(int SessionID) {
        this.io.setIntField(this, 48, SessionID);
        return this;
    }

    public void setSessionID(int sessionID) {
        this.SessionID(sessionID);
    }

    @Array({11L})
    @Field(49)
    private Pointer<Byte> UserProductInfo() {
        return this.io.getPointerField(this, 49);
    }

    @Array({11L})
    @Field(49)
    public void setUserProductInfo(String userProductInfo) {
        this.io.getPointerField(this, 49).setCString(userProductInfo);
    }

    public String getUserProductInfo() {
        return this.UserProductInfo().getCString();
    }

    @Array({81L})
    @Field(50)
    private Pointer<Byte> StatusMsg() {
        return this.io.getPointerField(this, 50);
    }

    @Array({81L})
    @Field(50)
    public void setStatusMsg(String statusMsg) {
        this.io.getPointerField(this, 50).setCString(statusMsg);
    }

    public String getStatusMsg() {
        return this.StatusMsg().getCString();
    }

    @Field(51)
    private int UserForceClose() {
        return this.io.getIntField(this, 51);
    }

    public int getUserForceClose() {
        return this.UserForceClose();
    }

    @Field(51)
    private CThostFtdcErrorConditionalOrderField UserForceClose(int UserForceClose) {
        this.io.setIntField(this, 51, UserForceClose);
        return this;
    }

    public void setUserForceClose(int userForceClose) {
        this.UserForceClose(userForceClose);
    }

    @Array({16L})
    @Field(52)
    private Pointer<Byte> ActiveUserID() {
        return this.io.getPointerField(this, 52);
    }

    @Array({16L})
    @Field(52)
    public void setActiveUserID(String activeUserID) {
        this.io.getPointerField(this, 52).setCString(activeUserID);
    }

    public String getActiveUserID() {
        return this.ActiveUserID().getCString();
    }

    @Field(53)
    private int BrokerOrderSeq() {
        return this.io.getIntField(this, 53);
    }

    public int getBrokerOrderSeq() {
        return this.BrokerOrderSeq();
    }

    @Field(53)
    private CThostFtdcErrorConditionalOrderField BrokerOrderSeq(int BrokerOrderSeq) {
        this.io.setIntField(this, 53, BrokerOrderSeq);
        return this;
    }

    public void setBrokerOrderSeq(int brokerOrderSeq) {
        this.BrokerOrderSeq(brokerOrderSeq);
    }

    @Array({21L})
    @Field(54)
    private Pointer<Byte> RelativeOrderSysID() {
        return this.io.getPointerField(this, 54);
    }

    @Array({21L})
    @Field(54)
    public void setRelativeOrderSysID(String relativeOrderSysID) {
        this.io.getPointerField(this, 54).setCString(relativeOrderSysID);
    }

    public String getRelativeOrderSysID() {
        return this.RelativeOrderSysID().getCString();
    }

    @Field(55)
    private int ZCETotalTradedVolume() {
        return this.io.getIntField(this, 55);
    }

    public int getZCETotalTradedVolume() {
        return this.ZCETotalTradedVolume();
    }

    @Field(55)
    private CThostFtdcErrorConditionalOrderField ZCETotalTradedVolume(int ZCETotalTradedVolume) {
        this.io.setIntField(this, 55, ZCETotalTradedVolume);
        return this;
    }

    public void setZCETotalTradedVolume(int zCETotalTradedVolume) {
        this.ZCETotalTradedVolume(zCETotalTradedVolume);
    }

    @Field(56)
    private int ErrorID() {
        return this.io.getIntField(this, 56);
    }

    public int getErrorID() {
        return this.ErrorID();
    }

    @Field(56)
    private CThostFtdcErrorConditionalOrderField ErrorID(int ErrorID) {
        this.io.setIntField(this, 56, ErrorID);
        return this;
    }

    public void setErrorID(int errorID) {
        this.ErrorID(errorID);
    }

    @Array({81L})
    @Field(57)
    private Pointer<Byte> ErrorMsg() {
        return this.io.getPointerField(this, 57);
    }

    @Array({81L})
    @Field(57)
    public void setErrorMsg(String errorMsg) {
        this.io.getPointerField(this, 57).setCString(errorMsg);
    }

    public String getErrorMsg() {
        return this.ErrorMsg().getCString();
    }

    @Field(58)
    private int IsSwapOrder() {
        return this.io.getIntField(this, 58);
    }

    public int getIsSwapOrder() {
        return this.IsSwapOrder();
    }

    @Field(58)
    private CThostFtdcErrorConditionalOrderField IsSwapOrder(int IsSwapOrder) {
        this.io.setIntField(this, 58, IsSwapOrder);
        return this;
    }

    public void setIsSwapOrder(int isSwapOrder) {
        this.IsSwapOrder(isSwapOrder);
    }

    public CThostFtdcErrorConditionalOrderField(Pointer pointer) {
        super(pointer);
    }
}
