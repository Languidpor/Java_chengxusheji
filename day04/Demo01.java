package cn.yd.corejava.day04;

public class Demo01 {
	public static void main(String[] args) {
		boolean b1 = true;
		boolean b2 = false;
		//boolean b3 = 3.14;
		char c1 = '男';
		//System.out.println(c1);
		char c2 = 'm';
		char c3 = '6';
		char c4 = ' ';
		char c5 = '中';
		char c6 = c5;
		System.out.println(c6);
		char c7 = '\'';//'需要添加转义字符
		System.out.println(c7);
		
		//将char类型,转换成int，自动转换
		int i5 = c5;
		System.out.println(i5);
		//将int类型强转成char
		char c = (char)48;
		System.out.println(c);
		
	}
}
