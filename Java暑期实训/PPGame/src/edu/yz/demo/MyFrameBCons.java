package edu.yz.demo;

import javax.swing.JFrame;

public class MyFrameBCons {
	
	private JFrame jFrame;
	
	//���췽��
	public MyFrameBCons() {		
		jFrame = new JFrame();
		jFrame.setSize(600, 800);
		jFrame.setTitle("�ڶ�������");
		jFrame.setVisible(true);
		System.out.println("���췽��");
	}

	public static void main(String[] args) {
//		��������ͬʱ�ڵ��ù��췽���������jFrame���Եĳ�ʼ��
		MyFrameBCons mfbc = new MyFrameBCons();
	}
	
}
