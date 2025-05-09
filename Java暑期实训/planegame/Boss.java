package planegame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Boss {
	public final static int ALL_BLOOD = 1000;
	public final static Image Boss = new ImageIcon("E:\\ep13.png").getImage();
	private int x , y ,size;
	private int blood;
	private JPanel panel;
	public final static int LEFT=0;
	public final static int RIGHT=1;
	private int FX;
	
	public void draw(Graphics g) {
		g.drawImage(Boss, x-25, y-40,2*size, 2*size, panel);
		g.setColor(Color.WHITE);
		g.fillRect(0, 50, ALL_BLOOD, 20);
		g.setColor(Color.PINK);
		g.fillRect(0, 50, this.blood, 20);

	}
	public Boss() {}
	public Boss(int x, int y, int size, int blood, int FX, JPanel panel) {
		super();
		this.x = x;
		this.y = y;
		this.size = size;
		this.blood = blood;
		this.FX = FX;
		this.panel = panel;
	}
	public void move() {
		switch(FX) {
	case LEFT:
		x--;
		break;
	case RIGHT:
		x++;
		
		break;}

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
	
	public int getFX() {
		return FX;
	}
	public void setFX(int fX) {
		FX = fX;
	}
	public JPanel getPanel() {
		return panel;
	}
	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	
	
	
	
	
	
}
