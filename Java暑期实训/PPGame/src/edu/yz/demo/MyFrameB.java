package edu.yz.demo;

import javax.swing.JFrame;

/**
 * 通过 封装的思想来实现：私有化属性、公开方法
 * 
 * @author tarena
 *
 */
public class MyFrameB {

//	定义一个私有化的属性：JFrame类型的成员变量
	private JFrame jFrame;

//	定义一个公开的方法：在其中实例化JFrame类型的变量
	public void showMe() {
		jFrame = new JFrame();
		jFrame.setSize(600, 800);
		jFrame.setTitle("第二个窗体");
		jFrame.setVisible(true);
	}

//	入口方法
	public static void main(String[] args) {
//		调用showMe方法
//		此方法是定义在MyFrameB类中，所以通过实例化MyFrameB类
//		然后通过MyFrameB对象调用showMe方法
		MyFrameB mfb = new MyFrameB();
		mfb.showMe();// 创建一个
		mfb.showMe();// 创建第二个
	}
}
