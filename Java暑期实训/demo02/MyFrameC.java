package edu.yz.demo02;

import javax.swing.JFrame;

/**
 * 	继承思想实现窗体的创建：继承JFrame类就会继承它的公开属性&方法
 * 	此时MyFrameC就相当于是一个JFrame
 * @author tarena
 *
 */
public class MyFrameC extends JFrame{
	
	private int num;
	
	public MyFrameC() {
//		this(200);
		System.out.println("无参构造");
	}
	
	public MyFrameC(int num) {
		this();
		System.out.println("有参构造"+num);
	}
	
	public void showMe(MyFrameC mfc) {
		mfc.setSize(600, 800);
		mfc.setTitle("继承创建的窗体");
		mfc.setVisible(true);
		this.showMe();
	}
	
//	TODO 思考用this关键字改造：this代表当前对象
	public void showMe() {
		this.setSize(800,1000);
		this.setTitle("this创建的窗体");
		this.setVisible(true);
//		关闭窗体同时关闭应用
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		MyFrameC frame = new MyFrameC();
		MyFrameC frame01 = new MyFrameC(100);
//		frame.showMe(frame);
//		frame.showMe();
	}

}
