package edu.yz.demo05;

/**
 * 	�̺߳��쳣����
 * @author tarena
 *
 */
public class ThreadDemo implements Runnable{

	public void run() {
//		��ӡ��ǰϵͳʱ��ĺ���ֵ��ͨ�����ڼ�������ִ��ʱ��
		System.out.println(System.currentTimeMillis());
//		���ݱ�����ʾ������޸�
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("�����̺߳��쳣");
		System.out.println(System.currentTimeMillis());
//		ѡ�п��ܳ��쳣�Ĵ��룬Ȼ��alt+shift+z��ѡ��try\catch����
		try {
			int i = 1/0;
		} catch (Exception e) {
			// �����쳣��ִ�д�ӡ�쳣��Ϣ
			e.printStackTrace();
		}
//		��ʱ���������ִ��
		System.out.println(System.currentTimeMillis());
	}
	
	public static void main(String[] args) {
//		��ThreadDemo�����װ��Thread����
		ThreadDemo td = new ThreadDemo();//������ֵ��һ�����ñ���
//		������������ķ�ʽ����һ������ֻҪʹ��һ�Σ�����Բ������ַ���
		Thread t = new Thread(new ThreadDemo());
		t.start();
	}

}
