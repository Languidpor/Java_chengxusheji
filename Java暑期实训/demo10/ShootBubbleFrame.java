package edu.yz.demo10;

import javax.swing.JFrame;
/**
 *	 �����ࣺ��ɻ���������Լ� ����ƶ��������������������
 * @author tarena
 *
 */
public class ShootBubbleFrame extends JFrame{
	public static void main(String[] args) {
		ShootBubbleFrame frame = new ShootBubbleFrame();
		frame.setSize(1024,768);
		frame.setTitle("ð��С��");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		ShootBubblePanel panel = new ShootBubblePanel();
		frame.add(panel);
		frame.addMouseMotionListener(panel);
		frame.addMouseListener(panel);
		Thread t = new Thread(panel);
		t.start();
	}

}
