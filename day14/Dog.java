package cn.yd.corejava.day14;
/**����*/
public class Dog extends Animal{
	String kind;//Ʒ��
	
	public Dog() {
		
	}
	public Dog(String kind) {		
		this.kind = kind;
	}
	
	 /**ҧ*/
	public void bite() {
		System.out.println("ҧ��");
	}
	
	public void move() {
		System.out.println("�������ƶ�");
	}
	
	
}

