package cn.yd.corejava.day15;

public class 班级 {
	int id;//班级序号
	String 班长;
	
	static String 教导主任="张三";
	static int index = 1;
	
	public 班级(int id,String 班长) {
		this.id = id;
		this.班长 = 班长;				
	}
	
	public static void 开校庆(){
		System.out.println(教导主任);
		System.out.println(班长);
	}
	
	
	{
		System.out.println("代码块");
	}
	
	static {
		System.out.println("静态代码块");
	}
}
