package com.xceder.ctp.thostftdcuserapistruct;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;

public class CThostFtdcMDTraderOfferField extends StructObject {
    public CThostFtdcMDTraderOfferField() {
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
    private Pointer<Byte> TraderID() {
        return this.io.getPointerField(this, 1);
    }

    @Array({21L})
    @Field(1)
    public void setTraderID(String traderID) {
        this.io.getPointerField(this, 1).setCString(traderID);
    }

    public String getTraderID() {
        return this.TraderID().getCString();
    }

    @Array({11L})
    @Field(2)
    private Pointer<Byte> ParticipantID() {
        return this.io.getPointerField(this, 2);
    }

    @Array({11L})
    @Field(2)
    public void setParticipantID(String participantID) {
        this.io.getPointerField(this, 2).setCString(participantID);
    }

    public String getParticipantID() {
        return this.ParticipantID().getCString();
    }

    @Array({41L})
    @Field(3)
    private Pointer<Byte> Password() {
        return this.io.getPointerField(this, 3);
    }

    @Array({41L})
    @Field(3)
    public void setPassword(String password) {
        this.io.getPointerField(this, 3).setCString(password);
    }

    public String getPassword() {
        return this.Password().getCString();
    }

    @Field(4)
    private int InstallID() {
        return this.io.getIntField(this, 4);
    }

    public int getInstallID() {
        return this.InstallID();
    }

    @Field(4)
    private CThostFtdcMDTraderOfferField InstallID(int InstallID) {
        this.io.setIntField(this, 4, InstallID);
        return this;
    }

    public void setInstallID(int installID) {
        this.InstallID(installID);
    }

    @Array({13L})
    @Field(5)
    private Pointer<Byte> OrderLocalID() {
        return this.io.getPointerField(this, 5);
    }

    @Array({13L})
    @Field(5)
    public void setOrderLocalID(String orderLocalID) {
        this.io.getPointerField(this, 5).setCString(orderLocalID);
    }

    public String getOrderLocalID() {
        return this.OrderLocalID().getCString();
    }

    @Field(6)
    private byte TraderConnectStatus() {
        return this.io.getByteField(this, 6);
    }

    public char getTraderConnectStatus() {
        return (char)this.TraderConnectStatus();
    }

    @Field(6)
    private CThostFtdcMDTraderOfferField TraderConnectStatus(byte TraderConnectStatus) {
        this.io.setByteField(this, 6, TraderConnectStatus);
        return this;
    }

    public void setTraderConnectStatus(char traderConnectStatus) {
        this.TraderConnectStatus((byte)traderConnectStatus);
    }

    @Array({9L})
    @Field(7)
    private Pointer<Byte> ConnectRequestDate() {
        return this.io.getPointerField(this, 7);
    }

    @Array({9L})
    @Field(7)
    public void setConnectRequestDate(String connectRequestDate) {
        this.io.getPointerField(this, 7).setCString(connectRequestDate);
    }

    public String getConnectRequestDate() {
        return this.ConnectRequestDate().getCString();
    }

    @Array({9L})
    @Field(8)
    private Pointer<Byte> ConnectRequestTime() {
        return this.io.getPointerField(this, 8);
    }

    @Array({9L})
    @Field(8)
    public void setConnectRequestTime(String connectRequestTime) {
        this.io.getPointerField(this, 8).setCString(connectRequestTime);
    }

    public String getConnectRequestTime() {
        return this.ConnectRequestTime().getCString();
    }

    @Array({9L})
    @Field(9)
    private Pointer<Byte> LastReportDate() {
        return this.io.getPointerField(this, 9);
    }

    @Array({9L})
    @Field(9)
    public void setLastReportDate(String lastReportDate) {
        this.io.getPointerField(this, 9).setCString(lastReportDate);
    }

    public String getLastReportDate() {
        return this.LastReportDate().getCString();
    }

    @Array({9L})
    @Field(10)
    private Pointer<Byte> LastReportTime() {
        return this.io.getPointerField(this, 10);
    }

    @Array({9L})
    @Field(10)
    public void setLastReportTime(String lastReportTime) {
        this.io.getPointerField(this, 10).setCString(lastReportTime);
    }

    public String getLastReportTime() {
        return this.LastReportTime().getCString();
    }

    @Array({9L})
    @Field(11)
    private Pointer<Byte> ConnectDate() {
        return this.io.getPointerField(this, 11);
    }

    @Array({9L})
    @Field(11)
    public void setConnectDate(String connectDate) {
        this.io.getPointerField(this, 11).setCString(connectDate);
    }

    public String getConnectDate() {
        return this.ConnectDate().getCString();
    }

    @Array({9L})
    @Field(12)
    private Pointer<Byte> ConnectTime() {
        return this.io.getPointerField(this, 12);
    }

    @Array({9L})
    @Field(12)
    public void setConnectTime(String connectTime) {
        this.io.getPointerField(this, 12).setCString(connectTime);
    }

    public String getConnectTime() {
        return this.ConnectTime().getCString();
    }

    @Array({9L})
    @Field(13)
    private Pointer<Byte> StartDate() {
        return this.io.getPointerField(this, 13);
    }

    @Array({9L})
    @Field(13)
    public void setStartDate(String startDate) {
        this.io.getPointerField(this, 13).setCString(startDate);
    }

    public String getStartDate() {
        return this.StartDate().getCString();
    }

    @Array({9L})
    @Field(14)
    private Pointer<Byte> StartTime() {
        return this.io.getPointerField(this, 14);
    }

    @Array({9L})
    @Field(14)
    public void setStartTime(String startTime) {
        this.io.getPointerField(this, 14).setCString(startTime);
    }

    public String getStartTime() {
        return this.StartTime().getCString();
    }

    @Array({9L})
    @Field(15)
    private Pointer<Byte> TradingDay() {
        return this.io.getPointerField(this, 15);
    }

    @Array({9L})
    @Field(15)
    public void setTradingDay(String tradingDay) {
        this.io.getPointerField(this, 15).setCString(tradingDay);
    }

    public String getTradingDay() {
        return this.TradingDay().getCString();
    }

    @Array({11L})
    @Field(16)
    private Pointer<Byte> BrokerID() {
        return this.io.getPointerField(this, 16);
    }

    @Array({11L})
    @Field(16)
    public void setBrokerID(String brokerID) {
        this.io.getPointerField(this, 16).setCString(brokerID);
    }

    public String getBrokerID() {
        return this.BrokerID().getCString();
    }

    @Array({21L})
    @Field(17)
    private Pointer<Byte> MaxTradeID() {
        return this.io.getPointerField(this, 17);
    }

    @Array({21L})
    @Field(17)
    public void setMaxTradeID(String maxTradeID) {
        this.io.getPointerField(this, 17).setCString(maxTradeID);
    }

    public String getMaxTradeID() {
        return this.MaxTradeID().getCString();
    }

    @Array({7L})
    @Field(18)
    private Pointer<Byte> MaxOrderMessageReference() {
        return this.io.getPointerField(this, 18);
    }

    @Array({7L})
    @Field(18)
    public void setMaxOrderMessageReference(String maxOrderMessageReference) {
        this.io.getPointerField(this, 18).setCString(maxOrderMessageReference);
    }

    public String getMaxOrderMessageReference() {
        return this.MaxOrderMessageReference().getCString();
    }

    public CThostFtdcMDTraderOfferField(Pointer pointer) {
        super(pointer);
    }
}
