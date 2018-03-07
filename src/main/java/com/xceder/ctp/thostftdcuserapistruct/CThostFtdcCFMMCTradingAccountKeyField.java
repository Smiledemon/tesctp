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
public class CThostFtdcCFMMCTradingAccountKeyField extends StructObject {
    public CThostFtdcCFMMCTradingAccountKeyField() {
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

    @Array({13L})
    @Field(2)
    private Pointer<Byte> AccountID() {
        return this.io.getPointerField(this, 2);
    }

    @Array({13L})
    @Field(2)
    public void setAccountID(String accountID) {
        this.io.getPointerField(this, 2).setCString(accountID);
    }

    public String getAccountID() {
        return this.AccountID().getCString();
    }

    @Field(3)
    private int KeyID() {
        return this.io.getIntField(this, 3);
    }

    public int getKeyID() {
        return this.KeyID();
    }

    @Field(3)
    private CThostFtdcCFMMCTradingAccountKeyField KeyID(int KeyID) {
        this.io.setIntField(this, 3, KeyID);
        return this;
    }

    public void setKeyID(int keyID) {
        this.KeyID(keyID);
    }

    @Array({21L})
    @Field(4)
    private Pointer<Byte> CurrentKey() {
        return this.io.getPointerField(this, 4);
    }

    @Array({21L})
    @Field(4)
    public void setCurrentKey(String currentKey) {
        this.io.getPointerField(this, 4).setCString(currentKey);
    }

    public String getCurrentKey() {
        return this.CurrentKey().getCString();
    }

    public CThostFtdcCFMMCTradingAccountKeyField(Pointer pointer) {
        super(pointer);
    }
}
