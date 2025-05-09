package cn.yd.corejava.day18;
//外部类
public class 学校 {
	//属性
	public String name;//校名
	public String id;
	//静态属性,这个属性不依赖学校对象，是类级别的
	public static String 教育局局长;
	/**方法*/
	public void 开始考试() {
		
	}
	//成员内部类
	public class 班级{
		public String id;//班级编号
		
		public void 开班会() {
			System.out.println(学校.this.id);
		}
	}
	
	/**学校这个类的一个方法*/
	public void 建设教学楼() {
		final int area = 20000;//可以建造教学楼的场地面积，比如说2W平米
		int 砖头的数量 = 200000;//购买的砖头，多退少补
		//局部内部类
		class 建筑物{
			
			public void m1() {
				//area=10000;//局部内部类不可以修改方法的final变量。可以理解
				System.out.println(area);//局部内部类可以访问方法的final变量
				
				//砖头的数量 = 300000;//局部内部类不可以修改方法的非final变量
				System.out.println(砖头的数量);//局部内部类可以访问方法的非final变量
			}
			
		}


	}
	/**静态内部类*/
	static class Teacher{
		public void m1() {
			//这里访问name就是Teacher的对象访问校名，因为Teacher的对象不依赖于学校，所以不能访问学校
			//System.out.println(name);
			System.out.println(new 学校().name);
			//
			System.out.println(教育局局长);
		}
	}
	
	
	
	
	
}
