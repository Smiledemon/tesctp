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
 * Time: 下午3:31
 */
public class CThostFtdcCancelAccountField extends StructObject {
    public CThostFtdcCancelAccountField() {
    }

    @Array({7L})
    @Field(0)
    private Pointer<Byte> TradeCode() {
        return this.io.getPointerField(this, 0);
    }

    @Array({7L})
    @Field(0)
    public void setTradeCode(String tradeCode) {
        this.io.getPointerField(this, 0).setCString(tradeCode);
    }

    public String getTradeCode() {
        return this.TradeCode().getCString();
    }

    @Array({4L})
    @Field(1)
    private Pointer<Byte> BankID() {
        return this.io.getPointerField(this, 1);
    }

    @Array({4L})
    @Field(1)
    public void setBankID(String bankID) {
        this.io.getPointerField(this, 1).setCString(bankID);
    }

    public String getBankID() {
        return this.BankID().getCString();
    }

    @Array({5L})
    @Field(2)
    private Pointer<Byte> BankBranchID() {
        return this.io.getPointerField(this, 2);
    }

    @Array({5L})
    @Field(2)
    public void setBankBranchID(String bankBranchID) {
        this.io.getPointerField(this, 2).setCString(bankBranchID);
    }

    public String getBankBranchID() {
        return this.BankBranchID().getCString();
    }

    @Array({11L})
    @Field(3)
    private Pointer<Byte> BrokerID() {
        return this.io.getPointerField(this, 3);
    }

    @Array({11L})
    @Field(3)
    public void setBrokerID(String brokerID) {
        this.io.getPointerField(this, 3).setCString(brokerID);
    }

    public String getBrokerID() {
        return this.BrokerID().getCString();
    }

    @Array({31L})
    @Field(4)
    private Pointer<Byte> BrokerBranchID() {
        return this.io.getPointerField(this, 4);
    }

    @Array({31L})
    @Field(4)
    public void setBrokerBranchID(String brokerBranchID) {
        this.io.getPointerField(this, 4).setCString(brokerBranchID);
    }

    public String getBrokerBranchID() {
        return this.BrokerBranchID().getCString();
    }

    @Array({9L})
    @Field(5)
    private Pointer<Byte> TradeDate() {
        return this.io.getPointerField(this, 5);
    }

    @Array({9L})
    @Field(5)
    public void setTradeDate(String tradeDate) {
        this.io.getPointerField(this, 5).setCString(tradeDate);
    }

    public String getTradeDate() {
        return this.TradeDate().getCString();
    }

    @Array({9L})
    @Field(6)
    private Pointer<Byte> TradeTime() {
        return this.io.getPointerField(this, 6);
    }

    @Array({9L})
    @Field(6)
    public void setTradeTime(String tradeTime) {
        this.io.getPointerField(this, 6).setCString(tradeTime);
    }

    public String getTradeTime() {
        return this.TradeTime().getCString();
    }

    @Array({13L})
    @Field(7)
    private Pointer<Byte> BankSerial() {
        return this.io.getPointerField(this, 7);
    }

    @Array({13L})
    @Field(7)
    public void setBankSerial(String bankSerial) {
        this.io.getPointerField(this, 7).setCString(bankSerial);
    }

    public String getBankSerial() {
        return this.BankSerial().getCString();
    }

    @Array({9L})
    @Field(8)
    private Pointer<Byte> TradingDay() {
        return this.io.getPointerField(this, 8);
    }

    @Array({9L})
    @Field(8)
    public void setTradingDay(String tradingDay) {
        this.io.getPointerField(this, 8).setCString(tradingDay);
    }

    public String getTradingDay() {
        return this.TradingDay().getCString();
    }

    @Field(9)
    private int PlateSerial() {
        return this.io.getIntField(this, 9);
    }

    public int getPlateSerial() {
        return this.PlateSerial();
    }

    @Field(9)
    private CThostFtdcCancelAccountField PlateSerial(int PlateSerial) {
        this.io.setIntField(this, 9, PlateSerial);
        return this;
    }

    public void setPlateSerial(int plateSerial) {
        this.PlateSerial(plateSerial);
    }

    @Field(10)
    private byte LastFragment() {
        return this.io.getByteField(this, 10);
    }

    public char getLastFragment() {
        return (char)this.LastFragment();
    }

    @Field(10)
    private CThostFtdcCancelAccountField LastFragment(byte LastFragment) {
        this.io.setByteField(this, 10, LastFragment);
        return this;
    }

    public void setLastFragment(char lastFragment) {
        this.LastFragment((byte)lastFragment);
    }

    @Field(11)
    private int SessionID() {
        return this.io.getIntField(this, 11);
    }

    public int getSessionID() {
        return this.SessionID();
    }

