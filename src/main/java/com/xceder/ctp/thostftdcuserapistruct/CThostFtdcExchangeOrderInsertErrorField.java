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
public class CThostFtdcExchangeOrderInsertErrorField extends StructObject {
    public CThostFtdcExchangeOrderInsertErrorField() {
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

    @Array({11L})
    @Field(1)
    private Pointer<Byte> ParticipantID() {
        return this.io.getPointerField(this, 1);
    }

    @Array({11L})
    @Field(1)
    public void setParticipantID(String participantID) {
        this.io.getPointerField(this, 1).setCString(participantID);
    }

    public String getParticipantID() {
        return this.ParticipantID().getCString();
    }

    @Array({21L})
    @Field(2)
    private Pointer<Byte> TraderID() {
        return this.io.getPointerField(this, 2);
    }

    @Array({21L})
    @Field(2)
    public void setTraderID(String traderID) {
        this.io.getPointerField(this, 2).setCString(traderID);
    }

    public String getTraderID() {
        return this.TraderID().getCString();
    }

    @Field(3)
    private int InstallID() {
        return this.io.getIntField(this, 3);
    }

    public int getInstallID() {
        return this.InstallID();
    }

    @Field(3)
    private CThostFtdcExchangeOrderInsertErrorField InstallID(int InstallID) {
        this.io.setIntField(this, 3, InstallID);
        return this;
    }

    public void setInstallID(int installID) {
        this.InstallID(installID);
    }

    @Array({13L})
    @Field(4)
    private Pointer<Byte> OrderLocalID() {
        return this.io.getPointerField(this, 4);
    }

    @Array({13L})
    @Field(4)
    public void setOrderLocalID(String orderLocalID) {
        this.io.getPointerField(this, 4).setCString(orderLocalID);
    }

    public String getOrderLocalID() {
        return this.OrderLocalID().getCString();
    }

    @Field(5)
    private int ErrorID() {
        return this.io.getIntField(this, 5);
    }

    public int getErrorID() {
        return this.ErrorID();
    }

    @Field(5)
    private CThostFtdcExchangeOrderInsertErrorField ErrorID(int ErrorID) {
        this.io.setIntField(this, 5, ErrorID);
        return this;
    }

    public void setErrorID(int errorID) {
        this.ErrorID(errorID);
    }

    @Array({81L})
    @Field(6)
    private Pointer<Byte> ErrorMsg() {
        return this.io.getPointerField(this, 6);
    }

    @Array({81L})
    @Field(6)
    public void setErrorMsg(String errorMsg) {
        this.io.getPointerField(this, 6).setCString(errorMsg);
    }

    public String getErrorMsg() {
        return this.ErrorMsg().getCString();
    }

    public CThostFtdcExchangeOrderInsertErrorField(Pointer pointer) {
        super(pointer);
    }
}
