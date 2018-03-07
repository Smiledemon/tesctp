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
 * Time: 下午3:32
 */
public class CThostFtdcCFMMCBrokerKeyField extends StructObject {
    public CThostFtdcCFMMCBrokerKeyField() {
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

    @Array({11L})
    @Field(1)
    private Pointer<Byte> ParticipantID() {
        return this.io.getPointerField(this, 1);
    }

    @Array({11L})
    @Field(1)
    public void setParticipantID(String participantID) {
        this.io.getPointerField(this, 1).setCString(participantID);
    }

    public String getParticipantID() {
        return this.ParticipantID().getCString();
    }

    @Array({9L})
    @Field(2)
    private Pointer<Byte> CreateDate() {
        return this.io.getPointerField(this, 2);
    }

    @Array({9L})
    @Field(2)
    public void setCreateDate(String createDate) {
        this.io.getPointerField(this, 2).setCString(createDate);
    }

    public String getCreateDate() {
        return this.CreateDate().getCString();
    }

    @Array({9L})
    @Field(3)
    private Pointer<Byte> CreateTime() {
        return this.io.getPointerField(this, 3);
    }

    @Array({9L})
    @Field(3)
    public void setCreateTime(String createTime) {
        this.io.getPointerField(this, 3).setCString(createTime);
    }

    public String getCreateTime() {
        return this.CreateTime().getCString();
    }

    @Field(4)
    private int KeyID() {
        return this.io.getIntField(this, 4);
    }

    public int getKeyID() {
        return this.KeyID();
    }

    @Field(4)
    private CThostFtdcCFMMCBrokerKeyField KeyID(int KeyID) {
        this.io.setIntField(this, 4, KeyID);
        return this;
    }

    public void setKeyID(int keyID) {
        this.KeyID(keyID);
    }

    @Array({21L})
    @Field(5)
    private Pointer<Byte> CurrentKey() {
        return this.io.getPointerField(this, 5);
    }

    @Array({21L})
    @Field(5)
    public void setCurrentKey(String currentKey) {
        this.io.getPointerField(this, 5).setCString(currentKey);
    }

    public String getCurrentKey() {
        return this.CurrentKey().getCString();
    }

    @Field(6)
    private byte KeyKind() {
        return this.io.getByteField(this, 6);
    }

    public char getKeyKind() {
        return (char)this.KeyKind();
    }

    @Field(6)
    private CThostFtdcCFMMCBrokerKeyField KeyKind(byte KeyKind) {
        this.io.setByteField(this, 6, KeyKind);
        return this;
    }

    public void setKeyKind(char keyKind) {
        this.KeyKind((byte)keyKind);
    }

    public CThostFtdcCFMMCBrokerKeyField(Pointer pointer) {
        super(pointer);
    }
}
