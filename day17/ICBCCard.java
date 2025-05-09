package cn.yd.corejava.day17;
/**表示工商银行卡 类*/
public class ICBCCard implements ICBC{

	@Override
	public boolean checkPwd(String userPassword) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean drawMoney(double num) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean payOnline() {
		// TODO Auto-generated method stub
		return false;
	}

}
