package cn.yd.corejava.day07;

import java.util.Scanner;

/**
 *  �������û������һ��ѧ���ķ�����Ȼ������ж�
      ���ѧ���ĵȼ���Ҫ��if�ṹ��switch�ṹ�����һ��
 * @author GuoJK
 *
 */
public class HomeWork02 {
	public static void main(String[] args) {
		/**
		 * ����û�������
		 * ��������ݽ����ж�
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ������");
		int score = sc.nextInt();
		String info = "";
		switch(score/10) {
			case 10: info="ѧ��";    break;
			case 9 : info="ѧ��";    break;
			case 8 : info="ѧ����";  break;
			case 7 : info="ѧһ���";break;
			case 6 : info="ѧ��";    break;
			default: info = "ѧ��";
		}
		System.out.println(info);
	}
}
