package cn.yd.corejava.day10;
/***
 * 案例，声明和初始化一个50长度的数组，
 * 然后随机的给50个分数，(50~100)
 * 再输出着50个分数
 * 循环：通过数组的下标去给数组的每一个元素赋值，
 */
public class Demo02 {
	public static void main(String[] args) {
		int[] scores = new int[50];
		//通过循环遍历到每一个元素，依次赋值
		for(int i=0;i<scores.length;i++) {
			scores[i] = (int)(Math.random()*51+50);
		}
		
		for(int i=0;i<scores.length;i++) {
			System.out.print(scores[i]+" ");
		}
		
	}
}
