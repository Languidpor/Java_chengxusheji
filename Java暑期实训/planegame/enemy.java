package planegame;

import java.awt.Graphics;
import java.awt.Image;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class enemy {

	public final static int UP = 0;
	public final static int DOWN = 1;

	private String type;

	private static Image[] enemy = { new ImageIcon("E:\\ep01.png").getImage(), new ImageIcon("E:\\ep02.png").getImage(),
			new ImageIcon("E:\\ep03.png").getImage(), new ImageIcon("E:\\ep04.png").getImage(),
			new ImageIcon("E:\\ep05.png").getImage(), new ImageIcon("E:\\ep06.png").getImage(),
			new ImageIcon("E:\\ep07.png").getImage(), new ImageIcon("E:\\ep08.png").getImage(),
			new ImageIcon("E:\\ep09.png").getImage(), new ImageIcon("E:\\ep10.png").getImage(),
			new ImageIcon("E:\\ep11.png").getImage(), new ImageIcon("E:\\ep12.png").getImage(),
			new ImageIcon("E:\\ep13.png").getImage(), new ImageIcon("E:\\ep14.png").getImage(),
			new ImageIcon("E:\\ep15.png").getImage(), };
	// public static Image enemy = new ImageIcon("E:\\ep10.png").getImage();
	public static Image bullet = new ImageIcon("E:\\fire.png").getImage();
	public static Image bomb = new ImageIcon("E:\\bao1.gif").getImage();
	public  static Image BossBullet = new ImageIcon("E:\\epFire.png").getImage();
	// 图片属性
	private int x, y, size;
	// 撞击一次减少的血量
	private int num;
	public int att;
	private JPanel panel;

	public enemy() {

	}

	public enemy(String type, int size, int x, int y, int att, int num, JPanel panel) {
		this.type = type;
		this.size = size;
		this.x = x;
		this.y = y;
		this.att = att;
		this.num = num;
		this.panel = panel;
	}

	public void draw(Graphics g) {
//		敌机EP、战机子弹HB、爆炸BB,、Boss子弹B
		switch (type) {
		case "EP1": {
			g.drawImage(enemy[5], x, y, 2 * size, 2 * size, panel);
			break;
		}
		case "EP2": {
			g.drawImage(enemy[9], x, y, 2 * size, 2 * size, panel);
			break;
		}
		case "EP3": {
			g.drawImage(enemy[12], x, y, 2 * size, 2 * size, panel);
			break;
		}
		case "EP4": {
			g.drawImage(enemy[0], x, y, 2 * size, 2 * size, panel);
			break;
		}}
		if("HB".equals(type)) {
			g.drawImage(bullet, x-25, y-40, 2*size, 2*size, panel);
		}
		else if("BB".equals(type)) {
			g.drawImage(bomb, x, y, 2*size, 2*size, panel);
		}
		else if("B".equals(type)) {
		g.drawImage(BossBullet, x, y,2*size, 2*size, panel);
		}
		
		
		}

	


	public void move() {
		switch (att) {
		case UP:
			y--;
			break;
		case DOWN:
			// 判断下落是否超出了窗口的高度；
			if (y > 768) {
				y = 0;
			} else {
				y++;
			}
			break;

		}

	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
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

	public int getAtt() {
		return att;
	}

	public void setAtt(int att) {
		this.att = att;
	}

	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

}
