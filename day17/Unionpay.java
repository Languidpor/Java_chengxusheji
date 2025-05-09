package cn.yd.corejava.day17;
/**银联的接口*/
public interface Unionpay {
	/**检测密码*/
	public boolean checkPwd(String userPassword);
	/**取钱*/
	public boolean drawMoney(double num);
	/**查询余额*/
	public double getBalance();
}
