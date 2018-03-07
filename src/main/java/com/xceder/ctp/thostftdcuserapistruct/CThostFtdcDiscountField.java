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
public class CThostFtdcDiscountField extends StructObject {
    public CThostFtdcDiscountField() {
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
    private byte InvestorRange() {
        return this.io.getByteField(this, 1);
    }

    public char getInvestorRange() {
        return (char)this.InvestorRange();
    }

    @Field(1)
    private CThostFtdcDiscountField InvestorRange(byte InvestorRange) {
        this.io.setByteField(this, 1, InvestorRange);
        return this;
    }

    public void setInvestorRange(char investorRange) {
        this.InvestorRange((byte)investorRange);
    }

    @Array({13L})
    @Field(2)
    private Pointer<Byte> InvestorID() {
        return this.io.getPointerField(this, 2);
    }

    @Array({13L})
    @Field(2)
    public void setInvestorID(String investorID) {
        this.io.getPointerField(this, 2).setCString(investorID);
    }

    public String getInvestorID() {
        return this.InvestorID().getCString();
    }

    @Field(3)
    private double Discount() {
        return this.io.getDoubleField(this, 3);
    }

    public double getDiscount() {
        return this.Discount();
    }

    @Field(3)
    private CThostFtdcDiscountField Discount(double Discount) {
        this.io.setDoubleField(this, 3, Discount);
        return this;
    }

    public void setDiscount(double discount) {
        this.Discount(discount);
    }

    public CThostFtdcDiscountField(Pointer pointer) {
        super(pointer);
    }
}
