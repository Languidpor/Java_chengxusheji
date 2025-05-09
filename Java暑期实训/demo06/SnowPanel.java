package edu.yz.demo06;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

public class SnowPanel extends JPanel{
	
//	定义数组保存雪花的初始坐标
	private int [] sx;
	private int [] sy;
//	画笔的字体数组：当前数组可以存储四个Font类型的对象
	private Font [] allFonts;
//	随机数
	private Random ran;
	
//	构造方法中完成数组的赋值语句
	public SnowPanel() {
//		初始化
		sx = new int[300];
		sy = new int[300];
		allFonts = new Font[4];
		ran = new Random();
//		赋值：雪花坐标
		for (int i = 0; i < sx.length; i++) {
			sx[i] = ran.nextInt(1024);
			sy[i] = ran.nextInt(768);
		}		
//		赋值字体：创建四个字体对象，然后保存到字体数组allFonts
		allFonts[0] = new Font("宋体",Font.BOLD,10);
		allFonts[1] = new Font("宋体",Font.BOLD,16);
		allFonts[2] = new Font("宋体",Font.BOLD,22);
		allFonts[3] = new Font("宋体",Font.BOLD,28);
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		this.setBackground(Color.DARK_GRAY);
//		设置画笔的颜色为白色
		g.setColor(Color.white);
//		绘制
		for (int i = 0; i < sx.length; i++) {
//		设置画笔的字体：从字体数组中随机获取
//		bound:一定要是正整数，是上限（此上限会被排除）
			g.setFont(allFonts[ran.nextInt(4)]);
			g.drawString("*", sx[i], sy[i]);
		}
	}

}
