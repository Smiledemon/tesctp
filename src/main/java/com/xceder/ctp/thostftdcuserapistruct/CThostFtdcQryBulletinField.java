package com.xceder.ctp.thostftdcuserapistruct;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

/**
 * \u67e5\u8be2\u4ea4\u6613\u6240\u516c\u544a<br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Thostmduserapi")
public class CThostFtdcQryBulletinField extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : TThostFtdcExchangeIDType */
	@Array({9})
	@Field(0)
	public Pointer<Byte > ExchangeID() {
		return this.io.getPointerField(this, 0);
	}
	/** C type : TThostFtdcBulletinIDType */
	@Field(1)
	public int BulletinID() {
		return this.io.getIntField(this, 1);
	}
	/** C type : TThostFtdcBulletinIDType */
	@Field(1)
	public CThostFtdcQryBulletinField BulletinID(int BulletinID) {
		this.io.setIntField(this, 1, BulletinID);
		return this;
	}
	/** C type : TThostFtdcSequenceNoType */
	@Field(2)
	public int SequenceNo() {
		return this.io.getIntField(this, 2);
	}
	/** C type : TThostFtdcSequenceNoType */
	@Field(2)
	public CThostFtdcQryBulletinField SequenceNo(int SequenceNo) {
		this.io.setIntField(this, 2, SequenceNo);
		return this;
	}
	/** C type : TThostFtdcNewsTypeType */
	@Array({3})
	@Field(3)
	public Pointer<Byte > NewsType() {
		return this.io.getPointerField(this, 3);
	}
	/** C type : TThostFtdcNewsUrgencyType */
	@Field(4)
	public byte NewsUrgency() {
		return this.io.getByteField(this, 4);
	}
	/** C type : TThostFtdcNewsUrgencyType */
	@Field(4)
	public CThostFtdcQryBulletinField NewsUrgency(byte NewsUrgency) {
		this.io.setByteField(this, 4, NewsUrgency);
		return this;
	}
	public CThostFtdcQryBulletinField() {
		super();
	}
	public CThostFtdcQryBulletinField(Pointer pointer) {
		super(pointer);
	}
}