    @Field(11)
    private CThostFtdcCancelAccountField SessionID(int SessionID) {
        this.io.setIntField(this, 11, SessionID);
        return this;
    }

    public void setSessionID(int sessionID) {
        this.SessionID(sessionID);
    }

    @Array({51L})
    @Field(12)
    private Pointer<Byte> CustomerName() {
        return this.io.getPointerField(this, 12);
    }

    @Array({51L})
    @Field(12)
    public void setCustomerName(String customerName) {
        this.io.getPointerField(this, 12).setCString(customerName);
    }

    public String getCustomerName() {
        return this.CustomerName().getCString();
    }

    @Field(13)
    private byte IdCardType() {
        return this.io.getByteField(this, 13);
    }

    public char getIdCardType() {
        return (char)this.IdCardType();
    }

    @Field(13)
    private CThostFtdcCancelAccountField IdCardType(byte IdCardType) {
        this.io.setByteField(this, 13, IdCardType);
        return this;
    }

    public void setIdCardType(char idCardType) {
        this.IdCardType((byte)idCardType);
    }

    @Array({51L})
    @Field(14)
    private Pointer<Byte> IdentifiedCardNo() {
        return this.io.getPointerField(this, 14);
    }

    @Array({51L})
    @Field(14)
    public void setIdentifiedCardNo(String identifiedCardNo) {
        this.io.getPointerField(this, 14).setCString(identifiedCardNo);
    }

    public String getIdentifiedCardNo() {
        return this.IdentifiedCardNo().getCString();
    }

    @Field(15)
    private byte Gender() {
        return this.io.getByteField(this, 15);
    }

    public char getGender() {
        return (char)this.Gender();
    }

    @Field(15)
    private CThostFtdcCancelAccountField Gender(byte Gender) {
        this.io.setByteField(this, 15, Gender);
        return this;
    }

    public void setGender(char gender) {
        this.Gender((byte)gender);
    }

    @Array({21L})
    @Field(16)
    private Pointer<Byte> CountryCode() {
        return this.io.getPointerField(this, 16);
    }

    @Array({21L})
    @Field(16)
    public void setCountryCode(String countryCode) {
        this.io.getPointerField(this, 16).setCString(countryCode);
    }

    public String getCountryCode() {
        return this.CountryCode().getCString();
    }

    @Field(17)
    private byte CustType() {
        return this.io.getByteField(this, 17);
    }

    public char getCustType() {
        return (char)this.CustType();
    }

    @Field(17)
    private CThostFtdcCancelAccountField CustType(byte CustType) {
        this.io.setByteField(this, 17, CustType);
        return this;
    }

    public void setCustType(char custType) {
        this.CustType((byte)custType);
    }

    @Array({101L})
    @Field(18)
    private Pointer<Byte> Address() {
        return this.io.getPointerField(this, 18);
    }

    @Array({101L})
    @Field(18)
    public void setAddress(String address) {
        this.io.getPointerField(this, 18).setCString(address);
    }

    public String getAddress() {
        return this.Address().getCString();
    }

    @Array({7L})
    @Field(19)
    private Pointer<Byte> ZipCode() {
        return this.io.getPointerField(this, 19);
    }

    @Array({7L})
    @Field(19)
    public void setZipCode(String zipCode) {
        this.io.getPointerField(this, 19).setCString(zipCode);
    }

    public String getZipCode() {
        return this.ZipCode().getCString();
    }

    @Array({41L})
    @Field(20)
    private Pointer<Byte> Telephone() {
        return this.io.getPointerField(this, 20);
    }

    @Array({41L})
    @Field(20)
    public void setTelephone(String telephone) {
        this.io.getPointerField(this, 20).setCString(telephone);
    }

    public String getTelephone() {
        return this.Telephone().getCString();
    }

    @Array({21L})
    @Field(21)
    private Pointer<Byte> MobilePhone() {
        return this.io.getPointerField(this, 21);
    }

    @Array({21L})
    @Field(21)
    public void setMobilePhone(String mobilePhone) {
        this.io.getPointerField(this, 21).setCString(mobilePhone);
    }

    public String getMobilePhone() {
        return this.MobilePhone().getCString();
    }

    @Array({41L})
    @Field(22)
    private Pointer<Byte> Fax() {
        return this.io.getPointerField(this, 22);
    }

    @Array({41L})
    @Field(22)
    public void setFax(String fax) {
        this.io.getPointerField(this, 22).setCString(fax);
    }

    public String getFax() {
        return this.Fax().getCString();
    }

    @Array({41L})
    @Field(23)
    private Pointer<Byte> EMail() {
        return this.io.getPointerField(this, 23);
    }

    @Array({41L})
    @Field(23)
    public void setEMail(String eMail) {
        this.io.getPointerField(this, 23).setCString(eMail);
    }

    public String getEMail() {
        return this.EMail().getCString();
    }

