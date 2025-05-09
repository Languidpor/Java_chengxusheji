package cn.yd.corejava.day17;
/**工商银行的接口*/
public interface ICBC extends Unionpay{
	/**在线支付*/
	public boolean payOnline();
}
