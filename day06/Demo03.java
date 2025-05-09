package cn.yd.corejava.day06;
/***
 * 三目运算符
 * @author GuoJK
 *
 */
public class Demo03 {
	public static void main(String[] args) {
		boolean flag = false;
		//String str = flag?1:"abc";
		int a = flag?1:'a';
		
		boolean b1 = 5<=5;
		String str1 = b1?"我好":"你好";//"我好"
		
		String str2 = (6%5==2?false:true)?"我不好":"你不好";
		
		System.out.println(str1);
		System.out.println(str2);
	}
}
