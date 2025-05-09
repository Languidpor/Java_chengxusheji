package cn.yd.corejava.day15;
/**类型的强转*/
public class Test02 {
	public static void main(String[] args) {
		Animal a1 = new Animal();//父类的引用指向父类的对象
		Animal a2 = new Dog();//父类的引用指向子类的对象
		Animal a3 = new Cat();//父类的引用指向子类的对象
		
		Dog d = new Dog();//子类的引用指向子类的对象
		Cat c = new Cat();//子类的引用指向子类的对象
		
		Animal a4 = d;
		Animal a5 = c;
		
		Dog d1 = (Dog)a2;
		//Dog d2 = (Dog)a3;
		if(a3 instanceof Dog) {
			Dog d2 = (Dog)a3;
		}
		
		
		//查看一下a2指向的对象是不是Dog类型的对象
		System.out.println(a2 instanceof Dog);
		//查看一下a3指向的对象是不是Dog类型的对象
		System.out.println(a3 instanceof Dog);
	}
}


class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}