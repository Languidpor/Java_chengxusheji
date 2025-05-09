package edu.yz.demo12;

import javax.swing.JFrame;

public class BallBattleFrame  extends JFrame{
	public static void main(String[] args) {
		BallBattleFrame frame = new BallBattleFrame();
		frame.setSize(1024,768);
		frame.setTitle("≈›≈›¥Û’Ω");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		BallBattlePanel panel = new BallBattlePanel();
		frame.add(panel);
		frame.addMouseMotionListener(panel);
		frame.addMouseListener(panel);
		Thread t = new Thread(panel);
		t.start();
	}
}