package edu.yz.demo03;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 * 	�̳�JDK���ṩ��JPanel���������Լ��Ļ���
 * 	�̳�������������������֮һ��ע��̳н�֧�ֵ��̳У����Զ��ؼ̳У�
 * 	һ������ֻ�ܼ̳�һ�����࣬һ�������ǿ���ӵ�ж�������
 * @author tarena
 */
public class MyStarPanel extends JPanel{
		
//	����һ���̳����游���paint(Graphics g)����
	
//	�ṩ���ʣ����л��ƣ������ڼ̳нṹ���ҵ��˷���ǩ���ķ�����
//	��ʱ�������¶����paint���ڷ�������д
//	�����ࣺGraphics�ṩ�˻��ƺ����һЩͼ�εķ���
	@Override
	public void paint(Graphics g) {
//		super���ø����paint(g)������һ���ջ���
		super.paint(g);
//		������������ɫ����Ϊ��ɫ
		this.setBackground(Color.black);
//		����Ҫ���Ƶ�ͼ������ɫΪ��ɫ
		g.setColor(Color.yellow);
		/*
		 * // ���ƻ�ɫʵ��Բ g.fillOval(200, 200, 20, 20); // ��Բ����Χ����һЩ��ɫ��ֱ�� // ˮƽ�����ϵ���
		 * g.drawLine(190, 210, 230, 210); // ��ֱ�����ϵ��� g.drawLine(210, 190, 210, 230);
		 * int a = (int) (210-Math.sqrt(20*20/2));//195 int b = (int)
		 * (210+Math.sqrt(20*20/2));//224 // ���ϵ����� g.drawLine(a, a, b, b); g.drawLine(a,
		 * b, b, a);
		 */
//		����ͼƬ��ע��·����ͼƬλ�ڹ�����ֱ��star.jpeg ��λ��src�� src/star.jpeg
		Image img = new ImageIcon("src/night.jpeg").getImage();
//		x&y��ʾ���Ͻǵ����꣬height&weight��ʾͼƬ�Ĵ�С
		g.drawImage(img, 0,0, 600, 600, this);
	}
	
}
