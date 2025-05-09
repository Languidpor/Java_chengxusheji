package edu.yz.demo02;


import javax.swing.JFrame;

public class MyStarFrame extends JFrame{
	
	public void showMe() {
		this.setSize(600, 600);
		this.setTitle("ÐÇÐÇ´°Ìå");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		MyStarFrame msf = new MyStarFrame();
		MyStarPanel panel = new MyStarPanel();
		msf.add(panel);
		msf.showMe();
	}

}
