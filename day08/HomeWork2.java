package cn.yd.corejava.day08;
/***
 * �žų˷���
 * @author GuoJK
 *
 */
public class HomeWork2 {
	public static void main(String[] args) {
		//���ѭ����ѭ��9�Σ����ڿ�����
		for(int i=1;i<=9;i++) {
			//�ڲ�ѭ����ѭ���Ĵ������ݵ�ǰ�ǵڶ�������ȷ�������ڿ��Ƶ�ǰ�о�������
			for(int j=1;j<=i;j++) {
				System.out.print(j+"*"+i+"="+(i*j)+"\t");
			}
			System.out.println();
		}
		
	}
}
 