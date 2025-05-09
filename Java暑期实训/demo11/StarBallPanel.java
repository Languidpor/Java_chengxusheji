package edu.yz.demo11;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Random;
import java.util.Vector;

import javax.swing.JPanel;

import edu.yz.demo12.Bubble;

public class StarBallPanel extends JPanel implements MouseMotionListener,MouseListener,Runnable{
	
//	��ð�ݵĴ��������
	private int x,y,r;
//	�洢С���ݶ���ļ���:ͨ������<Bubble>Լ���˴˼���ֻ�ܴ洢Bubble��Ķ���
	private Vector<Bubble> allBubbles;
//	���λ
	private boolean isShot;
//	����������
	private int [] xx,yy;
//	���ǵĸ���
	private int starCount;
//	�����
	private Random ran;
	
	public StarBallPanel() {
		x = 100;
		y = 120;
		r = 30;
		allBubbles = new Vector<Bubble>();
		isShot = false;
		starCount = 300;
		ran = new Random();
		xx = new int[starCount];
		yy = new int[starCount];
		for (int i = 0; i < starCount; i++) {
			xx[i]  = ran.nextInt(1024);
			yy[i] = ran.nextInt(768);
		}
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		this.setBackground(Color.DARK_GRAY);
//		�����������Ǳ���
		g.setColor(Color.YELLOW);
		for (int i = 0; i < starCount; i++) {
			g.drawString("*", xx[i], yy[i]);			
		}
//		���ƻ�ð�ݵ�С��
		g.setColor(Color.PINK);
		g.fillOval(x, y, 2*r, 2*r);
//		����ð�ݳ���С����
		for (int i = 0; i < allBubbles.size(); i++) {
//			�˴�����ǿת
			Bubble bubble = allBubbles.elementAt(i);
			bubble.draw(g);
		}
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		isShot = true;
		x = e.getX()-r;
		y = e.getY()-r;
		repaint();
	}
	
	@Override
	public void mouseMoved(MouseEvent e) {
		isShot = false;
		x = e.getX()-r;
		y = e.getY()-r;
		repaint();
	}

	@Override
	public void run() {
		int count = 0;
		while(true) {
			if(isShot && count%5==0) {
				Bubble b = new Bubble();
				b.setX(x+r-b.getR());
				b.setY(y);
				b.setR(10);
				b.setColor(Color.orange);
				b.setOrientation(Bubble.UP);
				b.setPanel(this);
				allBubbles.add(b);	
//				allBubbles.add(1);
			}
			for (int i = 0; i < allBubbles.size(); i++) {
				Bubble b = allBubbles.elementAt(i);
				if( y <= 0 | x <=0 | y >= 768) {
					allBubbles.remove(i);
				}
				b.move();
			}
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			count ++;
		}
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		isShot = true;		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		isShot = true;		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		isShot = false;
	}

	@Override
	public void mouseEntered(MouseEvent e) {		
	}

	@Override
	public void mouseExited(MouseEvent e) {	
	}

}
