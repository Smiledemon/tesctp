package com.xceder.ctp.thostftdcuserapistruct;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;

public class CThostFtdcAuthenticationInfoField extends StructObject {
    public CThostFtdcAuthenticationInfoField() {
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

    @Array({11L})
    @Field(2)
    private Pointer<Byte> UserProductInfo() {
        return this.io.getPointerField(this, 2);
    }

    @Array({11L})
    @Field(2)
    public void setUserProductInfo(String userProductInfo) {
        this.io.getPointerField(this, 2).setCString(userProductInfo);
    }

    public String getUserProductInfo() {
        return this.UserProductInfo().getCString();
    }

    @Array({129L})
    @Field(3)
    private Pointer<Byte> AuthInfo() {
        return this.io.getPointerField(this, 3);
    }

    @Array({129L})
    @Field(3)
    public void setAuthInfo(String authInfo) {
        this.io.getPointerField(this, 3).setCString(authInfo);
    }

    public String getAuthInfo() {
        return this.AuthInfo().getCString();
    }

    @Field(4)
    private int IsResult() {
        return this.io.getIntField(this, 4);
    }

    public int getIsResult() {
        return this.IsResult();
    }

    @Field(4)
    private CThostFtdcAuthenticationInfoField IsResult(int IsResult) {
        this.io.setIntField(this, 4, IsResult);
        return this;
    }

    public void setIsResult(int isResult) {
        this.IsResult(isResult);
    }

    public CThostFtdcAuthenticationInfoField(Pointer pointer) {
        super(pointer);
    }
}
