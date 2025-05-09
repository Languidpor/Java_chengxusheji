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
	
//	让小球跟随鼠标的按压拖拽移动而移动，
//	通过MouseEvent来获取到当前鼠标在画布上的坐标，
//	并将此坐标赋值给小球
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
