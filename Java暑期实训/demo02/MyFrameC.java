package edu.yz.demo02;

import javax.swing.JFrame;

/**
 * 	�̳�˼��ʵ�ִ���Ĵ������̳�JFrame��ͻ�̳����Ĺ�������&����
 * 	��ʱMyFrameC���൱����һ��JFrame
 * @author tarena
 *
 */
public class MyFrameC extends JFrame{
	
	private int num;
	
	public MyFrameC() {
//		this(200);
		System.out.println("�޲ι���");
	}
	
	public MyFrameC(int num) {
		this();
		System.out.println("�вι���"+num);
	}
	
	public void showMe(MyFrameC mfc) {
		mfc.setSize(600, 800);
		mfc.setTitle("�̳д����Ĵ���");
		mfc.setVisible(true);
		this.showMe();
	}
	
//	TODO ˼����this�ؼ��ָ��죺this����ǰ����
	public void showMe() {
		this.setSize(800,1000);
		this.setTitle("this�����Ĵ���");
		this.setVisible(true);
//		�رմ���ͬʱ�ر�Ӧ��
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		MyFrameC frame = new MyFrameC();
		MyFrameC frame01 = new MyFrameC(100);
//		frame.showMe(frame);
//		frame.showMe();
	}

}
