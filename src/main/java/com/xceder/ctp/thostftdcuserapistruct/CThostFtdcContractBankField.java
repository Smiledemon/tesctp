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
public class CThostFtdcContractBankField extends StructObject {
    public CThostFtdcContractBankField() {
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

    @Array({4L})
    @Field(1)
    private Pointer<Byte> BankID() {
        return this.io.getPointerField(this, 1);
    }

    @Array({4L})
    @Field(1)
    public void setBankID(String bankID) {
        this.io.getPointerField(this, 1).setCString(bankID);
    }

    public String getBankID() {
        return this.BankID().getCString();
    }

    @Array({5L})
    @Field(2)
    private Pointer<Byte> BankBrchID() {
        return this.io.getPointerField(this, 2);
    }

    @Array({5L})
    @Field(2)
    public void setBankBrchID(String bankBrchID) {
        this.io.getPointerField(this, 2).setCString(bankBrchID);
    }

    public String getBankBrchID() {
        return this.BankBrchID().getCString();
    }

    @Array({101L})
    @Field(3)
    private Pointer<Byte> BankName() {
        return this.io.getPointerField(this, 3);
    }

    @Array({101L})
    @Field(3)
    public void setBankName(String bankName) {
        this.io.getPointerField(this, 3).setCString(bankName);
    }

    public String getBankName() {
        return this.BankName().getCString();
    }

    public CThostFtdcContractBankField(Pointer pointer) {
        super(pointer);
    }
}
