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
 * Time: 下午3:37
 */
public class CThostFtdcExchangeOrderField extends StructObject {
    public CThostFtdcExchangeOrderField() {
    }

    @Field(0)
    private byte OrderPriceType() {
        return this.io.getByteField(this, 0);
    }

    public char getOrderPriceType() {
        return (char)this.OrderPriceType();
    }

    @Field(0)
    private CThostFtdcExchangeOrderField OrderPriceType(byte OrderPriceType) {
        this.io.setByteField(this, 0, OrderPriceType);
        return this;
    }

    public void setOrderPriceType(char orderPriceType) {
        this.OrderPriceType((byte)orderPriceType);
    }

    @Field(1)
    private byte Direction() {
        return this.io.getByteField(this, 1);
    }

    public char getDirection() {
        return (char)this.Direction();
    }

    @Field(1)
    private CThostFtdcExchangeOrderField Direction(byte Direction) {
        this.io.setByteField(this, 1, Direction);
        return this;
    }

    public void setDirection(char direction) {
        this.Direction((byte)direction);
    }

    @Array({5L})
    @Field(2)
    private Pointer<Byte> CombOffsetFlag() {
        return this.io.getPointerField(this, 2);
    }

    @Array({5L})
    @Field(2)
    public void setCombOffsetFlag(String combOffsetFlag) {
        this.io.getPointerField(this, 2).setCString(combOffsetFlag);
    }

    public String getCombOffsetFlag() {
        return this.CombOffsetFlag().getCString();
    }

    @Array({5L})
    @Field(3)
    private Pointer<Byte> CombHedgeFlag() {
        return this.io.getPointerField(this, 3);
    }

    @Array({5L})
    @Field(3)
    public void setCombHedgeFlag(String combHedgeFlag) {
        this.io.getPointerField(this, 3).setCString(combHedgeFlag);
    }

    public String getCombHedgeFlag() {
        return this.CombHedgeFlag().getCString();
    }

    @Field(4)
    private double LimitPrice() {
        return this.io.getDoubleField(this, 4);
    }

    public double getLimitPrice() {
        return this.LimitPrice();
    }

    @Field(4)
    private CThostFtdcExchangeOrderField LimitPrice(double LimitPrice) {
        this.io.setDoubleField(this, 4, LimitPrice);
        return this;
    }

    public void setLimitPrice(double limitPrice) {
        this.LimitPrice(limitPrice);
    }

    @Field(5)
    private int VolumeTotalOriginal() {
        return this.io.getIntField(this, 5);
    }

    public int getVolumeTotalOriginal() {
        return this.VolumeTotalOriginal();
    }

    @Field(5)
    private CThostFtdcExchangeOrderField VolumeTotalOriginal(int VolumeTotalOriginal) {
        this.io.setIntField(this, 5, VolumeTotalOriginal);
        return this;
    }

    public void setVolumeTotalOriginal(int volumeTotalOriginal) {
        this.VolumeTotalOriginal(volumeTotalOriginal);
    }

    @Field(6)
    private byte TimeCondition() {
        return this.io.getByteField(this, 6);
    }

    public char getTimeCondition() {
        return (char)this.TimeCondition();
    }

    @Field(6)
    private CThostFtdcExchangeOrderField TimeCondition(byte TimeCondition) {
        this.io.setByteField(this, 6, TimeCondition);
        return this;
    }

    public void setTimeCondition(char timeCondition) {
        this.TimeCondition((byte)timeCondition);
    }

    @Array({9L})
    @Field(7)
    private Pointer<Byte> GTDDate() {
        return this.io.getPointerField(this, 7);
    }

    @Array({9L})
    @Field(7)
    public void setGTDDate(String gTDDate) {
        this.io.getPointerField(this, 7).setCString(gTDDate);
    }

    public String getGTDDate() {
        return this.GTDDate().getCString();
    }

    @Field(8)
    private byte VolumeCondition() {
        return this.io.getByteField(this, 8);
    }

    public char getVolumeCondition() {
        return (char)this.VolumeCondition();
    }

    @Field(8)
    private CThostFtdcExchangeOrderField VolumeCondition(byte VolumeCondition) {
        this.io.setByteField(this, 8, VolumeCondition);
        return this;
    }

    public void setVolumeCondition(char volumeCondition) {
        this.VolumeCondition((byte)volumeCondition);
    }

    @Field(9)
    private int MinVolume() {
        return this.io.getIntField(this, 9);
    }

    public int getMinVolume() {
        return this.MinVolume();
    }

    @Field(9)
    private CThostFtdcExchangeOrderField MinVolume(int MinVolume) {
        this.io.setIntField(this, 9, MinVolume);
        return this;
    }

