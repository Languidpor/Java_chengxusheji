package cn.yd.corejava.day03;
/***
 * 基本类型中整数类型的练习
 * @author GuoJK
 *
 */
public class Demo02 {
	public static void main(String[] args) {
		/*声明整型int变量a，并赋值为5
		声明长整型变量b并赋值为a
		声明整型int变量c，并赋值为b
		声明长整型long变量d，并赋值为100亿
		声明整型int变量e，并赋值为d，输出e的值
		声明浮点float类型变量f，并赋值为56.987
		声明整型int变量g，并赋值为f，输出g的值
		声明byte类型变量b1和b2，分别赋值为5和6，
		声明byte类型变量b3，并赋值为b1+b2*/
		int a = 5;
		long b = a;//比喻：b是一个大的菜篮子，a是一个相对小的菜篮子
		//int c = b;//大的类型不能小小的类型转换
		//当写出100E的时候，编译器默认先拿一个int来存储这个100E，
		//再将这个int赋值给前面的变量。
		//如果加上了L或者小写l，编译器就不用int先来存100E
		long d = 10000000000L;
		int e = (int)d;//强制转换,会造成数据丢失，符号位也无法很好的控制
		System.out.println(e);
		//并不能说，f不能存储56.987，只能说double这个大篮子不能放到float这个小篮子里
		float f = 56.987f;//Type mismatch: cannot convert from double to float
		
		int g = (int)f;//Type mismatch: cannot convert from float to int
		System.out.print(g);
		
		byte b1 = 5;
		byte b2 = 6;
		//Type mismatch: cannot convert from int to byte
		//int short类型的变量，在运算的时候，先自动转换成int，再进行的计算
		byte b3 = (byte)(b1+b2);
		
	}
}
