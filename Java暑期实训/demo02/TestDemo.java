package edu.yz.demo02;

import edu.yz.demo02.Animal;
import edu.yz.demo02.Dog;

public class TestDemo {
	
	public static void main(String[] args) {
//		创建Animal对象
		Animal a = new Animal();
		System.out.println(a.getWeight());//100
		System.out.println(a.getHeight());//40
		a.setHeight(100);
		a.setWeight(20);
		a.eat();
		a.drink();
		System.out.println(a.getHeight());//100
		System.out.println(a.getWeight());//20
		
//		创建Dog对象
		Dog d = new Dog();
		d.setWeight(40);
		d.setHeight(100);
		d.drink();
//		调用的eat方法是Dog重写的eat，会覆盖掉父类的方法
		d.eat();
		System.out.println(d.getHeight());
		System.out.println(d.getWeight());
//		构造方法调用
		Dog ha = new Dog("多多","哈士奇",5);
		System.out.println(ha.getHeight());//
		System.out.println(ha.getWeight());//
		
	}
}
