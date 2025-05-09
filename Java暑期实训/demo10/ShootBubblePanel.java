package edu.yz.demo10;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Vector;

import javax.swing.JPanel;
/**
 * 1�����ƿ���ð�ݵĽϴ�С�򣬲��ҿ��Ը�������ָ����ק���ƶ����ƶ���MouseMotionListener
 * 2���������ĵ������ѹ��������СС����Ʊ��λ�ж�����Ƿ�����ѹ�����򴴽�ð��С��MouseListener
 * 3��������ð��С���ͬʱ��С�������˶���run����
 * @author tarena
 *
 */
public class ShootBubblePanel extends JPanel implements Runnable, MouseMotionListener,MouseListener{
	
//	С���x\y����
	private int x , y;
//	С��İ뾶
	private int r;
//	���Դ��ð��С�����ļ������ԣ����Դ洢��ͬ���͵������С�����
	private Vector allBubbles;	
//	С���Ƿ���ð��״̬��
	private boolean isMao; 
	
//	���췽����ɳ�ʼ��
	public ShootBubblePanel() {
		x = 200;
		y = 180;
		r = 30;
//		ʵ������Vector���϶��󣺳�ʼ��С����Ϊ10
		allBubbles = new Vector();
//		��ʼӦΪfalse��
		isMao = false;
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		this.setBackground(Color.DARK_GRAY);
		g.setColor(Color.pink);
		g.fillOval(x, y, 2*r, 2*r);
//		ͨ�������ṩ��capacity()������ȡ���ϵĳ�ʼ����
//		ͨ�������ṩ��size������ȡ����Ԫ�صĸ���
		for (int i = 0; i < allBubbles.size(); i++) {
			Bubble bubble = (Bubble) allBubbles.elementAt(i);
			bubble.draw(g);
		}
	}

	@Override
	public void mouseDragged(MouseEvent e) {
//		��ק��ͬʱ������ð��С��
		isMao = true;
		x = e.getX() - r;
		y = e.getY() - r;
		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
//		�ް�ѹ���������ָ���ƶ�ʱ��ֻ�д�����棬��������ð��С��
		isMao = false;
		x = e.getX() - r;
		y = e.getY() - r;
		repaint();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
//		�����ð�ݣ��޸�ð��״̬Ϊtrue
		isMao = true;
	}

	@Override
	public void mousePressed(MouseEvent e) {
//		��ѹ��ð�ݣ��޸�ð��״̬Ϊtrue
		isMao = true;
	}

	@Override
	public void mouseReleased(MouseEvent e) {
//		�ͷŲ�ֹͣð�ݣ��޸�Ϊfalse
		isMao = false;
	}

//	����ð��С�����Գ�ʼ���Լ�ð��С�������˶�
	@Override
	public void run() {
		int count = 0;
		while(true) {
//			isMao=true��ʾ�������ѹ�����ð��С�򴴽�
			if(isMao & count%15 ==0) {
				Bubble bubble = new Bubble();
				bubble.setR(10);
				bubble.setColor(Color.orange);
				bubble.setOrientation(Bubble.UP);
//				ð��С��Ӧ���ڴ��С����Ϸ�����
				bubble.setX(x+r-bubble.getR());
				bubble.setY(y);
				bubble.setPanel(this);
//				ÿ����һ��ð��С��ʹ洢������allBubbles����
				allBubbles.add(bubble);
			}
			for (int i = 0; i < allBubbles.size(); i++) {
				Bubble b = (Bubble) allBubbles.elementAt(i);
//				�жϵ�ǰð��С���y�������Ƿ�С�ڵ���0�������Ƴ�
				if(b.getY() <= 0) {
					allBubbles.remove(i);
				}
				b.move();
			}
//			ÿ��ð��С���˶����20����
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
