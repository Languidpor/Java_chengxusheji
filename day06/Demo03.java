package cn.yd.corejava.day06;
/***
 * ��Ŀ�����
 * @author GuoJK
 *
 */
public class Demo03 {
	public static void main(String[] args) {
		boolean flag = false;
		//String str = flag?1:"abc";
		int a = flag?1:'a';
		
		boolean b1 = 5<=5;
		String str1 = b1?"�Һ�":"���";//"�Һ�"
		
		String str2 = (6%5==2?false:true)?"�Ҳ���":"�㲻��";
		
		System.out.println(str1);
		System.out.println(str2);
	}
}
