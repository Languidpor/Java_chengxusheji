package edu.yz.demo04;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

public class MoonPanel extends JPanel implements Runnable{
//	���������ǵ�������꣺�����鱣��300�����ǵ�x-y����ֵ
	private int [] sx;
	private int [] sy;
	
//	��������ʼ��ʵ��ԲB(��ɫ)����ʼ����
	private int x = 580;
	private int y = 400;
	
//	�ڹ��췽�����������������ĳ�ʼ��
	public MoonPanel() {
		sx = new int[300];//�±�0-299
		sy = new int[300];
		Random ran = new Random();
		for (int i = 0; i < 300; i++) {
//			ͨ��������[�±�ֵ]�ķ�ʽ�����������||��ȡ||ɾ���������е�Ԫ�أ��±��0��ʼ
			sx[i] = ran.nextInt(1024);//0~1024֮��������
			sy[i] = ran.nextInt(768);//0~768֮��������
		}
	}
	
//	�ǻ��������ͼ�ε���ڷ������������
	public void paint(Graphics g) {
		super.paint(g);
		this.setBackground(Color.BLACK);
		g.setColor(Color.YELLOW);
		Font font = new Font("����",Font.BOLD,10);
		g.setFont(font);
//		������
		for(int i = 0;i < 300 ; i++) {
			/*
			 * // ��ȡdouble���͵������������ǿ��ת����int���� int x = (int)
			 * (Math.random()*1024);//0~1024֮�������� int y = (int)
			 * (Math.random()*768);//0~768֮��������
			 */			
			g.drawString("*", sx[i], sy[i]);
		}
//		��Բ��A������һ��ֱ��Ϊ80��Բ�£�����Ϊ����
		g.fillOval(880, 100, 80, 80);
		/*
		 * // �ٻ���һ����Բ��A��ͬ��С��ʵ��ԲB���޸�����Ϊ���� g.fillOval(280, 400, 80, 80); int x =280 ; int
		 * y =400 ; for (int i = 0; i < 300; i++) {//���ǺõĽ������ g.fillOval(x, y, 80, 80);
		 * x += 50; y -= 50; }
		 */
//		�ٻ���һ����Բ��A��ͬ��С��ʵ��ԲB(��ɫ)
		g.setColor(Color.BLACK);
		g.fillOval(x, y, 80, 80);
	}
	
//	�̵߳���ڷ�����
	public void run() {
//		whileѭ����ʵ����ʵ��ԲB������һֱ�ƶ�
		while(true) {
			x++;
			y--;
//			����ִ����ʳ������
			if(x>=910 || y <= 80) {
				/*
				 * x = 580; y = 400;
				 */
				break;
			}
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
//			�ػ�����
			repaint();
		}		
	}
}
