package cn.yd.corejava.day18;

import java.util.Timer;
import java.util.TimerTask;

import cn.yd.corejava.day18.ѧУ.Teacher;

public class Test {
	public static void main(String[] args) {
		//������̬�ڲ�����󣬺��ⲿ�����û���κι�ϵ
		Teacher t = new Teacher();
		
		
		//�����ڲ���
		//��ʱ���࣬һ�������࣬����ʵ�ֶ�ʱ���Ĺ���
		Timer timer = new Timer();//������ʱ������
		//������ʱ��, ��Ҫ��������
		/***1����һ������,�����������Ͳ����ڣ�����������͵ĸ�����TimerTask��TimerTask
		 * ��һ�������࣬������������Ҫʵ������󷽷�
		 *  2:long���͵ģ���ʾ���룬������ִ�е�����ʱ����Ϣ��ã���ʼִ�й̶����߼�
		 *  3:long���͵ģ���ʾ���룬ִ����һ��̶����߼����Ժ�ÿ�����ã��ٴ�ִ��	
		 */
		timer.schedule(new TimerTask() {
			public void run() {
				System.out.println("���");
			}
		},0,10);
		
		//��һ���࣬û�����֣����������ĸ�����Tread
		new Thread() {}.start();
	}
}
