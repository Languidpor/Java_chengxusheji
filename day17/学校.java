package cn.yd.corejava.day17;
//外部类
public class 学校 {
	//属性
	public String name;//校名
	public String id;
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
}
