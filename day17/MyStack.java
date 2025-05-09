package cn.yd.corejava.day17;

public class MyStack {
	private int size=0;//表示栈中的元素的个数
	private Object[] arr;
	//无参构造，会构造一个长度为10的栈
	public MyStack() {
		arr = new Object[10];
	}
	//有参构造，会根据传的参数来创建一个特定长度的栈
	public MyStack(int num) {
		arr = new Object[num];
	}
	//入栈
	public void push(Object obj) {
		//入满了，咋办？？??????
		arr[size] = obj;
		size++;
	}
	//出栈
	public Object pop(){
		return arr[--size];		
	}
	//获得栈中元素的个数
	public int getSize() {
		return this.size;
	}
}
