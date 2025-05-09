package edu.yz.demo05;

/**
 * 	线程和异常处理
 * @author tarena
 *
 */
public class ThreadDemo implements Runnable{

	public void run() {
//		打印当前系统时间的毫秒值，通常用于计算程序的执行时间
		System.out.println(System.currentTimeMillis());
//		根据编译提示，快捷修复
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("测试线程和异常");
		System.out.println(System.currentTimeMillis());
//		选中可能出异常的代码，然后alt+shift+z，选择try\catch即可
		try {
			int i = 1/0;
		} catch (Exception e) {
			// 出现异常则执行打印异常信息
			e.printStackTrace();
		}
//		此时后续代码会执行
		System.out.println(System.currentTimeMillis());
	}
	
	public static void main(String[] args) {
//		将ThreadDemo对象包装成Thread对象
		ThreadDemo td = new ThreadDemo();//将对象赋值给一个引用变量
//		采用匿名对象的方式，若一个对象只要使用一次，则可以采用这种方法
		Thread t = new Thread(new ThreadDemo());
		t.start();
	}

}
