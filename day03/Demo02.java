package cn.yd.corejava.day03;
/***
 * �����������������͵���ϰ
 * @author GuoJK
 *
 */
public class Demo02 {
	public static void main(String[] args) {
		/*��������int����a������ֵΪ5
		���������ͱ���b����ֵΪa
		��������int����c������ֵΪb
		����������long����d������ֵΪ100��
		��������int����e������ֵΪd�����e��ֵ
		��������float���ͱ���f������ֵΪ56.987
		��������int����g������ֵΪf�����g��ֵ
		����byte���ͱ���b1��b2���ֱ�ֵΪ5��6��
		����byte���ͱ���b3������ֵΪb1+b2*/
		int a = 5;
		long b = a;//������b��һ����Ĳ����ӣ�a��һ�����С�Ĳ�����
		//int c = b;//������Ͳ���СС������ת��
		//��д��100E��ʱ�򣬱�����Ĭ������һ��int���洢���100E��
		//�ٽ����int��ֵ��ǰ��ı�����
		//���������L����Сдl���������Ͳ���int������100E
		long d = 10000000000L;
		int e = (int)d;//ǿ��ת��,��������ݶ�ʧ������λҲ�޷��ܺõĿ���
		System.out.println(e);
		//������˵��f���ܴ洢56.987��ֻ��˵double��������Ӳ��ܷŵ�float���С������
		float f = 56.987f;//Type mismatch: cannot convert from double to float
		
		int g = (int)f;//Type mismatch: cannot convert from float to int
		System.out.print(g);
		
		byte b1 = 5;
		byte b2 = 6;
		//Type mismatch: cannot convert from int to byte
		//int short���͵ı������������ʱ�����Զ�ת����int���ٽ��еļ���
		byte b3 = (byte)(b1+b2);
		
	}
}
