package cn.yd.corejava.day17;

public class Square extends Shape{

	public Square(double c) {
		super(c);		
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0.0625*c*c;
	}

}
