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
 * Time: 下午3:29
 */
public class CThostFtdcBrokerTradingParamsField extends StructObject {
    public CThostFtdcBrokerTradingParamsField() {
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
    private Pointer<Byte> InvestorID() {
        return this.io.getPointerField(this, 1);
    }

    @Array({13L})
    @Field(1)
    public void setInvestorID(String investorID) {
        this.io.getPointerField(this, 1).setCString(investorID);
    }

    public String getInvestorID() {
        return this.InvestorID().getCString();
    }

    @Field(2)
    private byte MarginPriceType() {
        return this.io.getByteField(this, 2);
    }

    public char getMarginPriceType() {
        return (char)this.MarginPriceType();
    }

    @Field(2)
    private CThostFtdcBrokerTradingParamsField MarginPriceType(byte MarginPriceType) {
        this.io.setByteField(this, 2, MarginPriceType);
        return this;
    }

    public void setMarginPriceType(char marginPriceType) {
        this.MarginPriceType((byte)marginPriceType);
    }

    @Field(3)
    private byte Algorithm() {
        return this.io.getByteField(this, 3);
    }

    public char getAlgorithm() {
        return (char)this.Algorithm();
    }

    @Field(3)
    private CThostFtdcBrokerTradingParamsField Algorithm(byte Algorithm) {
        this.io.setByteField(this, 3, Algorithm);
        return this;
    }

    public void setAlgorithm(char algorithm) {
        this.Algorithm((byte)algorithm);
    }

    @Field(4)
    private byte AvailIncludeCloseProfit() {
        return this.io.getByteField(this, 4);
    }

    public char getAvailIncludeCloseProfit() {
        return (char)this.AvailIncludeCloseProfit();
    }

    @Field(4)
    private CThostFtdcBrokerTradingParamsField AvailIncludeCloseProfit(byte AvailIncludeCloseProfit) {
        this.io.setByteField(this, 4, AvailIncludeCloseProfit);
        return this;
    }

    public void setAvailIncludeCloseProfit(char availIncludeCloseProfit) {
        this.AvailIncludeCloseProfit((byte)availIncludeCloseProfit);
    }

    public CThostFtdcBrokerTradingParamsField(Pointer pointer) {
        super(pointer);
    }
}
