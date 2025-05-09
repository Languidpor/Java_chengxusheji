package cn.yd.corejava.day05;
import java.util.Scanner;
/**
 * 要求：用户从控制台输入商品的数量、单价、用户付的钱的金额，程序通过计算
     得到，商品总价是多少，找零多少。
    注意：变量的命名规范，变量的类型，会不会精度丢失。
 * @author GuoJK
 *
 */
public class Hemowork2 {
	public static void main(String[] args) {
		/**1、创建出Scanner类型的变量
		 * 2、依次获得用户输入的各个数据
		 * 3、计算
		 * 4、给出结论 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入商品的个数");
		int num = sc.nextInt();
		
		System.out.println("请输入商品的单价");
		double price = sc.nextDouble();
		
		System.out.println("请输入用户付的金额");
		double userMoney = sc.nextDouble();
		//计算出总价
		double totalMoney = num * price;
		//计算出找零
		double exchangeMoney = userMoney - totalMoney;
		
		System.out.println("总价："+totalMoney);
		System.out.println("找零："+exchangeMoney);
	}
}
