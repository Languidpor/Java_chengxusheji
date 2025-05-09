package cn.yd.corejava.day09;

import java.util.Scanner;

/**
 * 猜数字游戏
程序随机产生一个1~~1000之间的随机整数，让用户去猜，一共有10次猜的机会，
每一次猜之后，程序给出提示，猜小了还是猜大了，猜对了或者10次机会用完了，
游戏结束，给出相应的提示。
 * @author GuoJK
 *
 */
public class HomeWork01 {
	public static void main(String[] args) {
		//随机数
		double d = Math.random();//随机小数  0~1之间，包括0，不包括1  [0,1)
		//Math.random()*1000;随机小数，0~1000之间 [0,1000)
		//(int)(Math.random()*1000)随机整数，0~1000，[0,1000)
		/**
		 * 例如得到56~78之间的随机整数
		 * (int)(Math.random()*22)+56
		 */
		//随机生成一个[1,1000]随机整数
		int num = (int)(Math.random()*1000)+1;
		//用户去猜
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<10;i++) {			
			/**
			 * 程序先输出一句话：请猜 
			 * 用户在控制台输入一个数，程序获得这个数
			 * 进行判断，并给出提示
			 * 如果猜正确了，就结束循环
			 */
			System.out.println("请猜一个数："+"第"+(i+1)+"次");
			int userNum = sc.nextInt();
			if(userNum>num) {
				System.out.println("猜大了");
			}else if(userNum<num) {
				System.out.println("猜下了");
			}else {
				System.out.println("恭喜！！猜对了");
				break;
			}
		}
		
	}
}








