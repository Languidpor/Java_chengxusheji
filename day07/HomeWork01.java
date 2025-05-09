package cn.yd.corejava.day07;

import java.util.Scanner;

/**
 * 程序获得用户输入的一个学生的分数，然后进行判断
      输出学生的等级，要求if结构和switch结构各完成一遍
 *
 */
public class HomeWork01 {
	public static void main(String[] args) {
		/***
		 * 1、获得用户的输入
		 * 2、对这个数据进行判断 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个分数");
		int score = sc.nextInt();
		String info = "";
		//分支结构
		if(score==100) {
			info = "学神";
		}else if(score>=90 && score<=99) {
			info = "学霸";
		}else if(score>=80 && score<=89) {
			info = "学厉害";
		}else if(score>=70 && score<=79) {
			info = "学一般般";
		}else if(score>=60 && score<=69) {
			info = "学弱";
		}else {
			info = "学渣";
		}
		System.out.println(info);
	}
	
}
