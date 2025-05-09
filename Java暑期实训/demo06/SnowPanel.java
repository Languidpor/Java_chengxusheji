package edu.yz.demo06;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

public class SnowPanel extends JPanel{
	
//	�������鱣��ѩ���ĳ�ʼ����
	private int [] sx;
	private int [] sy;
//	���ʵ��������飺��ǰ������Դ洢�ĸ�Font���͵Ķ���
	private Font [] allFonts;
//	�����
	private Random ran;
	
//	���췽�����������ĸ�ֵ���
	public SnowPanel() {
//		��ʼ��
		sx = new int[300];
		sy = new int[300];
		allFonts = new Font[4];
		ran = new Random();
//		��ֵ��ѩ������
		for (int i = 0; i < sx.length; i++) {
			sx[i] = ran.nextInt(1024);
			sy[i] = ran.nextInt(768);
		}		
//		��ֵ���壺�����ĸ��������Ȼ�󱣴浽��������allFonts
		allFonts[0] = new Font("����",Font.BOLD,10);
		allFonts[1] = new Font("����",Font.BOLD,16);
		allFonts[2] = new Font("����",Font.BOLD,22);
		allFonts[3] = new Font("����",Font.BOLD,28);
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		this.setBackground(Color.DARK_GRAY);
//		���û��ʵ���ɫΪ��ɫ
		g.setColor(Color.white);
//		����
		for (int i = 0; i < sx.length; i++) {
//		���û��ʵ����壺�����������������ȡ
//		bound:һ��Ҫ���������������ޣ������޻ᱻ�ų���
			g.setFont(allFonts[ran.nextInt(4)]);
			g.drawString("*", sx[i], sy[i]);
		}
	}

}
