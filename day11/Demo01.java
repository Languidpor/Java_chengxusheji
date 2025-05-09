package cn.yd.corejava.day11;

import java.util.Arrays;

/**
 * 方法
 * //案例，模拟购买彩票，购买多少次可以中 18 10 14 27 33 23 + 15
 * @author GuoJK
 *
 */
public class Demo01 {
	public static void main(String[] args) {	
		/**
		 * 用死循环去购买
		 * 每一次循环做什么：
		 * 买一注，然后比较，如果中了，就停止循环，
		 */
		int i = 1;
		int[] firstPrize = {10,14,18,23,27,33,15};
		while(true) {
			
			int[] myRedBall = getRed();
			int myBlueBall = getBlue();
			System.out.println("第"+i+++"次购买："+Arrays.toString(myRedBall)+"+["+myBlueBall+"]");
			//比较
			boolean flag = compare(myRedBall, myBlueBall, firstPrize);
			if(flag) {
				System.out.print("恭喜你中一等奖了");
				break;
			}
		}
	}
	//1：访问控制修饰符(public private 不写 protected)；
	//2: static静态，在学习面向对象之前，必须写，至于为什么现在不需要知道
	//3：返回值类型
	//4：方法的名称，规范等同于变量的规范，小写，见名知意，驼峰命名法
	//5:()参数列表，如果有参数，说明调用这个方法的时候需要传参
	//6:retrun 返回数据
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
	
	//比较，一组红球及一个蓝球 和 开奖的信息比较
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
