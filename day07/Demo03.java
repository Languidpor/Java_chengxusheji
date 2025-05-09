package cn.yd.corejava.day07;
/***
 * 多重循环，嵌套循环
 * @author GuoJK
 *
 */
public class Demo03 {
	public static void main(String[] args) {
		//外层循环执行一次，内层执行若干次
		for(int i=0;i<5;i++) {
			//外层循环的执行体，又是一个循环
			for(int j=0;j<4;j++) {
				System.out.println(i+":"+j);
			}
		}
	}
}
