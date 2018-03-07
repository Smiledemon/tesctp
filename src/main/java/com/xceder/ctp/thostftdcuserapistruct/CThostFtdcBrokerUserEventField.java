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
 * Time: 下午3:30
 */
public class CThostFtdcBrokerUserEventField extends StructObject {
    public CThostFtdcBrokerUserEventField() {
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

    @Array({16L})
    @Field(1)
    private Pointer<Byte> UserID() {
        return this.io.getPointerField(this, 1);
    }

    @Array({16L})
    @Field(1)
    public void setUserID(String userID) {
        this.io.getPointerField(this, 1).setCString(userID);
    }

    public String getUserID() {
        return this.UserID().getCString();
    }

    @Field(2)
    private byte UserEventType() {
        return this.io.getByteField(this, 2);
    }

    public char getUserEventType() {
        return (char)this.UserEventType();
    }

    @Field(2)
    private CThostFtdcBrokerUserEventField UserEventType(byte UserEventType) {
        this.io.setByteField(this, 2, UserEventType);
        return this;
    }

    public void setUserEventType(char userEventType) {
        this.UserEventType((byte)userEventType);
    }

    @Field(3)
    private int EventSequenceNo() {
        return this.io.getIntField(this, 3);
    }

    public int getEventSequenceNo() {
        return this.EventSequenceNo();
    }

    @Field(3)
    private CThostFtdcBrokerUserEventField EventSequenceNo(int EventSequenceNo) {
        this.io.setIntField(this, 3, EventSequenceNo);
        return this;
    }

    public void setEventSequenceNo(int eventSequenceNo) {
        this.EventSequenceNo(eventSequenceNo);
    }

    @Array({9L})
    @Field(4)
    private Pointer<Byte> EventDate() {
        return this.io.getPointerField(this, 4);
    }

    @Array({9L})
    @Field(4)
    public void setEventDate(String eventDate) {
        this.io.getPointerField(this, 4).setCString(eventDate);
    }

    public String getEventDate() {
        return this.EventDate().getCString();
    }

    @Array({9L})
    @Field(5)
    private Pointer<Byte> EventTime() {
        return this.io.getPointerField(this, 5);
    }

    @Array({9L})
    @Field(5)
    public void setEventTime(String eventTime) {
        this.io.getPointerField(this, 5).setCString(eventTime);
    }

    public String getEventTime() {
        return this.EventTime().getCString();
    }

    @Array({1025L})
    @Field(6)
    private Pointer<Byte> UserEventInfo() {
        return this.io.getPointerField(this, 6);
    }

    @Array({1025L})
    @Field(6)
    public void setUserEventInfo(String userEventInfo) {
        this.io.getPointerField(this, 6).setCString(userEventInfo);
    }

    public String getUserEventInfo() {
        return this.UserEventInfo().getCString();
    }

    @Array({13L})
    @Field(7)
    private Pointer<Byte> InvestorID() {
        return this.io.getPointerField(this, 7);
    }

    @Array({13L})
    @Field(7)
    public void setInvestorID(String investorID) {
        this.io.getPointerField(this, 7).setCString(investorID);
    }

    public String getInvestorID() {
        return this.InvestorID().getCString();
    }

    @Array({31L})
    @Field(8)
    private Pointer<Byte> InstrumentID() {
        return this.io.getPointerField(this, 8);
    }

    @Array({31L})
    @Field(8)
    public void setInstrumentID(String instrumentID) {
        this.io.getPointerField(this, 8).setCString(instrumentID);
    }

    public String getInstrumentID() {
        return this.InstrumentID().getCString();
    }

    public CThostFtdcBrokerUserEventField(Pointer pointer) {
        super(pointer);
    }
}
