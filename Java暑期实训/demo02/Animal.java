package edu.yz.demo02;

/**
 * ������
 * @author tarena
 *
 */
public class Animal {
	
	private int weight;
	private int height;
	
	public Animal() {
//		��ʾ���õ�ǰ�����Animal(int weight, int height)
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
		System.out.println("�Ժ�");
	}
	
	public void drink() {
		System.out.println("�Ⱥ�");
	}

	public void sleep() {
		System.out.println("˯���þ�");
	}
}
