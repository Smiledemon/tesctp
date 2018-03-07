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
public class CThostFtdcInstrumentStatusField extends StructObject {
    public CThostFtdcInstrumentStatusField() {
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

    @Array({31L})
    @Field(1)
    private Pointer<Byte> ExchangeInstID() {
        return this.io.getPointerField(this, 1);
    }

    @Array({31L})
    @Field(1)
    public void setExchangeInstID(String exchangeInstID) {
        this.io.getPointerField(this, 1).setCString(exchangeInstID);
    }

    public String getExchangeInstID() {
        return this.ExchangeInstID().getCString();
    }

    @Array({9L})
    @Field(2)
    private Pointer<Byte> SettlementGroupID() {
        return this.io.getPointerField(this, 2);
    }

    @Array({9L})
    @Field(2)
    public void setSettlementGroupID(String settlementGroupID) {
        this.io.getPointerField(this, 2).setCString(settlementGroupID);
    }

    public String getSettlementGroupID() {
        return this.SettlementGroupID().getCString();
    }

    @Array({31L})
    @Field(3)
    private Pointer<Byte> InstrumentID() {
        return this.io.getPointerField(this, 3);
    }

    @Array({31L})
    @Field(3)
    public void setInstrumentID(String instrumentID) {
        this.io.getPointerField(this, 3).setCString(instrumentID);
    }

    public String getInstrumentID() {
        return this.InstrumentID().getCString();
    }

    @Field(4)
    private byte InstrumentStatus() {
        return this.io.getByteField(this, 4);
    }

    public char getInstrumentStatus() {
        return (char)this.InstrumentStatus();
    }

    @Field(4)
    private CThostFtdcInstrumentStatusField InstrumentStatus(byte InstrumentStatus) {
        this.io.setByteField(this, 4, InstrumentStatus);
        return this;
    }

    public void setInstrumentStatus(char instrumentStatus) {
        this.InstrumentStatus((byte)instrumentStatus);
    }

    @Field(5)
    private int TradingSegmentSN() {
        return this.io.getIntField(this, 5);
    }

    public int getTradingSegmentSN() {
        return this.TradingSegmentSN();
    }

    @Field(5)
    private CThostFtdcInstrumentStatusField TradingSegmentSN(int TradingSegmentSN) {
        this.io.setIntField(this, 5, TradingSegmentSN);
        return this;
    }

    public void setTradingSegmentSN(int tradingSegmentSN) {
        this.TradingSegmentSN(tradingSegmentSN);
    }

    @Array({9L})
    @Field(6)
    private Pointer<Byte> EnterTime() {
        return this.io.getPointerField(this, 6);
    }

    @Array({9L})
    @Field(6)
    public void setEnterTime(String enterTime) {
        this.io.getPointerField(this, 6).setCString(enterTime);
    }

    public String getEnterTime() {
        return this.EnterTime().getCString();
    }

    @Field(7)
    private byte EnterReason() {
        return this.io.getByteField(this, 7);
    }

    public char getEnterReason() {
        return (char)this.EnterReason();
    }

    @Field(7)
    private CThostFtdcInstrumentStatusField EnterReason(byte EnterReason) {
        this.io.setByteField(this, 7, EnterReason);
        return this;
    }

    public void setEnterReason(char enterReason) {
        this.EnterReason((byte)enterReason);
    }

    public CThostFtdcInstrumentStatusField(Pointer pointer) {
        super(pointer);
    }
}
