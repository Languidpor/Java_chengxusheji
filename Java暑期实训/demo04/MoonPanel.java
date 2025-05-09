package edu.yz.demo04;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

public class MoonPanel extends JPanel implements Runnable{
//	声明满天星的随机坐标：用数组保存300颗星星的x-y坐标值
	private int [] sx;
	private int [] sy;
	
//	声明并初始化实心圆B(黑色)的起始坐标
	private int x = 580;
	private int y = 400;
	
//	在构造方法中完成满天星坐标的初始化
	public MoonPanel() {
		sx = new int[300];//下标0-299
		sy = new int[300];
		Random ran = new Random();
		for (int i = 0; i < 300; i++) {
//			通过数组名[下标值]的方式来操作（添加||获取||删除）数组中的元素；下标从0开始
			sx[i] = ran.nextInt(1024);//0~1024之间的随机数
			sy[i] = ran.nextInt(768);//0~768之间的随机数
		}
	}
	
//	是画布类绘制图形的入口方法，无需调用
	public void paint(Graphics g) {
		super.paint(g);
		this.setBackground(Color.BLACK);
		g.setColor(Color.YELLOW);
		Font font = new Font("宋体",Font.BOLD,10);
		g.setFont(font);
//		画星星
		for(int i = 0;i < 300 ; i++) {
			/*
			 * // 获取double类型的随机数，并且强制转换成int类型 int x = (int)
			 * (Math.random()*1024);//0~1024之间的随机数 int y = (int)
			 * (Math.random()*768);//0~768之间的随机数
			 */			
			g.drawString("*", sx[i], sy[i]);
		}
//		画圆月A：绘制一轮直径为80的圆月，坐标为右上
		g.fillOval(880, 100, 80, 80);
		/*
		 * // 再绘制一个和圆月A相同大小的实心圆B，修改坐标为左下 g.fillOval(280, 400, 80, 80); int x =280 ; int
		 * y =400 ; for (int i = 0; i < 300; i++) {//不是好的解决方案 g.fillOval(x, y, 80, 80);
		 * x += 50; y -= 50; }
		 */
//		再绘制一个和圆月A相同大小的实心圆B(黑色)
		g.setColor(Color.BLACK);
		g.fillOval(x, y, 80, 80);
	}
	
//	线程的入口方法：
	public void run() {
//		while循环，实现让实心圆B的坐标一直移动
		while(true) {
			x++;
			y--;
//			反复执行月食的现象
			if(x>=910 || y <= 80) {
				/*
				 * x = 580; y = 400;
				 */
				break;
			}
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
//			重画方法
			repaint();
		}		
	}
}
