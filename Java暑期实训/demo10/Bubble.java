package edu.yz.demo10;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

/**
 *	小球实体类：
 *	属性：坐标、半径、颜色、移动方向（UP向上-4）、移动速度、所在画布
 *	方法：绘制、移动（扩展一个向上）
 * @author tarena
 *
 */
public class Bubble {
	
	public final static int LEFT_UP=0;
	public final static int LEFT_DOWN=1;
	public final static int RIGHT_UP=2;
	public final static int RIGHT_DOWN=3;
	public final static int UP=4;
	
	private int x,y;
	private int r;
	private Color color;
	private int orientation;
	private int speed;
	private JPanel panel;
	
	public Bubble() {
	}

	public Bubble(int x, int y, int r, Color color, int orientation, int speed, JPanel panel) {
		this.x = x;
		this.y = y;
		this.r = r;
		this.color = color;
		this.orientation = orientation;
		this.speed = speed;
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

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getOrientation() {
		return orientation;
	}

	public void setOrientation(int orientation) {
		this.orientation = orientation;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}
	
	public void draw(Graphics g) {
		g.setColor(color);
		g.fillOval(x, y, 2*r, 2*r);
	}
	
	public void move() {
		switch(orientation) {
		case UP:
			y--;
			break;
		case LEFT_UP:
			x--;
			y--;
			break;
		case LEFT_DOWN:
			x--;
			y++;
			break;
		case RIGHT_UP:
			x++;
			y--;
			break;
		case RIGHT_DOWN:
			x++;
			y++;
			break;		
		}
	}	
}
