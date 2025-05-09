package edu.yz.demo06;

import javax.swing.JFrame;

public class SnowFrame extends JFrame{
	
	public static void main(String[] args) {
		SnowFrame frame = new SnowFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1024,768);
		frame.setTitle("обя╘");
		frame.setVisible(true);
		SnowPanel panel = new SnowPanel();
		frame.add(panel);
	}

}
