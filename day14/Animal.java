package cn.yd.corejava.day14;
/**表示父类，动物类*/
public class Animal {
	int age;
	
	/**无参构造*/
	public Animal() {
		
	}
	/**有参构造*/
	public Animal(int age) {
		this.age=age;
	}
	
	/**移动*/
	public void move() {		
		System.out.println("动物移动");
	}
	
}
