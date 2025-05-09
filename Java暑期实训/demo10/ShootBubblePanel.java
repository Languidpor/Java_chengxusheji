package edu.yz.demo10;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Vector;

import javax.swing.JPanel;
/**
 * 1、绘制可以冒泡的较大小球，并且可以跟随鼠标的指针拖拽或移动而移动：MouseMotionListener
 * 2、根据鼠标的点击、按压而创建较小小球，设计标记位判断鼠标是否点击或按压，是则创建冒泡小球：MouseListener
 * 3、创建出冒泡小球的同时让小球向上运动：run起来
 * @author tarena
 *
 */
public class ShootBubblePanel extends JPanel implements Runnable, MouseMotionListener,MouseListener{
	
//	小球的x\y坐标
	private int x , y;
//	小球的半径
	private int r;
//	可以存放冒泡小球对象的集合属性，可以存储不同类型的任意个小球对象
	private Vector allBubbles;	
//	小球是否是冒泡状态：
	private boolean isMao; 
	
//	构造方法完成初始化
	public ShootBubblePanel() {
		x = 200;
		y = 180;
		r = 30;
//		实例化此Vector集合对象：初始大小容量为10
		allBubbles = new Vector();
//		初始应为false；
		isMao = false;
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		this.setBackground(Color.DARK_GRAY);
		g.setColor(Color.pink);
		g.fillOval(x, y, 2*r, 2*r);
//		通过集合提供的capacity()方法获取集合的初始容量
//		通过集合提供的size方法获取集合元素的个数
		for (int i = 0; i < allBubbles.size(); i++) {
			Bubble bubble = (Bubble) allBubbles.elementAt(i);
			bubble.draw(g);
		}
	}

	@Override
	public void mouseDragged(MouseEvent e) {
//		拖拽的同时会生成冒泡小球
		isMao = true;
		x = e.getX() - r;
		y = e.getY() - r;
		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
//		无按压仅仅是鼠标指针移动时，只有大球跟随，而不生成冒泡小球
		isMao = false;
		x = e.getX() - r;
		y = e.getY() - r;
		repaint();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
//		点击并冒泡，修改冒泡状态为true
		isMao = true;
	}

	@Override
	public void mousePressed(MouseEvent e) {
//		按压并冒泡，修改冒泡状态为true
		isMao = true;
	}

	@Override
	public void mouseReleased(MouseEvent e) {
//		释放并停止冒泡，修改为false
		isMao = false;
	}

//	创建冒泡小球：属性初始化以及冒泡小球向上运动
	@Override
	public void run() {
		int count = 0;
		while(true) {
//			isMao=true表示鼠标点击或按压，完成冒泡小球创建
			if(isMao & count%15 ==0) {
				Bubble bubble = new Bubble();
				bubble.setR(10);
				bubble.setColor(Color.orange);
				bubble.setOrientation(Bubble.UP);
//				冒泡小球应该在大的小球的上方产生
				bubble.setX(x+r-bubble.getR());
				bubble.setY(y);
				bubble.setPanel(this);
//				每生成一个冒泡小球就存储到集合allBubbles当中
				allBubbles.add(bubble);
			}
			for (int i = 0; i < allBubbles.size(); i++) {
				Bubble b = (Bubble) allBubbles.elementAt(i);
//				判断当前冒泡小球的y轴坐标是否小于等于0，是则移除
				if(b.getY() <= 0) {
					allBubbles.remove(i);
				}
				b.move();
			}
//			每个冒泡小球运动间隔20毫秒
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			count++;
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
