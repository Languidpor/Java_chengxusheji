package edu.yz.demo09;

import javax.swing.JFrame;

public class MouseCtrlBallFrame extends JFrame{
	
	public static void main(String[] args) {
		MouseCtrlBallFrame frame = new MouseCtrlBallFrame();
		frame.setSize(1024,768);
		frame.setTitle("¼üÅÌ¿ØÖÆÐ¡ÇòÒÆ¶¯");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		MouseCtrlBallPanel panel = new MouseCtrlBallPanel();
		frame.add(panel);
		frame.addMouseMotionListener(panel);
	}

}
