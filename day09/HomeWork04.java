package cn.yd.corejava.day09;
/**
 * 
 *  
    *  4个空格，1个星
   **  3个空格，2个星
  ***  2个空格，3个星
 ****  1个空格，4个星  
*****  0个空格，5个星
 
  

 **** 1个空格，4个星
  *** 2个空格，3个星
   ** 3个空格，2个星
    * 4个空格，1个星
    

 * @author GuoJK
 *
 */
public class HomeWork04 {
	public static void main(String[] args) {
//	     *  4个空格，1个星
//	    **  3个空格，2个星
//	   ***  2个空格，3个星
//	  ****  1个空格，4个星  
//	 *****  0个空格，5个星
		for(int i=1;i<=5;i++) {
			//先打印出每一行的空格，打印完之后不换行
			//当i=1时，此for执行4次，当i=2时，此for执行3次...
			for(int j=1;j<=5-i;j++) {
				System.out.print(" ");
			}
			//再打印出每一行的*，打印完毕之后要换行
			//当i=1时，次for执行1次，当i=2时，此for执行2次...
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
//		 **** 1个空格，4个星
//		  *** 2个空格，3个星
//		   ** 3个空格，2个星
//		    * 4个空格，1个星
		for(int i=1;i<=4;i++) {
			//先输出每一行的若干个空格，不换行
			//当i=1时，此for执行1遍，当i=2时，此for执行2遍
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			//再输出每一行的若干个星，输出所有的星之后，换行
			//当i=1，此for执行4遍，当i=2时，此for执行3次... ... 
			for(int j=1;j<=5-i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}
