package edu.yz.demo02;

import javax.swing.JFrame;

public class MyFrameBConsVal {
	
	private JFrame jFrame;
	
//	当前类中有有参构造时，一定要定义一个无参构造
	public MyFrameBConsVal() {
		System.out.println("此类的无参构造");
	}
	
//	构造方法：有参构造
	public MyFrameBConsVal(JFrame jFrame) {		
		this.jFrame = jFrame;
		System.out.println(jFrame);
	}

	public static void main(String[] args) {
//		此时实例化时，抛出编译期异常
		JFrame jf = new JFrame();
		jf.setVisible(true);
//		实例化，并调用有参构造
		MyFrameBConsVal mfbc = new MyFrameBConsVal(jf);
//		实例化，并调用无参构造
		MyFrameBConsVal mfb1c = new MyFrameBConsVal();
	}
	
}
