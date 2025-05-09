package edu.yz.demo03;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 * 	继承JDK所提供的JPanel，并定义自己的画布
 * 	继承是面向对象的三大特征之一，注意继承仅支持单继承，可以多重继承；
 * 	一个子类只能继承一个父类，一个父类是可以拥有多个子类的
 * @author tarena
 */
public class MyStarPanel extends JPanel{
		
//	隐含一个继承自祖父类的paint(Graphics g)方法
	
//	提供画笔，进行绘制；可以在继承结构中找到此方法签名的方法，
//	此时子类重新定义的paint属于方法的重写
//	画笔类：Graphics提供了绘制和填充一些图形的方法
	@Override
	public void paint(Graphics g) {
//		super调用父类的paint(g)，绘制一个空画布
		super.paint(g);
//		将画布背景颜色设置为黑色
		this.setBackground(Color.black);
//		设置要绘制的图案的颜色为黄色
		g.setColor(Color.yellow);
		/*
		 * // 绘制黄色实心圆 g.fillOval(200, 200, 20, 20); // 在圆的周围绘制一些黄色的直线 // 水平方向上的线
		 * g.drawLine(190, 210, 230, 210); // 垂直方向上的线 g.drawLine(210, 190, 210, 230);
		 * int a = (int) (210-Math.sqrt(20*20/2));//195 int b = (int)
		 * (210+Math.sqrt(20*20/2));//224 // 左上到右下 g.drawLine(a, a, b, b); g.drawLine(a,
		 * b, b, a);
		 */
//		绘制图片：注意路径，图片位于工程下直接star.jpeg ，位于src下 src/star.jpeg
		Image img = new ImageIcon("src/night.jpeg").getImage();
//		x&y表示左上角的坐标，height&weight表示图片的大小
		g.drawImage(img, 0,0, 600, 600, this);
	}
	
}
