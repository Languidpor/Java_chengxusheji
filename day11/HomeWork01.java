package cn.yd.corejava.day11;

import java.util.Arrays;

/**
 * ˫ɫ����6�������һ���������,������
	6������1~33֮�䲻�ظ�����
	1������1~16֮���һ����
 * @author GuoJK
 *
 */
public class HomeWork01 {
	public static void main(String[] args) {
		//�����洢���� Ȼ�󵥶���������
		int[] money = new int[6];
		//(int)(Math.random()*33+1);
		for(int i=0;i<money.length;i++) {
			money[i] = (int)(Math.random()*33+1);
			//�����˵�ǰ�ĺ���֮��Ҫ���Ѿ���������ÿһ���������Ƚ�
			//�������ͬ�ģ�������������ɵģ���������
			//���û����ͬ�ģ���ɶ�����ɣ�Ҳ���Ǽ���������һ��
			for(int j=0;j<i;j++) {
				if(money[i]==money[j]) {i--;break;}
			}
		}
		//����
		Arrays.sort(money);
		
		
		
		int blueBall = (int)(Math.random()*16+1);
		
		System.out.println(Arrays.toString(money)+"+["+blueBall+"]");
		
		
		
		
		
	}
}
