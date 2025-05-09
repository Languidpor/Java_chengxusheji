package cn.yd.corejava.day10;

import java.util.Arrays;

/**
 * 冒泡排序
 * @author GuoJK
 *
 */
public class Demo04 {
		public static void main(String[] args) {
			int[] scores = new int[10];			
			for(int i=0;i<scores.length;i++) {
				scores[i] = (int)(Math.random()*51+50);
			}
			//排序之前输出一下
			System.out.println(Arrays.toString(scores));
			//外层循环的作用，第一次：找出最大值，冒到最后
			//第二遍，找出剩下的最大值，冒到最后
			//...
			for(int i=0;i<scores.length-1;i++) {
				//内层循环，相邻俩数比较，交换或者不交换
				for(int j=0;j<scores.length-i-1;j++) {
					
					if(scores[j]>scores[j+1]) {
						int temp = scores[j];
						scores[j] = scores[j+1];
						scores[j+1] = temp;
						
					}
				}
				
			}
			
			
			
			
			
			
			//排序之后输出一下
			System.out.println(Arrays.toString(scores));
		}
}
