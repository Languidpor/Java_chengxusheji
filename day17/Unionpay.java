package cn.yd.corejava.day17;
/**�����Ľӿ�*/
public interface Unionpay {
	/**�������*/
	public boolean checkPwd(String userPassword);
	/**ȡǮ*/
	public boolean drawMoney(double num);
	/**��ѯ���*/
	public double getBalance();
}
