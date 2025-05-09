package cn.yd.corejava.day05;
/**
 * 逻辑运算符
 * @author GuoJK
 *
 */
public class Demo01 {
	public static void main(String[] args) {
		boolean b1 = 100>200;//false
		boolean b2 = 60%50<=5;//false
		boolean b3 = b1&&b2;//false
		boolean b4 = 100/20<=6;//true
		
		int i =5;
		boolean b5 = i++>=6;//fasle i=6后++,先运算(运算i>=6)，再++
		boolean b6 = b4||b5;//true
		
		boolean b7 = false;
		boolean b8 = !b7;//true
		
		boolean b9 = 5<4;//false
		int j=3;
		boolean b10 = b9&&j-->=3;//false  j=2
		
		int z=10;
		boolean b11 = --z>=9;//先--，再运算 z=9 true
		boolean b12 = b11||--z<=8;//true z=8
		
		System.out.println("b10:"+b10);
		System.out.println("j:"+j);
		System.out.println("b11:"+b11);
		System.out.println("b12:"+b12);
		System.out.println("z:"+z);
	
	}
}
