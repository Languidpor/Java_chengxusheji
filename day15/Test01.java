package cn.yd.corejava.day15;

public class Test01 {
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.print(s1.age);//不能调用类的私有成员
		System.out.print(s1.name);//Test01  和Student在同一个包中,所以可以访问protected修饰的内容
		s1.study();//不能调用类的私有成员
		
		
		s1.getAge();
		s1.setAge(18);
	}
}
