package cn.yd.corejava.day05;
import java.util.Scanner;
/**
 * Ҫ���û��ӿ���̨������Ʒ�����������ۡ��û�����Ǯ�Ľ�����ͨ������
     �õ�����Ʒ�ܼ��Ƕ��٣�������١�
    ע�⣺�����������淶�����������ͣ��᲻�ᾫ�ȶ�ʧ��
 * @author GuoJK
 *
 */
public class Hemowork2 {
	public static void main(String[] args) {
		/**1��������Scanner���͵ı���
		 * 2�����λ���û�����ĸ�������
		 * 3������
		 * 4���������� 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ʒ�ĸ���");
		int num = sc.nextInt();
		
		System.out.println("��������Ʒ�ĵ���");
		double price = sc.nextDouble();
		
		System.out.println("�������û����Ľ��");
		double userMoney = sc.nextDouble();
		//������ܼ�
		double totalMoney = num * price;
		//���������
		double exchangeMoney = userMoney - totalMoney;
		
		System.out.println("�ܼۣ�"+totalMoney);
		System.out.println("���㣺"+exchangeMoney);
	}
}
