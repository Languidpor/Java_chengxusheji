package cn.yd.corejava.day15;

public class Student {
	private int age;
	private boolean sex;
	protected String name;
	private void study() {
		this.age++;//���ñ����private���ԣ�����
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
	
	//Boolean���͵�sex��get����������isSex  Ҳ������getSex
	
	
}
