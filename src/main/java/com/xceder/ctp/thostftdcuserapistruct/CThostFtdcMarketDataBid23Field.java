package com.xceder.ctp.thostftdcuserapistruct;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

/**
 * \u884c\u60c5\u7533\u4e70\u4e8c\u3001\u4e09\u5c5e\u6027<br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Thostmduserapi")
public class CThostFtdcMarketDataBid23Field extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : TThostFtdcPriceType */
	@Field(0)
	public double BidPrice2() {
		return this.io.getDoubleField(this, 0);
	}
	/** C type : TThostFtdcPriceType */
	@Field(0)
	public CThostFtdcMarketDataBid23Field BidPrice2(double BidPrice2) {
		this.io.setDoubleField(this, 0, BidPrice2);
		return this;
	}
	/** C type : TThostFtdcVolumeType */
	@Field(1)
	public int BidVolume2() {
		return this.io.getIntField(this, 1);
	}
	/** C type : TThostFtdcVolumeType */
	@Field(1)
	public CThostFtdcMarketDataBid23Field BidVolume2(int BidVolume2) {
		this.io.setIntField(this, 1, BidVolume2);
		return this;
	}
	/** C type : TThostFtdcPriceType */
	@Field(2)
	public double BidPrice3() {
		return this.io.getDoubleField(this, 2);
	}
	/** C type : TThostFtdcPriceType */
	@Field(2)
	public CThostFtdcMarketDataBid23Field BidPrice3(double BidPrice3) {
		this.io.setDoubleField(this, 2, BidPrice3);
		return this;
	}
	/** C type : TThostFtdcVolumeType */
	@Field(3)
	public int BidVolume3() {
		return this.io.getIntField(this, 3);
	}
	/** C type : TThostFtdcVolumeType */
	@Field(3)
	public CThostFtdcMarketDataBid23Field BidVolume3(int BidVolume3) {
		this.io.setIntField(this, 3, BidVolume3);
		return this;
	}
	public CThostFtdcMarketDataBid23Field() {
		super();
	}
	public CThostFtdcMarketDataBid23Field(Pointer pointer) {
		super(pointer);
	}
}