    @Field(24)
    private byte MoneyAccountStatus() {
        return this.io.getByteField(this, 24);
    }

    public char getMoneyAccountStatus() {
        return (char)this.MoneyAccountStatus();
    }

    @Field(24)
    private CThostFtdcCancelAccountField MoneyAccountStatus(byte MoneyAccountStatus) {
        this.io.setByteField(this, 24, MoneyAccountStatus);
        return this;
    }

    public void setMoneyAccountStatus(char moneyAccountStatus) {
        this.MoneyAccountStatus((byte)moneyAccountStatus);
    }

    @Array({41L})
    @Field(25)
    private Pointer<Byte> BankAccount() {
        return this.io.getPointerField(this, 25);
    }

    @Array({41L})
    @Field(25)
    public void setBankAccount(String bankAccount) {
        this.io.getPointerField(this, 25).setCString(bankAccount);
    }

    public String getBankAccount() {
        return this.BankAccount().getCString();
    }

    @Array({41L})
    @Field(26)
    private Pointer<Byte> BankPassWord() {
        return this.io.getPointerField(this, 26);
    }

    @Array({41L})
    @Field(26)
    public void setBankPassWord(String bankPassWord) {
        this.io.getPointerField(this, 26).setCString(bankPassWord);
    }

    public String getBankPassWord() {
        return this.BankPassWord().getCString();
    }

    @Array({13L})
    @Field(27)
    private Pointer<Byte> AccountID() {
        return this.io.getPointerField(this, 27);
    }

    @Array({13L})
    @Field(27)
    public void setAccountID(String accountID) {
        this.io.getPointerField(this, 27).setCString(accountID);
    }

    public String getAccountID() {
        return this.AccountID().getCString();
    }

    @Array({41L})
    @Field(28)
    private Pointer<Byte> Password() {
        return this.io.getPointerField(this, 28);
    }

    @Array({41L})
    @Field(28)
    public void setPassword(String password) {
        this.io.getPointerField(this, 28).setCString(password);
    }

    public String getPassword() {
        return this.Password().getCString();
    }

    @Field(29)
    private int InstallID() {
        return this.io.getIntField(this, 29);
    }

    public int getInstallID() {
        return this.InstallID();
    }

    @Field(29)
    private CThostFtdcCancelAccountField InstallID(int InstallID) {
        this.io.setIntField(this, 29, InstallID);
        return this;
    }

    public void setInstallID(int installID) {
        this.InstallID(installID);
    }

    @Field(30)
    private byte VerifyCertNoFlag() {
        return this.io.getByteField(this, 30);
    }

    public char getVerifyCertNoFlag() {
        return (char)this.VerifyCertNoFlag();
    }

    @Field(30)
    private CThostFtdcCancelAccountField VerifyCertNoFlag(byte VerifyCertNoFlag) {
        this.io.setByteField(this, 30, VerifyCertNoFlag);
        return this;
    }

    public void setVerifyCertNoFlag(char verifyCertNoFlag) {
        this.VerifyCertNoFlag((byte)verifyCertNoFlag);
    }

    @Array({4L})
    @Field(31)
    private Pointer<Byte> CurrencyID() {
        return this.io.getPointerField(this, 31);
    }

    @Array({4L})
    @Field(31)
    public void setCurrencyID(String currencyID) {
        this.io.getPointerField(this, 31).setCString(currencyID);
    }

    public String getCurrencyID() {
        return this.CurrencyID().getCString();
    }

    @Field(32)
    private byte CashExchangeCode() {
        return this.io.getByteField(this, 32);
    }

    public char getCashExchangeCode() {
        return (char)this.CashExchangeCode();
    }

    @Field(32)
    private CThostFtdcCancelAccountField CashExchangeCode(byte CashExchangeCode) {
        this.io.setByteField(this, 32, CashExchangeCode);
        return this;
    }

    public void setCashExchangeCode(char cashExchangeCode) {
        this.CashExchangeCode((byte)cashExchangeCode);
    }

    @Array({36L})
    @Field(33)
    private Pointer<Byte> Digest() {
        return this.io.getPointerField(this, 33);
    }

    @Array({36L})
    @Field(33)
    public void setDigest(String digest) {
        this.io.getPointerField(this, 33).setCString(digest);
    }

    public String getDigest() {
        return this.Digest().getCString();
    }

    @Field(34)
    private byte BankAccType() {
        return this.io.getByteField(this, 34);
    }

    public char getBankAccType() {
        return (char)this.BankAccType();
    }

    @Field(34)
    private CThostFtdcCancelAccountField BankAccType(byte BankAccType) {
        this.io.setByteField(this, 34, BankAccType);
        return this;
    }

    public void setBankAccType(char bankAccType) {
        this.BankAccType((byte)bankAccType);
    }

