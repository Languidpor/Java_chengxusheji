package cn.yd.corejava.day10;
/***
 * ����Ķ���
 * @author GuoJK
 *
 */
public class Demo01 {
	public static void main(String[] args) {
		//��������[] arr = new ��������[��С]
		//�������� arr[] = new ��������[��С]
		
		//�����������û�г�ʼ��
		int[] arr;
 		
		//1������������ͳ�ʼ��  
		double[] scores = new double[100];
		double socres1[] = new double[100];
		
		//2������������ͳ�ʼ��
		//����Ҫnew�ؼ��֣�����Ҫ��������[��С],ֻ��Ҫһ��{}�������ֵ
		//���������Զ��ĸ���ֵ�ĸ����������ڴ��С
		int[] arr1 = {10,12,30,405,60};
		
		//3������������ͳ�ʼ��������������֮�����õķ�ʽ������Ҫָ��
		//���ȣ�����ĳ��Ȼ��Զ�����{}����ĸ���ȷ��
		int[] arr2;
		arr2 = new int[]{10,12,30,405,60};
		
		System.out.println(arr2[arr2.length-1]);
	}
}
