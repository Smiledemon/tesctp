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
public class CThostFtdcBrokerUserField extends StructObject {
    public CThostFtdcBrokerUserField() {
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

    @Array({81L})
    @Field(2)
    private Pointer<Byte> UserName() {
        return this.io.getPointerField(this, 2);
    }

    @Array({81L})
    @Field(2)
    public void setUserName(String userName) {
        this.io.getPointerField(this, 2).setCString(userName);
    }

    public String getUserName() {
        return this.UserName().getCString();
    }

    @Field(3)
    private byte UserType() {
        return this.io.getByteField(this, 3);
    }

    public char getUserType() {
        return (char)this.UserType();
    }

    @Field(3)
    private CThostFtdcBrokerUserField UserType(byte UserType) {
        this.io.setByteField(this, 3, UserType);
        return this;
    }

    public void setUserType(char userType) {
        this.UserType((byte)userType);
    }

    @Field(4)
    private int IsActive() {
        return this.io.getIntField(this, 4);
    }

    public int getIsActive() {
        return this.IsActive();
    }

    @Field(4)
    private CThostFtdcBrokerUserField IsActive(int IsActive) {
        this.io.setIntField(this, 4, IsActive);
        return this;
    }

    public void setIsActive(int isActive) {
        this.IsActive(isActive);
    }

    @Field(5)
    private int IsUsingOTP() {
        return this.io.getIntField(this, 5);
    }

    public int getIsUsingOTP() {
        return this.IsUsingOTP();
    }

    @Field(5)
    private CThostFtdcBrokerUserField IsUsingOTP(int IsUsingOTP) {
        this.io.setIntField(this, 5, IsUsingOTP);
        return this;
    }

    public void setIsUsingOTP(int isUsingOTP) {
        this.IsUsingOTP(isUsingOTP);
    }

    public CThostFtdcBrokerUserField(Pointer pointer) {
        super(pointer);
    }
}
