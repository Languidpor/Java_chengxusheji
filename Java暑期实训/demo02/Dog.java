package edu.yz.demo02;

public class Dog extends Animal{
	
//	子类自己的属性
	private String name;
	private String type;
	private int age;
	
	public Dog() {
	}
	
	public Dog(String name, String type, int age) {
//		调用父类的无参构造
		super();
		this.name = name;
		this.type = type;
		this.age = age;
	}

//	子类自己的方法
	public void play() {	
		int num = 0;
//		调用父类的方法
		super.drink();
		super.sleep();
		System.out.println("需要被溜 ");
	}
	
	public void eat() {
		System.out.println("狗粮真香");
	}
	/*
	 * private int height; private int weight;
	 * 
	 * public int getWeight() { return weight; }
	 * 
	 * public void setWeight(int weight) { this.weight = weight; }
	 * 
	 * public int getHeight() { return height; }
	 * 
	 * public void setHeight(int height) { this.height = height; }
	 * 
	 * public void eat() { System.out.println("吃好"); }
	 * 
	 * public void drink() { System.out.println("喝好"); }
	 * 
	 * public void sleep() { System.out.println("睡个好觉"); }
	 */

}