    public void setMinVolume(int minVolume) {
        this.MinVolume(minVolume);
    }

    @Field(10)
    private byte ContingentCondition() {
        return this.io.getByteField(this, 10);
    }

    public char getContingentCondition() {
        return (char)this.ContingentCondition();
    }

    @Field(10)
    private CThostFtdcExchangeOrderField ContingentCondition(byte ContingentCondition) {
        this.io.setByteField(this, 10, ContingentCondition);
        return this;
    }

    public void setContingentCondition(char contingentCondition) {
        this.ContingentCondition((byte)contingentCondition);
    }

    @Field(11)
    private double StopPrice() {
        return this.io.getDoubleField(this, 11);
    }

    public double getStopPrice() {
        return this.StopPrice();
    }

    @Field(11)
    private CThostFtdcExchangeOrderField StopPrice(double StopPrice) {
        this.io.setDoubleField(this, 11, StopPrice);
        return this;
    }

    public void setStopPrice(double stopPrice) {
        this.StopPrice(stopPrice);
    }

    @Field(12)
    private byte ForceCloseReason() {
        return this.io.getByteField(this, 12);
    }

    public char getForceCloseReason() {
        return (char)this.ForceCloseReason();
    }

    @Field(12)
    private CThostFtdcExchangeOrderField ForceCloseReason(byte ForceCloseReason) {
        this.io.setByteField(this, 12, ForceCloseReason);
        return this;
    }

    public void setForceCloseReason(char forceCloseReason) {
        this.ForceCloseReason((byte)forceCloseReason);
    }

    @Field(13)
    private int IsAutoSuspend() {
        return this.io.getIntField(this, 13);
    }

    public int getIsAutoSuspend() {
        return this.IsAutoSuspend();
    }

    @Field(13)
    private CThostFtdcExchangeOrderField IsAutoSuspend(int IsAutoSuspend) {
        this.io.setIntField(this, 13, IsAutoSuspend);
        return this;
    }

    public void setIsAutoSuspend(int isAutoSuspend) {
        this.IsAutoSuspend(isAutoSuspend);
    }

    @Array({21L})
    @Field(14)
    private Pointer<Byte> BusinessUnit() {
        return this.io.getPointerField(this, 14);
    }

    @Array({21L})
    @Field(14)
    public void setBusinessUnit(String businessUnit) {
        this.io.getPointerField(this, 14).setCString(businessUnit);
    }

    public String getBusinessUnit() {
        return this.BusinessUnit().getCString();
    }

    @Field(15)
    private int RequestID() {
        return this.io.getIntField(this, 15);
    }

    public int getRequestID() {
        return this.RequestID();
    }

    @Field(15)
    private CThostFtdcExchangeOrderField RequestID(int RequestID) {
        this.io.setIntField(this, 15, RequestID);
        return this;
    }

    public void setRequestID(int requestID) {
        this.RequestID(requestID);
    }

    @Array({13L})
    @Field(16)
    private Pointer<Byte> OrderLocalID() {
        return this.io.getPointerField(this, 16);
    }

    @Array({13L})
    @Field(16)
    public void setOrderLocalID(String orderLocalID) {
        this.io.getPointerField(this, 16).setCString(orderLocalID);
    }

    public String getOrderLocalID() {
        return this.OrderLocalID().getCString();
    }

    @Array({9L})
    @Field(17)
    private Pointer<Byte> ExchangeID() {
        return this.io.getPointerField(this, 17);
    }

    @Array({9L})
    @Field(17)
    public void setExchangeID(String exchangeID) {
        this.io.getPointerField(this, 17).setCString(exchangeID);
    }

    public String getExchangeID() {
        return this.ExchangeID().getCString();
    }

    @Array({11L})
    @Field(18)
    private Pointer<Byte> ParticipantID() {
        return this.io.getPointerField(this, 18);
    }

    @Array({11L})
    @Field(18)
    public void setParticipantID(String participantID) {
        this.io.getPointerField(this, 18).setCString(participantID);
    }

    public String getParticipantID() {
        return this.ParticipantID().getCString();
    }

    @Array({11L})
    @Field(19)
    private Pointer<Byte> ClientID() {
        return this.io.getPointerField(this, 19);
    }

    @Array({11L})
    @Field(19)
    public void setClientID(String clientID) {
        this.io.getPointerField(this, 19).setCString(clientID);
    }

    public String getClientID() {
        return this.ClientID().getCString();
    }

    @Array({31L})
    @Field(20)
    private Pointer<Byte> ExchangeInstID() {
        return this.io.getPointerField(this, 20);
    }

