package cn.yd.corejava.day16;

public abstract class Animal {
	private int age;
	//�����ྐྵȻ�����й���
	public Animal() {}
	
	public Animal(int age) {
		this.age=age;
	}
	/**�ƶ�*/
	public abstract void move();
	
	/**��*/
	public void eat() {
		//�������
	}	
}

class Dog extends Animal{
	public void move() {
		//����������
	}
}

class Human extends Animal{	
	public void move() {
		//����������		
	}
	
}



