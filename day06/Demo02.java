package cn.yd.corejava.day06;
/**
 * �ַ���ƴ�������
 * @author GuoJK
 *
 */
public class Demo02 {
	public static void main(String[] args) {
		int a = 5;
		int b = 3;
		b+=a;
		System.out.println(a);//5
		System.out.println(b);//8		
		a*=b;
		System.out.println(a);//40
		System.out.println(b);//8
		int i = 5;
		int j = 6;
		System.out.println("�ַ���1"+"�ַ���2");//"�ַ���1�ַ���2"
		System.out.println("�ַ���3"+i);//"�ַ���35"
		System.out.println("�ַ���4"+i+j);//"�ַ���456"
		System.out.println(i+j+"�ַ���5");//"11�ַ���5"
		System.out.println("�ַ���6"+j);//"�ַ���66"
		System.out.println("�ַ���7"+(i+j));//"�ַ���711"
		
		
	}
}