    @Array({31L})
    @Field(20)
    public void setExchangeInstID(String exchangeInstID) {
        this.io.getPointerField(this, 20).setCString(exchangeInstID);
    }

    public String getExchangeInstID() {
        return this.ExchangeInstID().getCString();
    }

    @Array({21L})
    @Field(21)
    private Pointer<Byte> TraderID() {
        return this.io.getPointerField(this, 21);
    }

    @Array({21L})
    @Field(21)
    public void setTraderID(String traderID) {
        this.io.getPointerField(this, 21).setCString(traderID);
    }

    public String getTraderID() {
        return this.TraderID().getCString();
    }

    @Field(22)
    private int InstallID() {
        return this.io.getIntField(this, 22);
    }

    public int getInstallID() {
        return this.InstallID();
    }

    @Field(22)
    private CThostFtdcExchangeOrderField InstallID(int InstallID) {
        this.io.setIntField(this, 22, InstallID);
        return this;
    }

    public void setInstallID(int installID) {
        this.InstallID(installID);
    }

    @Field(23)
    private byte OrderSubmitStatus() {
        return this.io.getByteField(this, 23);
    }

    public char getOrderSubmitStatus() {
        return (char)this.OrderSubmitStatus();
    }

    @Field(23)
    private CThostFtdcExchangeOrderField OrderSubmitStatus(byte OrderSubmitStatus) {
        this.io.setByteField(this, 23, OrderSubmitStatus);
        return this;
    }

    public void setOrderSubmitStatus(char orderSubmitStatus) {
        this.OrderSubmitStatus((byte)orderSubmitStatus);
    }

    @Field(24)
    private int NotifySequence() {
        return this.io.getIntField(this, 24);
    }

    public int getNotifySequence() {
        return this.NotifySequence();
    }

    @Field(24)
    private CThostFtdcExchangeOrderField NotifySequence(int NotifySequence) {
        this.io.setIntField(this, 24, NotifySequence);
        return this;
    }

    public void setNotifySequence(int notifySequence) {
        this.NotifySequence(notifySequence);
    }

    @Array({9L})
    @Field(25)
    private Pointer<Byte> TradingDay() {
        return this.io.getPointerField(this, 25);
    }

    @Array({9L})
    @Field(25)
    public void setTradingDay(String tradingDay) {
        this.io.getPointerField(this, 25).setCString(tradingDay);
    }

    public String getTradingDay() {
        return this.TradingDay().getCString();
    }

    @Field(26)
    private int SettlementID() {
        return this.io.getIntField(this, 26);
    }

    public int getSettlementID() {
        return this.SettlementID();
    }

    @Field(26)
    private CThostFtdcExchangeOrderField SettlementID(int SettlementID) {
        this.io.setIntField(this, 26, SettlementID);
        return this;
    }

    public void setSettlementID(int settlementID) {
        this.SettlementID(settlementID);
    }

    @Array({21L})
    @Field(27)
    private Pointer<Byte> OrderSysID() {
        return this.io.getPointerField(this, 27);
    }

    @Array({21L})
    @Field(27)
    public void setOrderSysID(String orderSysID) {
        this.io.getPointerField(this, 27).setCString(orderSysID);
    }

    public String getOrderSysID() {
        return this.OrderSysID().getCString();
    }

    @Field(28)
    private byte OrderSource() {
        return this.io.getByteField(this, 28);
    }

    public char getOrderSource() {
        return (char)this.OrderSource();
    }

    @Field(28)
    private CThostFtdcExchangeOrderField OrderSource(byte OrderSource) {
        this.io.setByteField(this, 28, OrderSource);
        return this;
    }

    public void setOrderSource(char orderSource) {
        this.OrderSource((byte)orderSource);
    }

    @Field(29)
    private byte OrderStatus() {
        return this.io.getByteField(this, 29);
    }

    public char getOrderStatus() {
        return (char)this.OrderStatus();
    }

    @Field(29)
    private CThostFtdcExchangeOrderField OrderStatus(byte OrderStatus) {
        this.io.setByteField(this, 29, OrderStatus);
        return this;
    }

    public void setOrderStatus(char orderStatus) {
        this.OrderStatus((byte)orderStatus);
    }

    @Field(30)
    private byte OrderType() {
        return this.io.getByteField(this, 30);
    }

    public char getOrderType() {
        return (char)this.OrderType();
    }

    @Field(30)
    private CThostFtdcExchangeOrderField OrderType(byte OrderType) {
        this.io.setByteField(this, 30, OrderType);
        return this;
    }

    public void setOrderType(char orderType) {
        this.OrderType((byte)orderType);
    }

