package cn.yd.corejava.day13;
/**重载演示*/
public class Test02 {
	public static void main(String[] args) {
		int a=1;
		String str = "123";
		int[] arr1 = {1,2,3,4};
		char[] arr2 = {'a','b','c','d'};
		String[] arr3 = {"123","abc","!@#"};
		//方法名都叫做println，但是传的参数不同就调用了不同的重载的方法
		//也就是说，System是一个类，out是这个类的一个属性
		//out的一个引用类型的变量，在这个引用类型中，又println的重载现象
		System.out.println(a);//1
		System.out.println(str);//123
		System.out.println(arr1);
		System.out.println(arr2);
		System.out.println(arr3);
		
		
		
	}
}
