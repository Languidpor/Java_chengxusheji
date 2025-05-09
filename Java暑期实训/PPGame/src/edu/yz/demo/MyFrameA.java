package edu.yz.demo;

import javax.swing.JFrame;

/**
 * 1、一个.java源文件中可以有n个class，但是只能有一个public class
 * 2、并且此public class的类名一定要与.java源文件名相同
 * 3、eclipse的快速提示快捷键：Alt+/
 * @author tarena
 *
 */
public class MyFrameA {
	
//	main方法：程序执行的入口方法
	public static void main(String[] args) {
//		使用java提供的类，需要导包：ctrl+1快速修复 或 ctrl+shift+O
//		实例化-new创建对象，类名 对象名 = new 类名();
//		类名()，是类的无参构造方法
		JFrame jFrame = new JFrame();
//		设置大小、标题、默认关闭等
		jFrame.setSize(800, 1000);
		jFrame.setTitle("第一个窗口");
//		设置窗体可见，true为显示，false为不显示，默认是false
		jFrame.setVisible(true);
	}

}
