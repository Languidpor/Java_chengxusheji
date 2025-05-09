package edu.yz.demo09;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

public class MouseCtrlBallPanel extends JPanel implements MouseMotionListener{

	private int x = 200;
	private int y = 200;
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.fillOval(x, y, 30, 30);
	}
	
//	��С��������İ�ѹ��ק�ƶ����ƶ���
//	ͨ��MouseEvent����ȡ����ǰ����ڻ����ϵ����꣬
//	���������긳ֵ��С��
	@Override
	public void mouseDragged(MouseEvent e) {
		x = e.getX();
		y = e.getY();
		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		x = e.getX();
		y = e.getY();
		repaint();
	}

}
