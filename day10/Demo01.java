package cn.yd.corejava.day10;
/***
 * 数组的定义
 * @author GuoJK
 *
 */
public class Demo01 {
	public static void main(String[] args) {
		//数组类型[] arr = new 数组类型[大小]
		//数组类型 arr[] = new 数组类型[大小]
		
		//数组的声明，没有初始化
		int[] arr;
 		
		//1、数组的声明和初始化  
		double[] scores = new double[100];
		double socres1[] = new double[100];
		
		//2、数组的声明和初始化
		//不需要new关键字，不需要数组类型[大小],只需要一对{}，里面给值
		//编译器会自动的根据值的个数来申请内存大小
		int[] arr1 = {10,12,30,405,60};
		
		//3、数组的声明和初始化，声明了数组之后，适用的方式，不需要指定
		//长度，数组的长度会自动根据{}里面的个数确定
		int[] arr2;
		arr2 = new int[]{10,12,30,405,60};
		
		System.out.println(arr2[arr2.length-1]);
	}
}
