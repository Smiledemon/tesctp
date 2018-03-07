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
public class CThostFtdcExchangeField extends StructObject {
    public CThostFtdcExchangeField() {
    }

    @Array({9L})
    @Field(0)
    private Pointer<Byte> ExchangeID() {
        return this.io.getPointerField(this, 0);
    }

    @Array({9L})
    @Field(0)
    public void setExchangeID(String exchangeID) {
        this.io.getPointerField(this, 0).setCString(exchangeID);
    }

    public String getExchangeID() {
        return this.ExchangeID().getCString();
    }

    @Array({31L})
    @Field(1)
    private Pointer<Byte> ExchangeName() {
        return this.io.getPointerField(this, 1);
    }

    @Array({31L})
    @Field(1)
    public void setExchangeName(String exchangeName) {
        this.io.getPointerField(this, 1).setCString(exchangeName);
    }

    public String getExchangeName() {
        return this.ExchangeName().getCString();
    }

    @Field(2)
    private byte ExchangeProperty() {
        return this.io.getByteField(this, 2);
    }

    public char getExchangeProperty() {
        return (char)this.ExchangeProperty();
    }

    @Field(2)
    private CThostFtdcExchangeField ExchangeProperty(byte ExchangeProperty) {
        this.io.setByteField(this, 2, ExchangeProperty);
        return this;
    }

    public void setExchangeProperty(char exchangeProperty) {
        this.ExchangeProperty((byte)exchangeProperty);
    }

    public CThostFtdcExchangeField(Pointer pointer) {
        super(pointer);
    }
}
