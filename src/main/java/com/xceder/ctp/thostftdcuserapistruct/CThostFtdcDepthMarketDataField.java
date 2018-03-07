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
public class CThostFtdcDepthMarketDataField extends StructObject {
    public CThostFtdcDepthMarketDataField() {
    }

    @Array({9L})
    @Field(0)
    private Pointer<Byte> TradingDay() {
        return this.io.getPointerField(this, 0);
    }

    @Array({9L})
    @Field(0)
    public void setTradingDay(String tradingDay) {
        this.io.getPointerField(this, 0).setCString(tradingDay);
    }

    public String getTradingDay() {
        return this.TradingDay().getCString();
    }

    @Array({31L})
    @Field(1)
    private Pointer<Byte> InstrumentID() {
        return this.io.getPointerField(this, 1);
    }

    @Array({31L})
    @Field(1)
    public void setInstrumentID(String instrumentID) {
        this.io.getPointerField(this, 1).setCString(instrumentID);
    }

    public String getInstrumentID() {
        return this.InstrumentID().getCString();
    }

    @Array({9L})
    @Field(2)
    private Pointer<Byte> ExchangeID() {
        return this.io.getPointerField(this, 2);
    }

    @Array({9L})
    @Field(2)
    public void setExchangeID(String exchangeID) {
        this.io.getPointerField(this, 2).setCString(exchangeID);
    }

