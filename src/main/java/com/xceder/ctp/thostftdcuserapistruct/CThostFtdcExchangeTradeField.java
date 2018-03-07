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
public class CThostFtdcExchangeTradeField extends StructObject {
    public CThostFtdcExchangeTradeField() {
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

    @Array({21L})
    @Field(1)
    private Pointer<Byte> TradeID() {
        return this.io.getPointerField(this, 1);
    }

    @Array({21L})
    @Field(1)
    public void setTradeID(String tradeID) {
        this.io.getPointerField(this, 1).setCString(tradeID);
    }

    public String getTradeID() {
        return this.TradeID().getCString();
    }

    @Field(2)
    private byte Direction() {
        return this.io.getByteField(this, 2);
    }

    public char getDirection() {
        return (char)this.Direction();
    }

    @Field(2)
    private CThostFtdcExchangeTradeField Direction(byte Direction) {
        this.io.setByteField(this, 2, Direction);
        return this;
    }

    public void setDirection(char direction) {
        this.Direction((byte)direction);
    }

    @Array({21L})
    @Field(3)
    private Pointer<Byte> OrderSysID() {
        return this.io.getPointerField(this, 3);
    }

    @Array({21L})
    @Field(3)
    public void setOrderSysID(String orderSysID) {
        this.io.getPointerField(this, 3).setCString(orderSysID);
    }

    public String getOrderSysID() {
        return this.OrderSysID().getCString();
    }

    @Array({11L})
    @Field(4)
    private Pointer<Byte> ParticipantID() {
        return this.io.getPointerField(this, 4);
    }

    @Array({11L})
    @Field(4)
    public void setParticipantID(String participantID) {
        this.io.getPointerField(this, 4).setCString(participantID);
    }

    public String getParticipantID() {
        return this.ParticipantID().getCString();
    }

    @Array({11L})
    @Field(5)
    private Pointer<Byte> ClientID() {
        return this.io.getPointerField(this, 5);
    }

    @Array({11L})
    @Field(5)
    public void setClientID(String clientID) {
        this.io.getPointerField(this, 5).setCString(clientID);
    }

    public String getClientID() {
        return this.ClientID().getCString();
    }

    @Field(6)
    private byte TradingRole() {
        return this.io.getByteField(this, 6);
    }

    public char getTradingRole() {
        return (char)this.TradingRole();
    }

    @Field(6)
    private CThostFtdcExchangeTradeField TradingRole(byte TradingRole) {
        this.io.setByteField(this, 6, TradingRole);
        return this;
    }

    public void setTradingRole(char tradingRole) {
        this.TradingRole((byte)tradingRole);
    }

    @Array({31L})
    @Field(7)
    private Pointer<Byte> ExchangeInstID() {
        return this.io.getPointerField(this, 7);
    }

    @Array({31L})
    @Field(7)
    public void setExchangeInstID(String exchangeInstID) {
        this.io.getPointerField(this, 7).setCString(exchangeInstID);
    }

    public String getExchangeInstID() {
        return this.ExchangeInstID().getCString();
    }

    @Field(8)
    private byte OffsetFlag() {
        return this.io.getByteField(this, 8);
    }

    public char getOffsetFlag() {
        return (char)this.OffsetFlag();
    }

    @Field(8)
    private CThostFtdcExchangeTradeField OffsetFlag(byte OffsetFlag) {
        this.io.setByteField(this, 8, OffsetFlag);
        return this;
    }

    public void setOffsetFlag(char offsetFlag) {
        this.OffsetFlag((byte)offsetFlag);
    }

    @Field(9)
    private byte HedgeFlag() {
        return this.io.getByteField(this, 9);
    }

    public char getHedgeFlag() {
        return (char)this.HedgeFlag();
    }

    @Field(9)
    private CThostFtdcExchangeTradeField HedgeFlag(byte HedgeFlag) {
        this.io.setByteField(this, 9, HedgeFlag);
        return this;
    }

    public void setHedgeFlag(char hedgeFlag) {
        this.HedgeFlag((byte)hedgeFlag);
    }

    @Field(10)
    private double Price() {
        return this.io.getDoubleField(this, 10);
    }

    public double getPrice() {
        return this.Price();
    }

    @Field(10)
    private CThostFtdcExchangeTradeField Price(double Price) {
        this.io.setDoubleField(this, 10, Price);
        return this;
    }

    public void setPrice(double price) {
        this.Price(price);
    }

    @Field(11)
    private int Volume() {
        return this.io.getIntField(this, 11);
    }

    public int getVolume() {
        return this.Volume();
    }

    @Field(11)
    private CThostFtdcExchangeTradeField Volume(int Volume) {
        this.io.setIntField(this, 11, Volume);
        return this;
    }

    public void setVolume(int volume) {
        this.Volume(volume);
    }

    @Array({9L})
    @Field(12)
    private Pointer<Byte> TradeDate() {
        return this.io.getPointerField(this, 12);
    }

    @Array({9L})
    @Field(12)
    public void setTradeDate(String tradeDate) {
        this.io.getPointerField(this, 12).setCString(tradeDate);
    }

    public String getTradeDate() {
        return this.TradeDate().getCString();
    }

    @Array({9L})
    @Field(13)
    private Pointer<Byte> TradeTime() {
        return this.io.getPointerField(this, 13);
    }

    @Array({9L})
    @Field(13)
    public void setTradeTime(String tradeTime) {
        this.io.getPointerField(this, 13).setCString(tradeTime);
    }

    public String getTradeTime() {
        return this.TradeTime().getCString();
    }

    @Field(14)
    private byte TradeType() {
        return this.io.getByteField(this, 14);
    }

    public char getTradeType() {
        return (char)this.TradeType();
    }

    @Field(14)
    private CThostFtdcExchangeTradeField TradeType(byte TradeType) {
        this.io.setByteField(this, 14, TradeType);
        return this;
    }

    public void setTradeType(char tradeType) {
        this.TradeType((byte)tradeType);
    }

    @Field(15)
    private byte PriceSource() {
        return this.io.getByteField(this, 15);
    }

    public char getPriceSource() {
        return (char)this.PriceSource();
    }

    @Field(15)
    private CThostFtdcExchangeTradeField PriceSource(byte PriceSource) {
        this.io.setByteField(this, 15, PriceSource);
        return this;
    }

    public void setPriceSource(char priceSource) {
        this.PriceSource((byte)priceSource);
    }

    @Array({21L})
    @Field(16)
    private Pointer<Byte> TraderID() {
        return this.io.getPointerField(this, 16);
    }

    @Array({21L})
    @Field(16)
    public void setTraderID(String traderID) {
        this.io.getPointerField(this, 16).setCString(traderID);
    }

    public String getTraderID() {
        return this.TraderID().getCString();
    }

    @Array({13L})
    @Field(17)
    private Pointer<Byte> OrderLocalID() {
        return this.io.getPointerField(this, 17);
    }

    @Array({13L})
    @Field(17)
    public void setOrderLocalID(String orderLocalID) {
        this.io.getPointerField(this, 17).setCString(orderLocalID);
    }

    public String getOrderLocalID() {
        return this.OrderLocalID().getCString();
    }

    @Array({11L})
    @Field(18)
    private Pointer<Byte> ClearingPartID() {
        return this.io.getPointerField(this, 18);
    }

    @Array({11L})
    @Field(18)
    public void setClearingPartID(String clearingPartID) {
        this.io.getPointerField(this, 18).setCString(clearingPartID);
    }

    public String getClearingPartID() {
        return this.ClearingPartID().getCString();
    }

    @Array({21L})
    @Field(19)
    private Pointer<Byte> BusinessUnit() {
        return this.io.getPointerField(this, 19);
    }

    @Array({21L})
    @Field(19)
    public void setBusinessUnit(String businessUnit) {
        this.io.getPointerField(this, 19).setCString(businessUnit);
    }

    public String getBusinessUnit() {
        return this.BusinessUnit().getCString();
    }

    @Field(20)
    private int SequenceNo() {
        return this.io.getIntField(this, 20);
    }

    public int getSequenceNo() {
        return this.SequenceNo();
    }

    @Field(20)
    private CThostFtdcExchangeTradeField SequenceNo(int SequenceNo) {
        this.io.setIntField(this, 20, SequenceNo);
        return this;
    }

    public void setSequenceNo(int sequenceNo) {
        this.SequenceNo(sequenceNo);
    }

    @Field(21)
    private byte TradeSource() {
        return this.io.getByteField(this, 21);
    }

    public char getTradeSource() {
        return (char)this.TradeSource();
    }

    @Field(21)
    private CThostFtdcExchangeTradeField TradeSource(byte TradeSource) {
        this.io.setByteField(this, 21, TradeSource);
        return this;
    }

    public void setTradeSource(char tradeSource) {
        this.TradeSource((byte)tradeSource);
    }

    public CThostFtdcExchangeTradeField(Pointer pointer) {
        super(pointer);
    }
}
