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
 * Time: 下午3:31
 */
public class CThostFtdcBrokerWithdrawAlgorithmField extends StructObject {
    public CThostFtdcBrokerWithdrawAlgorithmField() {
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

    @Field(1)
    private byte WithdrawAlgorithm() {
        return this.io.getByteField(this, 1);
    }

    public char getWithdrawAlgorithm() {
        return (char)this.WithdrawAlgorithm();
    }

    @Field(1)
    private CThostFtdcBrokerWithdrawAlgorithmField WithdrawAlgorithm(byte WithdrawAlgorithm) {
        this.io.setByteField(this, 1, WithdrawAlgorithm);
        return this;
    }

    public void setWithdrawAlgorithm(char withdrawAlgorithm) {
        this.WithdrawAlgorithm((byte)withdrawAlgorithm);
    }

    @Field(2)
    private double UsingRatio() {
        return this.io.getDoubleField(this, 2);
    }

    public double getUsingRatio() {
        return this.UsingRatio();
    }

    @Field(2)
    private CThostFtdcBrokerWithdrawAlgorithmField UsingRatio(double UsingRatio) {
        this.io.setDoubleField(this, 2, UsingRatio);
        return this;
    }

    public void setUsingRatio(double usingRatio) {
        this.UsingRatio(usingRatio);
    }

    @Field(3)
    private byte IncludeCloseProfit() {
        return this.io.getByteField(this, 3);
    }

    public char getIncludeCloseProfit() {
        return (char)this.IncludeCloseProfit();
    }

    @Field(3)
    private CThostFtdcBrokerWithdrawAlgorithmField IncludeCloseProfit(byte IncludeCloseProfit) {
        this.io.setByteField(this, 3, IncludeCloseProfit);
        return this;
    }

    public void setIncludeCloseProfit(char includeCloseProfit) {
        this.IncludeCloseProfit((byte)includeCloseProfit);
    }

    @Field(4)
    private byte AllWithoutTrade() {
        return this.io.getByteField(this, 4);
    }

    public char getAllWithoutTrade() {
        return (char)this.AllWithoutTrade();
    }

    @Field(4)
    private CThostFtdcBrokerWithdrawAlgorithmField AllWithoutTrade(byte AllWithoutTrade) {
        this.io.setByteField(this, 4, AllWithoutTrade);
        return this;
    }

    public void setAllWithoutTrade(char allWithoutTrade) {
        this.AllWithoutTrade((byte)allWithoutTrade);
    }

    @Field(5)
    private byte AvailIncludeCloseProfit() {
        return this.io.getByteField(this, 5);
    }

    public char getAvailIncludeCloseProfit() {
        return (char)this.AvailIncludeCloseProfit();
    }

    @Field(5)
    private CThostFtdcBrokerWithdrawAlgorithmField AvailIncludeCloseProfit(byte AvailIncludeCloseProfit) {
        this.io.setByteField(this, 5, AvailIncludeCloseProfit);
        return this;
    }

    public void setAvailIncludeCloseProfit(char availIncludeCloseProfit) {
        this.AvailIncludeCloseProfit((byte)availIncludeCloseProfit);
    }

    @Field(6)
    private int IsBrokerUserEvent() {
        return this.io.getIntField(this, 6);
    }

    public int getIsBrokerUserEvent() {
        return this.IsBrokerUserEvent();
    }

    @Field(6)
    private CThostFtdcBrokerWithdrawAlgorithmField IsBrokerUserEvent(int IsBrokerUserEvent) {
        this.io.setIntField(this, 6, IsBrokerUserEvent);
        return this;
    }

    public void setIsBrokerUserEvent(int isBrokerUserEvent) {
        this.IsBrokerUserEvent(isBrokerUserEvent);
    }

    public CThostFtdcBrokerWithdrawAlgorithmField(Pointer pointer) {
        super(pointer);
    }
}
