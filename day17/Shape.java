package cn.yd.corejava.day17;
/**ͼ��*/
public abstract class Shape {
	//�ܳ�
	public double c;
	
	public Shape(double c) {
		this.c = c;
	}
	
	//����
	public abstract double getArea();
}