    public String getExchangeID() {
        return this.ExchangeID().getCString();
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

    @Field(4)
    private double LastPrice() {
        return this.io.getDoubleField(this, 4);
    }

    public double getLastPrice() {
        return this.LastPrice();
    }

    @Field(4)
    private CThostFtdcDepthMarketDataField LastPrice(double LastPrice) {
        this.io.setDoubleField(this, 4, LastPrice);
        return this;
    }

    public void setLastPrice(double lastPrice) {
        this.LastPrice(lastPrice);
    }

    @Field(5)
    private double PreSettlementPrice() {
        return this.io.getDoubleField(this, 5);
    }

    public double getPreSettlementPrice() {
        return this.PreSettlementPrice();
    }

    @Field(5)
    private CThostFtdcDepthMarketDataField PreSettlementPrice(double PreSettlementPrice) {
        this.io.setDoubleField(this, 5, PreSettlementPrice);
        return this;
    }

    public void setPreSettlementPrice(double preSettlementPrice) {
        this.PreSettlementPrice(preSettlementPrice);
    }

    @Field(6)
    private double PreClosePrice() {
        return this.io.getDoubleField(this, 6);
    }

    public double getPreClosePrice() {
        return this.PreClosePrice();
    }

    @Field(6)
    private CThostFtdcDepthMarketDataField PreClosePrice(double PreClosePrice) {
        this.io.setDoubleField(this, 6, PreClosePrice);
        return this;
    }

    public void setPreClosePrice(double preClosePrice) {
        this.PreClosePrice(preClosePrice);
    }

    @Field(7)
    private double PreOpenInterest() {
        return this.io.getDoubleField(this, 7);
    }

    public double getPreOpenInterest() {
        return this.PreOpenInterest();
    }

    @Field(7)
    private CThostFtdcDepthMarketDataField PreOpenInterest(double PreOpenInterest) {
        this.io.setDoubleField(this, 7, PreOpenInterest);
        return this;
    }

    public void setPreOpenInterest(double preOpenInterest) {
        this.PreOpenInterest(preOpenInterest);
    }

    @Field(8)
    private double OpenPrice() {
        return this.io.getDoubleField(this, 8);
    }

    public double getOpenPrice() {
        return this.OpenPrice();
    }

    @Field(8)
    private CThostFtdcDepthMarketDataField OpenPrice(double OpenPrice) {
        this.io.setDoubleField(this, 8, OpenPrice);
        return this;
    }

    public void setOpenPrice(double openPrice) {
        this.OpenPrice(openPrice);
    }

    @Field(9)
    private double HighestPrice() {
        return this.io.getDoubleField(this, 9);
    }

    public double getHighestPrice() {
        return this.HighestPrice();
    }

    @Field(9)
    private CThostFtdcDepthMarketDataField HighestPrice(double HighestPrice) {
        this.io.setDoubleField(this, 9, HighestPrice);
        return this;
    }

    public void setHighestPrice(double highestPrice) {
        this.HighestPrice(highestPrice);
    }

    @Field(10)
    private double LowestPrice() {
        return this.io.getDoubleField(this, 10);
    }

    public double getLowestPrice() {
        return this.LowestPrice();
    }

    @Field(10)
    private CThostFtdcDepthMarketDataField LowestPrice(double LowestPrice) {
        this.io.setDoubleField(this, 10, LowestPrice);
        return this;
    }

    public void setLowestPrice(double lowestPrice) {
        this.LowestPrice(lowestPrice);
    }

    @Field(11)
    private int Volume() {
        return this.io.getIntField(this, 11);
    }

    public int getVolume() {
        return this.Volume();
    }

    @Field(11)
    private CThostFtdcDepthMarketDataField Volume(int Volume) {
        this.io.setIntField(this, 11, Volume);
        return this;
    }

    public void setVolume(int volume) {
        this.Volume(volume);
    }

    @Field(12)
    private double Turnover() {
        return this.io.getDoubleField(this, 12);
    }

    public double getTurnover() {
        return this.Turnover();
    }

    @Field(12)
    private CThostFtdcDepthMarketDataField Turnover(double Turnover) {
        this.io.setDoubleField(this, 12, Turnover);
        return this;
    }

    public void setTurnover(double turnover) {
        this.Turnover(turnover);
    }

    @Field(13)
    private double OpenInterest() {
        return this.io.getDoubleField(this, 13);
    }

    public double getOpenInterest() {
        return this.OpenInterest();
    }

    @Field(13)
    private CThostFtdcDepthMarketDataField OpenInterest(double OpenInterest) {
        this.io.setDoubleField(this, 13, OpenInterest);
        return this;
    }

    public void setOpenInterest(double openInterest) {
        this.OpenInterest(openInterest);
    }

    @Field(14)
    private double ClosePrice() {
        return this.io.getDoubleField(this, 14);
    }

    public double getClosePrice() {
        return this.ClosePrice();
    }

    @Field(14)
    private CThostFtdcDepthMarketDataField ClosePrice(double ClosePrice) {
        this.io.setDoubleField(this, 14, ClosePrice);
        return this;
    }

    public void setClosePrice(double closePrice) {
        this.ClosePrice(closePrice);
    }

    @Field(15)
    private double SettlementPrice() {
        return this.io.getDoubleField(this, 15);
    }

    public double getSettlementPrice() {
        return this.SettlementPrice();
    }

    @Field(15)
    private CThostFtdcDepthMarketDataField SettlementPrice(double SettlementPrice) {
        this.io.setDoubleField(this, 15, SettlementPrice);
        return this;
    }

    public void setSettlementPrice(double settlementPrice) {
        this.SettlementPrice(settlementPrice);
    }

    @Field(16)
    private double UpperLimitPrice() {
        return this.io.getDoubleField(this, 16);
    }

    public double getUpperLimitPrice() {
        return this.UpperLimitPrice();
    }

    @Field(16)
    private CThostFtdcDepthMarketDataField UpperLimitPrice(double UpperLimitPrice) {
        this.io.setDoubleField(this, 16, UpperLimitPrice);
        return this;
    }

    public void setUpperLimitPrice(double upperLimitPrice) {
        this.UpperLimitPrice(upperLimitPrice);
    }

    @Field(17)
    private double LowerLimitPrice() {
        return this.io.getDoubleField(this, 17);
    }

    public double getLowerLimitPrice() {
        return this.LowerLimitPrice();
    }

    @Field(17)
    private CThostFtdcDepthMarketDataField LowerLimitPrice(double LowerLimitPrice) {
        this.io.setDoubleField(this, 17, LowerLimitPrice);
        return this;
    }

    public void setLowerLimitPrice(double lowerLimitPrice) {
        this.LowerLimitPrice(lowerLimitPrice);
    }

    @Field(18)
    private double PreDelta() {
        return this.io.getDoubleField(this, 18);
    }

    public double getPreDelta() {
        return this.PreDelta();
    }

    @Field(18)
    private CThostFtdcDepthMarketDataField PreDelta(double PreDelta) {
        this.io.setDoubleField(this, 18, PreDelta);
        return this;
    }

    public void setPreDelta(double preDelta) {
        this.PreDelta(preDelta);
    }

    @Field(19)
    private double CurrDelta() {
        return this.io.getDoubleField(this, 19);
    }

    public double getCurrDelta() {
        return this.CurrDelta();
    }

    @Field(19)
    private CThostFtdcDepthMarketDataField CurrDelta(double CurrDelta) {
        this.io.setDoubleField(this, 19, CurrDelta);
        return this;
    }

    public void setCurrDelta(double currDelta) {
        this.CurrDelta(currDelta);
    }

    @Array({9L})
    @Field(20)
    private Pointer<Byte> UpdateTime() {
        return this.io.getPointerField(this, 20);
    }

    @Array({9L})
    @Field(20)
    public void setUpdateTime(String updateTime) {
        this.io.getPointerField(this, 20).setCString(updateTime);
    }

    public String getUpdateTime() {
        return this.UpdateTime().getCString();
    }

    @Field(21)
    private int UpdateMillisec() {
        return this.io.getIntField(this, 21);
    }

    public int getUpdateMillisec() {
        return this.UpdateMillisec();
    }

    @Field(21)
    private CThostFtdcDepthMarketDataField UpdateMillisec(int UpdateMillisec) {
        this.io.setIntField(this, 21, UpdateMillisec);
        return this;
    }

    public void setUpdateMillisec(int updateMillisec) {
        this.UpdateMillisec(updateMillisec);
    }

    @Field(22)
    private double BidPrice1() {
        return this.io.getDoubleField(this, 22);
    }

    public double getBidPrice1() {
        return this.BidPrice1();
    }

    @Field(22)
    private CThostFtdcDepthMarketDataField BidPrice1(double BidPrice1) {
        this.io.setDoubleField(this, 22, BidPrice1);
        return this;
    }

    public void setBidPrice1(double bidPrice1) {
        this.BidPrice1(bidPrice1);
    }

    @Field(23)
    private int BidVolume1() {
        return this.io.getIntField(this, 23);
    }

    public int getBidVolume1() {
        return this.BidVolume1();
    }

    @Field(23)
    private CThostFtdcDepthMarketDataField BidVolume1(int BidVolume1) {
        this.io.setIntField(this, 23, BidVolume1);
        return this;
    }

    public void setBidVolume1(int bidVolume1) {
        this.BidVolume1(bidVolume1);
    }

    @Field(24)
    private double AskPrice1() {
        return this.io.getDoubleField(this, 24);
    }

    public double getAskPrice1() {
        return this.AskPrice1();
    }

    @Field(24)
    private CThostFtdcDepthMarketDataField AskPrice1(double AskPrice1) {
        this.io.setDoubleField(this, 24, AskPrice1);
        return this;
    }

    public void setAskPrice1(double askPrice1) {
        this.AskPrice1(askPrice1);
    }

    @Field(25)
    private int AskVolume1() {
        return this.io.getIntField(this, 25);
    }

    public int getAskVolume1() {
        return this.AskVolume1();
    }

    @Field(25)
    private CThostFtdcDepthMarketDataField AskVolume1(int AskVolume1) {
        this.io.setIntField(this, 25, AskVolume1);
        return this;
    }

    public void setAskVolume1(int askVolume1) {
        this.AskVolume1(askVolume1);
    }

    @Field(26)
    private double BidPrice2() {
        return this.io.getDoubleField(this, 26);
    }

    public double getBidPrice2() {
        return this.BidPrice2();
    }

    @Field(26)
    private CThostFtdcDepthMarketDataField BidPrice2(double BidPrice2) {
        this.io.setDoubleField(this, 26, BidPrice2);
        return this;
    }

    public void setBidPrice2(double bidPrice2) {
        this.BidPrice2(bidPrice2);
    }

    @Field(27)
    private int BidVolume2() {
        return this.io.getIntField(this, 27);
    }

    public int getBidVolume2() {
        return this.BidVolume2();
    }

    @Field(27)
    private CThostFtdcDepthMarketDataField BidVolume2(int BidVolume2) {
        this.io.setIntField(this, 27, BidVolume2);
        return this;
    }

    public void setBidVolume2(int bidVolume2) {
        this.BidVolume2(bidVolume2);
    }

    @Field(28)
    private double AskPrice2() {
        return this.io.getDoubleField(this, 28);
    }

    public double getAskPrice2() {
        return this.AskPrice2();
    }

    @Field(28)
    private CThostFtdcDepthMarketDataField AskPrice2(double AskPrice2) {
        this.io.setDoubleField(this, 28, AskPrice2);
        return this;
    }

    public void setAskPrice2(double askPrice2) {
        this.AskPrice2(askPrice2);
    }

    @Field(29)
    private int AskVolume2() {
        return this.io.getIntField(this, 29);
    }

    public int getAskVolume2() {
        return this.AskVolume2();
    }

    @Field(29)
    private CThostFtdcDepthMarketDataField AskVolume2(int AskVolume2) {
        this.io.setIntField(this, 29, AskVolume2);
        return this;
    }

    public void setAskVolume2(int askVolume2) {
        this.AskVolume2(askVolume2);
    }

    @Field(30)
    private double BidPrice3() {
        return this.io.getDoubleField(this, 30);
    }

    public double getBidPrice3() {
        return this.BidPrice3();
    }

    @Field(30)
    private CThostFtdcDepthMarketDataField BidPrice3(double BidPrice3) {
        this.io.setDoubleField(this, 30, BidPrice3);
        return this;
    }

    public void setBidPrice3(double bidPrice3) {
        this.BidPrice3(bidPrice3);
    }

    @Field(31)
    private int BidVolume3() {
        return this.io.getIntField(this, 31);
    }

    public int getBidVolume3() {
        return this.BidVolume3();
    }

    @Field(31)
    private CThostFtdcDepthMarketDataField BidVolume3(int BidVolume3) {
        this.io.setIntField(this, 31, BidVolume3);
        return this;
    }

    public void setBidVolume3(int bidVolume3) {
        this.BidVolume3(bidVolume3);
    }

    @Field(32)
    private double AskPrice3() {
        return this.io.getDoubleField(this, 32);
    }

    public double getAskPrice3() {
        return this.AskPrice3();
    }

    @Field(32)
    private CThostFtdcDepthMarketDataField AskPrice3(double AskPrice3) {
        this.io.setDoubleField(this, 32, AskPrice3);
        return this;
    }

    public void setAskPrice3(double askPrice3) {
        this.AskPrice3(askPrice3);
    }

    @Field(33)
    private int AskVolume3() {
        return this.io.getIntField(this, 33);
    }

    public int getAskVolume3() {
        return this.AskVolume3();
    }

    @Field(33)
    private CThostFtdcDepthMarketDataField AskVolume3(int AskVolume3) {
        this.io.setIntField(this, 33, AskVolume3);
        return this;
    }

    public void setAskVolume3(int askVolume3) {
        this.AskVolume3(askVolume3);
    }

    @Field(34)
    private double BidPrice4() {
        return this.io.getDoubleField(this, 34);
    }

    public double getBidPrice4() {
        return this.BidPrice4();
    }

    @Field(34)
    private CThostFtdcDepthMarketDataField BidPrice4(double BidPrice4) {
        this.io.setDoubleField(this, 34, BidPrice4);
        return this;
    }

    public void setBidPrice4(double bidPrice4) {
        this.BidPrice4(bidPrice4);
    }

    @Field(35)
    private int BidVolume4() {
        return this.io.getIntField(this, 35);
    }

    public int getBidVolume4() {
        return this.BidVolume4();
    }

    @Field(35)
    private CThostFtdcDepthMarketDataField BidVolume4(int BidVolume4) {
        this.io.setIntField(this, 35, BidVolume4);
        return this;
    }

    public void setBidVolume4(int bidVolume4) {
        this.BidVolume4(bidVolume4);
    }

    @Field(36)
    private double AskPrice4() {
        return this.io.getDoubleField(this, 36);
    }

    public double getAskPrice4() {
        return this.AskPrice4();
    }

    @Field(36)
    private CThostFtdcDepthMarketDataField AskPrice4(double AskPrice4) {
        this.io.setDoubleField(this, 36, AskPrice4);
        return this;
    }

    public void setAskPrice4(double askPrice4) {
        this.AskPrice4(askPrice4);
    }

    @Field(37)
    private int AskVolume4() {
        return this.io.getIntField(this, 37);
    }

    public int getAskVolume4() {
        return this.AskVolume4();
    }

    @Field(37)
    private CThostFtdcDepthMarketDataField AskVolume4(int AskVolume4) {
        this.io.setIntField(this, 37, AskVolume4);
        return this;
    }

    public void setAskVolume4(int askVolume4) {
        this.AskVolume4(askVolume4);
    }

    @Field(38)
    private double BidPrice5() {
        return this.io.getDoubleField(this, 38);
    }

    public double getBidPrice5() {
        return this.BidPrice5();
    }

    @Field(38)
    private CThostFtdcDepthMarketDataField BidPrice5(double BidPrice5) {
        this.io.setDoubleField(this, 38, BidPrice5);
        return this;
    }

    public void setBidPrice5(double bidPrice5) {
        this.BidPrice5(bidPrice5);
    }

    @Field(39)
    private int BidVolume5() {
        return this.io.getIntField(this, 39);
    }

    public int getBidVolume5() {
        return this.BidVolume5();
    }

    @Field(39)
    private CThostFtdcDepthMarketDataField BidVolume5(int BidVolume5) {
        this.io.setIntField(this, 39, BidVolume5);
        return this;
    }

    public void setBidVolume5(int bidVolume5) {
        this.BidVolume5(bidVolume5);
    }

    @Field(40)
    private double AskPrice5() {
        return this.io.getDoubleField(this, 40);
    }

    public double getAskPrice5() {
        return this.AskPrice5();
    }

    @Field(40)
    private CThostFtdcDepthMarketDataField AskPrice5(double AskPrice5) {
        this.io.setDoubleField(this, 40, AskPrice5);
        return this;
    }

    public void setAskPrice5(double askPrice5) {
        this.AskPrice5(askPrice5);
    }

    @Field(41)
    private int AskVolume5() {
        return this.io.getIntField(this, 41);
    }

    public int getAskVolume5() {
        return this.AskVolume5();
    }

    @Field(41)
    private CThostFtdcDepthMarketDataField AskVolume5(int AskVolume5) {
        this.io.setIntField(this, 41, AskVolume5);
        return this;
    }

    public void setAskVolume5(int askVolume5) {
        this.AskVolume5(askVolume5);
    }

    @Field(42)
    private double AveragePrice() {
        return this.io.getDoubleField(this, 42);
    }

    public double getAveragePrice() {
        return this.AveragePrice();
    }

    @Field(42)
    private CThostFtdcDepthMarketDataField AveragePrice(double AveragePrice) {
        this.io.setDoubleField(this, 42, AveragePrice);
        return this;
    }

    public void setAveragePrice(double averagePrice) {
        this.AveragePrice(averagePrice);
    }

    public CThostFtdcDepthMarketDataField(Pointer pointer) {
        super(pointer);
    }
}
