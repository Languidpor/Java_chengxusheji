package edu.yz.demo10;

import javax.swing.JFrame;
/**
 *	 窗口类：完成画布的添加以及 鼠标移动监听、鼠标监听器的添加
 * @author tarena
 *
 */
public class ShootBubbleFrame extends JFrame{
	public static void main(String[] args) {
		ShootBubbleFrame frame = new ShootBubbleFrame();
		frame.setSize(1024,768);
		frame.setTitle("冒泡小球");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		ShootBubblePanel panel = new ShootBubblePanel();
		frame.add(panel);
		frame.addMouseMotionListener(panel);
		frame.addMouseListener(panel);
		Thread t = new Thread(panel);
		t.start();
	}

}
