package edu.yz.demo05;

import javax.swing.JFrame;

public class MoveBallFrame extends JFrame{
		
	public static void main(String[] args) {
		MoveBallFrame frame = new MoveBallFrame();
		frame.setSize(1024, 768);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("·´µ¯µÄÐ¡Çò");
		frame.setVisible(true);
		MoveBallPanel panel = new MoveBallPanel();
		frame.add(panel);
		Thread t = new Thread(panel);
		t.start();
	}
	
}
