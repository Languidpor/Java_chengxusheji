package cn.yd.corejava.day04;
/**
 * ��ϵ�����
 * @author GuoJK
 *
 */
public class Demo05 {
	public static void main(String[] args) {
		int a=5;
		int b=2;
		boolean b1 = a>6;//false
		//++��ǰ��������(a��������6)�������㣨6/2���Ϊ3��
		boolean b2 = ++a/b!=3;//false
		
		System.out.println(b1);
		System.out.println(b2);
	}
}
