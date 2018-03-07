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
public class CThostFtdcEWarrantOffsetField extends StructObject {
    public CThostFtdcEWarrantOffsetField() {
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

    @Array({13L})
    @Field(2)
    private Pointer<Byte> InvestorID() {
        return this.io.getPointerField(this, 2);
    }

    @Array({13L})
    @Field(2)
    public void setInvestorID(String investorID) {
        this.io.getPointerField(this, 2).setCString(investorID);
    }

    public String getInvestorID() {
        return this.InvestorID().getCString();
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

    @Array({31L})
    @Field(4)
    private Pointer<Byte> InstrumentID() {
        return this.io.getPointerField(this, 4);
    }

    @Array({31L})
    @Field(4)
    public void setInstrumentID(String instrumentID) {
        this.io.getPointerField(this, 4).setCString(instrumentID);
    }

    public String getInstrumentID() {
        return this.InstrumentID().getCString();
    }

    @Field(5)
    private byte Direction() {
        return this.io.getByteField(this, 5);
    }

    public char getDirection() {
        return (char)this.Direction();
    }

    @Field(5)
    private CThostFtdcEWarrantOffsetField Direction(byte Direction) {
        this.io.setByteField(this, 5, Direction);
        return this;
    }

    public void setDirection(char direction) {
        this.Direction((byte)direction);
    }

    @Field(6)
    private byte HedgeFlag() {
        return this.io.getByteField(this, 6);
    }

    public char getHedgeFlag() {
        return (char)this.HedgeFlag();
    }

    @Field(6)
    private CThostFtdcEWarrantOffsetField HedgeFlag(byte HedgeFlag) {
        this.io.setByteField(this, 6, HedgeFlag);
        return this;
    }

    public void setHedgeFlag(char hedgeFlag) {
        this.HedgeFlag((byte)hedgeFlag);
    }

    @Field(7)
    private int Volume() {
        return this.io.getIntField(this, 7);
    }

    public int getVolume() {
        return this.Volume();
    }

    @Field(7)
    private CThostFtdcEWarrantOffsetField Volume(int Volume) {
        this.io.setIntField(this, 7, Volume);
        return this;
    }

    public void setVolume(int volume) {
        this.Volume(volume);
    }

    public CThostFtdcEWarrantOffsetField(Pointer pointer) {
        super(pointer);
    }
}
