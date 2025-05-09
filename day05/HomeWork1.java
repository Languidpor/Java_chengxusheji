package cn.yd.corejava.day05;
import java.util.Scanner;
/**
 * 1、利用Scanner从控制台获得用户输入的年月日，并分别进行输出。
         注意变量的命名规范
 * @author GuoJK
 */
public class HomeWork1 {
	public static void main(String[] args) {
		//声明并初始化Scanner类型的变量sc，这个工具类型的变量可以用来
		//获得用户在控制台输入的数据
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入年份");
		int year = sc.nextInt();
		
		System.out.println("请输入月份");
		int month = sc.nextInt();
		
		System.out.println("请输入天");
		int day = sc.nextInt();
		
		//字符串和变量 用一个+链接的时候，叫做字符串拼接，整体会变成一个字符串
		System.out.println("年份是:"+year);
		System.out.println(month);
		System.out.println(day);
	}
}
