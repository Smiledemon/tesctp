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
 * Time: 下午3:39
 */
public class CThostFtdcInstrumentCommissionRateField extends StructObject {
    public CThostFtdcInstrumentCommissionRateField() {
    }

    @Array({31L})
    @Field(0)
    private Pointer<Byte> InstrumentID() {
        return this.io.getPointerField(this, 0);
    }

    @Array({31L})
    @Field(0)
    public void setInstrumentID(String instrumentID) {
        this.io.getPointerField(this, 0).setCString(instrumentID);
    }

    public String getInstrumentID() {
        return this.InstrumentID().getCString();
    }

    @Field(1)
    private byte InvestorRange() {
        return this.io.getByteField(this, 1);
    }

    public char getInvestorRange() {
        return (char)this.InvestorRange();
    }

    @Field(1)
    private CThostFtdcInstrumentCommissionRateField InvestorRange(byte InvestorRange) {
        this.io.setByteField(this, 1, InvestorRange);
        return this;
    }

    public void setInvestorRange(char investorRange) {
        this.InvestorRange((byte)investorRange);
    }

    @Array({11L})
    @Field(2)
    private Pointer<Byte> BrokerID() {
        return this.io.getPointerField(this, 2);
    }

    @Array({11L})
    @Field(2)
    public void setBrokerID(String brokerID) {
        this.io.getPointerField(this, 2).setCString(brokerID);
    }

    public String getBrokerID() {
        return this.BrokerID().getCString();
    }

    @Array({13L})
    @Field(3)
    private Pointer<Byte> InvestorID() {
        return this.io.getPointerField(this, 3);
    }

    @Array({13L})
    @Field(3)
    public void setInvestorID(String investorID) {
        this.io.getPointerField(this, 3).setCString(investorID);
    }

    public String getInvestorID() {
        return this.InvestorID().getCString();
    }

    @Field(4)
    private double OpenRatioByMoney() {
        return this.io.getDoubleField(this, 4);
    }

    public double getOpenRatioByMoney() {
        return this.OpenRatioByMoney();
    }

    @Field(4)
    private CThostFtdcInstrumentCommissionRateField OpenRatioByMoney(double OpenRatioByMoney) {
        this.io.setDoubleField(this, 4, OpenRatioByMoney);
        return this;
    }

    public void setOpenRatioByMoney(double openRatioByMoney) {
        this.OpenRatioByMoney(openRatioByMoney);
    }

    @Field(5)
    private double OpenRatioByVolume() {
        return this.io.getDoubleField(this, 5);
    }

    public double getOpenRatioByVolume() {
        return this.OpenRatioByVolume();
    }

    @Field(5)
    private CThostFtdcInstrumentCommissionRateField OpenRatioByVolume(double OpenRatioByVolume) {
        this.io.setDoubleField(this, 5, OpenRatioByVolume);
        return this;
    }

    public void setOpenRatioByVolume(double openRatioByVolume) {
        this.OpenRatioByVolume(openRatioByVolume);
    }

    @Field(6)
    private double CloseRatioByMoney() {
        return this.io.getDoubleField(this, 6);
    }

    public double getCloseRatioByMoney() {
        return this.CloseRatioByMoney();
    }

    @Field(6)
    private CThostFtdcInstrumentCommissionRateField CloseRatioByMoney(double CloseRatioByMoney) {
        this.io.setDoubleField(this, 6, CloseRatioByMoney);
        return this;
    }

    public void setCloseRatioByMoney(double closeRatioByMoney) {
        this.CloseRatioByMoney(closeRatioByMoney);
    }

    @Field(7)
    private double CloseRatioByVolume() {
        return this.io.getDoubleField(this, 7);
    }

    public double getCloseRatioByVolume() {
        return this.CloseRatioByVolume();
    }

    @Field(7)
    private CThostFtdcInstrumentCommissionRateField CloseRatioByVolume(double CloseRatioByVolume) {
        this.io.setDoubleField(this, 7, CloseRatioByVolume);
        return this;
    }

    public void setCloseRatioByVolume(double closeRatioByVolume) {
        this.CloseRatioByVolume(closeRatioByVolume);
    }

    @Field(8)
    private double CloseTodayRatioByMoney() {
        return this.io.getDoubleField(this, 8);
    }

    public double getCloseTodayRatioByMoney() {
        return this.CloseTodayRatioByMoney();
    }

    @Field(8)
    private CThostFtdcInstrumentCommissionRateField CloseTodayRatioByMoney(double CloseTodayRatioByMoney) {
        this.io.setDoubleField(this, 8, CloseTodayRatioByMoney);
        return this;
    }

    public void setCloseTodayRatioByMoney(double closeTodayRatioByMoney) {
        this.CloseTodayRatioByMoney(closeTodayRatioByMoney);
    }

    @Field(9)
    private double CloseTodayRatioByVolume() {
        return this.io.getDoubleField(this, 9);
    }

    public double getCloseTodayRatioByVolume() {
        return this.CloseTodayRatioByVolume();
    }

    @Field(9)
    private CThostFtdcInstrumentCommissionRateField CloseTodayRatioByVolume(double CloseTodayRatioByVolume) {
        this.io.setDoubleField(this, 9, CloseTodayRatioByVolume);
        return this;
    }

    public void setCloseTodayRatioByVolume(double closeTodayRatioByVolume) {
        this.CloseTodayRatioByVolume(closeTodayRatioByVolume);
    }

    public CThostFtdcInstrumentCommissionRateField(Pointer pointer) {
        super(pointer);
    }
}
