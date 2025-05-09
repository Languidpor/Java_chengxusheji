package cn.yd.corejava.day06;

import java.util.Scanner;

/***
 * 分支结构
 * @author GuoJK
 *
 */
public class Demo04 {
	public static void main(String[] args) {
		//if-esle
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
//		if(num>5) {
//			System.out.println(num+"是大于5的");
//		}else {
//			System.out.println(num+"是小于5的");
//		}
		//if  else if 
		if(num>0&&num<10) {
			System.out.println(num+"是大于0并且小于10的");
		}else if(num>=10&&num<50) {
			System.out.println(num+"是大于10并且小于50的");
		}else {
			System.out.println(num+"是大于50的");
		}
		
	}
}
