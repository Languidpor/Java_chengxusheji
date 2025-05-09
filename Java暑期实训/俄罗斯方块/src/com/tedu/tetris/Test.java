package com.tedu.tetris;

public class Test {

	
	public static void main(String[] args) {
		
		String s1 = "123";
		String s2 = "123";
		System.out.println("s1==s2? "+(s1==s2));//true
	          
		//使用new关键字创建一个String对象s3,看看会不会出现不一样的情况？
		String s3 = new String("123");
		System.out.println("s1==s3? "+(s1==s3));//false
	          
		//如果不使用==比较，而是equals比较呢？
		System.out.println("s1.equals(s3)? "+s1.equals(s3));//true
	}
}
