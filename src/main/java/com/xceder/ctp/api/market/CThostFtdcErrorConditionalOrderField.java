package com.xceder.ctp.api.market;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
 * <i>native declaration : ThostFtdcUserApiStruct.h:6099</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Thostmduserapi") 
public class CThostFtdcErrorConditionalOrderField extends StructObject {
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBrokerIDType
	 */
	@Array({11}) 
	@Field(0) 
	public Pointer<Byte > BrokerID() {
		return this.io.getPointerField(this, 0);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInvestorIDType
	 */
	@Array({13}) 
	@Field(1) 
	public Pointer<Byte > InvestorID() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInstrumentIDType
	 */
	@Array({31}) 
	@Field(2) 
	public Pointer<Byte > InstrumentID() {
		return this.io.getPointerField(this, 2);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcOrderRefType
	 */
	@Array({13}) 
	@Field(3) 
	public Pointer<Byte > OrderRef() {
		return this.io.getPointerField(this, 3);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcUserIDType
	 */
	@Array({16}) 
	@Field(4) 
	public Pointer<Byte > UserID() {
		return this.io.getPointerField(this, 4);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcOrderPriceTypeType
	 */
	@Field(5) 
	public byte OrderPriceType() {
		return this.io.getByteField(this, 5);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcOrderPriceTypeType
	 */
	@Field(5) 
	public CThostFtdcErrorConditionalOrderField OrderPriceType(byte OrderPriceType) {
		this.io.setByteField(this, 5, OrderPriceType);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcDirectionType
	 */
	@Field(6) 
	public byte Direction() {
		return this.io.getByteField(this, 6);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcDirectionType
	 */
	@Field(6) 
	public CThostFtdcErrorConditionalOrderField Direction(byte Direction) {
		this.io.setByteField(this, 6, Direction);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcCombOffsetFlagType
	 */
	@Array({5}) 
	@Field(7) 
	public Pointer<Byte > CombOffsetFlag() {
		return this.io.getPointerField(this, 7);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcCombHedgeFlagType
	 */
	@Array({5}) 
	@Field(8) 
	public Pointer<Byte > CombHedgeFlag() {
		return this.io.getPointerField(this, 8);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(9) 
	public double LimitPrice() {
		return this.io.getDoubleField(this, 9);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(9) 
	public CThostFtdcErrorConditionalOrderField LimitPrice(double LimitPrice) {
		this.io.setDoubleField(this, 9, LimitPrice);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(10) 
	public int VolumeTotalOriginal() {
		return this.io.getIntField(this, 10);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(10) 
	public CThostFtdcErrorConditionalOrderField VolumeTotalOriginal(int VolumeTotalOriginal) {
		this.io.setIntField(this, 10, VolumeTotalOriginal);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcTimeConditionType
	 */
	@Field(11) 
	public byte TimeCondition() {
		return this.io.getByteField(this, 11);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcTimeConditionType
	 */
	@Field(11) 
	public CThostFtdcErrorConditionalOrderField TimeCondition(byte TimeCondition) {
		this.io.setByteField(this, 11, TimeCondition);
		return this;
	}
	/**
	 * GTD\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcDateType
	 */
	@Array({9}) 
	@Field(12) 
	public Pointer<Byte > GTDDate() {
		return this.io.getPointerField(this, 12);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeConditionType
	 */
	@Field(13) 
	public byte VolumeCondition() {
		return this.io.getByteField(this, 13);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeConditionType
	 */
	@Field(13) 
	public CThostFtdcErrorConditionalOrderField VolumeCondition(byte VolumeCondition) {
		this.io.setByteField(this, 13, VolumeCondition);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(14) 
	public int MinVolume() {
		return this.io.getIntField(this, 14);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(14) 
	public CThostFtdcErrorConditionalOrderField MinVolume(int MinVolume) {
		this.io.setIntField(this, 14, MinVolume);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcContingentConditionType
	 */
	@Field(15) 
	public byte ContingentCondition() {
		return this.io.getByteField(this, 15);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcContingentConditionType
	 */
	@Field(15) 
	public CThostFtdcErrorConditionalOrderField ContingentCondition(byte ContingentCondition) {
		this.io.setByteField(this, 15, ContingentCondition);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(16) 
	public double StopPrice() {
		return this.io.getDoubleField(this, 16);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(16) 
	public CThostFtdcErrorConditionalOrderField StopPrice(double StopPrice) {
		this.io.setDoubleField(this, 16, StopPrice);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcForceCloseReasonType
	 */
	@Field(17) 
	public byte ForceCloseReason() {
		return this.io.getByteField(this, 17);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcForceCloseReasonType
	 */
	@Field(17) 
	public CThostFtdcErrorConditionalOrderField ForceCloseReason(byte ForceCloseReason) {
		this.io.setByteField(this, 17, ForceCloseReason);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBoolType
	 */
	@Field(18) 
	public int IsAutoSuspend() {
		return this.io.getIntField(this, 18);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBoolType
	 */
	@Field(18) 
	public CThostFtdcErrorConditionalOrderField IsAutoSuspend(int IsAutoSuspend) {
		this.io.setIntField(this, 18, IsAutoSuspend);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBusinessUnitType
	 */
	@Array({21}) 
	@Field(19) 
	public Pointer<Byte > BusinessUnit() {
		return this.io.getPointerField(this, 19);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRequestIDType
	 */
	@Field(20) 
	public int RequestID() {
		return this.io.getIntField(this, 20);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRequestIDType
	 */
	@Field(20) 
	public CThostFtdcErrorConditionalOrderField RequestID(int RequestID) {
		this.io.setIntField(this, 20, RequestID);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcOrderLocalIDType
	 */
	@Array({13}) 
	@Field(21) 
	public Pointer<Byte > OrderLocalID() {
		return this.io.getPointerField(this, 21);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcExchangeIDType
	 */
	@Array({9}) 
	@Field(22) 
	public Pointer<Byte > ExchangeID() {
		return this.io.getPointerField(this, 22);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcParticipantIDType
	 */
	@Array({11}) 
	@Field(23) 
	public Pointer<Byte > ParticipantID() {
		return this.io.getPointerField(this, 23);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcClientIDType
	 */
	@Array({11}) 
	@Field(24) 
	public Pointer<Byte > ClientID() {
		return this.io.getPointerField(this, 24);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcExchangeInstIDType
	 */
	@Array({31}) 
	@Field(25) 
	public Pointer<Byte > ExchangeInstID() {
		return this.io.getPointerField(this, 25);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcTraderIDType
	 */
	@Array({21}) 
	@Field(26) 
	public Pointer<Byte > TraderID() {
		return this.io.getPointerField(this, 26);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInstallIDType
	 */
	@Field(27) 
	public int InstallID() {
		return this.io.getIntField(this, 27);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInstallIDType
	 */
	@Field(27) 
	public CThostFtdcErrorConditionalOrderField InstallID(int InstallID) {
		this.io.setIntField(this, 27, InstallID);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcOrderSubmitStatusType
	 */
	@Field(28) 
	public byte OrderSubmitStatus() {
		return this.io.getByteField(this, 28);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcOrderSubmitStatusType
	 */
	@Field(28) 
	public CThostFtdcErrorConditionalOrderField OrderSubmitStatus(byte OrderSubmitStatus) {
		this.io.setByteField(this, 28, OrderSubmitStatus);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSequenceNoType
	 */
	@Field(29) 
	public int NotifySequence() {
		return this.io.getIntField(this, 29);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSequenceNoType
	 */
	@Field(29) 
	public CThostFtdcErrorConditionalOrderField NotifySequence(int NotifySequence) {
		this.io.setIntField(this, 29, NotifySequence);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcDateType
	 */
	@Array({9}) 
	@Field(30) 
	public Pointer<Byte > TradingDay() {
		return this.io.getPointerField(this, 30);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSettlementIDType
	 */
	@Field(31) 
	public int SettlementID() {
		return this.io.getIntField(this, 31);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSettlementIDType
	 */
	@Field(31) 
	public CThostFtdcErrorConditionalOrderField SettlementID(int SettlementID) {
		this.io.setIntField(this, 31, SettlementID);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcOrderSysIDType
	 */
	@Array({21}) 
	@Field(32) 
	public Pointer<Byte > OrderSysID() {
		return this.io.getPointerField(this, 32);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcOrderSourceType
	 */
	@Field(33) 
	public byte OrderSource() {
		return this.io.getByteField(this, 33);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcOrderSourceType
	 */
	@Field(33) 
	public CThostFtdcErrorConditionalOrderField OrderSource(byte OrderSource) {
		this.io.setByteField(this, 33, OrderSource);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcOrderStatusType
	 */
	@Field(34) 
	public byte OrderStatus() {
		return this.io.getByteField(this, 34);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcOrderStatusType
	 */
	@Field(34) 
	public CThostFtdcErrorConditionalOrderField OrderStatus(byte OrderStatus) {
		this.io.setByteField(this, 34, OrderStatus);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcOrderTypeType
	 */
	@Field(35) 
	public byte OrderType() {
		return this.io.getByteField(this, 35);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcOrderTypeType
	 */
	@Field(35) 
	public CThostFtdcErrorConditionalOrderField OrderType(byte OrderType) {
		this.io.setByteField(this, 35, OrderType);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(36) 
	public int VolumeTraded() {
		return this.io.getIntField(this, 36);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(36) 
	public CThostFtdcErrorConditionalOrderField VolumeTraded(int VolumeTraded) {
		this.io.setIntField(this, 36, VolumeTraded);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(37) 
	public int VolumeTotal() {
		return this.io.getIntField(this, 37);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(37) 
	public CThostFtdcErrorConditionalOrderField VolumeTotal(int VolumeTotal) {
		this.io.setIntField(this, 37, VolumeTotal);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcDateType
	 */
	@Array({9}) 
	@Field(38) 
	public Pointer<Byte > InsertDate() {
		return this.io.getPointerField(this, 38);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcTimeType
	 */
	@Array({9}) 
	@Field(39) 
	public Pointer<Byte > InsertTime() {
		return this.io.getPointerField(this, 39);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcTimeType
	 */
	@Array({9}) 
	@Field(40) 
	public Pointer<Byte > ActiveTime() {
		return this.io.getPointerField(this, 40);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcTimeType
	 */
	@Array({9}) 
	@Field(41) 
	public Pointer<Byte > SuspendTime() {
		return this.io.getPointerField(this, 41);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcTimeType
	 */
	@Array({9}) 
	@Field(42) 
	public Pointer<Byte > UpdateTime() {
		return this.io.getPointerField(this, 42);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcTimeType
	 */
	@Array({9}) 
	@Field(43) 
	public Pointer<Byte > CancelTime() {
		return this.io.getPointerField(this, 43);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcTraderIDType
	 */
	@Array({21}) 
	@Field(44) 
	public Pointer<Byte > ActiveTraderID() {
		return this.io.getPointerField(this, 44);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcParticipantIDType
	 */
	@Array({11}) 
	@Field(45) 
	public Pointer<Byte > ClearingPartID() {
		return this.io.getPointerField(this, 45);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSequenceNoType
	 */
	@Field(46) 
	public int SequenceNo() {
		return this.io.getIntField(this, 46);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSequenceNoType
	 */
	@Field(46) 
	public CThostFtdcErrorConditionalOrderField SequenceNo(int SequenceNo) {
		this.io.setIntField(this, 46, SequenceNo);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcFrontIDType
	 */
	@Field(47) 
	public int FrontID() {
		return this.io.getIntField(this, 47);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcFrontIDType
	 */
	@Field(47) 
	public CThostFtdcErrorConditionalOrderField FrontID(int FrontID) {
		this.io.setIntField(this, 47, FrontID);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSessionIDType
	 */
	@Field(48) 
	public int SessionID() {
		return this.io.getIntField(this, 48);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSessionIDType
	 */
	@Field(48) 
	public CThostFtdcErrorConditionalOrderField SessionID(int SessionID) {
		this.io.setIntField(this, 48, SessionID);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcProductInfoType
	 */
	@Array({11}) 
	@Field(49) 
	public Pointer<Byte > UserProductInfo() {
		return this.io.getPointerField(this, 49);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcErrorMsgType
	 */
	@Array({81}) 
	@Field(50) 
	public Pointer<Byte > StatusMsg() {
		return this.io.getPointerField(this, 50);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBoolType
	 */
	@Field(51) 
	public int UserForceClose() {
		return this.io.getIntField(this, 51);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBoolType
	 */
	@Field(51) 
	public CThostFtdcErrorConditionalOrderField UserForceClose(int UserForceClose) {
		this.io.setIntField(this, 51, UserForceClose);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcUserIDType
	 */
	@Array({16}) 
	@Field(52) 
	public Pointer<Byte > ActiveUserID() {
		return this.io.getPointerField(this, 52);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSequenceNoType
	 */
	@Field(53) 
	public int BrokerOrderSeq() {
		return this.io.getIntField(this, 53);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSequenceNoType
	 */
	@Field(53) 
	public CThostFtdcErrorConditionalOrderField BrokerOrderSeq(int BrokerOrderSeq) {
		this.io.setIntField(this, 53, BrokerOrderSeq);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcOrderSysIDType
	 */
	@Array({21}) 
	@Field(54) 
	public Pointer<Byte > RelativeOrderSysID() {
		return this.io.getPointerField(this, 54);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(55) 
	public int ZCETotalTradedVolume() {
		return this.io.getIntField(this, 55);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(55) 
	public CThostFtdcErrorConditionalOrderField ZCETotalTradedVolume(int ZCETotalTradedVolume) {
		this.io.setIntField(this, 55, ZCETotalTradedVolume);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcErrorIDType
	 */
	@Field(56) 
	public int ErrorID() {
		return this.io.getIntField(this, 56);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcErrorIDType
	 */
	@Field(56) 
	public CThostFtdcErrorConditionalOrderField ErrorID(int ErrorID) {
		this.io.setIntField(this, 56, ErrorID);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcErrorMsgType
	 */
	@Array({81}) 
	@Field(57) 
	public Pointer<Byte > ErrorMsg() {
		return this.io.getPointerField(this, 57);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBoolType
	 */
	@Field(58) 
	public int IsSwapOrder() {
		return this.io.getIntField(this, 58);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBoolType
	 */
	@Field(58) 
	public CThostFtdcErrorConditionalOrderField IsSwapOrder(int IsSwapOrder) {
		this.io.setIntField(this, 58, IsSwapOrder);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBranchIDType
	 */
	@Array({9}) 
	@Field(59) 
	public Pointer<Byte > BranchID() {
		return this.io.getPointerField(this, 59);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInvestUnitIDType
	 */
	@Array({17}) 
	@Field(60) 
	public Pointer<Byte > InvestUnitID() {
		return this.io.getPointerField(this, 60);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcAccountIDType
	 */
	@Array({13}) 
	@Field(61) 
	public Pointer<Byte > AccountID() {
		return this.io.getPointerField(this, 61);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcCurrencyIDType
	 */
	@Array({4}) 
	@Field(62) 
	public Pointer<Byte > CurrencyID() {
		return this.io.getPointerField(this, 62);
	}
	/**
	 * IP\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcIPAddressType
	 */
	@Array({16}) 
	@Field(63) 
	public Pointer<Byte > IPAddress() {
		return this.io.getPointerField(this, 63);
	}
	/**
	 * Mac\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMacAddressType
	 */
	@Array({21}) 
	@Field(64) 
	public Pointer<Byte > MacAddress() {
		return this.io.getPointerField(this, 64);
	}
	public CThostFtdcErrorConditionalOrderField() {
		super();
	}
	public CThostFtdcErrorConditionalOrderField(Pointer pointer) {
		super(pointer);
	}
}
