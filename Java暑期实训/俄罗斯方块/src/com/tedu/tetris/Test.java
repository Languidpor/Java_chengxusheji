package com.tedu.tetris;

public class Test {

	
	public static void main(String[] args) {
		
		String s1 = "123";
		String s2 = "123";
		System.out.println("s1==s2? "+(s1==s2));//true
	          
		//ʹ��new�ؼ��ִ���һ��String����s3,�����᲻����ֲ�һ���������
		String s3 = new String("123");
		System.out.println("s1==s3? "+(s1==s3));//false
	          
		//�����ʹ��==�Ƚϣ�����equals�Ƚ��أ�
		System.out.println("s1.equals(s3)? "+s1.equals(s3));//true
	}
}
