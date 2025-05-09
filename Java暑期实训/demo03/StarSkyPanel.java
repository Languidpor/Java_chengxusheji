package edu.yz.demo03;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class StarSkyPanel extends JPanel{

	@Override
	public void paint(Graphics g) {
//		���ø����paint����һ�ſջ����������ñ�����ɫΪ��ɫ
		super.paint(g);
		this.setBackground(Color.black);
//		�ַ�����ʽ����һ�Ż�ɫ������
		g.setColor(Color.YELLOW);
		Font font = new Font("����",Font.BOLD,10);
		g.setFont(font);
//		��һ������
		g.drawString("*", 200, 210);
//		��300������
		for(int i = 0;i < 300 ; i++) {
//			��ȡdouble���͵������������ǿ��ת����int����
			int x = (int) (Math.random()*1024);//0~1024֮��������
			int y = (int) (Math.random()*768);//0~768֮��������
			g.drawString("*", x, y);
		}
	}
}
