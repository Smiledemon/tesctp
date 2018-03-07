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
public class CThostFtdcExchangeMarginRateAdjustField extends StructObject {
    public CThostFtdcExchangeMarginRateAdjustField() {
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

    @Array({31L})
    @Field(1)
    private Pointer<Byte> InstrumentID() {
        return this.io.getPointerField(this, 1);
    }

    @Array({31L})
    @Field(1)
    public void setInstrumentID(String instrumentID) {
        this.io.getPointerField(this, 1).setCString(instrumentID);
    }

    public String getInstrumentID() {
        return this.InstrumentID().getCString();
    }

    @Field(2)
    private byte HedgeFlag() {
        return this.io.getByteField(this, 2);
    }

    public char getHedgeFlag() {
        return (char)this.HedgeFlag();
    }

    @Field(2)
    private CThostFtdcExchangeMarginRateAdjustField HedgeFlag(byte HedgeFlag) {
        this.io.setByteField(this, 2, HedgeFlag);
        return this;
    }

    public void setHedgeFlag(char hedgeFlag) {
        this.HedgeFlag((byte)hedgeFlag);
    }

    @Field(3)
    private double LongMarginRatioByMoney() {
        return this.io.getDoubleField(this, 3);
    }

    public double getLongMarginRatioByMoney() {
        return this.LongMarginRatioByMoney();
    }

    @Field(3)
    private CThostFtdcExchangeMarginRateAdjustField LongMarginRatioByMoney(double LongMarginRatioByMoney) {
        this.io.setDoubleField(this, 3, LongMarginRatioByMoney);
        return this;
    }

    public void setLongMarginRatioByMoney(double longMarginRatioByMoney) {
        this.LongMarginRatioByMoney(longMarginRatioByMoney);
    }

    @Field(4)
    private double LongMarginRatioByVolume() {
        return this.io.getDoubleField(this, 4);
    }

    public double getLongMarginRatioByVolume() {
        return this.LongMarginRatioByVolume();
    }

    @Field(4)
    private CThostFtdcExchangeMarginRateAdjustField LongMarginRatioByVolume(double LongMarginRatioByVolume) {
        this.io.setDoubleField(this, 4, LongMarginRatioByVolume);
        return this;
    }

    public void setLongMarginRatioByVolume(double longMarginRatioByVolume) {
        this.LongMarginRatioByVolume(longMarginRatioByVolume);
    }

    @Field(5)
    private double ShortMarginRatioByMoney() {
        return this.io.getDoubleField(this, 5);
    }

    public double getShortMarginRatioByMoney() {
        return this.ShortMarginRatioByMoney();
    }

    @Field(5)
    private CThostFtdcExchangeMarginRateAdjustField ShortMarginRatioByMoney(double ShortMarginRatioByMoney) {
        this.io.setDoubleField(this, 5, ShortMarginRatioByMoney);
        return this;
    }

    public void setShortMarginRatioByMoney(double shortMarginRatioByMoney) {
        this.ShortMarginRatioByMoney(shortMarginRatioByMoney);
    }

    @Field(6)
    private double ShortMarginRatioByVolume() {
        return this.io.getDoubleField(this, 6);
    }

    public double getShortMarginRatioByVolume() {
        return this.ShortMarginRatioByVolume();
    }

    @Field(6)
    private CThostFtdcExchangeMarginRateAdjustField ShortMarginRatioByVolume(double ShortMarginRatioByVolume) {
        this.io.setDoubleField(this, 6, ShortMarginRatioByVolume);
        return this;
    }

    public void setShortMarginRatioByVolume(double shortMarginRatioByVolume) {
        this.ShortMarginRatioByVolume(shortMarginRatioByVolume);
    }

    @Field(7)
    private double ExchLongMarginRatioByMoney() {
        return this.io.getDoubleField(this, 7);
    }

    public double getExchLongMarginRatioByMoney() {
        return this.ExchLongMarginRatioByMoney();
    }

    @Field(7)
    private CThostFtdcExchangeMarginRateAdjustField ExchLongMarginRatioByMoney(double ExchLongMarginRatioByMoney) {
        this.io.setDoubleField(this, 7, ExchLongMarginRatioByMoney);
        return this;
    }

    public void setExchLongMarginRatioByMoney(double exchLongMarginRatioByMoney) {
        this.ExchLongMarginRatioByMoney(exchLongMarginRatioByMoney);
    }

    @Field(8)
    private double ExchLongMarginRatioByVolume() {
        return this.io.getDoubleField(this, 8);
    }

    public double getExchLongMarginRatioByVolume() {
        return this.ExchLongMarginRatioByVolume();
    }

    @Field(8)
    private CThostFtdcExchangeMarginRateAdjustField ExchLongMarginRatioByVolume(double ExchLongMarginRatioByVolume) {
        this.io.setDoubleField(this, 8, ExchLongMarginRatioByVolume);
        return this;
    }

    public void setExchLongMarginRatioByVolume(double exchLongMarginRatioByVolume) {
        this.ExchLongMarginRatioByVolume(exchLongMarginRatioByVolume);
    }

    @Field(9)
    private double ExchShortMarginRatioByMoney() {
        return this.io.getDoubleField(this, 9);
    }

    public double getExchShortMarginRatioByMoney() {
        return this.ExchShortMarginRatioByMoney();
    }

    @Field(9)
    private CThostFtdcExchangeMarginRateAdjustField ExchShortMarginRatioByMoney(double ExchShortMarginRatioByMoney) {
        this.io.setDoubleField(this, 9, ExchShortMarginRatioByMoney);
        return this;
    }

    public void setExchShortMarginRatioByMoney(double exchShortMarginRatioByMoney) {
        this.ExchShortMarginRatioByMoney(exchShortMarginRatioByMoney);
    }

    @Field(10)
    private double ExchShortMarginRatioByVolume() {
        return this.io.getDoubleField(this, 10);
    }

    public double getExchShortMarginRatioByVolume() {
        return this.ExchShortMarginRatioByVolume();
    }

    @Field(10)
    private CThostFtdcExchangeMarginRateAdjustField ExchShortMarginRatioByVolume(double ExchShortMarginRatioByVolume) {
        this.io.setDoubleField(this, 10, ExchShortMarginRatioByVolume);
        return this;
    }

    public void setExchShortMarginRatioByVolume(double exchShortMarginRatioByVolume) {
        this.ExchShortMarginRatioByVolume(exchShortMarginRatioByVolume);
    }

    @Field(11)
    private double NoLongMarginRatioByMoney() {
        return this.io.getDoubleField(this, 11);
    }

    public double getNoLongMarginRatioByMoney() {
        return this.NoLongMarginRatioByMoney();
    }

    @Field(11)
    private CThostFtdcExchangeMarginRateAdjustField NoLongMarginRatioByMoney(double NoLongMarginRatioByMoney) {
        this.io.setDoubleField(this, 11, NoLongMarginRatioByMoney);
        return this;
    }

    public void setNoLongMarginRatioByMoney(double noLongMarginRatioByMoney) {
        this.NoLongMarginRatioByMoney(noLongMarginRatioByMoney);
    }

    @Field(12)
    private double NoLongMarginRatioByVolume() {
        return this.io.getDoubleField(this, 12);
    }

    public double getNoLongMarginRatioByVolume() {
        return this.NoLongMarginRatioByVolume();
    }

    @Field(12)
    private CThostFtdcExchangeMarginRateAdjustField NoLongMarginRatioByVolume(double NoLongMarginRatioByVolume) {
        this.io.setDoubleField(this, 12, NoLongMarginRatioByVolume);
        return this;
    }

    public void setNoLongMarginRatioByVolume(double noLongMarginRatioByVolume) {
        this.NoLongMarginRatioByVolume(noLongMarginRatioByVolume);
    }

    @Field(13)
    private double NoShortMarginRatioByMoney() {
        return this.io.getDoubleField(this, 13);
    }

    public double getNoShortMarginRatioByMoney() {
        return this.NoShortMarginRatioByMoney();
    }

    @Field(13)
    private CThostFtdcExchangeMarginRateAdjustField NoShortMarginRatioByMoney(double NoShortMarginRatioByMoney) {
        this.io.setDoubleField(this, 13, NoShortMarginRatioByMoney);
        return this;
    }

    public void setNoShortMarginRatioByMoney(double noShortMarginRatioByMoney) {
        this.NoShortMarginRatioByMoney(noShortMarginRatioByMoney);
    }

    @Field(14)
    private double NoShortMarginRatioByVolume() {
        return this.io.getDoubleField(this, 14);
    }

    public double getNoShortMarginRatioByVolume() {
        return this.NoShortMarginRatioByVolume();
    }

    @Field(14)
    private CThostFtdcExchangeMarginRateAdjustField NoShortMarginRatioByVolume(double NoShortMarginRatioByVolume) {
        this.io.setDoubleField(this, 14, NoShortMarginRatioByVolume);
        return this;
    }

    public void setNoShortMarginRatioByVolume(double noShortMarginRatioByVolume) {
        this.NoShortMarginRatioByVolume(noShortMarginRatioByVolume);
    }

    public CThostFtdcExchangeMarginRateAdjustField(Pointer pointer) {
        super(pointer);
    }
}
