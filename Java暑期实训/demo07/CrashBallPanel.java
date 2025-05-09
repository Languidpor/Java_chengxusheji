package edu.yz.demo07;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

public class CrashBallPanel extends JPanel implements Runnable {
//	С��������
	private Ball [] allBalls;
//	С����ɫ������
	private Color [] colors;
//	�����
	private Random ran;
	
//	���췽����������Գ�ʼ��
	public CrashBallPanel() {
		colors = new Color[2];
		colors[0] = Color.PINK;
		colors[1] = Color.YELLOW;
		/*
		 * 	С���ʼ�������ַ�����new Ball()-set����new Ball(����)����
		 * 	1��С������ĳ�ʼ����
		 * 	2��Ȼ��ͨ��ѭ����������С����󣬰뾶rһ��Ϊ20
		 * 	3���ֱ�Ϊ����С��������������ʼx\y����
		 * 	4����ɫ����ɫ�����а�˳��ȡ������ֵ
		 * 	5����ʼ���˶�����0 | 1
		 * 	6��С����˶��ٶȣ�����С����˶��ٶȲ���ͬ����5-55����֮��
		 * 	7��С�����ڵĻ�����this
		 */	
		allBalls = new Ball[2];
		ran = new Random();
		for (int i = 0; i < allBalls.length; i++) {
//			��ʽһ���޲ι���
			Ball ball = new Ball();
			ball.setR(50);
			ball.setX(ran.nextInt(1024 - 2*ball.getR()));
			ball.setY(ran.nextInt(768 - 2*ball.getR()));
			ball.setColor(colors[i]);
//			��0-100֮�������������ȡ��2�����ֻ��0��1
			ball.setOrientation(ran.nextInt(100) % 2);
//			����С�����˶����ػ����ٶȣ�����Thread.sleep(speed);
			ball.setSpeed(ran.nextInt(1)+5);
			ball.setPanel(this);
//			��ʽ�����вι���
			Ball ball2 = 
					new Ball(20,ran.nextInt(1024 - 2*ball.getR()),
					ran.nextInt(768 - 2*ball.getR()),colors[i],ran.nextInt(100) % 2,
					ran.nextInt(55),this);
//			�����ɵ�С�����洢��С��������
			allBalls[i] = ball;
		}
	}
//	��������С��
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		this.setBackground(Color.DARK_GRAY);
		for (int i = 0; i < allBalls.length; i++) {
			allBalls[i].draw(g);
		}
	}
//	������С���Բ�ͬ���ٶȿ�ʼ�˶�
	@Override
	public void run() {
		while (true) {
			for (int i = 0; i < allBalls.length; i++) {
				allBalls[i].move();
				try {
					Thread.sleep(allBalls[i].getSpeed());
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
//				�����ж���������ײ�ķ���
				boolean isHit = twoBallsHit(allBalls[0],allBalls[1]);
				if(isHit) {
//					��ײ֮��һ��С��İ뾶��Ϊ0����һ��С��İ뾶��10(������һ��С��İ뾶)
					allBalls[1].setR(allBalls[1].getR()+allBalls[0].getR());
					allBalls[0].setR(0);
					allBalls[0].setX(0);
					allBalls[0].setY(0);
				}
			}
			repaint();
		}
	}
//	�ж�����С���Ƿ���ײ��true��ʾ��ײ��false��ʾδ��ײ
	public boolean twoBallsHit(Ball ballOne,Ball ballTwo) {
//		����һ�����λ��δ��ײ
		boolean isHit = false;
		int bxot = ballOne.getX() - ballTwo.getX();
		int byot = ballOne.getY() - ballTwo.getY();
		int rot = ballOne.getR() + ballTwo.getR();
//		�ж�С����ײ
		double z = Math.sqrt(bxot*bxot+byot*byot);
		if(z <= rot) {
			isHit = true;//��ʱС����ײ
		}		
		return isHit;
	}	
}
