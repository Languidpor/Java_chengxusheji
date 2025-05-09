package cn.yd.corejava.day14;
/**子类*/
public class Human extends Animal{
	String name;
	
	/**学习*/
	public void study() {
		System.out.println("学习");
	}
	
	public void move() {
		System.out.println("两条腿移动");
	}
}
