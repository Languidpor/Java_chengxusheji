package planegame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class HeroPlane {
	
//	����Ӣ��ս����������ֵ
	public final static int ALL_BLOOD = 100;
//	����Ӣ��ս��ͼƬ
	public final static Image hero = new ImageIcon("E:\\hero.png").getImage();
//	����Ӣ��ս���������Լ�ͼƬ���
	private int x , y ,size;
//	����Ӣ��ս����ʣ������ֵ
	private int blood;
//	����Ӣ��ս�����ܵ÷�
	private int score;
//	����Ӣ��ս������һ�ܵл��ĵ÷�
	private int oneScore;
//	����Ӣ��ս�����ڻ���
	private JPanel panel;
	
//	draw��������ɻ���
	public void draw(Graphics g) {
		
//		ս������
		g.drawImage(hero, x-25, y-40,2*size, 2*size, panel);
//		ս��������ֵ����
		Font font = new Font("����",Font.BOLD,12);
		g.setFont(font);
		g.setColor(Color.PINK);
//		��ʾѪ����title
		g.drawString("ʣ��Ѫ��", 0, 25);
//		��ʾ��Ѫ�����ڵľ��ο�
		g.setColor(Color.WHITE);
		g.fillRect(60, 16, ALL_BLOOD, 10);
//		��ʾʣ��Ѫ�����ڵľ��ο�
		g.setColor(Color.RED);
		g.fillRect(60, 16, this.blood, 10);
//		��ʾ�÷�
		g.setColor(Color.PINK);
		g.drawString("�÷֣�"+this.score, 0, 40);
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