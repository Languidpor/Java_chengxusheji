package edu.yz.demo08;

import javax.swing.JFrame;

public class ControlBallFrame extends JFrame{
	
	public static void main(String[] args) {
		ControlBallFrame frame = new ControlBallFrame();
		frame.setSize(1024,768);
		frame.setTitle("���̿���С���ƶ�");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		ControlBallPanel panel = new ControlBallPanel();
		frame.add(panel);
//		��ͨС����ζ�������Ϊ�ؼ�ע�����
		frame.addKeyListener(panel);
	}
}
