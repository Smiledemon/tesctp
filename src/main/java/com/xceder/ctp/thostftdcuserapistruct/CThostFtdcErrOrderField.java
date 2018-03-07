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
public class CThostFtdcErrOrderField extends StructObject {
    public CThostFtdcErrOrderField() {
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
    private CThostFtdcErrOrderField OrderPriceType(byte OrderPriceType) {
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
    private CThostFtdcErrOrderField Direction(byte Direction) {
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
    private CThostFtdcErrOrderField LimitPrice(double LimitPrice) {
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
    private CThostFtdcErrOrderField VolumeTotalOriginal(int VolumeTotalOriginal) {
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
    private CThostFtdcErrOrderField TimeCondition(byte TimeCondition) {
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
    private CThostFtdcErrOrderField VolumeCondition(byte VolumeCondition) {
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
    private CThostFtdcErrOrderField MinVolume(int MinVolume) {
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
    private CThostFtdcErrOrderField ContingentCondition(byte ContingentCondition) {
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
    private CThostFtdcErrOrderField StopPrice(double StopPrice) {
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
    private CThostFtdcErrOrderField ForceCloseReason(byte ForceCloseReason) {
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
    private CThostFtdcErrOrderField IsAutoSuspend(int IsAutoSuspend) {
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
    private CThostFtdcErrOrderField RequestID(int RequestID) {
        this.io.setIntField(this, 20, RequestID);
        return this;
    }

    public void setRequestID(int requestID) {
        this.RequestID(requestID);
    }

    @Field(21)
    private int UserForceClose() {
        return this.io.getIntField(this, 21);
    }

    public int getUserForceClose() {
        return this.UserForceClose();
    }

    @Field(21)
    private CThostFtdcErrOrderField UserForceClose(int UserForceClose) {
        this.io.setIntField(this, 21, UserForceClose);
        return this;
    }

    public void setUserForceClose(int userForceClose) {
        this.UserForceClose(userForceClose);
    }

    @Field(22)
    private int ErrorID() {
        return this.io.getIntField(this, 22);
    }

    public int getErrorID() {
        return this.ErrorID();
    }

    @Field(22)
    private CThostFtdcErrOrderField ErrorID(int ErrorID) {
        this.io.setIntField(this, 22, ErrorID);
        return this;
    }

    public void setErrorID(int errorID) {
        this.ErrorID(errorID);
    }

    @Array({81L})
    @Field(23)
    private Pointer<Byte> ErrorMsg() {
        return this.io.getPointerField(this, 23);
    }

    @Array({81L})
    @Field(23)
    public void setErrorMsg(String errorMsg) {
        this.io.getPointerField(this, 23).setCString(errorMsg);
    }

    public String getErrorMsg() {
        return this.ErrorMsg().getCString();
    }

    @Field(24)
    private int IsSwapOrder() {
        return this.io.getIntField(this, 24);
    }

    public int getIsSwapOrder() {
        return this.IsSwapOrder();
    }

    @Field(24)
    private CThostFtdcErrOrderField IsSwapOrder(int IsSwapOrder) {
        this.io.setIntField(this, 24, IsSwapOrder);
        return this;
    }

    public void setIsSwapOrder(int isSwapOrder) {
        this.IsSwapOrder(isSwapOrder);
    }

    public CThostFtdcErrOrderField(Pointer pointer) {
        super(pointer);
    }
}
