package cn.yd.corejava.day12;

public class Student {
	double height;//身高
	int age;
	int id;
	String name;
	
	
	
//	//无参的构造方法
//	public Student() {
//		this.height = 1.80;
//		this.age = 20;
//		this.name = "王富贵";
//	}
	//有参的构造方法
	public Student(double height, int age, int id, String name) {
		this.height = height;
		this.age = age;
		this.id = id;
		this.name = name;
	}
//	//有参的构造方法,每次创建的对象，身高和姓名是制定，age和id都是相同
//	public Student(String name,double height) {
//		this.height = height;
//		this.age = 20;
//		this.id = 3;
//		this.name = name;
//	}
	
}
