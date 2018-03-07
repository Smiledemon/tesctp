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
 * Time: 下午3:34
 */
public class CThostFtdcDRTransferField extends StructObject {
    public CThostFtdcDRTransferField() {
    }

    @Field(0)
    private int OrigDRIdentityID() {
        return this.io.getIntField(this, 0);
    }

    public int getOrigDRIdentityID() {
        return this.OrigDRIdentityID();
    }

    @Field(0)
    private CThostFtdcDRTransferField OrigDRIdentityID(int OrigDRIdentityID) {
        this.io.setIntField(this, 0, OrigDRIdentityID);
        return this;
    }

    public void setOrigDRIdentityID(int origDRIdentityID) {
        this.OrigDRIdentityID(origDRIdentityID);
    }

    @Field(1)
    private int DestDRIdentityID() {
        return this.io.getIntField(this, 1);
    }

    public int getDestDRIdentityID() {
        return this.DestDRIdentityID();
    }

    @Field(1)
    private CThostFtdcDRTransferField DestDRIdentityID(int DestDRIdentityID) {
        this.io.setIntField(this, 1, DestDRIdentityID);
        return this;
    }

    public void setDestDRIdentityID(int destDRIdentityID) {
        this.DestDRIdentityID(destDRIdentityID);
    }

    @Array({11L})
    @Field(2)
    private Pointer<Byte> OrigBrokerID() {
        return this.io.getPointerField(this, 2);
    }

    @Array({11L})
    @Field(2)
    public void setOrigBrokerID(String origBrokerID) {
        this.io.getPointerField(this, 2).setCString(origBrokerID);
    }

    public String getOrigBrokerID() {
        return this.OrigBrokerID().getCString();
    }

    @Array({11L})
    @Field(3)
    private Pointer<Byte> DestBrokerID() {
        return this.io.getPointerField(this, 3);
    }

    @Array({11L})
    @Field(3)
    public void setDestBrokerID(String destBrokerID) {
        this.io.getPointerField(this, 3).setCString(destBrokerID);
    }

    public String getDestBrokerID() {
        return this.DestBrokerID().getCString();
    }

    public CThostFtdcDRTransferField(Pointer pointer) {
        super(pointer);
    }
}
