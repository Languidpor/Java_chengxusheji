package edu.yz.demo02;

public class Dog extends Animal{
	
//	�����Լ�������
	private String name;
	private String type;
	private int age;
	
	public Dog() {
	}
	
	public Dog(String name, String type, int age) {
//		���ø�����޲ι���
		super();
		this.name = name;
		this.type = type;
		this.age = age;
	}

//	�����Լ��ķ���
	public void play() {	
		int num = 0;
//		���ø���ķ���
		super.drink();
		super.sleep();
		System.out.println("��Ҫ���� ");
	}
	
	public void eat() {
		System.out.println("��������");
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
	 * public void eat() { System.out.println("�Ժ�"); }
	 * 
	 * public void drink() { System.out.println("�Ⱥ�"); }
	 * 
	 * public void sleep() { System.out.println("˯���þ�"); }
	 */

}
