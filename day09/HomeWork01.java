package cn.yd.corejava.day09;

import java.util.Scanner;

/**
 * ��������Ϸ
�����������һ��1~~1000֮���������������û�ȥ�£�һ����10�βµĻ��ᣬ
ÿһ�β�֮�󣬳��������ʾ����С�˻��ǲ´��ˣ��¶��˻���10�λ��������ˣ�
��Ϸ������������Ӧ����ʾ��
 * @author GuoJK
 *
 */
public class HomeWork01 {
	public static void main(String[] args) {
		//�����
		double d = Math.random();//���С��  0~1֮�䣬����0��������1  [0,1)
		//Math.random()*1000;���С����0~1000֮�� [0,1000)
		//(int)(Math.random()*1000)���������0~1000��[0,1000)
		/**
		 * ����õ�56~78֮����������
		 * (int)(Math.random()*22)+56
		 */
		//�������һ��[1,1000]�������
		int num = (int)(Math.random()*1000)+1;
		//�û�ȥ��
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<10;i++) {			
			/**
			 * ���������һ�仰����� 
			 * �û��ڿ���̨����һ�����������������
			 * �����жϣ���������ʾ
			 * �������ȷ�ˣ��ͽ���ѭ��
			 */
			System.out.println("���һ������"+"��"+(i+1)+"��");
			int userNum = sc.nextInt();
			if(userNum>num) {
				System.out.println("�´���");
			}else if(userNum<num) {
				System.out.println("������");
			}else {
				System.out.println("��ϲ�����¶���");
				break;
			}
		}
		
	}
}








