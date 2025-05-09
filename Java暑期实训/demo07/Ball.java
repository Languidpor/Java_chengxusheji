package edu.yz.demo07;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * 	��װС���ʵ���ࣺ		
 * 	���ԣ�С���ʼλ������x\y��С��İ뾶���˶������˶��ٶȡ���ɫ������
 * @author tarena
 *
 */
public class Ball {
//	�����˶�����ĳ��������εĶ������ܱ��޸ģ���������һ��Ҫ������ͬʱ����ʼ��
	public final static int LEFT_UP = 0;
	public final static int LEFT_DOWN = 1;
	public final static int RIGHT_UP = 2;
	public final static int RIGHT_DOWN = 3;
	
//	�뾶
	private int r;
//	����
	private int x,y;
//	��ɫ
	private Color color;
//	�˶�����0��ʾ���ϡ�1��ʾ���¡�2��ʾ���ϡ�3��ʾ����
	private int orientation;
//	�˶��ٶ�
	private int speed;
//	С�����ڵĻ���
	private JPanel panel;
	
//	�޲ι���
	public Ball() {	}
//	��ʼ��С�򲿷����Ե��вι���
	public Ball(int r, int x, int y, Color color, int orientation) {
		this.r = r;
		this.x = x;
		this.y = y;
		this.color = color;
		this.orientation = orientation;
	}
//	���أ�ȫ���������вι���
	public Ball(int r, int x, int y, Color color, int orientation, int speed, JPanel panel) {
		this.r = r;
		this.x = x;
		this.y = y;
		this.color = color;
		this.orientation = orientation;
		this.speed = speed;
		this.panel = panel;
	}
//	����С��ķ�����
	public void draw(Graphics g) {
		g.setColor(color);
		g.fillArc(x, y, 2*r, 2*r, 0, 360);
	}
	
//	С����еķ�����
	public void move() {
		switch(orientation) {
//		��ʼ����Ϊ����ʱ��
		case LEFT_UP:
			x--;
			y--;
//			���� 
			if(x <= 0) {//������ߵ�ǽ�ڣ���������
				this.setOrientation(RIGHT_UP);
			}
			if(y <= 0) {//�����ϱߵ�ǽ�ڣ���������
				this.setOrientation(LEFT_DOWN);
			}
//			�жϣ�����switch
			break;
			
//		��ʼ����Ϊ����ʱ��
		case LEFT_DOWN:
			x--;
			y++;
			if(x <= 0) {
				this.setOrientation(RIGHT_DOWN);
			}
//			y����жϣ���Ҫ��ȡС�����ڵĻ����߶ȼ�ȥС���ֱ��
			if(y >= panel.getHeight()- 2*r) {
				this.setOrientation(LEFT_UP);
			}
			break;
			
//		��ʼ����Ϊ����ʱ��
		case RIGHT_UP:
			x++;
			y--;
//			x����жϣ���Ҫ��ȡС�����ڵĻ�����ȼ�ȥС���ֱ��
			if(x >= panel.getWidth()-2*r) {
				this.setOrientation(LEFT_UP);
			}
			if(y <= 0) {
				this.setOrientation(RIGHT_DOWN);
			}
			break;
			
//		��ʼ����Ϊ����ʱ��
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
	
//	������˽�л�֮����Ҫ�ṩ������set&get������alt+shift+s��ѡ�񹹽�set&get����
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
