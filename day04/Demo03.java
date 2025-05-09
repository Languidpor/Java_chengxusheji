package cn.yd.corejava.day04;
/**
 * System.currentTimeMillis()
 * @author GuoJK
 *
 */
public class Demo03 {
	public static void main(String[] args) {
		long l1 = System.currentTimeMillis();
		System.out.println(l1);
		
		//¡£¡£¡£...
		
		for(int i =0;i<5000000000L;i++) {}
		
		long l2 = System.currentTimeMillis();
		System.out.println(l2);
		
		System.out.println(l2-l1);
	}
}
