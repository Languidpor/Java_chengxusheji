package edu.yz.demo02;

import javax.swing.JFrame;

public class MyFrameBConsVal {
	
	private JFrame jFrame;
	
//	��ǰ�������вι���ʱ��һ��Ҫ����һ���޲ι���
	public MyFrameBConsVal() {
		System.out.println("������޲ι���");
	}
	
//	���췽�����вι���
	public MyFrameBConsVal(JFrame jFrame) {		
		this.jFrame = jFrame;
		System.out.println(jFrame);
	}

	public static void main(String[] args) {
//		��ʱʵ����ʱ���׳��������쳣
		JFrame jf = new JFrame();
		jf.setVisible(true);
//		ʵ�������������вι���
		MyFrameBConsVal mfbc = new MyFrameBConsVal(jf);
//		ʵ�������������޲ι���
		MyFrameBConsVal mfb1c = new MyFrameBConsVal();
	}
	
}
