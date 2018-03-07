package com.xceder.ctp.thostftdcuserapistruct;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;

public class CThostFtdcQryMDTraderOfferField extends StructObject {
    public CThostFtdcQryMDTraderOfferField() {
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

    public CThostFtdcQryMDTraderOfferField(Pointer pointer) {
        super(pointer);
    }
}
