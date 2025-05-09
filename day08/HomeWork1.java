package cn.yd.corejava.day08;
//1、计算多项式的前50项的和值   1/4+1/8+1/12+1/16+..... ....
public class HomeWork1 {
	public static void main(String[] args) {
		//初始条件;循环条件;修正语句
		//初始条件：定义一个变量i=1,表示第多少多少次循环，也就是循环数
		           //还需要定义一个变量sum=0.0，表示每一次循环体，拿到的那个数加进去的和值
		//循环条件：i<=50
		//修正语句:i++
		double sum = 0.0;
		for(int i=1;i<=50;i++) {
			//分子都是1
			//分母是i*4
			double item = 1.0/(i*4);
			sum+=item;
		}
		System.out.println(sum);
	
	}
}
