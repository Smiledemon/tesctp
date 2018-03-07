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
public class CThostFtdcErrOrderActionField extends StructObject {
    public CThostFtdcErrOrderActionField() {
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
    private CThostFtdcErrOrderActionField OrderActionRef(int OrderActionRef) {
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
    private CThostFtdcErrOrderActionField RequestID(int RequestID) {
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
    private CThostFtdcErrOrderActionField FrontID(int FrontID) {
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
    private CThostFtdcErrOrderActionField SessionID(int SessionID) {
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
    private CThostFtdcErrOrderActionField ActionFlag(byte ActionFlag) {
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
    private CThostFtdcErrOrderActionField LimitPrice(double LimitPrice) {
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
    private CThostFtdcErrOrderActionField VolumeChange(int VolumeChange) {
        this.io.setIntField(this, 11, VolumeChange);
        return this;
    }

    public void setVolumeChange(int volumeChange) {
        this.VolumeChange(volumeChange);
    }

    @Array({9L})
    @Field(12)
    private Pointer<Byte> ActionDate() {
        return this.io.getPointerField(this, 12);
    }

    @Array({9L})
    @Field(12)
    public void setActionDate(String actionDate) {
        this.io.getPointerField(this, 12).setCString(actionDate);
    }

    public String getActionDate() {
        return this.ActionDate().getCString();
    }

    @Array({9L})
    @Field(13)
    private Pointer<Byte> ActionTime() {
        return this.io.getPointerField(this, 13);
    }

    @Array({9L})
    @Field(13)
    public void setActionTime(String actionTime) {
        this.io.getPointerField(this, 13).setCString(actionTime);
    }

    public String getActionTime() {
        return this.ActionTime().getCString();
    }

    @Array({21L})
    @Field(14)
    private Pointer<Byte> TraderID() {
        return this.io.getPointerField(this, 14);
    }

    @Array({21L})
    @Field(14)
    public void setTraderID(String traderID) {
        this.io.getPointerField(this, 14).setCString(traderID);
    }

    public String getTraderID() {
        return this.TraderID().getCString();
    }

    @Field(15)
    private int InstallID() {
        return this.io.getIntField(this, 15);
    }

    public int getInstallID() {
        return this.InstallID();
    }

    @Field(15)
    private CThostFtdcErrOrderActionField InstallID(int InstallID) {
        this.io.setIntField(this, 15, InstallID);
        return this;
    }

    public void setInstallID(int installID) {
        this.InstallID(installID);
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

    @Array({13L})
    @Field(17)
    private Pointer<Byte> ActionLocalID() {
        return this.io.getPointerField(this, 17);
    }

    @Array({13L})
    @Field(17)
    public void setActionLocalID(String actionLocalID) {
        this.io.getPointerField(this, 17).setCString(actionLocalID);
    }

    public String getActionLocalID() {
        return this.ActionLocalID().getCString();
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

    @Array({21L})
    @Field(20)
    private Pointer<Byte> BusinessUnit() {
        return this.io.getPointerField(this, 20);
    }

    @Array({21L})
    @Field(20)
    public void setBusinessUnit(String businessUnit) {
        this.io.getPointerField(this, 20).setCString(businessUnit);
    }

    public String getBusinessUnit() {
        return this.BusinessUnit().getCString();
    }

    @Field(21)
    private byte OrderActionStatus() {
        return this.io.getByteField(this, 21);
    }

    public char getOrderActionStatus() {
        return (char)this.OrderActionStatus();
    }

    @Field(21)
    private CThostFtdcErrOrderActionField OrderActionStatus(byte OrderActionStatus) {
        this.io.setByteField(this, 21, OrderActionStatus);
        return this;
    }

    public void setOrderActionStatus(char orderActionStatus) {
        this.OrderActionStatus((byte)orderActionStatus);
    }

    @Array({16L})
    @Field(22)
    private Pointer<Byte> UserID() {
        return this.io.getPointerField(this, 22);
    }

    @Array({16L})
    @Field(22)
    public void setUserID(String userID) {
        this.io.getPointerField(this, 22).setCString(userID);
    }

    public String getUserID() {
        return this.UserID().getCString();
    }

    @Array({81L})
    @Field(23)
    private Pointer<Byte> StatusMsg() {
        return this.io.getPointerField(this, 23);
    }

    @Array({81L})
    @Field(23)
    public void setStatusMsg(String statusMsg) {
        this.io.getPointerField(this, 23).setCString(statusMsg);
    }

    public String getStatusMsg() {
        return this.StatusMsg().getCString();
    }

    @Array({31L})
    @Field(24)
    private Pointer<Byte> InstrumentID() {
        return this.io.getPointerField(this, 24);
    }

    @Array({31L})
    @Field(24)
    public void setInstrumentID(String instrumentID) {
        this.io.getPointerField(this, 24).setCString(instrumentID);
    }

    public String getInstrumentID() {
        return this.InstrumentID().getCString();
    }

    @Field(25)
    private int ErrorID() {
        return this.io.getIntField(this, 25);
    }

    public int getErrorID() {
        return this.ErrorID();
    }

    @Field(25)
    private CThostFtdcErrOrderActionField ErrorID(int ErrorID) {
        this.io.setIntField(this, 25, ErrorID);
        return this;
    }

    public void setErrorID(int errorID) {
        this.ErrorID(errorID);
    }

    @Array({81L})
    @Field(26)
    private Pointer<Byte> ErrorMsg() {
        return this.io.getPointerField(this, 26);
    }

    @Array({81L})
    @Field(26)
    public void setErrorMsg(String errorMsg) {
        this.io.getPointerField(this, 26).setCString(errorMsg);
    }

    public String getErrorMsg() {
        return this.ErrorMsg().getCString();
    }

    public CThostFtdcErrOrderActionField(Pointer pointer) {
        super(pointer);
    }
}
