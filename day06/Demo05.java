package cn.yd.corejava.day06;
/***
 * switch-case
 * @author GuoJK
 *
 */
public class Demo05 {
	public static void main(String[] args) {
		int num = 4;
		char c = 'c';
		String str = "abc";
		
		switch(num) {
			case 1:System.out.println("case1");break;
			case 2:System.out.println("case2");break;
			case 3:System.out.println("case3");break;
			case 4:System.out.println("case4");break;
			case 5:System.out.println("case5");break;
			case 6:System.out.println("case6");break;
			case 7:System.out.println("case7");break;
			default :System.out.println("default");
		}
		switch(c) {
			case 'a':System.out.println("case1");break;
			case 1:System.out.println("case2");break;
			default :System.out.println("default");
		}
	}
}
