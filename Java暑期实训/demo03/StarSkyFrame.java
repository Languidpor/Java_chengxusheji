package edu.yz.demo03;

import javax.swing.JFrame;

public class StarSkyFrame{
	
	private JFrame jframe;
	
	public void showMe() {
		jframe = new JFrame();
		jframe.setSize(600, 800);
		jframe.setTitle("满天星");
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setVisible(true);
	}
	
	public static void main(String[] args) {
		StarSkyFrame ssf = new StarSkyFrame();
		ssf.showMe();
		StarSkyPanel ssp = new StarSkyPanel();
//		在静态方法中不能直接调用非静态的变量或方法，需要通过对象调用
		ssf.jframe.add(ssp);
	}

}
