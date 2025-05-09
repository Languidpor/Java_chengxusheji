package edu.yz.demo12;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Random;
import java.util.Vector;

import javax.swing.JPanel;

public class BallBattlePanel  extends JPanel implements MouseMotionListener,MouseListener,Runnable{

	private int x,y,r;
	private int [] xx,yy;
	private int starCount;
	private Random ran;
	private Vector<Bubble> allBubbles;
	private boolean isFire;
//	����洢��������ݣ��л����ļ��ϣ�
	private int dbCount;
	private Vector<Bubble> downBubbles;
	
	public BallBattlePanel() {
//		ս����ʼ��
		x = 100;
		y = 200;
		r = 40;
//		���ǳ�ʼ��
		starCount = 300;
		xx = new int[starCount];
		yy = new int[starCount];
		ran = new Random();
		for (int i = 0; i < starCount; i++) {
			xx[i] = ran.nextInt(1024);
			yy[i] = ran.nextInt(768);
		}
//		�ӵ���ð�ݳ�ʼ��
		isFire = false;
		allBubbles = new Vector<Bubble>();
//		�л����������ݳ�ʼ��
		dbCount = 10;
		downBubbles = new Vector<Bubble>();
		for (int i = 0; i < dbCount; i++) {
			Bubble b = new Bubble();
			b.setColor(Color.RED);
			b.setR(12);
			b.setOrientation(Bubble.DOWN);
			b.setX(ran.nextInt(1024));//[0,1024)
			b.setY(-ran.nextInt(768));//[-768,0)
			downBubbles.add(b);
		}
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		this.setBackground(Color.DARK_GRAY);
//		���Ʊ���
		g.setColor(Color.YELLOW);
		for (int i = 0; i < starCount; i++) {
			g.drawString("*", xx[i], yy[i]);
		}
		g.setColor(Color.BLUE);
		g.fillOval(x, y, 2*r, 2*r);
//		����ð�ݵ�С����
		for (int i = 0; i < allBubbles.size(); i++) {
//			���ٴ��������ķ���ֵ������alt+shift+l
			Bubble upBubble = allBubbles.elementAt(i);
			upBubble.draw(g);
		}
//		�������������
		for (int i = 0; i < dbCount; i++) {
			Bubble dwBubble = downBubbles.get(i);
			dwBubble.draw(g);
		}
	}
	
	@Override
	public void run() {
		int count = 0;
		while(true) {
			if(isFire && count%5==0) {
				Bubble b = new Bubble();
				b.setX(x+r-b.getR());
				b.setY(y);
				b.setR(10);
				b.setColor(Color.orange);
				b.setOrientation(Bubble.UP);
				b.setPanel(this);
				allBubbles.add(b);	
			}
//			�ӵ���ð�����ݵ��ƶ����Ƴ�
			for (int i = 0; i < allBubbles.size(); i++) {
				Bubble b = allBubbles.elementAt(i);
				if( y <= 0 | x <=0 | y >= 768) {
					allBubbles.remove(i);
				}
				b.move();
			}
//			�л����������ݵ��ƶ�
			for (int i = 0; i < downBubbles.size(); i++) {
				Bubble b = downBubbles.get(i);
				b.move();
			}
//			�ж�С����������Ƿ�������������
			for (int i = 0; i < allBubbles.size(); i++) {
//				����ȡ�����������
				Bubble ub = allBubbles.elementAt(i);
				for (int j = 0; j < downBubbles.size(); j++) {
//					����ȡ�����������
					Bubble db = downBubbles.get(j);
//					�����жϵķ�����������������ʧ
					if(isHit(ub,db)) {
//						��������ݣ��Ӽ������Ƴ�
						allBubbles.remove(i);
//						��������ݣ�����y��
						db.setY(-db.getY());
						j--;
						i--;
						break;
					}
				}
			}
			
			
			try {
				Thread.sleep(3);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			count ++;
			repaint();
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		isFire = true;
	}

	@Override
	public void mousePressed(MouseEvent e) {
		isFire = true;
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		isFire = false;
	}


	@Override
	public void mouseDragged(MouseEvent e) {
		isFire = true;
		x = e.getX() - r;
		y = e.getY() - r;
		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		isFire = false;
		x = e.getX() - r;
		y = e.getY() - r;
		repaint();
	}
	
	/*
	 * �ж�С����������Ƿ�������������
	 * ub��upBubble���ϵ�����
	 * db��downBubble���µ�����
	 */
	public boolean isHit(Bubble ub,Bubble db) {
		boolean isHit = false;
//		������������ub\dbԲ��֮��x���y��ľ���
		int xDistance = (ub.getX()+ub.getR())-(db.getX()+db.getR());
		int yDistance = (ub.getY()+ub.getR())-(db.getY()+db.getR());
//		������������Բ��֮��ľ����ƽ����
		int xyDis = xDistance*xDistance + yDistance*yDistance;
//		�����������ݰ뾶�ĺ͵�ƽ��
		int rDis = (ub.getR()+db.getR())*(ub.getR()+db.getR());
//		���ݹ��ɶ���
		if(xyDis <= rDis) {
			isHit = true;
		}
		return isHit;
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
	}
	
	@Override
	public void mouseExited(MouseEvent e) {
	}

}
