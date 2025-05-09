package cn.yd.corejava.day17;
/**图形*/
public abstract class Shape {
	//周长
	public double c;
	
	public Shape(double c) {
		this.c = c;
	}
	
	//方法
	public abstract double getArea();
}
