package cn.yd.corejava.day16;

public abstract class Animal {
	private int age;
	//抽象类竟然可以有构造
	public Animal() {}
	
	public Animal(int age) {
		this.age=age;
	}
	/**移动*/
	public abstract void move();
	
	/**吃*/
	public void eat() {
		//调用嘴巴
	}	
}

class Dog extends Animal{
	public void move() {
		//调用四条腿
	}
}

class Human extends Animal{	
	public void move() {
		//调用两条腿		
	}
	
}



