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
public class CThostFtdcFutureSignIOField extends StructObject {
    public CThostFtdcFutureSignIOField() {
    }

    @Array({7L})
    @Field(0)
    private Pointer<Byte> TradeCode() {
        return this.io.getPointerField(this, 0);
    }

    @Array({7L})
    @Field(0)
    public void setTradeCode(String tradeCode) {
        this.io.getPointerField(this, 0).setCString(tradeCode);
    }

    public String getTradeCode() {
        return this.TradeCode().getCString();
    }

    @Array({4L})
    @Field(1)
    private Pointer<Byte> BankID() {
        return this.io.getPointerField(this, 1);
    }

    @Array({4L})
    @Field(1)
    public void setBankID(String bankID) {
        this.io.getPointerField(this, 1).setCString(bankID);
    }

    public String getBankID() {
        return this.BankID().getCString();
    }

    @Array({5L})
    @Field(2)
    private Pointer<Byte> BankBranchID() {
        return this.io.getPointerField(this, 2);
    }

    @Array({5L})
    @Field(2)
    public void setBankBranchID(String bankBranchID) {
        this.io.getPointerField(this, 2).setCString(bankBranchID);
    }

    public String getBankBranchID() {
        return this.BankBranchID().getCString();
    }

    @Array({11L})
    @Field(3)
    private Pointer<Byte> BrokerID() {
        return this.io.getPointerField(this, 3);
    }

    @Array({11L})
    @Field(3)
    public void setBrokerID(String brokerID) {
        this.io.getPointerField(this, 3).setCString(brokerID);
    }

    public String getBrokerID() {
        return this.BrokerID().getCString();
    }

    @Array({31L})
    @Field(4)
    private Pointer<Byte> BrokerBranchID() {
        return this.io.getPointerField(this, 4);
    }

    @Array({31L})
    @Field(4)
    public void setBrokerBranchID(String brokerBranchID) {
        this.io.getPointerField(this, 4).setCString(brokerBranchID);
    }

    public String getBrokerBranchID() {
        return this.BrokerBranchID().getCString();
    }

    @Array({9L})
    @Field(5)
    private Pointer<Byte> TradeDate() {
        return this.io.getPointerField(this, 5);
    }

    @Array({9L})
    @Field(5)
    public void setTradeDate(String tradeDate) {
        this.io.getPointerField(this, 5).setCString(tradeDate);
    }

    public String getTradeDate() {
        return this.TradeDate().getCString();
    }

    @Array({9L})
    @Field(6)
    private Pointer<Byte> TradeTime() {
        return this.io.getPointerField(this, 6);
    }

    @Array({9L})
    @Field(6)
    public void setTradeTime(String tradeTime) {
        this.io.getPointerField(this, 6).setCString(tradeTime);
    }

    public String getTradeTime() {
        return this.TradeTime().getCString();
    }

    @Array({13L})
    @Field(7)
    private Pointer<Byte> BankSerial() {
        return this.io.getPointerField(this, 7);
    }

    @Array({13L})
    @Field(7)
    public void setBankSerial(String bankSerial) {
        this.io.getPointerField(this, 7).setCString(bankSerial);
    }

    public String getBankSerial() {
        return this.BankSerial().getCString();
    }

    @Array({9L})
    @Field(8)
    private Pointer<Byte> TradingDay() {
        return this.io.getPointerField(this, 8);
    }

    @Array({9L})
    @Field(8)
    public void setTradingDay(String tradingDay) {
        this.io.getPointerField(this, 8).setCString(tradingDay);
    }

    public String getTradingDay() {
        return this.TradingDay().getCString();
    }

    @Field(9)
    private int PlateSerial() {
        return this.io.getIntField(this, 9);
    }

    public int getPlateSerial() {
        return this.PlateSerial();
    }

    @Field(9)
    private CThostFtdcFutureSignIOField PlateSerial(int PlateSerial) {
        this.io.setIntField(this, 9, PlateSerial);
        return this;
    }

    public void setPlateSerial(int plateSerial) {
        this.PlateSerial(plateSerial);
    }

    @Field(10)
    private byte LastFragment() {
        return this.io.getByteField(this, 10);
    }

    public char getLastFragment() {
        return (char)this.LastFragment();
    }

