package edu.yz.demo13;

import javax.swing.JFrame;

public class ThunderPlaneFrame  extends JFrame{
	public static void main(String[] args) {
		ThunderPlaneFrame frame = new ThunderPlaneFrame();
		frame.setSize(1024,768);
		frame.setTitle("À×öªÕ½»ú");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		ThunderPlanePanel panel = new 
				ThunderPlanePanel();
		frame.add(panel);
		frame.addMouseMotionListener(panel);
		frame.addMouseListener(panel);
		Thread t = new Thread(panel);
		t.start();
	}
}