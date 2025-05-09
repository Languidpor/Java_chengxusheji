package cn.yd.corejava.day07;
/***
 * break和continue
 * @author GuoJK
 *
 */
public class Demo02 {
	public static void main(String[] args) {
		
		for(int i=0;i<10;i++) {	
			if(i==5) {continue;}
			//输出当前是第几次循环，也输出当前i的值
			System.out.println("第"+(i+1)+"次循环，此时i="+i);
//			if(i>7) {
//				break;
//			}
			
			
		}
		
		
		
	}
}
