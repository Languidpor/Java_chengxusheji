package cn.yd.corejava.day14;
/**
 * 父类的引用指向子类的对象
 * @author GuoJK
 *
 */
public class Test01 {
	public static void main(String[] args) {
		//父类类型的引用变量
		Animal a1;
		//指向子类的对象
		a1 = new Human();
		
		a1.move();
	}
}
