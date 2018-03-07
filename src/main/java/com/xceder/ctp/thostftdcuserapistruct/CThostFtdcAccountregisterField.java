package com.xceder.ctp.thostftdcuserapistruct;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;

public class CThostFtdcAccountregisterField extends StructObject {
    public CThostFtdcAccountregisterField() {
    }

    @Array({9L})
    @Field(0)
    private Pointer<Byte> TradeDay() {
        return this.io.getPointerField(this, 0);
    }

    @Array({9L})
    @Field(0)
    public void setTradeDay(String tradeDay) {
        this.io.getPointerField(this, 0).setCString(tradeDay);
    }

    public String getTradeDay() {
        return this.TradeDay().getCString();
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

    @Array({41L})
    @Field(3)
    private Pointer<Byte> BankAccount() {
        return this.io.getPointerField(this, 3);
    }

    @Array({41L})
    @Field(3)
    public void setBankAccount(String bankAccount) {
        this.io.getPointerField(this, 3).setCString(bankAccount);
    }

    public String getBankAccount() {
        return this.BankAccount().getCString();
    }

    @Array({11L})
    @Field(4)
    private Pointer<Byte> BrokerID() {
        return this.io.getPointerField(this, 4);
    }

    @Array({11L})
    @Field(4)
    public void setBrokerID(String brokerID) {
        this.io.getPointerField(this, 4).setCString(brokerID);
    }

    public String getBrokerID() {
        return this.BrokerID().getCString();
    }

    @Array({31L})
    @Field(5)
    private Pointer<Byte> BrokerBranchID() {
        return this.io.getPointerField(this, 5);
    }

    @Array({31L})
    @Field(5)
    public void setBrokerBranchID(String brokerBranchID) {
        this.io.getPointerField(this, 5).setCString(brokerBranchID);
    }

    public String getBrokerBranchID() {
        return this.BrokerBranchID().getCString();
    }

    @Array({13L})
    @Field(6)
    private Pointer<Byte> AccountID() {
        return this.io.getPointerField(this, 6);
    }

    @Array({13L})
    @Field(6)
    public void setAccountID(String accountID) {
        this.io.getPointerField(this, 6).setCString(accountID);
    }

    public String getAccountID() {
        return this.AccountID().getCString();
    }

    @Field(7)
    private byte IdCardType() {
        return this.io.getByteField(this, 7);
    }

    public char getIdCardType() {
        return (char)this.IdCardType();
    }

    @Field(7)
    private CThostFtdcAccountregisterField IdCardType(byte IdCardType) {
        this.io.setByteField(this, 7, IdCardType);
        return this;
    }

    public void setIdCardType(char idCardType) {
        this.IdCardType((byte)idCardType);
    }

    @Array({51L})
    @Field(8)
    private Pointer<Byte> IdentifiedCardNo() {
        return this.io.getPointerField(this, 8);
    }

    @Array({51L})
    @Field(8)
    public void setIdentifiedCardNo(String identifiedCardNo) {
        this.io.getPointerField(this, 8).setCString(identifiedCardNo);
    }

    public String getIdentifiedCardNo() {
        return this.IdentifiedCardNo().getCString();
    }

    @Array({51L})
    @Field(9)
    private Pointer<Byte> CustomerName() {
        return this.io.getPointerField(this, 9);
    }

    @Array({51L})
    @Field(9)
    public void setCustomerName(String customerName) {
        this.io.getPointerField(this, 9).setCString(customerName);
    }

    public String getCustomerName() {
        return this.CustomerName().getCString();
    }

    @Array({4L})
    @Field(10)
    private Pointer<Byte> CurrencyID() {
        return this.io.getPointerField(this, 10);
    }

    @Array({4L})
    @Field(10)
    public void setCurrencyID(String currencyID) {
        this.io.getPointerField(this, 10).setCString(currencyID);
    }

    public String getCurrencyID() {
        return this.CurrencyID().getCString();
    }

    @Field(11)
    private byte OpenOrDestroy() {
        return this.io.getByteField(this, 11);
    }

    public char getOpenOrDestroy() {
        return (char)this.OpenOrDestroy();
    }

    @Field(11)
    private CThostFtdcAccountregisterField OpenOrDestroy(byte OpenOrDestroy) {
        this.io.setByteField(this, 11, OpenOrDestroy);
        return this;
    }

    public void setOpenOrDestroy(char openOrDestroy) {
        this.OpenOrDestroy((byte)openOrDestroy);
    }

    @Array({9L})
    @Field(12)
    private Pointer<Byte> RegDate() {
        return this.io.getPointerField(this, 12);
    }

    @Array({9L})
    @Field(12)
    public void setRegDate(String regDate) {
        this.io.getPointerField(this, 12).setCString(regDate);
    }

    public String getRegDate() {
        return this.RegDate().getCString();
    }

    @Array({9L})
    @Field(13)
    private Pointer<Byte> OutDate() {
        return this.io.getPointerField(this, 13);
    }

    @Array({9L})
    @Field(13)
    public void setOutDate(String outDate) {
        this.io.getPointerField(this, 13).setCString(outDate);
    }

    public String getOutDate() {
        return this.OutDate().getCString();
    }

    @Field(14)
    private int TID() {
        return this.io.getIntField(this, 14);
    }

    public int getTID() {
        return this.TID();
    }

    @Field(14)
    private CThostFtdcAccountregisterField TID(int TID) {
        this.io.setIntField(this, 14, TID);
        return this;
    }

    public void setTID(int tID) {
        this.TID(tID);
    }

    @Field(15)
    private byte CustType() {
        return this.io.getByteField(this, 15);
    }

    public char getCustType() {
        return (char)this.CustType();
    }

    @Field(15)
    private CThostFtdcAccountregisterField CustType(byte CustType) {
        this.io.setByteField(this, 15, CustType);
        return this;
    }

    public void setCustType(char custType) {
        this.CustType((byte)custType);
    }

    @Field(16)
    private byte BankAccType() {
        return this.io.getByteField(this, 16);
    }

    public char getBankAccType() {
        return (char)this.BankAccType();
    }

    @Field(16)
    private CThostFtdcAccountregisterField BankAccType(byte BankAccType) {
        this.io.setByteField(this, 16, BankAccType);
        return this;
    }

    public void setBankAccType(char bankAccType) {
        this.BankAccType((byte)bankAccType);
    }

    public CThostFtdcAccountregisterField(Pointer pointer) {
        super(pointer);
    }
}
