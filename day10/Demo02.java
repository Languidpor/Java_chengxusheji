package cn.yd.corejava.day10;
/***
 * �����������ͳ�ʼ��һ��50���ȵ����飬
 * Ȼ������ĸ�50��������(50~100)
 * �������50������
 * ѭ����ͨ��������±�ȥ�������ÿһ��Ԫ�ظ�ֵ��
 */
public class Demo02 {
	public static void main(String[] args) {
		int[] scores = new int[50];
		//ͨ��ѭ��������ÿһ��Ԫ�أ����θ�ֵ
		for(int i=0;i<scores.length;i++) {
			scores[i] = (int)(Math.random()*51+50);
		}
		
		for(int i=0;i<scores.length;i++) {
			System.out.print(scores[i]+" ");
		}
		
	}
}
