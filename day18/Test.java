package cn.yd.corejava.day18;

import java.util.Timer;
import java.util.TimerTask;

import cn.yd.corejava.day18.学校.Teacher;

public class Test {
	public static void main(String[] args) {
		//创建静态内部类对象，和外部类对象没有任何关系
		Teacher t = new Teacher();
		
		
		//匿名内部类
		//定时器类，一个工具类，可以实现定时器的功能
		Timer timer = new Timer();//创建定时器对象
		//启动定时器, 需要三个参数
		/***1：是一个对象,这个对象的类型不存在，但是这个类型的父类是TimerTask，TimerTask
		 * 是一个抽象类，所以其子类需要实现其抽象方法
		 *  2:long类型的，表示毫秒，当程序执行到这里时，休息多久，开始执行固定的逻辑
		 *  3:long类型的，表示毫秒，执行了一遍固定的逻辑后，以后每间隔多久，再次执行	
		 */
		timer.schedule(new TimerTask() {
			public void run() {
				System.out.println("你好");
			}
		},0,10);
		
		//有一个类，没有名字，但是这个类的父类是Tread
		new Thread() {}.start();
	}
}
