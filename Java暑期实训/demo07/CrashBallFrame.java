package edu.yz.demo07;

import javax.swing.JFrame;

public class CrashBallFrame extends JFrame{
	
	public static void main(String[] args) {
		CrashBallFrame frame = new CrashBallFrame();
		frame.setSize(1024, 768);
		frame.setTitle("Åö×²µÄÐ¡Çò");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		CrashBallPanel panel = new CrashBallPanel();
		frame.add(panel);
		Thread t = new Thread(panel);
		t.start();
	}
}
