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
public class CThostFtdcExchangeMarginRateField extends StructObject {
    public CThostFtdcExchangeMarginRateField() {
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
    private CThostFtdcExchangeMarginRateField HedgeFlag(byte HedgeFlag) {
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
    private CThostFtdcExchangeMarginRateField LongMarginRatioByMoney(double LongMarginRatioByMoney) {
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
    private CThostFtdcExchangeMarginRateField LongMarginRatioByVolume(double LongMarginRatioByVolume) {
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
    private CThostFtdcExchangeMarginRateField ShortMarginRatioByMoney(double ShortMarginRatioByMoney) {
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
    private CThostFtdcExchangeMarginRateField ShortMarginRatioByVolume(double ShortMarginRatioByVolume) {
        this.io.setDoubleField(this, 6, ShortMarginRatioByVolume);
        return this;
    }

    public void setShortMarginRatioByVolume(double shortMarginRatioByVolume) {
        this.ShortMarginRatioByVolume(shortMarginRatioByVolume);
    }

    public CThostFtdcExchangeMarginRateField(Pointer pointer) {
        super(pointer);
    }
}
