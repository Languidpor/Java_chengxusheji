package cn.yd.corejava.day05;
import java.util.Scanner;
/**
 * 1������Scanner�ӿ���̨����û�����������գ����ֱ���������
         ע������������淶
 * @author GuoJK
 */
public class HomeWork1 {
	public static void main(String[] args) {
		//��������ʼ��Scanner���͵ı���sc������������͵ı�����������
		//����û��ڿ���̨���������
		Scanner sc = new Scanner(System.in);
		System.out.println("���������");
		int year = sc.nextInt();
		
		System.out.println("�������·�");
		int month = sc.nextInt();
		
		System.out.println("��������");
		int day = sc.nextInt();
		
		//�ַ����ͱ��� ��һ��+���ӵ�ʱ�򣬽����ַ���ƴ�ӣ��������һ���ַ���
		System.out.println("�����:"+year);
		System.out.println(month);
		System.out.println(day);
	}
}
