package cn.yd.corejava.day06;

import java.util.Scanner;

/***
 * ��֧�ṹ
 * @author GuoJK
 *
 */
public class Demo04 {
	public static void main(String[] args) {
		//if-esle
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
//		if(num>5) {
//			System.out.println(num+"�Ǵ���5��");
//		}else {
//			System.out.println(num+"��С��5��");
//		}
		//if  else if 
		if(num>0&&num<10) {
			System.out.println(num+"�Ǵ���0����С��10��");
		}else if(num>=10&&num<50) {
			System.out.println(num+"�Ǵ���10����С��50��");
		}else {
			System.out.println(num+"�Ǵ���50��");
		}
		
	}
}
