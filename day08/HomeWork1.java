package cn.yd.corejava.day08;
//1���������ʽ��ǰ50��ĺ�ֵ   1/4+1/8+1/12+1/16+..... ....
public class HomeWork1 {
	public static void main(String[] args) {
		//��ʼ����;ѭ������;�������
		//��ʼ����������һ������i=1,��ʾ�ڶ��ٶ��ٴ�ѭ����Ҳ����ѭ����
		           //����Ҫ����һ������sum=0.0����ʾÿһ��ѭ���壬�õ����Ǹ����ӽ�ȥ�ĺ�ֵ
		//ѭ��������i<=50
		//�������:i++
		double sum = 0.0;
		for(int i=1;i<=50;i++) {
			//���Ӷ���1
			//��ĸ��i*4
			double item = 1.0/(i*4);
			sum+=item;
		}
		System.out.println(sum);
	
	}
}
