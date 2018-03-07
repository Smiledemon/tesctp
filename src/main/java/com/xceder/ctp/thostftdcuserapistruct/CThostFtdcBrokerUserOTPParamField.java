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
 * Time: 下午3:31
 */
public class CThostFtdcBrokerUserOTPParamField extends StructObject {
    public CThostFtdcBrokerUserOTPParamField() {
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

    @Array({2L})
    @Field(2)
    private Pointer<Byte> OTPVendorsID() {
        return this.io.getPointerField(this, 2);
    }

    @Array({2L})
    @Field(2)
    public void setOTPVendorsID(String oTPVendorsID) {
        this.io.getPointerField(this, 2).setCString(oTPVendorsID);
    }

    public String getOTPVendorsID() {
        return this.OTPVendorsID().getCString();
    }

    @Array({17L})
    @Field(3)
    private Pointer<Byte> SerialNumber() {
        return this.io.getPointerField(this, 3);
    }

    @Array({17L})
    @Field(3)
    public void setSerialNumber(String serialNumber) {
        this.io.getPointerField(this, 3).setCString(serialNumber);
    }

    public String getSerialNumber() {
        return this.SerialNumber().getCString();
    }

    @Array({41L})
    @Field(4)
    private Pointer<Byte> AuthKey() {
        return this.io.getPointerField(this, 4);
    }

    @Array({41L})
    @Field(4)
    public void setAuthKey(String authKey) {
        this.io.getPointerField(this, 4).setCString(authKey);
    }

    public String getAuthKey() {
        return this.AuthKey().getCString();
    }

    @Field(5)
    private int LastDrift() {
        return this.io.getIntField(this, 5);
    }

    public int getLastDrift() {
        return this.LastDrift();
    }

    @Field(5)
    private CThostFtdcBrokerUserOTPParamField LastDrift(int LastDrift) {
        this.io.setIntField(this, 5, LastDrift);
        return this;
    }

    public void setLastDrift(int lastDrift) {
        this.LastDrift(lastDrift);
    }

    @Field(6)
    private int LastSuccess() {
        return this.io.getIntField(this, 6);
    }

    public int getLastSuccess() {
        return this.LastSuccess();
    }

    @Field(6)
    private CThostFtdcBrokerUserOTPParamField LastSuccess(int LastSuccess) {
        this.io.setIntField(this, 6, LastSuccess);
        return this;
    }

    public void setLastSuccess(int lastSuccess) {
        this.LastSuccess(lastSuccess);
    }

    @Field(7)
    private byte OTPType() {
        return this.io.getByteField(this, 7);
    }

    public char getOTPType() {
        return (char)this.OTPType();
    }

    @Field(7)
    private CThostFtdcBrokerUserOTPParamField OTPType(byte OTPType) {
        this.io.setByteField(this, 7, OTPType);
        return this;
    }

    public void setOTPType(char oTPType) {
        this.OTPType((byte)oTPType);
    }

    public CThostFtdcBrokerUserOTPParamField(Pointer pointer) {
        super(pointer);
    }
}
