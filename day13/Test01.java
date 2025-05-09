package cn.yd.corejava.day13;

public class Test01 {
	public static void main(String[] args) {
		Book book;//定义了一个引用类型的变量，book，这个变量存在了栈中
		//对应图1
		
		book = new Book();//创建了一个对象，将这个对象的内存地址赋值
						//给了book这个引用类型的变量，于是就可以通过
						//这个变量来操作对象了
		//对应图2
		
		book.name = "诛仙";//通过引用变量，找到刚才的对象，访问其name属性
						//并进行了赋值
		//对应图3
		
		book = new Book();//又创建了一个新的对象(存在堆中)，将这个对象的地址赋值给了
						//book这个引用。
		//对应图4
		
		book.name = "鬼吹灯";//通过book这个引用，找到新创建的对象，访问其name属性并赋值
		//对应图5
		
		
	}
}
