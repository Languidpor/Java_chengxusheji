package cn.yd.corejava.day04;
/**
 * 关系运算符
 * @author GuoJK
 *
 */
public class Demo05 {
	public static void main(String[] args) {
		int a=5;
		int b=2;
		boolean b1 = a>6;//false
		//++在前，先自增(a自曾成了6)，再运算（6/2结果为3）
		boolean b2 = ++a/b!=3;//false
		
		System.out.println(b1);
		System.out.println(b2);
	}
}
