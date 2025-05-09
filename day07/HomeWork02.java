package cn.yd.corejava.day07;

import java.util.Scanner;

/**
 *  程序获得用户输入的一个学生的分数，然后进行判断
      输出学生的等级，要求if结构和switch结构各完成一遍
 * @author GuoJK
 *
 */
public class HomeWork02 {
	public static void main(String[] args) {
		/**
		 * 获得用户的输入
		 * 将这个数据进行判断
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个分数");
		int score = sc.nextInt();
		String info = "";
		switch(score/10) {
			case 10: info="学神";    break;
			case 9 : info="学霸";    break;
			case 8 : info="学厉害";  break;
			case 7 : info="学一般般";break;
			case 6 : info="学弱";    break;
			default: info = "学渣";
		}
		System.out.println(info);
	}
}
