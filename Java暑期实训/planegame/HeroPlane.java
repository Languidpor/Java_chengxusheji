package planegame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class HeroPlane {
	
//	定义英雄战机的总生命值
	public final static int ALL_BLOOD = 100;
//	定义英雄战机图片
	public final static Image hero = new ImageIcon("E:\\hero.png").getImage();
//	定义英雄战机的坐标以及图片宽高
	private int x , y ,size;
//	定义英雄战机的剩余生命值
	private int blood;
//	定义英雄战机的总得分
	private int score;
//	定义英雄战机击中一架敌机的得分
	private int oneScore;
//	定义英雄战机所在画布
	private JPanel panel;
	
//	draw方法，完成绘制
	public void draw(Graphics g) {
		
//		战机绘制
		g.drawImage(hero, x-25, y-40,2*size, 2*size, panel);
//		战机的生命值绘制
		Font font = new Font("宋体",Font.BOLD,12);
		g.setFont(font);
		g.setColor(Color.PINK);
//		显示血量的title
		g.drawString("剩余血量", 0, 25);
//		显示总血量所在的矩形框
		g.setColor(Color.WHITE);
		g.fillRect(60, 16, ALL_BLOOD, 10);
//		显示剩余血量所在的矩形框
		g.setColor(Color.RED);
		g.fillRect(60, 16, this.blood, 10);
//		显示得分
		g.setColor(Color.PINK);
		g.drawString("得分："+this.score, 0, 40);
	}
	public HeroPlane() {}
	public HeroPlane(int x, int y, int size, int blood, int score, JPanel panel) {
		super();
		this.x = x;
		this.y = y;
		this.size = size;
		this.blood = blood;
		this.score = score;
		this.panel = panel;
	}

	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getBlood() {
		return blood;
	}
	public void setBlood(int blood) {
		this.blood = blood;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getOneScore() {
		return oneScore;
	}
	public void setOneScore(int oneScore) {
		this.oneScore = oneScore;
	}
	public JPanel getPanel() {
		return panel;
	}
	public void setPanel(JPanel panel) {
		this.panel = panel;
	}	
}