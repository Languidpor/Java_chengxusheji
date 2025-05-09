package cn.yd.corejava.day10;

import java.util.Arrays;

/***
 * 数组的复制和扩容
 * @author GuoJK
 *
 */
public class Demo03 {
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = new int[10];
		//将数组1中的元素复制到数组2中
		System.arraycopy(arr1, 0, arr2, 0, 5);
		
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
		
		
		System.out.println("~~~~~~~~");
		//截取前四个--缩容
		int[] arr3 = Arrays.copyOf(arr1, 4);
		//扩容，扩容的位置补默认值
		int[] arr4 = Arrays.copyOf(arr1, 6);
		
	}
}
