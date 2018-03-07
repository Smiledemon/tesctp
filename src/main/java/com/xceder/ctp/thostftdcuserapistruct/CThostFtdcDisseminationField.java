package com.xceder.ctp.thostftdcuserapistruct;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: xiaopan
 * Date: 2018-03-07
 * Time: 下午3:35
 */
public class CThostFtdcDisseminationField extends StructObject {
    public CThostFtdcDisseminationField() {
    }

    @Field(0)
    private short SequenceSeries() {
        return this.io.getShortField(this, 0);
    }

    public short getSequenceSeries() {
        return this.SequenceSeries();
    }

    @Field(0)
    private CThostFtdcDisseminationField SequenceSeries(short SequenceSeries) {
        this.io.setShortField(this, 0, SequenceSeries);
        return this;
    }

    public void setSequenceSeries(short sequenceSeries) {
        this.SequenceSeries(sequenceSeries);
    }

    @Field(1)
    private int SequenceNo() {
        return this.io.getIntField(this, 1);
    }

    public int getSequenceNo() {
        return this.SequenceNo();
    }

    @Field(1)
    private CThostFtdcDisseminationField SequenceNo(int SequenceNo) {
        this.io.setIntField(this, 1, SequenceNo);
        return this;
    }

    public void setSequenceNo(int sequenceNo) {
        this.SequenceNo(sequenceNo);
    }

    public CThostFtdcDisseminationField(Pointer pointer) {
        super(pointer);
    }
}
