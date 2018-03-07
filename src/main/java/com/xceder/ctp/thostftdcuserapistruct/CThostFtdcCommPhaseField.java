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
public class CThostFtdcCommPhaseField extends StructObject {
    public CThostFtdcCommPhaseField() {
    }

    @Array({9L})
    @Field(0)
    private Pointer<Byte> TradingDay() {
        return this.io.getPointerField(this, 0);
    }

    @Array({9L})
    @Field(0)
    public void setTradingDay(String tradingDay) {
        this.io.getPointerField(this, 0).setCString(tradingDay);
    }

    public String getTradingDay() {
        return this.TradingDay().getCString();
    }

    @Field(1)
    private short CommPhaseNo() {
        return this.io.getShortField(this, 1);
    }

    public short getCommPhaseNo() {
        return this.CommPhaseNo();
    }

    @Field(1)
    private CThostFtdcCommPhaseField CommPhaseNo(short CommPhaseNo) {
        this.io.setShortField(this, 1, CommPhaseNo);
        return this;
    }

    public void setCommPhaseNo(short commPhaseNo) {
        this.CommPhaseNo(commPhaseNo);
    }

    public CThostFtdcCommPhaseField(Pointer pointer) {
        super(pointer);
    }
}
