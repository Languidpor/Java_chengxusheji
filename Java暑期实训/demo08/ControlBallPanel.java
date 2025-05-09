package edu.yz.demo08;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class ControlBallPanel extends JPanel implements KeyListener{
	
	private int x = 20;
	private int y = 20;
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.fillOval(x, y, 30, 30);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

//	KeyEvent类提供一系列的键盘输入事件常量，将此时的键盘输入与常量进行比较
//	e表示玩家输入的键盘操作
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_UP) {
			y--;
			repaint();
		}else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			y++;
			repaint();
		}else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			x--;
			repaint();
		}else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			x++;
			repaint();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
