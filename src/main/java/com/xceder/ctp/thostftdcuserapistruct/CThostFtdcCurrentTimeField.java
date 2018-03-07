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
public class CThostFtdcCurrentTimeField extends StructObject {
    public CThostFtdcCurrentTimeField() {
    }

    @Array({9L})
    @Field(0)
    private Pointer<Byte> CurrDate() {
        return this.io.getPointerField(this, 0);
    }

    @Array({9L})
    @Field(0)
    public void setCurrDate(String currDate) {
        this.io.getPointerField(this, 0).setCString(currDate);
    }

    public String getCurrDate() {
        return this.CurrDate().getCString();
    }

    @Array({9L})
    @Field(1)
    private Pointer<Byte> CurrTime() {
        return this.io.getPointerField(this, 1);
    }

    @Array({9L})
    @Field(1)
    public void setCurrTime(String currTime) {
        this.io.getPointerField(this, 1).setCString(currTime);
    }

    public String getCurrTime() {
        return this.CurrTime().getCString();
    }

    @Field(2)
    private int CurrMillisec() {
        return this.io.getIntField(this, 2);
    }

    public int getCurrMillisec() {
        return this.CurrMillisec();
    }

    @Field(2)
    private CThostFtdcCurrentTimeField CurrMillisec(int CurrMillisec) {
        this.io.setIntField(this, 2, CurrMillisec);
        return this;
    }

    public void setCurrMillisec(int currMillisec) {
        this.CurrMillisec(currMillisec);
    }

    public CThostFtdcCurrentTimeField(Pointer pointer) {
        super(pointer);
    }
}
