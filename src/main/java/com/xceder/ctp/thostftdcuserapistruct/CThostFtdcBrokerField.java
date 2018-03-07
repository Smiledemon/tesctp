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
 * Time: 下午3:28
 */

public class CThostFtdcBrokerField extends StructObject {
    public CThostFtdcBrokerField() {
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
    private Pointer<Byte> BrokerAbbr() {
        return this.io.getPointerField(this, 1);
    }

    @Array({9L})
    @Field(1)
    public void setBrokerAbbr(String brokerAbbr) {
        this.io.getPointerField(this, 1).setCString(brokerAbbr);
    }

    public String getBrokerAbbr() {
        return this.BrokerAbbr().getCString();
    }

    @Array({81L})
    @Field(2)
    private Pointer<Byte> BrokerName() {
        return this.io.getPointerField(this, 2);
    }

    @Array({81L})
    @Field(2)
    public void setBrokerName(String brokerName) {
        this.io.getPointerField(this, 2).setCString(brokerName);
    }

    public String getBrokerName() {
        return this.BrokerName().getCString();
    }

    @Field(3)
    private int IsActive() {
        return this.io.getIntField(this, 3);
    }

    public int getIsActive() {
        return this.IsActive();
    }

    @Field(3)
    private CThostFtdcBrokerField IsActive(int IsActive) {
        this.io.setIntField(this, 3, IsActive);
        return this;
    }

    public void setIsActive(int isActive) {
        this.IsActive(isActive);
    }

    public CThostFtdcBrokerField(Pointer pointer) {
        super(pointer);
    }
}
