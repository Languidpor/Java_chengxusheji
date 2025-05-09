package cn.yd.corejava.day06;
/**
 * ×Ö·û´®Æ´½ÓÔËËã·û
 * @author GuoJK
 *
 */
public class Demo02 {
	public static void main(String[] args) {
		int a = 5;
		int b = 3;
		b+=a;
		System.out.println(a);//5
		System.out.println(b);//8		
		a*=b;
		System.out.println(a);//40
		System.out.println(b);//8
		int i = 5;
		int j = 6;
		System.out.println("×Ö·û´®1"+"×Ö·û´®2");//"×Ö·û´®1×Ö·û´®2"
		System.out.println("×Ö·û´®3"+i);//"×Ö·û´®35"
		System.out.println("×Ö·û´®4"+i+j);//"×Ö·û´®456"
		System.out.println(i+j+"×Ö·û´®5");//"11×Ö·û´®5"
		System.out.println("×Ö·û´®6"+j);//"×Ö·û´®66"
		System.out.println("×Ö·û´®7"+(i+j));//"×Ö·û´®711"
		
		
	}
}
