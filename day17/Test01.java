package cn.yd.corejava.day17;

import cn.yd.corejava.day17.学校.班级;

/**测试成员内部类*/
public class Test01 {
	public static void main(String[] args) {
		 学校 yangda = new 学校();
		 班级  banji1 = yangda.new 班级();
	}
}