    @Array({3L})
    @Field(35)
    private Pointer<Byte> DeviceID() {
        return this.io.getPointerField(this, 35);
    }

    @Array({3L})
    @Field(35)
    public void setDeviceID(String deviceID) {
        this.io.getPointerField(this, 35).setCString(deviceID);
    }

    public String getDeviceID() {
        return this.DeviceID().getCString();
    }

    @Field(36)
    private byte BankSecuAccType() {
        return this.io.getByteField(this, 36);
    }

    public char getBankSecuAccType() {
        return (char)this.BankSecuAccType();
    }

    @Field(36)
    private CThostFtdcCancelAccountField BankSecuAccType(byte BankSecuAccType) {
        this.io.setByteField(this, 36, BankSecuAccType);
        return this;
    }

    public void setBankSecuAccType(char bankSecuAccType) {
        this.BankSecuAccType((byte)bankSecuAccType);
    }

    @Array({33L})
    @Field(37)
    private Pointer<Byte> BrokerIDByBank() {
        return this.io.getPointerField(this, 37);
    }

    @Array({33L})
    @Field(37)
    public void setBrokerIDByBank(String brokerIDByBank) {
        this.io.getPointerField(this, 37).setCString(brokerIDByBank);
    }

    public String getBrokerIDByBank() {
        return this.BrokerIDByBank().getCString();
    }

    @Array({41L})
    @Field(38)
    private Pointer<Byte> BankSecuAcc() {
        return this.io.getPointerField(this, 38);
    }

    @Array({41L})
    @Field(38)
    public void setBankSecuAcc(String bankSecuAcc) {
        this.io.getPointerField(this, 38).setCString(bankSecuAcc);
    }

    public String getBankSecuAcc() {
        return this.BankSecuAcc().getCString();
    }

    @Field(39)
    private byte BankPwdFlag() {
        return this.io.getByteField(this, 39);
    }

    public char getBankPwdFlag() {
        return (char)this.BankPwdFlag();
    }

    @Field(39)
    private CThostFtdcCancelAccountField BankPwdFlag(byte BankPwdFlag) {
        this.io.setByteField(this, 39, BankPwdFlag);
        return this;
    }

    public void setBankPwdFlag(char bankPwdFlag) {
        this.BankPwdFlag((byte)bankPwdFlag);
    }

    @Field(40)
    private byte SecuPwdFlag() {
        return this.io.getByteField(this, 40);
    }

    public char getSecuPwdFlag() {
        return (char)this.SecuPwdFlag();
    }

    @Field(40)
    private CThostFtdcCancelAccountField SecuPwdFlag(byte SecuPwdFlag) {
        this.io.setByteField(this, 40, SecuPwdFlag);
        return this;
    }

    public void setSecuPwdFlag(char secuPwdFlag) {
        this.SecuPwdFlag((byte)secuPwdFlag);
    }

    @Array({17L})
    @Field(41)
    private Pointer<Byte> OperNo() {
        return this.io.getPointerField(this, 41);
    }

    @Array({17L})
    @Field(41)
    public void setOperNo(String operNo) {
        this.io.getPointerField(this, 41).setCString(operNo);
    }

    public String getOperNo() {
        return this.OperNo().getCString();
    }

    @Field(42)
    private int TID() {
        return this.io.getIntField(this, 42);
    }

    public int getTID() {
        return this.TID();
    }

    @Field(42)
    private CThostFtdcCancelAccountField TID(int TID) {
        this.io.setIntField(this, 42, TID);
        return this;
    }

    public void setTID(int tID) {
        this.TID(tID);
    }

    @Array({16L})
    @Field(43)
    private Pointer<Byte> UserID() {
        return this.io.getPointerField(this, 43);
    }

    @Array({16L})
    @Field(43)
    public void setUserID(String userID) {
        this.io.getPointerField(this, 43).setCString(userID);
    }

    public String getUserID() {
        return this.UserID().getCString();
    }

    @Field(44)
    private int ErrorID() {
        return this.io.getIntField(this, 44);
    }

    public int getErrorID() {
        return this.ErrorID();
    }

    @Field(44)
    private CThostFtdcCancelAccountField ErrorID(int ErrorID) {
        this.io.setIntField(this, 44, ErrorID);
        return this;
    }

    public void setErrorID(int errorID) {
        this.ErrorID(errorID);
    }

    @Array({81L})
    @Field(45)
    private Pointer<Byte> ErrorMsg() {
        return this.io.getPointerField(this, 45);
    }

    @Array({81L})
    @Field(45)
    public void setErrorMsg(String errorMsg) {
        this.io.getPointerField(this, 45).setCString(errorMsg);
    }

    public String getErrorMsg() {
        return this.ErrorMsg().getCString();
    }

    public CThostFtdcCancelAccountField(Pointer pointer) {
        super(pointer);
    }
}
