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
public class CThostFtdcInstrumentField extends StructObject {
    public CThostFtdcInstrumentField() {
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

    @Array({9L})
    @Field(1)
    private Pointer<Byte> ExchangeID() {
        return this.io.getPointerField(this, 1);
    }

    @Array({9L})
    @Field(1)
    public void setExchangeID(String exchangeID) {
        this.io.getPointerField(this, 1).setCString(exchangeID);
    }

    public String getExchangeID() {
        return this.ExchangeID().getCString();
    }

    @Array({21L})
    @Field(2)
    private Pointer<Byte> InstrumentName() {
        return this.io.getPointerField(this, 2);
    }

    @Array({21L})
    @Field(2)
    public void setInstrumentName(String instrumentName) {
        this.io.getPointerField(this, 2).setCString(instrumentName);
    }

    public String getInstrumentName() {
        return this.InstrumentName().getCString();
    }

    @Array({31L})
    @Field(3)
    private Pointer<Byte> ExchangeInstID() {
        return this.io.getPointerField(this, 3);
    }

    @Array({31L})
    @Field(3)
    public void setExchangeInstID(String exchangeInstID) {
        this.io.getPointerField(this, 3).setCString(exchangeInstID);
    }

    public String getExchangeInstID() {
        return this.ExchangeInstID().getCString();
    }

    @Array({31L})
    @Field(4)
    private Pointer<Byte> ProductID() {
        return this.io.getPointerField(this, 4);
    }

    @Array({31L})
    @Field(4)
    public void setProductID(String productID) {
        this.io.getPointerField(this, 4).setCString(productID);
    }

    public String getProductID() {
        return this.ProductID().getCString();
    }

    @Field(5)
    private byte ProductClass() {
        return this.io.getByteField(this, 5);
    }

    public char getProductClass() {
        return (char)this.ProductClass();
    }

    @Field(5)
    private CThostFtdcInstrumentField ProductClass(byte ProductClass) {
        this.io.setByteField(this, 5, ProductClass);
        return this;
    }

    public void setProductClass(char productClass) {
        this.ProductClass((byte)productClass);
    }

    @Field(6)
    private int DeliveryYear() {
        return this.io.getIntField(this, 6);
    }

    public int getDeliveryYear() {
        return this.DeliveryYear();
    }

    @Field(6)
    private CThostFtdcInstrumentField DeliveryYear(int DeliveryYear) {
        this.io.setIntField(this, 6, DeliveryYear);
        return this;
    }

    public void setDeliveryYear(int deliveryYear) {
        this.DeliveryYear(deliveryYear);
    }

    @Field(7)
    private int DeliveryMonth() {
        return this.io.getIntField(this, 7);
    }

    public int getDeliveryMonth() {
        return this.DeliveryMonth();
    }

    @Field(7)
    private CThostFtdcInstrumentField DeliveryMonth(int DeliveryMonth) {
        this.io.setIntField(this, 7, DeliveryMonth);
        return this;
    }

    public void setDeliveryMonth(int deliveryMonth) {
        this.DeliveryMonth(deliveryMonth);
    }

    @Field(8)
    private int MaxMarketOrderVolume() {
        return this.io.getIntField(this, 8);
    }

    public int getMaxMarketOrderVolume() {
        return this.MaxMarketOrderVolume();
    }

    @Field(8)
    private CThostFtdcInstrumentField MaxMarketOrderVolume(int MaxMarketOrderVolume) {
        this.io.setIntField(this, 8, MaxMarketOrderVolume);
        return this;
    }

    public void setMaxMarketOrderVolume(int maxMarketOrderVolume) {
        this.MaxMarketOrderVolume(maxMarketOrderVolume);
    }

    @Field(9)
    private int MinMarketOrderVolume() {
        return this.io.getIntField(this, 9);
    }

    public int getMinMarketOrderVolume() {
        return this.MinMarketOrderVolume();
    }

    @Field(9)
    private CThostFtdcInstrumentField MinMarketOrderVolume(int MinMarketOrderVolume) {
        this.io.setIntField(this, 9, MinMarketOrderVolume);
        return this;
    }

    public void setMinMarketOrderVolume(int minMarketOrderVolume) {
        this.MinMarketOrderVolume(minMarketOrderVolume);
    }

    @Field(10)
    private int MaxLimitOrderVolume() {
        return this.io.getIntField(this, 10);
    }

    public int getMaxLimitOrderVolume() {
        return this.MaxLimitOrderVolume();
    }

    @Field(10)
    private CThostFtdcInstrumentField MaxLimitOrderVolume(int MaxLimitOrderVolume) {
        this.io.setIntField(this, 10, MaxLimitOrderVolume);
        return this;
    }

    public void setMaxLimitOrderVolume(int maxLimitOrderVolume) {
        this.MaxLimitOrderVolume(maxLimitOrderVolume);
    }

    @Field(11)
    private int MinLimitOrderVolume() {
        return this.io.getIntField(this, 11);
    }

    public int getMinLimitOrderVolume() {
        return this.MinLimitOrderVolume();
    }

    @Field(11)
    private CThostFtdcInstrumentField MinLimitOrderVolume(int MinLimitOrderVolume) {
        this.io.setIntField(this, 11, MinLimitOrderVolume);
        return this;
    }

    public void setMinLimitOrderVolume(int minLimitOrderVolume) {
        this.MinLimitOrderVolume(minLimitOrderVolume);
    }

    @Field(12)
    private int VolumeMultiple() {
        return this.io.getIntField(this, 12);
    }

    public int getVolumeMultiple() {
        return this.VolumeMultiple();
    }

    @Field(12)
    private CThostFtdcInstrumentField VolumeMultiple(int VolumeMultiple) {
        this.io.setIntField(this, 12, VolumeMultiple);
        return this;
    }

    public void setVolumeMultiple(int volumeMultiple) {
        this.VolumeMultiple(volumeMultiple);
    }

    @Field(13)
    private double PriceTick() {
        return this.io.getDoubleField(this, 13);
    }

    public double getPriceTick() {
        return this.PriceTick();
    }

    @Field(13)
    private CThostFtdcInstrumentField PriceTick(double PriceTick) {
        this.io.setDoubleField(this, 13, PriceTick);
        return this;
    }

    public void setPriceTick(double priceTick) {
        this.PriceTick(priceTick);
    }

    @Array({9L})
    @Field(14)
    private Pointer<Byte> CreateDate() {
        return this.io.getPointerField(this, 14);
    }

    @Array({9L})
    @Field(14)
    public void setCreateDate(String createDate) {
        this.io.getPointerField(this, 14).setCString(createDate);
    }

    public String getCreateDate() {
        return this.CreateDate().getCString();
    }

    @Array({9L})
    @Field(15)
    private Pointer<Byte> OpenDate() {
        return this.io.getPointerField(this, 15);
    }

    @Array({9L})
    @Field(15)
    public void setOpenDate(String openDate) {
        this.io.getPointerField(this, 15).setCString(openDate);
    }

    public String getOpenDate() {
        return this.OpenDate().getCString();
    }

    @Array({9L})
    @Field(16)
    private Pointer<Byte> ExpireDate() {
        return this.io.getPointerField(this, 16);
    }

    @Array({9L})
    @Field(16)
    public void setExpireDate(String expireDate) {
        this.io.getPointerField(this, 16).setCString(expireDate);
    }

    public String getExpireDate() {
        return this.ExpireDate().getCString();
    }

    @Array({9L})
    @Field(17)
    private Pointer<Byte> StartDelivDate() {
        return this.io.getPointerField(this, 17);
    }

    @Array({9L})
    @Field(17)
    public void setStartDelivDate(String startDelivDate) {
        this.io.getPointerField(this, 17).setCString(startDelivDate);
    }

    public String getStartDelivDate() {
        return this.StartDelivDate().getCString();
    }

    @Array({9L})
    @Field(18)
    private Pointer<Byte> EndDelivDate() {
        return this.io.getPointerField(this, 18);
    }

    @Array({9L})
    @Field(18)
    public void setEndDelivDate(String endDelivDate) {
        this.io.getPointerField(this, 18).setCString(endDelivDate);
    }

    public String getEndDelivDate() {
        return this.EndDelivDate().getCString();
    }

    @Field(19)
    private byte InstLifePhase() {
        return this.io.getByteField(this, 19);
    }

    public char getInstLifePhase() {
        return (char)this.InstLifePhase();
    }

    @Field(19)
    private CThostFtdcInstrumentField InstLifePhase(byte InstLifePhase) {
        this.io.setByteField(this, 19, InstLifePhase);
        return this;
    }

    public void setInstLifePhase(char instLifePhase) {
        this.InstLifePhase((byte)instLifePhase);
    }

    @Field(20)
    private int IsTrading() {
        return this.io.getIntField(this, 20);
    }

    public int getIsTrading() {
        return this.IsTrading();
    }

    @Field(20)
    private CThostFtdcInstrumentField IsTrading(int IsTrading) {
        this.io.setIntField(this, 20, IsTrading);
        return this;
    }

    public void setIsTrading(int isTrading) {
        this.IsTrading(isTrading);
    }

    @Field(21)
    private byte PositionType() {
        return this.io.getByteField(this, 21);
    }

    public char getPositionType() {
        return (char)this.PositionType();
    }

    @Field(21)
    private CThostFtdcInstrumentField PositionType(byte PositionType) {
        this.io.setByteField(this, 21, PositionType);
        return this;
    }

    public void setPositionType(char positionType) {
        this.PositionType((byte)positionType);
    }

    @Field(22)
    private byte PositionDateType() {
        return this.io.getByteField(this, 22);
    }

    public char getPositionDateType() {
        return (char)this.PositionDateType();
    }

    @Field(22)
    private CThostFtdcInstrumentField PositionDateType(byte PositionDateType) {
        this.io.setByteField(this, 22, PositionDateType);
        return this;
    }

    public void setPositionDateType(char positionDateType) {
        this.PositionDateType((byte)positionDateType);
    }

    @Field(23)
    private double LongMarginRatio() {
        return this.io.getDoubleField(this, 23);
    }

    public double getLongMarginRatio() {
        return this.LongMarginRatio();
    }

    @Field(23)
    private CThostFtdcInstrumentField LongMarginRatio(double LongMarginRatio) {
        this.io.setDoubleField(this, 23, LongMarginRatio);
        return this;
    }

    public void setLongMarginRatio(double longMarginRatio) {
        this.LongMarginRatio(longMarginRatio);
    }

    @Field(24)
    private double ShortMarginRatio() {
        return this.io.getDoubleField(this, 24);
    }

    public double getShortMarginRatio() {
        return this.ShortMarginRatio();
    }

    @Field(24)
    private CThostFtdcInstrumentField ShortMarginRatio(double ShortMarginRatio) {
        this.io.setDoubleField(this, 24, ShortMarginRatio);
        return this;
    }

    public void setShortMarginRatio(double shortMarginRatio) {
        this.ShortMarginRatio(shortMarginRatio);
    }

    public CThostFtdcInstrumentField(Pointer pointer) {
        super(pointer);
    }
}
