package edu.yz.demo04;

import javax.swing.JFrame;

public class MoonFrame{
	
	private JFrame jframe;
	
	public void showMe() {
		jframe = new JFrame();
		jframe.setSize(1024, 768);
		jframe.setTitle("��ʳ");
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setVisible(true);
	}
	
	public static void main(String[] args) {
		MoonFrame ssf = new MoonFrame();
		ssf.showMe();
		MoonPanel ssp = new MoonPanel();
//		�ھ�̬�����в���ֱ�ӵ��÷Ǿ�̬�ı����򷽷�����Ҫͨ���������
		ssf.jframe.add(ssp);
//		��֪����ϵͳ��ʱMoonPanel��һ���߳���
		Thread t = new Thread(ssp);
		t.start();
	}

}
