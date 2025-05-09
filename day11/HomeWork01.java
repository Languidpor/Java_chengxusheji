package cn.yd.corejava.day11;

import java.util.Arrays;

/**
 * 双色球由6个红球和一个蓝球组成,并排序
	6个红球：1~33之间不重复的数
	1个篮球：1~16之间的一个数
 * @author GuoJK
 *
 */
public class HomeWork01 {
	public static void main(String[] args) {
		//用来存储红球， 然后单独生成蓝球
		int[] money = new int[6];
		//(int)(Math.random()*33+1);
		for(int i=0;i<money.length;i++) {
			money[i] = (int)(Math.random()*33+1);
			//生成了当前的红球之后，要和已经产生过的每一个红球作比较
			//如果有相同的，就舍弃这次生成的，重新生成
			//如果没有相同的，就啥都不干，也就是继续生成下一个
			for(int j=0;j<i;j++) {
				if(money[i]==money[j]) {i--;break;}
			}
		}
		//排序
		Arrays.sort(money);
		
		
		
		int blueBall = (int)(Math.random()*16+1);
		
		System.out.println(Arrays.toString(money)+"+["+blueBall+"]");
		
		
		
		
		
	}
}
