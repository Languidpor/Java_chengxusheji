package edu.yz.demo07;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * 	封装小球的实体类：		
 * 	属性：小球初始位置坐标x\y、小球的半径、运动方向、运动速度、颜色、画布
 * @author tarena
 *
 */
public class Ball {
//	具体运动方向的常量：修饰的东西不能被修改；修饰属性一定要声明的同时被初始化
	public final static int LEFT_UP = 0;
	public final static int LEFT_DOWN = 1;
	public final static int RIGHT_UP = 2;
	public final static int RIGHT_DOWN = 3;
	
//	半径
	private int r;
//	坐标
	private int x,y;
//	颜色
	private Color color;
//	运动方向：0表示左上、1表示左下、2表示右上、3表示右下
	private int orientation;
//	运动速度
	private int speed;
//	小球所在的画布
	private JPanel panel;
	
//	无参构造
	public Ball() {	}
//	初始化小球部分属性的有参构造
	public Ball(int r, int x, int y, Color color, int orientation) {
		this.r = r;
		this.x = x;
		this.y = y;
		this.color = color;
		this.orientation = orientation;
	}
//	重载：全部参数的有参构造
	public Ball(int r, int x, int y, Color color, int orientation, int speed, JPanel panel) {
		this.r = r;
		this.x = x;
		this.y = y;
		this.color = color;
		this.orientation = orientation;
		this.speed = speed;
		this.panel = panel;
	}
//	绘制小球的方法：
	public void draw(Graphics g) {
		g.setColor(color);
		g.fillArc(x, y, 2*r, 2*r, 0, 360);
	}
	
//	小球飞行的方法：
	public void move() {
		switch(orientation) {
//		初始方向为左上时：
		case LEFT_UP:
			x--;
			y--;
//			反弹 
			if(x <= 0) {//碰到左边的墙壁：弹向右上
				this.setOrientation(RIGHT_UP);
			}
			if(y <= 0) {//碰到上边的墙壁：弹向左下
				this.setOrientation(LEFT_DOWN);
			}
//			中断，重新switch
			break;
			
//		初始方向为左下时：
		case LEFT_DOWN:
			x--;
			y++;
			if(x <= 0) {
				this.setOrientation(RIGHT_DOWN);
			}
//			y轴的判断：需要获取小球所在的画布高度减去小球的直径
			if(y >= panel.getHeight()- 2*r) {
				this.setOrientation(LEFT_UP);
			}
			break;
			
//		初始方向为右上时：
		case RIGHT_UP:
			x++;
			y--;
//			x轴的判断：需要获取小球所在的画布宽度减去小球的直径
			if(x >= panel.getWidth()-2*r) {
				this.setOrientation(LEFT_UP);
			}
			if(y <= 0) {
				this.setOrientation(RIGHT_DOWN);
			}
			break;
			
//		初始方向为右下时：
		case RIGHT_DOWN:
			x++;
			y++;
			if(x >= panel.getWidth()-2*r) {
				this.setOrientation(LEFT_DOWN);
			}
			if(y >= panel.getHeight()- 2*r) {
				this.setOrientation(RIGHT_UP);
			}
			break;
		}	
	}
	
//	当属性私有化之后，需要提供公共的set&get方法：alt+shift+s，选择构建set&get即可
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
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
	

}
