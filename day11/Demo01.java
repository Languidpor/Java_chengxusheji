package cn.yd.corejava.day11;

import java.util.Arrays;

/**
 * ����
 * //������ģ�⹺���Ʊ��������ٴο����� 18 10 14 27 33 23 + 15
 * @author GuoJK
 *
 */
public class Demo01 {
	public static void main(String[] args) {	
		/**
		 * ����ѭ��ȥ����
		 * ÿһ��ѭ����ʲô��
		 * ��һע��Ȼ��Ƚϣ�������ˣ���ֹͣѭ����
		 */
		int i = 1;
		int[] firstPrize = {10,14,18,23,27,33,15};
		while(true) {
			
			int[] myRedBall = getRed();
			int myBlueBall = getBlue();
			System.out.println("��"+i+++"�ι���"+Arrays.toString(myRedBall)+"+["+myBlueBall+"]");
			//�Ƚ�
			boolean flag = compare(myRedBall, myBlueBall, firstPrize);
			if(flag) {
				System.out.print("��ϲ����һ�Ƚ���");
				break;
			}
		}
	}
	//1�����ʿ������η�(public private ��д protected)��
	//2: static��̬����ѧϰ�������֮ǰ������д������Ϊʲô���ڲ���Ҫ֪��
	//3������ֵ����
	//4�����������ƣ��淶��ͬ�ڱ����Ĺ淶��Сд������֪�⣬�շ�������
	//5:()�����б�����в�����˵���������������ʱ����Ҫ����
	//6:retrun ��������
	public static int[] getRed() {	
		int[] arr = new int[6];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*33+1);
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {i--;break;}
			}
		}
		Arrays.sort(arr);
		return arr;
	}
	
	
	public static int getBlue() {
		return (int)(Math.random()*16+1);
	}
	
	//�Ƚϣ�һ�����һ������ �� ��������Ϣ�Ƚ�
	public static boolean compare(int[] redBall,int blueBall,int[] firstPrize) {
		
		boolean flag1 = redBall[0]==firstPrize[0];
		boolean flag2 = redBall[1]==firstPrize[1];
		boolean flag3 = redBall[2]==firstPrize[2];
		boolean flag4 = redBall[3]==firstPrize[3];
		boolean flag5 = redBall[4]==firstPrize[4];
		boolean flag6 = redBall[5]==firstPrize[5];
		boolean flag7 = blueBall==firstPrize[6];
		
		return flag1&&flag2&&flag3&&flag4&&flag5&&flag6&&flag7;
	}
	
	
}
