package cn.yd.corejava.day12;

public class Student {
	double height;//���
	int age;
	int id;
	String name;
	
	
	
//	//�޲εĹ��췽��
//	public Student() {
//		this.height = 1.80;
//		this.age = 20;
//		this.name = "������";
//	}
	//�вεĹ��췽��
	public Student(double height, int age, int id, String name) {
		this.height = height;
		this.age = age;
		this.id = id;
		this.name = name;
	}
//	//�вεĹ��췽��,ÿ�δ����Ķ�����ߺ��������ƶ���age��id������ͬ
//	public Student(String name,double height) {
//		this.height = height;
//		this.age = 20;
//		this.id = 3;
//		this.name = name;
//	}
	
}