    @Field(10)
    private CThostFtdcFutureSignIOField LastFragment(byte LastFragment) {
        this.io.setByteField(this, 10, LastFragment);
        return this;
    }

    public void setLastFragment(char lastFragment) {
        this.LastFragment((byte)lastFragment);
    }

    @Field(11)
    private int SessionID() {
        return this.io.getIntField(this, 11);
    }

    public int getSessionID() {
        return this.SessionID();
    }

    @Field(11)
    private CThostFtdcFutureSignIOField SessionID(int SessionID) {
        this.io.setIntField(this, 11, SessionID);
        return this;
    }

    public void setSessionID(int sessionID) {
        this.SessionID(sessionID);
    }

    @Field(12)
    private int InstallID() {
        return this.io.getIntField(this, 12);
    }

    public int getInstallID() {
        return this.InstallID();
    }

    @Field(12)
    private CThostFtdcFutureSignIOField InstallID(int InstallID) {
        this.io.setIntField(this, 12, InstallID);
        return this;
    }

    public void setInstallID(int installID) {
        this.InstallID(installID);
    }

    @Array({16L})
    @Field(13)
    private Pointer<Byte> UserID() {
        return this.io.getPointerField(this, 13);
    }

    @Array({16L})
    @Field(13)
    public void setUserID(String userID) {
        this.io.getPointerField(this, 13).setCString(userID);
    }

    public String getUserID() {
        return this.UserID().getCString();
    }

    @Array({36L})
    @Field(14)
    private Pointer<Byte> Digest() {
        return this.io.getPointerField(this, 14);
    }

    @Array({36L})
    @Field(14)
    public void setDigest(String digest) {
        this.io.getPointerField(this, 14).setCString(digest);
    }

    public String getDigest() {
        return this.Digest().getCString();
    }

    @Array({4L})
    @Field(15)
    private Pointer<Byte> CurrencyID() {
        return this.io.getPointerField(this, 15);
    }

    @Array({4L})
    @Field(15)
    public void setCurrencyID(String currencyID) {
        this.io.getPointerField(this, 15).setCString(currencyID);
    }

    public String getCurrencyID() {
        return this.CurrencyID().getCString();
    }

    @Array({3L})
    @Field(16)
    private Pointer<Byte> DeviceID() {
        return this.io.getPointerField(this, 16);
    }

    @Array({3L})
    @Field(16)
    public void setDeviceID(String deviceID) {
        this.io.getPointerField(this, 16).setCString(deviceID);
    }

    public String getDeviceID() {
        return this.DeviceID().getCString();
    }

    @Array({33L})
    @Field(17)
    private Pointer<Byte> BrokerIDByBank() {
        return this.io.getPointerField(this, 17);
    }

    @Array({33L})
    @Field(17)
    public void setBrokerIDByBank(String brokerIDByBank) {
        this.io.getPointerField(this, 17).setCString(brokerIDByBank);
    }

    public String getBrokerIDByBank() {
        return this.BrokerIDByBank().getCString();
    }

    @Array({17L})
    @Field(18)
    private Pointer<Byte> OperNo() {
        return this.io.getPointerField(this, 18);
    }

    @Array({17L})
    @Field(18)
    public void setOperNo(String operNo) {
        this.io.getPointerField(this, 18).setCString(operNo);
    }

    public String getOperNo() {
        return this.OperNo().getCString();
    }

    @Field(19)
    private int RequestID() {
        return this.io.getIntField(this, 19);
    }

    public int getRequestID() {
        return this.RequestID();
    }

    @Field(19)
    private CThostFtdcFutureSignIOField RequestID(int RequestID) {
        this.io.setIntField(this, 19, RequestID);
        return this;
    }

    public void setRequestID(int requestID) {
        this.RequestID(requestID);
    }

    @Field(20)
    private int TID() {
        return this.io.getIntField(this, 20);
    }

    public int getTID() {
        return this.TID();
    }

    @Field(20)
    private CThostFtdcFutureSignIOField TID(int TID) {
        this.io.setIntField(this, 20, TID);
        return this;
    }

    public void setTID(int tID) {
        this.TID(tID);
    }

    public CThostFtdcFutureSignIOField(Pointer pointer) {
        super(pointer);
    }
}
