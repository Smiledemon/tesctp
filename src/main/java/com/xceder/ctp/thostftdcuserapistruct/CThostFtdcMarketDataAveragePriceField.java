package com.xceder.ctp.thostftdcuserapistruct;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

/**
 * \u6210\u4ea4\u5747\u4ef7<br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Thostmduserapi")
public class CThostFtdcMarketDataAveragePriceField extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : TThostFtdcPriceType */
	@Field(0)
	public double AveragePrice() {
		return this.io.getDoubleField(this, 0);
	}
	/** C type : TThostFtdcPriceType */
	@Field(0)
	public CThostFtdcMarketDataAveragePriceField AveragePrice(double AveragePrice) {
		this.io.setDoubleField(this, 0, AveragePrice);
		return this;
	}
	public CThostFtdcMarketDataAveragePriceField() {
		super();
	}
	public CThostFtdcMarketDataAveragePriceField(Pointer pointer) {
		super(pointer);
	}
}
