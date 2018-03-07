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
public class CThostFtdcDepositResultInformField extends StructObject {
    public CThostFtdcDepositResultInformField() {
    }

    @Array({15L})
    @Field(0)
    private Pointer<Byte> DepositSeqNo() {
        return this.io.getPointerField(this, 0);
    }

    @Array({15L})
    @Field(0)
    public void setDepositSeqNo(String depositSeqNo) {
        this.io.getPointerField(this, 0).setCString(depositSeqNo);
    }

    public String getDepositSeqNo() {
        return this.DepositSeqNo().getCString();
    }

    @Array({11L})
    @Field(1)
    private Pointer<Byte> BrokerID() {
        return this.io.getPointerField(this, 1);
    }

    @Array({11L})
    @Field(1)
    public void setBrokerID(String brokerID) {
        this.io.getPointerField(this, 1).setCString(brokerID);
    }

    public String getBrokerID() {
        return this.BrokerID().getCString();
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
    private double Deposit() {
        return this.io.getDoubleField(this, 3);
    }

    public double getDeposit() {
        return this.Deposit();
    }

    @Field(3)
    private CThostFtdcDepositResultInformField Deposit(double Deposit) {
        this.io.setDoubleField(this, 3, Deposit);
        return this;
    }

    public void setDeposit(double deposit) {
        this.Deposit(deposit);
    }

    @Field(4)
    private int RequestID() {
        return this.io.getIntField(this, 4);
    }

    public int getRequestID() {
        return this.RequestID();
    }

    @Field(4)
    private CThostFtdcDepositResultInformField RequestID(int RequestID) {
        this.io.setIntField(this, 4, RequestID);
        return this;
    }

    public void setRequestID(int requestID) {
        this.RequestID(requestID);
    }

    @Array({7L})
    @Field(5)
    private Pointer<Byte> ReturnCode() {
        return this.io.getPointerField(this, 5);
    }

    @Array({7L})
    @Field(5)
    public void setReturnCode(String returnCode) {
        this.io.getPointerField(this, 5).setCString(returnCode);
    }

    public String getReturnCode() {
        return this.ReturnCode().getCString();
    }

    @Array({129L})
    @Field(6)
    private Pointer<Byte> DescrInfoForReturnCode() {
        return this.io.getPointerField(this, 6);
    }

    @Array({129L})
    @Field(6)
    public void setDescrInfoForReturnCode(String descrInfoForReturnCode) {
        this.io.getPointerField(this, 6).setCString(descrInfoForReturnCode);
    }

    public String getDescrInfoForReturnCode() {
        return this.DescrInfoForReturnCode().getCString();
    }

    public CThostFtdcDepositResultInformField(Pointer pointer) {
        super(pointer);
    }
}
