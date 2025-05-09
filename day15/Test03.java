package cn.yd.corejava.day15;

public class Test03{
	public static void main(String[] args) {
		班级 banji1 = new 班级(1, "班长1");
		班级 banji2 = new 班级(2, "班长2");
		
		banji1.教导主任 = "李四";
		banji1.index++;
		
		System.out.print(banji2.教导主任);
		System.out.print(banji2.index);
		
		System.out.print(班级.教导主任);
		
		
	}
}
