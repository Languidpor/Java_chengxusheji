package cn.yd.corejava.day04;
//import翻译声明，程序中遇到Scanner的时候，
//告诉编译器，去找java.util.Scanner这个类
//Java语言规定，处理java.lang包下面的类，其他所有的类在使用时都需要import声明
import java.util.Scanner;

/***
 * Scanner练习
 * @author GuoJK
 */
public class Demo02 {
	public static void main(String[] args) {
		//创建一个Scanner类型的对象，现在理解为一个变量
		Scanner sc = new Scanner(System.in);
		int i1 = sc.nextInt();//以int的类型，从控制台获得一个变量
		System.out.print(i1);		
	}
}
