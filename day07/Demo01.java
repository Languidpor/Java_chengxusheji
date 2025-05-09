package cn.yd.corejava.day07;
/**
 * 循环三种语法
 * @author GuoJK
 *
 */
public class Demo01 {
	public static void main(String[] args) {
		/**
		 * 第一遍循环：i=0, i<5满足，执行执行体，i++，第一遍循环之后i=1
		 * 第二遍循环：i=1，i<5满足，执行执行体，i++，第二遍循环之后i=2
		 * 第三遍循环，i=2，i<5满足，执行执行体，i++，第三遍循环之后i=3
		 * 第四遍循环，i=3，i<5满足，执行执行体，i++，第四遍循环之后i=4
		 * 第五遍循环，i=4，i<5满足，执行执行体，i++，第五遍循环之后i=5
		 * 第六遍循环，i=5，i<5不满足，循环结束
		 */
//		for(int i=0;i<5;i++) {
//			System.out.println(i);			
//		}
		int a=1;
		int b=2;
		
		while(a>b) {
			System.out.println("aaa");
		}
		
		// 不管循环条件满足与否，do都会执行一遍
		do {
			System.out.println("aaa");
		}while(a>b);
		
	}
}
