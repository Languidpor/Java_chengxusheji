package cn.yd.corejava.day07;

import java.util.Scanner;

/**
 * �������û������һ��ѧ���ķ�����Ȼ������ж�
      ���ѧ���ĵȼ���Ҫ��if�ṹ��switch�ṹ�����һ��
 *
 */
public class HomeWork01 {
	public static void main(String[] args) {
		/***
		 * 1������û�������
		 * 2����������ݽ����ж� 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ������");
		int score = sc.nextInt();
		String info = "";
		//��֧�ṹ
		if(score==100) {
			info = "ѧ��";
		}else if(score>=90 && score<=99) {
			info = "ѧ��";
		}else if(score>=80 && score<=89) {
			info = "ѧ����";
		}else if(score>=70 && score<=79) {
			info = "ѧһ���";
		}else if(score>=60 && score<=69) {
			info = "ѧ��";
		}else {
			info = "ѧ��";
		}
		System.out.println(info);
	}
	
}
