package cn.yd.corejava.day07;
/**
 * ѭ�������﷨
 * @author GuoJK
 *
 */
public class Demo01 {
	public static void main(String[] args) {
		/**
		 * ��һ��ѭ����i=0, i<5���㣬ִ��ִ���壬i++����һ��ѭ��֮��i=1
		 * �ڶ���ѭ����i=1��i<5���㣬ִ��ִ���壬i++���ڶ���ѭ��֮��i=2
		 * ������ѭ����i=2��i<5���㣬ִ��ִ���壬i++��������ѭ��֮��i=3
		 * ���ı�ѭ����i=3��i<5���㣬ִ��ִ���壬i++�����ı�ѭ��֮��i=4
		 * �����ѭ����i=4��i<5���㣬ִ��ִ���壬i++�������ѭ��֮��i=5
		 * ������ѭ����i=5��i<5�����㣬ѭ������
		 */
//		for(int i=0;i<5;i++) {
//			System.out.println(i);			
//		}
		int a=1;
		int b=2;
		
		while(a>b) {
			System.out.println("aaa");
		}
		
		// ����ѭ�������������do����ִ��һ��
		do {
			System.out.println("aaa");
		}while(a>b);
		
	}
}
