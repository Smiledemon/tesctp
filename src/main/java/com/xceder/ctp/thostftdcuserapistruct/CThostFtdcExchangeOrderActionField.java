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
public class CThostFtdcExchangeOrderActionField extends StructObject {
    public CThostFtdcExchangeOrderActionField() {
    }

    @Array({9L})
    @Field(0)
    private Pointer<Byte> ExchangeID() {
        return this.io.getPointerField(this, 0);
    }

    @Array({9L})
    @Field(0)
    public void setExchangeID(String exchangeID) {
        this.io.getPointerField(this, 0).setCString(exchangeID);
    }

    public String getExchangeID() {
        return this.ExchangeID().getCString();
    }

    @Array({21L})
    @Field(1)
    private Pointer<Byte> OrderSysID() {
        return this.io.getPointerField(this, 1);
    }

    @Array({21L})
    @Field(1)
    public void setOrderSysID(String orderSysID) {
        this.io.getPointerField(this, 1).setCString(orderSysID);
    }

    public String getOrderSysID() {
        return this.OrderSysID().getCString();
    }

    @Field(2)
    private byte ActionFlag() {
        return this.io.getByteField(this, 2);
    }

    public char getActionFlag() {
        return (char)this.ActionFlag();
    }

    @Field(2)
    private CThostFtdcExchangeOrderActionField ActionFlag(byte ActionFlag) {
        this.io.setByteField(this, 2, ActionFlag);
        return this;
    }

    public void setActionFlag(char actionFlag) {
        this.ActionFlag((byte)actionFlag);
    }

    @Field(3)
    private double LimitPrice() {
        return this.io.getDoubleField(this, 3);
    }

    public double getLimitPrice() {
        return this.LimitPrice();
    }

    @Field(3)
    private CThostFtdcExchangeOrderActionField LimitPrice(double LimitPrice) {
        this.io.setDoubleField(this, 3, LimitPrice);
        return this;
    }

    public void setLimitPrice(double limitPrice) {
        this.LimitPrice(limitPrice);
    }

    @Field(4)
    private int VolumeChange() {
        return this.io.getIntField(this, 4);
    }

    public int getVolumeChange() {
        return this.VolumeChange();
    }

    @Field(4)
    private CThostFtdcExchangeOrderActionField VolumeChange(int VolumeChange) {
        this.io.setIntField(this, 4, VolumeChange);
        return this;
    }

    public void setVolumeChange(int volumeChange) {
        this.VolumeChange(volumeChange);
    }

    @Array({9L})
    @Field(5)
    private Pointer<Byte> ActionDate() {
        return this.io.getPointerField(this, 5);
    }

    @Array({9L})
    @Field(5)
    public void setActionDate(String actionDate) {
        this.io.getPointerField(this, 5).setCString(actionDate);
    }

    public String getActionDate() {
        return this.ActionDate().getCString();
    }

    @Array({9L})
    @Field(6)
    private Pointer<Byte> ActionTime() {
        return this.io.getPointerField(this, 6);
    }

    @Array({9L})
    @Field(6)
    public void setActionTime(String actionTime) {
        this.io.getPointerField(this, 6).setCString(actionTime);
    }

    public String getActionTime() {
        return this.ActionTime().getCString();
    }

    @Array({21L})
    @Field(7)
    private Pointer<Byte> TraderID() {
        return this.io.getPointerField(this, 7);
    }

    @Array({21L})
    @Field(7)
    public void setTraderID(String traderID) {
        this.io.getPointerField(this, 7).setCString(traderID);
    }

    public String getTraderID() {
        return this.TraderID().getCString();
    }

    @Field(8)
    private int InstallID() {
        return this.io.getIntField(this, 8);
    }

    public int getInstallID() {
        return this.InstallID();
    }

    @Field(8)
    private CThostFtdcExchangeOrderActionField InstallID(int InstallID) {
        this.io.setIntField(this, 8, InstallID);
        return this;
    }

    public void setInstallID(int installID) {
        this.InstallID(installID);
    }

    @Array({13L})
    @Field(9)
    private Pointer<Byte> OrderLocalID() {
        return this.io.getPointerField(this, 9);
    }

    @Array({13L})
    @Field(9)
    public void setOrderLocalID(String orderLocalID) {
        this.io.getPointerField(this, 9).setCString(orderLocalID);
    }

    public String getOrderLocalID() {
        return this.OrderLocalID().getCString();
    }

    @Array({13L})
    @Field(10)
    private Pointer<Byte> ActionLocalID() {
        return this.io.getPointerField(this, 10);
    }

    @Array({13L})
    @Field(10)
    public void setActionLocalID(String actionLocalID) {
        this.io.getPointerField(this, 10).setCString(actionLocalID);
    }

    public String getActionLocalID() {
        return this.ActionLocalID().getCString();
    }

    @Array({11L})
    @Field(11)
    private Pointer<Byte> ParticipantID() {
        return this.io.getPointerField(this, 11);
    }

    @Array({11L})
    @Field(11)
    public void setParticipantID(String participantID) {
        this.io.getPointerField(this, 11).setCString(participantID);
    }

    public String getParticipantID() {
        return this.ParticipantID().getCString();
    }

    @Array({11L})
    @Field(12)
    private Pointer<Byte> ClientID() {
        return this.io.getPointerField(this, 12);
    }

    @Array({11L})
    @Field(12)
    public void setClientID(String clientID) {
        this.io.getPointerField(this, 12).setCString(clientID);
    }

    public String getClientID() {
        return this.ClientID().getCString();
    }

    @Array({21L})
    @Field(13)
    private Pointer<Byte> BusinessUnit() {
        return this.io.getPointerField(this, 13);
    }

    @Array({21L})
    @Field(13)
    public void setBusinessUnit(String businessUnit) {
        this.io.getPointerField(this, 13).setCString(businessUnit);
    }

    public String getBusinessUnit() {
        return this.BusinessUnit().getCString();
    }

    @Field(14)
    private byte OrderActionStatus() {
        return this.io.getByteField(this, 14);
    }

    public char getOrderActionStatus() {
        return (char)this.OrderActionStatus();
    }

    @Field(14)
    private CThostFtdcExchangeOrderActionField OrderActionStatus(byte OrderActionStatus) {
        this.io.setByteField(this, 14, OrderActionStatus);
        return this;
    }

    public void setOrderActionStatus(char orderActionStatus) {
        this.OrderActionStatus((byte)orderActionStatus);
    }

    @Array({16L})
    @Field(15)
    private Pointer<Byte> UserID() {
        return this.io.getPointerField(this, 15);
    }

    @Array({16L})
    @Field(15)
    public void setUserID(String userID) {
        this.io.getPointerField(this, 15).setCString(userID);
    }

    public String getUserID() {
        return this.UserID().getCString();
    }

    public CThostFtdcExchangeOrderActionField(Pointer pointer) {
        super(pointer);
    }
}
