package com.xceder.ctp.thostftdcuserapistruct;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;

public class CThostFtdcBrokerDepositField extends StructObject {
    public CThostFtdcBrokerDepositField() {
    }

    @Array({9L})
    @Field(0)
    private Pointer<Byte> TradingDay() {
        return this.io.getPointerField(this, 0);
    }

    @Array({9L})
    @Field(0)
    public void setTradingDay(String tradingDay) {
        this.io.getPointerField(this, 0).setCString(tradingDay);
    }

    public String getTradingDay() {
        return this.TradingDay().getCString();
    }

    @Array({11L})
    @Field(1)
    private Pointer<Byte> BrokerID() {
        return this.io.getPointerField(this, 1);
    }

    @Array({11L})
    @Field(1)
    public void setBrokerID(String brokerID) {
        this.io.getPointerField(this, 1).setCString(brokerID);
    }

    public String getBrokerID() {
        return this.BrokerID().getCString();
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

    @Array({9L})
    @Field(3)
    private Pointer<Byte> ExchangeID() {
        return this.io.getPointerField(this, 3);
    }

    @Array({9L})
    @Field(3)
    public void setExchangeID(String exchangeID) {
        this.io.getPointerField(this, 3).setCString(exchangeID);
    }

    public String getExchangeID() {
        return this.ExchangeID().getCString();
    }

    @Field(4)
    private double PreBalance() {
        return this.io.getDoubleField(this, 4);
    }

    public double getPreBalance() {
        return this.PreBalance();
    }

    @Field(4)
    private CThostFtdcBrokerDepositField PreBalance(double PreBalance) {
        this.io.setDoubleField(this, 4, PreBalance);
        return this;
    }

    public void setPreBalance(double preBalance) {
        this.PreBalance(preBalance);
    }

    @Field(5)
    private double CurrMargin() {
        return this.io.getDoubleField(this, 5);
    }

    public double getCurrMargin() {
        return this.CurrMargin();
    }

    @Field(5)
    private CThostFtdcBrokerDepositField CurrMargin(double CurrMargin) {
        this.io.setDoubleField(this, 5, CurrMargin);
        return this;
    }

    public void setCurrMargin(double currMargin) {
        this.CurrMargin(currMargin);
    }

    @Field(6)
    private double CloseProfit() {
        return this.io.getDoubleField(this, 6);
    }

    public double getCloseProfit() {
        return this.CloseProfit();
    }

    @Field(6)
    private CThostFtdcBrokerDepositField CloseProfit(double CloseProfit) {
        this.io.setDoubleField(this, 6, CloseProfit);
        return this;
    }

    public void setCloseProfit(double closeProfit) {
        this.CloseProfit(closeProfit);
    }

    @Field(7)
    private double Balance() {
        return this.io.getDoubleField(this, 7);
    }

    public double getBalance() {
        return this.Balance();
    }

    @Field(7)
    private CThostFtdcBrokerDepositField Balance(double Balance) {
        this.io.setDoubleField(this, 7, Balance);
        return this;
    }

    public void setBalance(double balance) {
        this.Balance(balance);
    }

    @Field(8)
    private double Deposit() {
        return this.io.getDoubleField(this, 8);
    }

    public double getDeposit() {
        return this.Deposit();
    }

    @Field(8)
    private CThostFtdcBrokerDepositField Deposit(double Deposit) {
        this.io.setDoubleField(this, 8, Deposit);
        return this;
    }

    public void setDeposit(double deposit) {
        this.Deposit(deposit);
    }

    @Field(9)
    private double Withdraw() {
        return this.io.getDoubleField(this, 9);
    }

    public double getWithdraw() {
        return this.Withdraw();
    }

    @Field(9)
    private CThostFtdcBrokerDepositField Withdraw(double Withdraw) {
        this.io.setDoubleField(this, 9, Withdraw);
        return this;
    }

    public void setWithdraw(double withdraw) {
        this.Withdraw(withdraw);
    }

    @Field(10)
    private double Available() {
        return this.io.getDoubleField(this, 10);
    }

    public double getAvailable() {
        return this.Available();
    }

    @Field(10)
    private CThostFtdcBrokerDepositField Available(double Available) {
        this.io.setDoubleField(this, 10, Available);
        return this;
    }

    public void setAvailable(double available) {
        this.Available(available);
    }

    @Field(11)
    private double Reserve() {
        return this.io.getDoubleField(this, 11);
    }

    public double getReserve() {
        return this.Reserve();
    }

    @Field(11)
    private CThostFtdcBrokerDepositField Reserve(double Reserve) {
        this.io.setDoubleField(this, 11, Reserve);
        return this;
    }

    public void setReserve(double reserve) {
        this.Reserve(reserve);
    }

    @Field(12)
    private double FrozenMargin() {
        return this.io.getDoubleField(this, 12);
    }

    public double getFrozenMargin() {
        return this.FrozenMargin();
    }

    @Field(12)
    private CThostFtdcBrokerDepositField FrozenMargin(double FrozenMargin) {
        this.io.setDoubleField(this, 12, FrozenMargin);
        return this;
    }

    public void setFrozenMargin(double frozenMargin) {
        this.FrozenMargin(frozenMargin);
    }

    public CThostFtdcBrokerDepositField(Pointer pointer) {
        super(pointer);
    }
}
