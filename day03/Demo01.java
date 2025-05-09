package cn.yd.corejava.day03;

public class Demo01 {
	//main方法(函数)，是java程序的入口，固定的语法结构
	public static void main(String[] args) {
		//声明一个变量，不进行初始化
		int age;//int整型
		//声明一个变量，声明的同时进行初始化
		//程序中的=，要理解为赋值，不是等于的意思
		String name = "郭德纲";//字符串类型
		//驼峰命名法
		//double studentScore = 95.5;
		
		//变量的访问(就是程序去"读"或者"写"这个变量)
		age = 18;//声明之后，第一次使用之前，进行初始化
		System.out.println(age);//没有初始化的变量去访问，是没有意义的。
		System.out.println(name);
		
		//变量的存取需要满足其类型
		//age = "19";
		//name = 1234.12;
	}
}
