package cn.yd.corejava.day15;
/**���͵�ǿת*/
public class Test02 {
	public static void main(String[] args) {
		Animal a1 = new Animal();//���������ָ����Ķ���
		Animal a2 = new Dog();//���������ָ������Ķ���
		Animal a3 = new Cat();//���������ָ������Ķ���
		
		Dog d = new Dog();//���������ָ������Ķ���
		Cat c = new Cat();//���������ָ������Ķ���
		
		Animal a4 = d;
		Animal a5 = c;
		
		Dog d1 = (Dog)a2;
		//Dog d2 = (Dog)a3;
		if(a3 instanceof Dog) {
			Dog d2 = (Dog)a3;
		}
		
		
		//�鿴һ��a2ָ��Ķ����ǲ���Dog���͵Ķ���
		System.out.println(a2 instanceof Dog);
		//�鿴һ��a3ָ��Ķ����ǲ���Dog���͵Ķ���
		System.out.println(a3 instanceof Dog);
	}
}


class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}