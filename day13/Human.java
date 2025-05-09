package cn.yd.corejava.day13;
/**人类*/
public class Human {
	//属性
	int age;
	String sex;
	//构造
	public Human(int age,String sex) {
		this.age = age;
		this.sex = sex;
	}
	//方法,以下为重载
	/**喝水*/
	public void drink(Water water) {
		/////
		drink(new Wine());
	}		
	/**喝酒*/
	public void drink(Wine wine) {
		
		
	}
	
	
	
	
	
	
	
	
	
}
