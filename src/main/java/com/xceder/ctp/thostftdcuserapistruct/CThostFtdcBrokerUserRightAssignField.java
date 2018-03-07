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
public class CThostFtdcBrokerUserRightAssignField extends StructObject {
    public CThostFtdcBrokerUserRightAssignField() {
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

    @Field(1)
    private int DRIdentityID() {
        return this.io.getIntField(this, 1);
    }

    public int getDRIdentityID() {
        return this.DRIdentityID();
    }

    @Field(1)
    private CThostFtdcBrokerUserRightAssignField DRIdentityID(int DRIdentityID) {
        this.io.setIntField(this, 1, DRIdentityID);
        return this;
    }

    public void setDRIdentityID(int dRIdentityID) {
        this.DRIdentityID(dRIdentityID);
    }

    @Field(2)
    private int Tradeable() {
        return this.io.getIntField(this, 2);
    }

    public int getTradeable() {
        return this.Tradeable();
    }

    @Field(2)
    private CThostFtdcBrokerUserRightAssignField Tradeable(int Tradeable) {
        this.io.setIntField(this, 2, Tradeable);
        return this;
    }

    public void setTradeable(int tradeable) {
        this.Tradeable(tradeable);
    }

    public CThostFtdcBrokerUserRightAssignField(Pointer pointer) {
        super(pointer);
    }
}
