package cn.yd.corejava.day15;

public class Test01 {
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.print(s1.age);//���ܵ������˽�г�Ա
		System.out.print(s1.name);//Test01  ��Student��ͬһ������,���Կ��Է���protected���ε�����
		s1.study();//���ܵ������˽�г�Ա
		
		
		s1.getAge();
		s1.setAge(18);
	}
}
