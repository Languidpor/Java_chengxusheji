package cn.yd.corejava.day13;
/**方法的传递规则*/
public class Test04 {
	public static void main(String[] args) {
		Demo02 demo02 = new Demo02();
		int x = 1;
		demo02.m1(x);
		System.out.println(x);//1 int经过方法，没变化
		
		String str = new String("abc");
		demo02.m2(str);
		System.out.println(str);//abc String经过方法，没变化
		
		Book book = new Book();
		book.name = "知否知否";
		demo02.m3(book);
		System.out.println(book.name);//三生三世 Book经过方法，有变化
		
		int[] arr = new int[]{1,2,3};
		demo02.m4(arr);
		System.out.println(arr[0]);//100 int[]经过方法，有变化
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
		book.name = "三生三世";
	}
	
	public void m4(int[] arr) {
		arr[0] = 100;
	}
}