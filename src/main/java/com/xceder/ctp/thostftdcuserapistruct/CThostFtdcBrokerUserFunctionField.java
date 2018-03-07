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
public class CThostFtdcBrokerUserFunctionField extends StructObject {
    public CThostFtdcBrokerUserFunctionField() {
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
    private byte BrokerFunctionCode() {
        return this.io.getByteField(this, 2);
    }

    public char getBrokerFunctionCode() {
        return (char)this.BrokerFunctionCode();
    }

    @Field(2)
    private CThostFtdcBrokerUserFunctionField BrokerFunctionCode(byte BrokerFunctionCode) {
        this.io.setByteField(this, 2, BrokerFunctionCode);
        return this;
    }

    public void setBrokerFunctionCode(char brokerFunctionCode) {
        this.BrokerFunctionCode((byte)brokerFunctionCode);
    }

    public CThostFtdcBrokerUserFunctionField(Pointer pointer) {
        super(pointer);
    }
}
