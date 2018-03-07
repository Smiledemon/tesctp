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
public class CThostFtdcCommRateModelField extends StructObject {
    public CThostFtdcCommRateModelField() {
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

    @Array({13L})
    @Field(1)
    private Pointer<Byte> CommModelID() {
        return this.io.getPointerField(this, 1);
    }

    @Array({13L})
    @Field(1)
    public void setCommModelID(String commModelID) {
        this.io.getPointerField(this, 1).setCString(commModelID);
    }

    public String getCommModelID() {
        return this.CommModelID().getCString();
    }

    @Array({161L})
    @Field(2)
    private Pointer<Byte> CommModelName() {
        return this.io.getPointerField(this, 2);
    }

    @Array({161L})
    @Field(2)
    public void setCommModelName(String commModelName) {
        this.io.getPointerField(this, 2).setCString(commModelName);
    }

    public String getCommModelName() {
        return this.CommModelName().getCString();
    }

    public CThostFtdcCommRateModelField(Pointer pointer) {
        super(pointer);
    }
}
