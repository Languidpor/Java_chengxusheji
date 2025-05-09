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
//	定义存储下落的泡泡（敌机）的集合；
	private int dbCount;
	private Vector<Bubble> downBubbles;
	
	public BallBattlePanel() {
//		战机初始化
		x = 100;
		y = 200;
		r = 40;
//		星星初始化
		starCount = 300;
		xx = new int[starCount];
		yy = new int[starCount];
		ran = new Random();
		for (int i = 0; i < starCount; i++) {
			xx[i] = ran.nextInt(1024);
			yy[i] = ran.nextInt(768);
		}
//		子弹：冒泡初始化
		isFire = false;
		allBubbles = new Vector<Bubble>();
//		敌机：下落泡泡初始化
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
//		绘制背景
		g.setColor(Color.YELLOW);
		for (int i = 0; i < starCount; i++) {
			g.drawString("*", xx[i], yy[i]);
		}
		g.setColor(Color.BLUE);
		g.fillOval(x, y, 2*r, 2*r);
//		绘制冒泡的小泡泡
		for (int i = 0; i < allBubbles.size(); i++) {
//			快速创建方法的返回值变量：alt+shift+l
			Bubble upBubble = allBubbles.elementAt(i);
			upBubble.draw(g);
		}
//		绘制下落的泡泡
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
//			子弹：冒出泡泡的移动与移除
			for (int i = 0; i < allBubbles.size(); i++) {
				Bubble b = allBubbles.elementAt(i);
				if( y <= 0 | x <=0 | y >= 768) {
					allBubbles.remove(i);
				}
				b.move();
			}
//			敌机：下落泡泡的移动
			for (int i = 0; i < downBubbles.size(); i++) {
				Bubble b = downBubbles.get(i);
				b.move();
			}
//			判断小球发射的泡泡是否击中下落的泡泡
			for (int i = 0; i < allBubbles.size(); i++) {
//				遍历取出发射的泡泡
				Bubble ub = allBubbles.elementAt(i);
				for (int j = 0; j < downBubbles.size(); j++) {
//					遍历取出下落的泡泡
					Bubble db = downBubbles.get(j);
//					调用判断的方法：让两个泡泡消失
					if(isHit(ub,db)) {
//						发射的泡泡：从集合中移除
						allBubbles.remove(i);
//						下落的泡泡：重置y轴
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
	 * 判断小球发射的泡泡是否击中下落的泡泡
	 * ub：upBubble向上的泡泡
	 * db：downBubble向下的泡泡
	 */
	public boolean isHit(Bubble ub,Bubble db) {
		boolean isHit = false;
//		计算两个泡泡ub\db圆心之间x轴和y轴的距离
		int xDistance = (ub.getX()+ub.getR())-(db.getX()+db.getR());
		int yDistance = (ub.getY()+ub.getR())-(db.getY()+db.getR());
//		计算两个泡泡圆心之间的距离的平方和
		int xyDis = xDistance*xDistance + yDistance*yDistance;
//		计算两个泡泡半径的和的平方
		int rDis = (ub.getR()+db.getR())*(ub.getR()+db.getR());
//		根据勾股定理
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
