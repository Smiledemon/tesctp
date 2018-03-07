package com.xceder.ctp.thostftdcuserapistruct;


import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;

public class CThostFtdcBrokerTradingAlgosField extends StructObject {
    public CThostFtdcBrokerTradingAlgosField() {
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

    @Array({9L})
    @Field(1)
    private Pointer<Byte> ExchangeID() {
        return this.io.getPointerField(this, 1);
    }

    @Array({9L})
    @Field(1)
    public void setExchangeID(String exchangeID) {
        this.io.getPointerField(this, 1).setCString(exchangeID);
    }

    public String getExchangeID() {
        return this.ExchangeID().getCString();
    }

    @Array({31L})
    @Field(2)
    private Pointer<Byte> InstrumentID() {
        return this.io.getPointerField(this, 2);
    }

    @Array({31L})
    @Field(2)
    public void setInstrumentID(String instrumentID) {
        this.io.getPointerField(this, 2).setCString(instrumentID);
    }

    public String getInstrumentID() {
        return this.InstrumentID().getCString();
    }

    @Field(3)
    private byte HandlePositionAlgoID() {
        return this.io.getByteField(this, 3);
    }

    public char getHandlePositionAlgoID() {
        return (char)this.HandlePositionAlgoID();
    }

    @Field(3)
    private CThostFtdcBrokerTradingAlgosField HandlePositionAlgoID(byte HandlePositionAlgoID) {
        this.io.setByteField(this, 3, HandlePositionAlgoID);
        return this;
    }

    public void setHandlePositionAlgoID(char handlePositionAlgoID) {
        this.HandlePositionAlgoID((byte)handlePositionAlgoID);
    }

    @Field(4)
    private byte FindMarginRateAlgoID() {
        return this.io.getByteField(this, 4);
    }

    public char getFindMarginRateAlgoID() {
        return (char)this.FindMarginRateAlgoID();
    }

    @Field(4)
    private CThostFtdcBrokerTradingAlgosField FindMarginRateAlgoID(byte FindMarginRateAlgoID) {
        this.io.setByteField(this, 4, FindMarginRateAlgoID);
        return this;
    }

    public void setFindMarginRateAlgoID(char findMarginRateAlgoID) {
        this.FindMarginRateAlgoID((byte)findMarginRateAlgoID);
    }

    @Field(5)
    private byte HandleTradingAccountAlgoID() {
        return this.io.getByteField(this, 5);
    }

    public char getHandleTradingAccountAlgoID() {
        return (char)this.HandleTradingAccountAlgoID();
    }

    @Field(5)
    private CThostFtdcBrokerTradingAlgosField HandleTradingAccountAlgoID(byte HandleTradingAccountAlgoID) {
        this.io.setByteField(this, 5, HandleTradingAccountAlgoID);
        return this;
    }

    public void setHandleTradingAccountAlgoID(char handleTradingAccountAlgoID) {
        this.HandleTradingAccountAlgoID((byte)handleTradingAccountAlgoID);
    }

    public CThostFtdcBrokerTradingAlgosField(Pointer pointer) {
        super(pointer);
    }
}
