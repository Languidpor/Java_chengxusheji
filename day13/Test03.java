package cn.yd.corejava.day13;
/**
 * 方法的调用原则
 * @author GuoJK
 *
 */
public class Test03 {
	public static void main(String[] args) {
		Demo01 demo01 = new Demo01();
		int x = 1;
		int y = 2;
		byte b = 3;
		char c ='a';
		long l = 1000L;
		
		demo01.add(x,y);//add(int int)
		demo01.add(b,y);//add(short int)
	}
}

class Demo01{
	/**add(int int)*/
	public int add(int x,int y) {
		System.out.println("add(int int)");
		return x+y;
	}
	/**add(short int)*/
	public int add(short x,int y) {
		System.out.println("add(short int)");
		return x+y;
	}
	/**add(long int)*/
	public long add(long x,int y) {
		System.out.println("add(long int)");
		return x+y;
	}
	/**add(int)*/
	public int add(int x) {
		System.out.println("add(int)");
		return x+x;
	}
	/**add(char int)*/
	public int add(char x,int y) {
		System.out.print("add(char int)");
		return x+y;
	}
	
	
}
