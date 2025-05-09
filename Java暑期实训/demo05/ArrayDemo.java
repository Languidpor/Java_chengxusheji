package edu.yz.demo05;

public class ArrayDemo {
	
	public static void main(String[] args) {
//		基本数据类型：无初始值
		int i;
//		System.out.println(i);
		
//		数组的声明与初始化 type [] name = new type[length];
		int [] arr = new int[6];
//		打印出地址[I@659e0bfd，数组是一个引用数据类型
		System.out.println(arr);
//		数组中的元素：引用数据类型是有初始值，例如此时为int，则初始值为0
		System.out.println(arr[0]);
//		赋值
		arr[0] = 1;
		System.out.println(arr[0]);
//		结合循环进行数组的操作
		for (int j = 0; j < arr.length; j++) {
			arr[j] = j;
			System.out.println(arr[j]);
		}
		double [] arr01 = new double[5];
		System.out.println(arr01[0]);
	}
	

}
