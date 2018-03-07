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
 * Time: 下午3:39
 */
public class CThostFtdcInstrumentMarginRateAdjustField extends StructObject {
    public CThostFtdcInstrumentMarginRateAdjustField() {
    }

    @Array({31L})
    @Field(0)
    private Pointer<Byte> InstrumentID() {
        return this.io.getPointerField(this, 0);
    }

    @Array({31L})
    @Field(0)
    public void setInstrumentID(String instrumentID) {
        this.io.getPointerField(this, 0).setCString(instrumentID);
    }

    public String getInstrumentID() {
        return this.InstrumentID().getCString();
    }

    @Field(1)
    private byte InvestorRange() {
        return this.io.getByteField(this, 1);
    }

    public char getInvestorRange() {
        return (char)this.InvestorRange();
    }

    @Field(1)
    private CThostFtdcInstrumentMarginRateAdjustField InvestorRange(byte InvestorRange) {
        this.io.setByteField(this, 1, InvestorRange);
        return this;
    }

    public void setInvestorRange(char investorRange) {
        this.InvestorRange((byte)investorRange);
    }

    @Array({11L})
    @Field(2)
    private Pointer<Byte> BrokerID() {
        return this.io.getPointerField(this, 2);
    }

    @Array({11L})
    @Field(2)
    public void setBrokerID(String brokerID) {
        this.io.getPointerField(this, 2).setCString(brokerID);
    }

    public String getBrokerID() {
        return this.BrokerID().getCString();
    }

    @Array({13L})
    @Field(3)
    private Pointer<Byte> InvestorID() {
        return this.io.getPointerField(this, 3);
    }

    @Array({13L})
    @Field(3)
    public void setInvestorID(String investorID) {
        this.io.getPointerField(this, 3).setCString(investorID);
    }

    public String getInvestorID() {
        return this.InvestorID().getCString();
    }

    @Field(4)
    private byte HedgeFlag() {
        return this.io.getByteField(this, 4);
    }

    public char getHedgeFlag() {
        return (char)this.HedgeFlag();
    }

    @Field(4)
    private CThostFtdcInstrumentMarginRateAdjustField HedgeFlag(byte HedgeFlag) {
        this.io.setByteField(this, 4, HedgeFlag);
        return this;
    }

    public void setHedgeFlag(char hedgeFlag) {
        this.HedgeFlag((byte)hedgeFlag);
    }

    @Field(5)
    private double LongMarginRatioByMoney() {
        return this.io.getDoubleField(this, 5);
    }

    public double getLongMarginRatioByMoney() {
        return this.LongMarginRatioByMoney();
    }

    @Field(5)
    private CThostFtdcInstrumentMarginRateAdjustField LongMarginRatioByMoney(double LongMarginRatioByMoney) {
        this.io.setDoubleField(this, 5, LongMarginRatioByMoney);
        return this;
    }

    public void setLongMarginRatioByMoney(double longMarginRatioByMoney) {
        this.LongMarginRatioByMoney(longMarginRatioByMoney);
    }

    @Field(6)
    private double LongMarginRatioByVolume() {
        return this.io.getDoubleField(this, 6);
    }

    public double getLongMarginRatioByVolume() {
        return this.LongMarginRatioByVolume();
    }

    @Field(6)
    private CThostFtdcInstrumentMarginRateAdjustField LongMarginRatioByVolume(double LongMarginRatioByVolume) {
        this.io.setDoubleField(this, 6, LongMarginRatioByVolume);
        return this;
    }

    public void setLongMarginRatioByVolume(double longMarginRatioByVolume) {
        this.LongMarginRatioByVolume(longMarginRatioByVolume);
    }

    @Field(7)
    private double ShortMarginRatioByMoney() {
        return this.io.getDoubleField(this, 7);
    }

    public double getShortMarginRatioByMoney() {
        return this.ShortMarginRatioByMoney();
    }

    @Field(7)
    private CThostFtdcInstrumentMarginRateAdjustField ShortMarginRatioByMoney(double ShortMarginRatioByMoney) {
        this.io.setDoubleField(this, 7, ShortMarginRatioByMoney);
        return this;
    }

    public void setShortMarginRatioByMoney(double shortMarginRatioByMoney) {
        this.ShortMarginRatioByMoney(shortMarginRatioByMoney);
    }

    @Field(8)
    private double ShortMarginRatioByVolume() {
        return this.io.getDoubleField(this, 8);
    }

    public double getShortMarginRatioByVolume() {
        return this.ShortMarginRatioByVolume();
    }

    @Field(8)
    private CThostFtdcInstrumentMarginRateAdjustField ShortMarginRatioByVolume(double ShortMarginRatioByVolume) {
        this.io.setDoubleField(this, 8, ShortMarginRatioByVolume);
        return this;
    }

    public void setShortMarginRatioByVolume(double shortMarginRatioByVolume) {
        this.ShortMarginRatioByVolume(shortMarginRatioByVolume);
    }

    @Field(9)
    private int IsRelative() {
        return this.io.getIntField(this, 9);
    }

    public int getIsRelative() {
        return this.IsRelative();
    }

    @Field(9)
    private CThostFtdcInstrumentMarginRateAdjustField IsRelative(int IsRelative) {
        this.io.setIntField(this, 9, IsRelative);
        return this;
    }

    public void setIsRelative(int isRelative) {
        this.IsRelative(isRelative);
    }

    public CThostFtdcInstrumentMarginRateAdjustField(Pointer pointer) {
        super(pointer);
    }
}
