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
public class CThostFtdcInputOrderActionField extends StructObject {
    public CThostFtdcInputOrderActionField() {
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

    @Field(2)
    private int OrderActionRef() {
        return this.io.getIntField(this, 2);
    }

    public int getOrderActionRef() {
        return this.OrderActionRef();
    }

    @Field(2)
    private CThostFtdcInputOrderActionField OrderActionRef(int OrderActionRef) {
        this.io.setIntField(this, 2, OrderActionRef);
        return this;
    }

    public void setOrderActionRef(int orderActionRef) {
        this.OrderActionRef(orderActionRef);
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

    @Field(4)
    private int RequestID() {
        return this.io.getIntField(this, 4);
    }

    public int getRequestID() {
        return this.RequestID();
    }

    @Field(4)
    private CThostFtdcInputOrderActionField RequestID(int RequestID) {
        this.io.setIntField(this, 4, RequestID);
        return this;
    }

    public void setRequestID(int requestID) {
        this.RequestID(requestID);
    }

    @Field(5)
    private int FrontID() {
        return this.io.getIntField(this, 5);
    }

    public int getFrontID() {
        return this.FrontID();
    }

    @Field(5)
    private CThostFtdcInputOrderActionField FrontID(int FrontID) {
        this.io.setIntField(this, 5, FrontID);
        return this;
    }

    public void setFrontID(int frontID) {
        this.FrontID(frontID);
    }

    @Field(6)
    private int SessionID() {
        return this.io.getIntField(this, 6);
    }

    public int getSessionID() {
        return this.SessionID();
    }

    @Field(6)
    private CThostFtdcInputOrderActionField SessionID(int SessionID) {
        this.io.setIntField(this, 6, SessionID);
        return this;
    }

    public void setSessionID(int sessionID) {
        this.SessionID(sessionID);
    }

    @Array({9L})
    @Field(7)
    private Pointer<Byte> ExchangeID() {
        return this.io.getPointerField(this, 7);
    }

    @Array({9L})
    @Field(7)
    public void setExchangeID(String exchangeID) {
        this.io.getPointerField(this, 7).setCString(exchangeID);
    }

    public String getExchangeID() {
        return this.ExchangeID().getCString();
    }

    @Array({21L})
    @Field(8)
    private Pointer<Byte> OrderSysID() {
        return this.io.getPointerField(this, 8);
    }

    @Array({21L})
    @Field(8)
    public void setOrderSysID(String orderSysID) {
        this.io.getPointerField(this, 8).setCString(orderSysID);
    }

    public String getOrderSysID() {
        return this.OrderSysID().getCString();
    }

    @Field(9)
    private byte ActionFlag() {
        return this.io.getByteField(this, 9);
    }

    public char getActionFlag() {
        return (char)this.ActionFlag();
    }

    @Field(9)
    private CThostFtdcInputOrderActionField ActionFlag(byte ActionFlag) {
        this.io.setByteField(this, 9, ActionFlag);
        return this;
    }

    public void setActionFlag(char actionFlag) {
        this.ActionFlag((byte)actionFlag);
    }

    @Field(10)
    private double LimitPrice() {
        return this.io.getDoubleField(this, 10);
    }

    public double getLimitPrice() {
        return this.LimitPrice();
    }

    @Field(10)
    private CThostFtdcInputOrderActionField LimitPrice(double LimitPrice) {
        this.io.setDoubleField(this, 10, LimitPrice);
        return this;
    }

    public void setLimitPrice(double limitPrice) {
        this.LimitPrice(limitPrice);
    }

    @Field(11)
    private int VolumeChange() {
        return this.io.getIntField(this, 11);
    }

    public int getVolumeChange() {
        return this.VolumeChange();
    }

    @Field(11)
    private CThostFtdcInputOrderActionField VolumeChange(int VolumeChange) {
        this.io.setIntField(this, 11, VolumeChange);
        return this;
    }

    public void setVolumeChange(int volumeChange) {
        this.VolumeChange(volumeChange);
    }

    @Array({16L})
    @Field(12)
    private Pointer<Byte> UserID() {
        return this.io.getPointerField(this, 12);
    }

    @Array({16L})
    @Field(12)
    public void setUserID(String userID) {
        this.io.getPointerField(this, 12).setCString(userID);
    }

    public String getUserID() {
        return this.UserID().getCString();
    }

    @Array({31L})
    @Field(13)
    private Pointer<Byte> InstrumentID() {
        return this.io.getPointerField(this, 13);
    }

    @Array({31L})
    @Field(13)
    public void setInstrumentID(String instrumentID) {
        this.io.getPointerField(this, 13).setCString(instrumentID);
    }

    public String getInstrumentID() {
        return this.InstrumentID().getCString();
    }

    public CThostFtdcInputOrderActionField(Pointer pointer) {
        super(pointer);
    }
}
