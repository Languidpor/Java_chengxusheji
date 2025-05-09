package cn.yd.corejava.day15;

public class Student {
	private int age;
	private boolean sex;
	protected String name;
	private void study() {
		this.age++;//调用本类的private属性，可以
	}
	public void m1(final int x) {
		final int y;
		
		//x=2;
		y=1;
		y=2;
		
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	//Boolean类型的sex的get方法可以是isSex  也可以是getSex
	
	
}
