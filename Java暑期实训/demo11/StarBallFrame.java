package edu.yz.demo11;

import javax.swing.JFrame;

public class StarBallFrame  extends JFrame{
	public static void main(String[] args) {
		StarBallFrame frame = new StarBallFrame();
		frame.setSize(1024,768);
		frame.setTitle("ÐÇ¿Õ±³¾°ÏÂÃ°ÅÝµÄÐ¡Çò");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		StarBallPanel panel = new StarBallPanel();
		frame.add(panel);
		frame.addMouseMotionListener(panel);
		frame.addMouseListener(panel);
		Thread t = new Thread(panel);
		t.start();
	}

}
