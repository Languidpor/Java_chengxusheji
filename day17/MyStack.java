package cn.yd.corejava.day17;

public class MyStack {
	private int size=0;//��ʾջ�е�Ԫ�صĸ���
	private Object[] arr;
	//�޲ι��죬�ṹ��һ������Ϊ10��ջ
	public MyStack() {
		arr = new Object[10];
	}
	//�вι��죬����ݴ��Ĳ���������һ���ض����ȵ�ջ
	public MyStack(int num) {
		arr = new Object[num];
	}
	//��ջ
	public void push(Object obj) {
		//�����ˣ�զ�죿��??????
		arr[size] = obj;
		size++;
	}
	//��ջ
	public Object pop(){
		return arr[--size];		
	}
	//���ջ��Ԫ�صĸ���
	public int getSize() {
		return this.size;
	}
}
