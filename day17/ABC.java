package cn.yd.corejava.day17;
/**农业银行的接口*/
public interface ABC extends Unionpay{
	public int overdraft = 20000;
	/**支付花费*/
	public boolean payTelBill(double num);
}
