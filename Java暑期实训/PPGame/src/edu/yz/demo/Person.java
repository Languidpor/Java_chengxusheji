package edu.yz.demo;

public class Person {
	
//	��װ��˼�룺����˽�л�
	private int id;
	private String name;
	private int height;
	private int weight;
	
//	��װ��˼�룺�ṩһ�����⹫����setter&getter���������ڸ�ֵ�ͻ�ȡֵ
	public void setId(int id) {
//		�������id��ֵ����ǰ����ĳ�Ա����id
		this.id  = id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getHeight() {
		return height;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getWeight() {
		return weight;
	}
	
//	�޷���ֵ���͡��޲����б�
	public void eat() {
		name = "�仨";
		String food = "���";
		System.out.println(name+"��"+food);
	}	
	
//	�淶����ķ������壺�в����б���������ΪString
	public void eat(String food) {
		System.out.println(name+"��"+food);
	}
//	�в����б����Ҳ�������Ϊchar
	public void eat(char food) {
		System.out.println(name+"��"+food);
	}
//	�в����б�����������������ͷֱ�Ϊchar\int
	public void eat(char food,int num) {
		System.out.println(name+"��"+food);
	}
	
//	�з���ֵ���ͣ��˷����б���Ҫͨ��return�ؼ��������ض�Ӧ���͵Ľ��
	public int sleep(int hour) {
		return hour;
	}
	
	public int sleep(int hour,int minute) {
		return hour;
	}
	
	public int sleep(int hour,int minute,int second) {
		return hour;
	}
	
//	Object��Java�Ķ������࣬return�Ľ���������������ͣ���ΪObject������
	public Object sleep(String hour) {
		return hour;
	}
}
