package cn.yd.corejava.day04;
/**
 * ���������
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
		
		int g = c++%b;//++�ں�˵����������(c%b�Ľ������ֵ��g)����++(c����)
		System.out.println(g);//1
		System.out.println(c);//7
		
		int h = --b%a;//--��ǰ��˵������--��������
		System.out.println(b);//4
		System.out.println(h);//0
	}
}
