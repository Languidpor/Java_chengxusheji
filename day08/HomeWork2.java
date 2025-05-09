package cn.yd.corejava.day08;
/***
 * 九九乘法表
 * @author GuoJK
 *
 */
public class HomeWork2 {
	public static void main(String[] args) {
		//外层循环，循环9次，用于控制行
		for(int i=1;i<=9;i++) {
			//内层循环，循环的次数根据当前是第多少行来确定，用于控制当前行具体的输出
			for(int j=1;j<=i;j++) {
				System.out.print(j+"*"+i+"="+(i*j)+"\t");
			}
			System.out.println();
		}
		
	}
}
 