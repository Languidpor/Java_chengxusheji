package edu.yz.demo;

import javax.swing.JFrame;

/**
 * ͨ�� ��װ��˼����ʵ�֣�˽�л����ԡ���������
 * 
 * @author tarena
 *
 */
public class MyFrameB {

//	����һ��˽�л������ԣ�JFrame���͵ĳ�Ա����
	private JFrame jFrame;

//	����һ�������ķ�����������ʵ����JFrame���͵ı���
	public void showMe() {
		jFrame = new JFrame();
		jFrame.setSize(600, 800);
		jFrame.setTitle("�ڶ�������");
		jFrame.setVisible(true);
	}

//	��ڷ���
	public static void main(String[] args) {
//		����showMe����
//		�˷����Ƕ�����MyFrameB���У�����ͨ��ʵ����MyFrameB��
//		Ȼ��ͨ��MyFrameB�������showMe����
		MyFrameB mfb = new MyFrameB();
		mfb.showMe();// ����һ��
		mfb.showMe();// �����ڶ���
	}
}
