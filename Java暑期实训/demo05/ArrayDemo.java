package edu.yz.demo05;

public class ArrayDemo {
	
	public static void main(String[] args) {
//		�����������ͣ��޳�ʼֵ
		int i;
//		System.out.println(i);
		
//		������������ʼ�� type [] name = new type[length];
		int [] arr = new int[6];
//		��ӡ����ַ[I@659e0bfd��������һ��������������
		System.out.println(arr);
//		�����е�Ԫ�أ����������������г�ʼֵ�������ʱΪint�����ʼֵΪ0
		System.out.println(arr[0]);
//		��ֵ
		arr[0] = 1;
		System.out.println(arr[0]);
//		���ѭ����������Ĳ���
		for (int j = 0; j < arr.length; j++) {
			arr[j] = j;
			System.out.println(arr[j]);
		}
		double [] arr01 = new double[5];
		System.out.println(arr01[0]);
	}
	

}
