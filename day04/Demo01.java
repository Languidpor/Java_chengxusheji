package cn.yd.corejava.day04;

public class Demo01 {
	public static void main(String[] args) {
		boolean b1 = true;
		boolean b2 = false;
		//boolean b3 = 3.14;
		char c1 = '��';
		//System.out.println(c1);
		char c2 = 'm';
		char c3 = '6';
		char c4 = ' ';
		char c5 = '��';
		char c6 = c5;
		System.out.println(c6);
		char c7 = '\'';//'��Ҫ���ת���ַ�
		System.out.println(c7);
		
		//��char����,ת����int���Զ�ת��
		int i5 = c5;
		System.out.println(i5);
		//��int����ǿת��char
		char c = (char)48;
		System.out.println(c);
		
	}
}
