package cn.yd.corejava.day09;
/**
 * 如果一个整数恰好是它所有的因子的和值，这个数叫做完数，
    例如6=1+2=3，要求找出1000以内的所有完数
 
 */
public class HomeWork03 {
	public static void main(String[] args) {
		//此循环，从1遍历到1000
		for(int i=1;i<=1000;i++) {
			//对于当前的i,让i对1~(i-1)所有的整数，求商，
			//只要商为0，就是其因子，将这些因子加到一个和值中中去。
			//最终这个和值等于i，说明i是一个完数
			int sum = 0;
			for(int j=1;j<i;j++) {
				if(i%j==0) {sum+=j;}
			}
			if(i==sum) {System.out.println(i);}
		}
	}
}
