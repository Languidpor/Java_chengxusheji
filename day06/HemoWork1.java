package cn.yd.corejava.day06;

import java.util.Scanner;

/**
 * 1���û�����һ����ݣ������ж��ǲ������꣬
 *        һ��������������������֮һ����������
     ����1�����Ա�400����
     ����2�����Ա�4������ͬʱ���ܱ�100����
 * @author GuoJK
 *
 */
public class HemoWork1 {
	public static void main(String[] args) {
		//��ʾ�û����룬���ó����ã�Ȼ��洢��һ��������
		int year;
		System.out.println("������һ�����");
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();
		//��������boolean�ı������ֱ��ʾ����1������2�Ƿ�����
		boolean isYear1 = year%400==0;
		boolean isYear2 = year%4==0 && year%100!=0;
		//boolean isYear = isYear1 || isYear2;
		//System.out.print(isYear);
		String str = (isYear1 || isYear2)?"������":"��������";
	}
}





