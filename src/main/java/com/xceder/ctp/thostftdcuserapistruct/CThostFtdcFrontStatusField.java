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
 * Time: 下午3:37
 */
public class CThostFtdcFrontStatusField extends StructObject {
    public CThostFtdcFrontStatusField() {
    }

    @Field(0)
    private int FrontID() {
        return this.io.getIntField(this, 0);
    }

    public int getFrontID() {
        return this.FrontID();
    }

    @Field(0)
    private CThostFtdcFrontStatusField FrontID(int FrontID) {
        this.io.setIntField(this, 0, FrontID);
        return this;
    }

    public void setFrontID(int frontID) {
        this.FrontID(frontID);
    }

    @Array({9L})
    @Field(1)
    private Pointer<Byte> LastReportDate() {
        return this.io.getPointerField(this, 1);
    }

    @Array({9L})
    @Field(1)
    public void setLastReportDate(String lastReportDate) {
        this.io.getPointerField(this, 1).setCString(lastReportDate);
    }

    public String getLastReportDate() {
        return this.LastReportDate().getCString();
    }

    @Array({9L})
    @Field(2)
    private Pointer<Byte> LastReportTime() {
        return this.io.getPointerField(this, 2);
    }

    @Array({9L})
    @Field(2)
    public void setLastReportTime(String lastReportTime) {
        this.io.getPointerField(this, 2).setCString(lastReportTime);
    }

    public String getLastReportTime() {
        return this.LastReportTime().getCString();
    }

    @Field(3)
    private int IsActive() {
        return this.io.getIntField(this, 3);
    }

    public int getIsActive() {
        return this.IsActive();
    }

    @Field(3)
    private CThostFtdcFrontStatusField IsActive(int IsActive) {
        this.io.setIntField(this, 3, IsActive);
        return this;
    }

    public void setIsActive(int isActive) {
        this.IsActive(isActive);
    }

    public CThostFtdcFrontStatusField(Pointer pointer) {
        super(pointer);
    }
}
