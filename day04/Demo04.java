package cn.yd.corejava.day04;
/**
 * 算术运算符
 * @author GuoJK
 *
 */
public class Demo04 {
	public static void main(String[] args) {
		int a=4,b=5,c=6;
		int d = a+b;
		System.out.println(d);//9
		
		int e = a/b;
		System.out.println(e);//0
		
		int f = a%b;
		System.out.println(f);//4
		
		int g = c++%b;//++在后，说明是先运算(c%b的结果，赋值给g)，再++(c自增)
		System.out.println(g);//1
		System.out.println(c);//7
		
		int h = --b%a;//--在前，说明是先--，再运算
		System.out.println(b);//4
		System.out.println(h);//0
	}
}
