package cn.yd.corejava.day06;

import java.util.Scanner;

/**
 * 1、用户输入一个年份，程序判断是不是闰年，
 *        一个年份如果满足以下条件之一，就是闰年
     条件1：可以被400整除
     条件2：可以被4整除，同时不能被100整除
 * @author GuoJK
 *
 */
public class HemoWork1 {
	public static void main(String[] args) {
		//提示用户输入，并用程序获得，然后存储在一个变量中
		int year;
		System.out.println("请输入一个年份");
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();
		//声明两个boolean的变量，分别表示条件1和条件2是否满足
		boolean isYear1 = year%400==0;
		boolean isYear2 = year%4==0 && year%100!=0;
		//boolean isYear = isYear1 || isYear2;
		//System.out.print(isYear);
		String str = (isYear1 || isYear2)?"是闰年":"不是闰年";
	}
}