    @Field(31)
    private int VolumeTraded() {
        return this.io.getIntField(this, 31);
    }

    public int getVolumeTraded() {
        return this.VolumeTraded();
    }

    @Field(31)
    private CThostFtdcExchangeOrderField VolumeTraded(int VolumeTraded) {
        this.io.setIntField(this, 31, VolumeTraded);
        return this;
    }

    public void setVolumeTraded(int volumeTraded) {
        this.VolumeTraded(volumeTraded);
    }

    @Field(32)
    private int VolumeTotal() {
        return this.io.getIntField(this, 32);
    }

    public int getVolumeTotal() {
        return this.VolumeTotal();
    }

    @Field(32)
    private CThostFtdcExchangeOrderField VolumeTotal(int VolumeTotal) {
        this.io.setIntField(this, 32, VolumeTotal);
        return this;
    }

    public void setVolumeTotal(int volumeTotal) {
        this.VolumeTotal(volumeTotal);
    }

    @Array({9L})
    @Field(33)
    private Pointer<Byte> InsertDate() {
        return this.io.getPointerField(this, 33);
    }

    @Array({9L})
    @Field(33)
    public void setInsertDate(String insertDate) {
        this.io.getPointerField(this, 33).setCString(insertDate);
    }

    public String getInsertDate() {
        return this.InsertDate().getCString();
    }

    @Array({9L})
    @Field(34)
    private Pointer<Byte> InsertTime() {
        return this.io.getPointerField(this, 34);
    }

    @Array({9L})
    @Field(34)
    public void setInsertTime(String insertTime) {
        this.io.getPointerField(this, 34).setCString(insertTime);
    }

    public String getInsertTime() {
        return this.InsertTime().getCString();
    }

    @Array({9L})
    @Field(35)
    private Pointer<Byte> ActiveTime() {
        return this.io.getPointerField(this, 35);
    }

    @Array({9L})
    @Field(35)
    public void setActiveTime(String activeTime) {
        this.io.getPointerField(this, 35).setCString(activeTime);
    }

    public String getActiveTime() {
        return this.ActiveTime().getCString();
    }

    @Array({9L})
    @Field(36)
    private Pointer<Byte> SuspendTime() {
        return this.io.getPointerField(this, 36);
    }

    @Array({9L})
    @Field(36)
    public void setSuspendTime(String suspendTime) {
        this.io.getPointerField(this, 36).setCString(suspendTime);
    }

    public String getSuspendTime() {
        return this.SuspendTime().getCString();
    }

    @Array({9L})
    @Field(37)
    private Pointer<Byte> UpdateTime() {
        return this.io.getPointerField(this, 37);
    }

    @Array({9L})
    @Field(37)
    public void setUpdateTime(String updateTime) {
        this.io.getPointerField(this, 37).setCString(updateTime);
    }

    public String getUpdateTime() {
        return this.UpdateTime().getCString();
    }

    @Array({9L})
    @Field(38)
    private Pointer<Byte> CancelTime() {
        return this.io.getPointerField(this, 38);
    }

    @Array({9L})
    @Field(38)
    public void setCancelTime(String cancelTime) {
        this.io.getPointerField(this, 38).setCString(cancelTime);
    }

    public String getCancelTime() {
        return this.CancelTime().getCString();
    }

    @Array({21L})
    @Field(39)
    private Pointer<Byte> ActiveTraderID() {
        return this.io.getPointerField(this, 39);
    }

    @Array({21L})
    @Field(39)
    public void setActiveTraderID(String activeTraderID) {
        this.io.getPointerField(this, 39).setCString(activeTraderID);
    }

    public String getActiveTraderID() {
        return this.ActiveTraderID().getCString();
    }

    @Array({11L})
    @Field(40)
    private Pointer<Byte> ClearingPartID() {
        return this.io.getPointerField(this, 40);
    }

    @Array({11L})
    @Field(40)
    public void setClearingPartID(String clearingPartID) {
        this.io.getPointerField(this, 40).setCString(clearingPartID);
    }

    public String getClearingPartID() {
        return this.ClearingPartID().getCString();
    }

    @Field(41)
    private int SequenceNo() {
        return this.io.getIntField(this, 41);
    }

    public int getSequenceNo() {
        return this.SequenceNo();
    }

    @Field(41)
    private CThostFtdcExchangeOrderField SequenceNo(int SequenceNo) {
        this.io.setIntField(this, 41, SequenceNo);
        return this;
    }

    public void setSequenceNo(int sequenceNo) {
        this.SequenceNo(sequenceNo);
    }

    public CThostFtdcExchangeOrderField(Pointer pointer) {
        super(pointer);
    }
}
