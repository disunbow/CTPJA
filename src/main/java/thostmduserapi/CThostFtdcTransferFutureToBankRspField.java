package thostmduserapi;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\u06bb\ufffd\ufffd\u02bd\ufffd\u05ea\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u04e6<br>
 * <i>native declaration : ctpapi/linux/ThostFtdcUserApiStruct.h:211</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("thostmduserapi") 
public class CThostFtdcTransferFutureToBankRspField extends StructObject {
	/**
	 * \ufffd\ufffd\u04e6\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRetCodeType
	 */
	@Array({5}) 
	@Field(0) 
	public Pointer<Byte > RetCode() {
		return this.io.getPointerField(this, 0);
	}
	/**
	 * \ufffd\ufffd\u04e6\ufffd\ufffd\u03e2<br>
	 * C type : TThostFtdcRetInfoType
	 */
	@Array({129}) 
	@Field(1) 
	public Pointer<Byte > RetInfo() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * \ufffd\u02bd\ufffd\ufffd\u02fb\ufffd<br>
	 * C type : TThostFtdcAccountIDType
	 */
	@Array({13}) 
	@Field(2) 
	public Pointer<Byte > FutureAccount() {
		return this.io.getPointerField(this, 2);
	}
	/**
	 * \u05ea\ufffd\u02bd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(3) 
	public double TradeAmt() {
		return this.io.getDoubleField(this, 3);
	}
	/**
	 * \u05ea\ufffd\u02bd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(3) 
	public CThostFtdcTransferFutureToBankRspField TradeAmt(double TradeAmt) {
		this.io.setDoubleField(this, 3, TradeAmt);
		return this;
	}
	/**
	 * \u04e6\ufffd\u057f\u037b\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(4) 
	public double CustFee() {
		return this.io.getDoubleField(this, 4);
	}
	/**
	 * \u04e6\ufffd\u057f\u037b\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(4) 
	public CThostFtdcTransferFutureToBankRspField CustFee(double CustFee) {
		this.io.setDoubleField(this, 4, CustFee);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcCurrencyCodeType
	 */
	@Array({4}) 
	@Field(5) 
	public Pointer<Byte > CurrencyCode() {
		return this.io.getPointerField(this, 5);
	}
	public CThostFtdcTransferFutureToBankRspField() {
		super();
	}
	public CThostFtdcTransferFutureToBankRspField(Pointer pointer) {
		super(pointer);
	}
}
