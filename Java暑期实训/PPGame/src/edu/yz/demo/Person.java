package edu.yz.demo;

public class Person {
	
//	封装的思想：属性私有化
	private int id;
	private String name;
	private int height;
	private int weight;
	
//	封装的思想：提供一个对外公开的setter&getter方法，用于赋值和获取值
	public void setId(int id) {
//		将传入的id赋值给当前对象的成员变量id
		this.id  = id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getHeight() {
		return height;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getWeight() {
		return weight;
	}
	
//	无返回值类型、无参数列表
	public void eat() {
		name = "翠花";
		String food = "酸菜";
		System.out.println(name+"吃"+food);
	}	
	
//	规范的类的方法定义：有参数列表，参数类型为String
	public void eat(String food) {
		System.out.println(name+"吃"+food);
	}
//	有参数列表，并且参数类型为char
	public void eat(char food) {
		System.out.println(name+"吃"+food);
	}
//	有参数列表包含两个参数，类型分别为char\int
	public void eat(char food,int num) {
		System.out.println(name+"吃"+food);
	}
	
//	有返回值类型：此方法中必须要通过return关键字来返回对应类型的结果
	public int sleep(int hour) {
		return hour;
	}
	
	public int sleep(int hour,int minute) {
		return hour;
	}
	
	public int sleep(int hour,int minute,int second) {
		return hour;
	}
	
//	Object是Java的顶级父类，return的结果可以是任意类型，均为Object的子类
	public Object sleep(String hour) {
		return hour;
	}
}
