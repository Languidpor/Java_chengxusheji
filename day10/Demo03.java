package cn.yd.corejava.day10;

import java.util.Arrays;

/***
 * ����ĸ��ƺ�����
 * @author GuoJK
 *
 */
public class Demo03 {
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = new int[10];
		//������1�е�Ԫ�ظ��Ƶ�����2��
		System.arraycopy(arr1, 0, arr2, 0, 5);
		
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
		
		
		System.out.println("~~~~~~~~");
		//��ȡǰ�ĸ�--����
		int[] arr3 = Arrays.copyOf(arr1, 4);
		//���ݣ����ݵ�λ�ò�Ĭ��ֵ
		int[] arr4 = Arrays.copyOf(arr1, 6);
		
	}
}
