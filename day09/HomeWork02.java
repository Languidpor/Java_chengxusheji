package cn.yd.corejava.day09;
/**
 * 找出2~1000之间所有的素数(难度大)
 所谓素数，也叫质数，只能被1和其本身整除的整数，2，3，5，7，11，13，17，19....
 * @author GuoJK
 */
public class HomeWork02 {
	public static void main(String[] args) {
		//判断一个数是不是素数，n，用n除以2~(n-1)之间所有的整数。
		//如果全部都除不尽(余数!=0)，说明是素数。
		//也就是说，只要有一个能除得尽，此n就肯定不是素数
		//此for循环，从2遍历到1000
		for(int n=2;n<=1000;n++) {
			//然后用n除以2~(n-1)之间所有的整数，只要有一个除的尽，n就不是素数
			boolean flag = true;//先默认当前的n是一个素数
			for(int m=2;m<n;m++) {
				if(n%m==0) {flag=false;break;}
			}
			if(flag) {System.out.println(n);}
		}
	}
}
