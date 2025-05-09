package edu.yz.demo02;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 * 	继承JDK所提供的JPanel，并定义自己的画布
 * 	继承是面向对象的三大特征之一，注意继承仅支持单继承，可以多重继承；
 * 	一个子类只能继承一个父类，一个父类是可以拥有多个子类的
 * @author tarena
 */
public class MyStarPanel extends JPanel{
	
	
//	子类自己的新方法
	public void add() {
		
	}
//	子类自己的新方法
	public void paint() {
		
	}
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
//		绘制字符串形式的星星：可以设置字体
		Font font = new Font("宋体",Font.BOLD,10);
		g.setFont(font);
//		绘制 *
		g.drawString("*", 40, 40);
		g.drawString("*", 50, 50);
		g.drawString("*", 60, 80);
		g.drawString("*", 70, 100);
//		四个参数分别表示起点&终点的坐标
//		g.drawLine(30, 30, 100, 100);
	}
	
}
