package edu.yz.demo05;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MoveBallPanel extends JPanel implements Runnable {

//	设置小球的初始坐标
	private int bx = 100;
	private int by = 100;
//	设置四面墙壁接触的方位：0：右下、1：左下、2：左上、3：右上
	private int att = 1;

	public void paint(Graphics g) {
//		调用父类的paint方法，提供了清理画布的作用
		super.paint(g);
		this.setBackground(Color.pink);
		g.setColor(Color.BLACK);
//		可以采用画笔提供的清理方法
//		g.clearRect(0, 0, 1024, 768);
//		根据坐标画绘制一个黑色实心小球
		g.fillOval(bx, by, 30, 30);
	}

	@Override
	public void run() {
//		45°∠分别向 0：右下、1：左下、2：左上、3：右上移动
		while (true) {
			if (att == 0) {
				bx++;
				by++;
			}
			if (att == 1) {
				bx--;
				by++;
			}
			if (att == 2) {
				bx--;
				by--;
			}
			if (att == 3) {
				bx++;
				by--;
			}
//			判断小球碰上了哪边墙壁，并且改变小球反弹的方向（两个方向）
			if (bx > 987) {
				if (att == 0) {
					att = 1;
				} else {
					att = 2;
				}
			}
			if (by > 709) {
				if (att == 1) {
					att = 2;
				} else {
					att = 3;
				}
			}
			if(bx < 0) {
				if(att == 2) {
					att = 3;
				}else {
					att = 0;
				}
			}
			if(by < 0) {
				if(att == 3) {
					att = 0;
				}else {
					att = 1;
				}
			}
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			repaint();
		}
	}

}
