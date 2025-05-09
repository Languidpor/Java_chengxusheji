package edu.yz.demo08;

import javax.swing.JFrame;

public class ControlBallFrame extends JFrame{
	
	public static void main(String[] args) {
		ControlBallFrame frame = new ControlBallFrame();
		frame.setSize(1024,768);
		frame.setTitle("键盘控制小球移动");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		ControlBallPanel panel = new ControlBallPanel();
		frame.add(panel);
//		打通小球的任督二脉，为控件注册监听
		frame.addKeyListener(panel);
	}
}
