package cn.yd.corejava.day14;
/**子类*/
public class Dog extends Animal{
	String kind;//品种
	
	public Dog() {
		
	}
	public Dog(String kind) {		
		this.kind = kind;
	}
	
	 /**咬*/
	public void bite() {
		System.out.println("咬人");
	}
	
	public void move() {
		System.out.println("四条腿移动");
	}
	
	
}

