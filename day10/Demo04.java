package cn.yd.corejava.day10;

import java.util.Arrays;

/**
 * ð������
 * @author GuoJK
 *
 */
public class Demo04 {
		public static void main(String[] args) {
			int[] scores = new int[10];			
			for(int i=0;i<scores.length;i++) {
				scores[i] = (int)(Math.random()*51+50);
			}
			//����֮ǰ���һ��
			System.out.println(Arrays.toString(scores));
			//���ѭ�������ã���һ�Σ��ҳ����ֵ��ð�����
			//�ڶ��飬�ҳ�ʣ�µ����ֵ��ð�����
			//...
			for(int i=0;i<scores.length-1;i++) {
				//�ڲ�ѭ�������������Ƚϣ��������߲�����
				for(int j=0;j<scores.length-i-1;j++) {
					
					if(scores[j]>scores[j+1]) {
						int temp = scores[j];
						scores[j] = scores[j+1];
						scores[j+1] = temp;
						
					}
				}
				
			}
			
			
			
			
			
			
			//����֮�����һ��
			System.out.println(Arrays.toString(scores));
		}
}
