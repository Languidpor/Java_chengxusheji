package cn.yd.corejava.day09;
/**
 * ���һ������ǡ���������е����ӵĺ�ֵ�����������������
    ����6=1+2=3��Ҫ���ҳ�1000���ڵ���������
 
 */
public class HomeWork03 {
	public static void main(String[] args) {
		//��ѭ������1������1000
		for(int i=1;i<=1000;i++) {
			//���ڵ�ǰ��i,��i��1~(i-1)���е����������̣�
			//ֻҪ��Ϊ0�����������ӣ�����Щ���Ӽӵ�һ����ֵ����ȥ��
			//���������ֵ����i��˵��i��һ������
			int sum = 0;
			for(int j=1;j<i;j++) {
				if(i%j==0) {sum+=j;}
			}
			if(i==sum) {System.out.println(i);}
		}
	}
}
