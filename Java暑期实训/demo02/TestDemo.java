package edu.yz.demo02;

import edu.yz.demo02.Animal;
import edu.yz.demo02.Dog;

public class TestDemo {
	
	public static void main(String[] args) {
//		����Animal����
		Animal a = new Animal();
		System.out.println(a.getWeight());//100
		System.out.println(a.getHeight());//40
		a.setHeight(100);
		a.setWeight(20);
		a.eat();
		a.drink();
		System.out.println(a.getHeight());//100
		System.out.println(a.getWeight());//20
		
//		����Dog����
		Dog d = new Dog();
		d.setWeight(40);
		d.setHeight(100);
		d.drink();
//		���õ�eat������Dog��д��eat���Ḳ�ǵ�����ķ���
		d.eat();
		System.out.println(d.getHeight());
		System.out.println(d.getWeight());
//		���췽������
		Dog ha = new Dog("���","��ʿ��",5);
		System.out.println(ha.getHeight());//
		System.out.println(ha.getWeight());//
		
	}
}
