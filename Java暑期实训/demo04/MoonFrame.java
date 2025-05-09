package edu.yz.demo04;

import javax.swing.JFrame;

public class MoonFrame{
	
	private JFrame jframe;
	
	public void showMe() {
		jframe = new JFrame();
		jframe.setSize(1024, 768);
		jframe.setTitle("月食");
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setVisible(true);
	}
	
	public static void main(String[] args) {
		MoonFrame ssf = new MoonFrame();
		ssf.showMe();
		MoonPanel ssp = new MoonPanel();
//		在静态方法中不能直接调用非静态的变量或方法，需要通过对象调用
		ssf.jframe.add(ssp);
//		告知操作系统此时MoonPanel是一个线程类
		Thread t = new Thread(ssp);
		t.start();
	}

}
