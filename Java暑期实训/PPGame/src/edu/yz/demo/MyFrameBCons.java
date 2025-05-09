package edu.yz.demo;

import javax.swing.JFrame;

public class MyFrameBCons {
	
	private JFrame jFrame;
	
	//构造方法
	public MyFrameBCons() {		
		jFrame = new JFrame();
		jFrame.setSize(600, 800);
		jFrame.setTitle("第二个窗体");
		jFrame.setVisible(true);
		System.out.println("构造方法");
	}

	public static void main(String[] args) {
//		创建对象，同时在调用构造方法，完成了jFrame属性的初始化
		MyFrameBCons mfbc = new MyFrameBCons();
	}
	
}
