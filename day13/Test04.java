package cn.yd.corejava.day13;
/**�����Ĵ��ݹ���*/
public class Test04 {
	public static void main(String[] args) {
		Demo02 demo02 = new Demo02();
		int x = 1;
		demo02.m1(x);
		System.out.println(x);//1 int����������û�仯
		
		String str = new String("abc");
		demo02.m2(str);
		System.out.println(str);//abc String����������û�仯
		
		Book book = new Book();
		book.name = "֪��֪��";
		demo02.m3(book);
		System.out.println(book.name);//�������� Book�����������б仯
		
		int[] arr = new int[]{1,2,3};
		demo02.m4(arr);
		System.out.println(arr[0]);//100 int[]�����������б仯
	}
}
class Demo02{
	public void m1(int x) {
		System.out.println("~~~~");
		x = 200;
	}
	
	public void m2(String str) {
		str = new String("123");
	}
	
	public void m3(Book book) {
		book.name = "��������";
	}
	
	public void m4(int[] arr) {
		arr[0] = 100;
	}
}