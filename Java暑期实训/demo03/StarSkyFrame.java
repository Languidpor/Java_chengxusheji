package edu.yz.demo03;

import javax.swing.JFrame;

public class StarSkyFrame{
	
	private JFrame jframe;
	
	public void showMe() {
		jframe = new JFrame();
		jframe.setSize(600, 800);
		jframe.setTitle("������");
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setVisible(true);
	}
	
	public static void main(String[] args) {
		StarSkyFrame ssf = new StarSkyFrame();
		ssf.showMe();
		StarSkyPanel ssp = new StarSkyPanel();
//		�ھ�̬�����в���ֱ�ӵ��÷Ǿ�̬�ı����򷽷�����Ҫͨ���������
		ssf.jframe.add(ssp);
	}

}
