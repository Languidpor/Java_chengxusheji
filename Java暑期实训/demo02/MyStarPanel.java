package edu.yz.demo02;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 * 	�̳�JDK���ṩ��JPanel���������Լ��Ļ���
 * 	�̳�������������������֮һ��ע��̳н�֧�ֵ��̳У����Զ��ؼ̳У�
 * 	һ������ֻ�ܼ̳�һ�����࣬һ�������ǿ���ӵ�ж�������
 * @author tarena
 */
public class MyStarPanel extends JPanel{
	
	
//	�����Լ����·���
	public void add() {
		
	}
//	�����Լ����·���
	public void paint() {
		
	}
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
//		�����ַ�����ʽ�����ǣ�������������
		Font font = new Font("����",Font.BOLD,10);
		g.setFont(font);
//		���� *
		g.drawString("*", 40, 40);
		g.drawString("*", 50, 50);
		g.drawString("*", 60, 80);
		g.drawString("*", 70, 100);
//		�ĸ������ֱ��ʾ���&�յ������
//		g.drawLine(30, 30, 100, 100);
	}
	
}
