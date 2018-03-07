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
public class CThostFtdcCombinationLegField extends StructObject {
    public CThostFtdcCombinationLegField() {
    }

    @Array({31L})
    @Field(0)
    private Pointer<Byte> CombInstrumentID() {
        return this.io.getPointerField(this, 0);
    }

    @Array({31L})
    @Field(0)
    public void setCombInstrumentID(String combInstrumentID) {
        this.io.getPointerField(this, 0).setCString(combInstrumentID);
    }

    public String getCombInstrumentID() {
        return this.CombInstrumentID().getCString();
    }

    @Field(1)
    private int LegID() {
        return this.io.getIntField(this, 1);
    }

    public int getLegID() {
        return this.LegID();
    }

    @Field(1)
    private CThostFtdcCombinationLegField LegID(int LegID) {
        this.io.setIntField(this, 1, LegID);
        return this;
    }

    public void setLegID(int legID) {
        this.LegID(legID);
    }

    @Array({31L})
    @Field(2)
    private Pointer<Byte> LegInstrumentID() {
        return this.io.getPointerField(this, 2);
    }

    @Array({31L})
    @Field(2)
    public void setLegInstrumentID(String legInstrumentID) {
        this.io.getPointerField(this, 2).setCString(legInstrumentID);
    }

    public String getLegInstrumentID() {
        return this.LegInstrumentID().getCString();
    }

    @Field(3)
    private byte Direction() {
        return this.io.getByteField(this, 3);
    }

    public char getDirection() {
        return (char)this.Direction();
    }

    @Field(3)
    private CThostFtdcCombinationLegField Direction(byte Direction) {
        this.io.setByteField(this, 3, Direction);
        return this;
    }

    public void setDirection(char direction) {
        this.Direction((byte)direction);
    }

    @Field(4)
    private int LegMultiple() {
        return this.io.getIntField(this, 4);
    }

    public int getLegMultiple() {
        return this.LegMultiple();
    }

    @Field(4)
    private CThostFtdcCombinationLegField LegMultiple(int LegMultiple) {
        this.io.setIntField(this, 4, LegMultiple);
        return this;
    }

    public void setLegMultiple(int legMultiple) {
        this.LegMultiple(legMultiple);
    }

    @Field(5)
    private int ImplyLevel() {
        return this.io.getIntField(this, 5);
    }

    public int getImplyLevel() {
        return this.ImplyLevel();
    }

    @Field(5)
    private CThostFtdcCombinationLegField ImplyLevel(int ImplyLevel) {
        this.io.setIntField(this, 5, ImplyLevel);
        return this;
    }

    public void setImplyLevel(int implyLevel) {
        this.ImplyLevel(implyLevel);
    }

    public CThostFtdcCombinationLegField(Pointer pointer) {
        super(pointer);
    }
}
