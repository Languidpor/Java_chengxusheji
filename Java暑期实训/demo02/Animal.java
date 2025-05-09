package edu.yz.demo02;

/**
 * 动物类
 * @author tarena
 *
 */
public class Animal {
	
	private int weight;
	private int height;
	
	public Animal() {
//		表示调用当前对象的Animal(int weight, int height)
		this(100,40);
	}
	
	public Animal(int weight, int height) {
		this.weight = weight;
		this.height = height;
	}
	
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void eat() {
		System.out.println("吃好");
	}
	
	public void drink() {
		System.out.println("喝好");
	}

	public void sleep() {
		System.out.println("睡个好觉");
	}
}
