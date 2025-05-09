package edu.yz.demo05;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MoveBallPanel extends JPanel implements Runnable {

//	����С��ĳ�ʼ����
	private int bx = 100;
	private int by = 100;
//	��������ǽ�ڽӴ��ķ�λ��0�����¡�1�����¡�2�����ϡ�3������
	private int att = 1;

	public void paint(Graphics g) {
//		���ø����paint�������ṩ��������������
		super.paint(g);
		this.setBackground(Color.pink);
		g.setColor(Color.BLACK);
//		���Բ��û����ṩ��������
//		g.clearRect(0, 0, 1024, 768);
//		�������껭����һ����ɫʵ��С��
		g.fillOval(bx, by, 30, 30);
	}

	@Override
	public void run() {
//		45��Ϸֱ��� 0�����¡�1�����¡�2�����ϡ�3�������ƶ�
		while (true) {
			if (att == 0) {
				bx++;
				by++;
			}
			if (att == 1) {
				bx--;
				by++;
			}
			if (att == 2) {
				bx--;
				by--;
			}
			if (att == 3) {
				bx++;
				by--;
			}
//			�ж�С���������ı�ǽ�ڣ����Ҹı�С�򷴵��ķ�����������
			if (bx > 987) {
				if (att == 0) {
					att = 1;
				} else {
					att = 2;
				}
			}
			if (by > 709) {
				if (att == 1) {
					att = 2;
				} else {
					att = 3;
				}
			}
			if(bx < 0) {
				if(att == 2) {
					att = 3;
				}else {
					att = 0;
				}
			}
			if(by < 0) {
				if(att == 3) {
					att = 0;
				}else {
					att = 1;
				}
			}
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			repaint();
		}
	}

}
