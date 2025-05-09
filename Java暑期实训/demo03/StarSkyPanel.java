package edu.yz.demo03;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class StarSkyPanel extends JPanel{

	@Override
	public void paint(Graphics g) {
//		调用父类的paint绘制一张空画布，并设置背景颜色为黑色
		super.paint(g);
		this.setBackground(Color.black);
//		字符串形式绘制一颗黄色的星星
		g.setColor(Color.YELLOW);
		Font font = new Font("宋体",Font.BOLD,10);
		g.setFont(font);
//		画一颗星星
		g.drawString("*", 200, 210);
//		画300颗星星
		for(int i = 0;i < 300 ; i++) {
//			获取double类型的随机数，并且强制转换成int类型
			int x = (int) (Math.random()*1024);//0~1024之间的随机数
			int y = (int) (Math.random()*768);//0~768之间的随机数
			g.drawString("*", x, y);
		}
	}
}
