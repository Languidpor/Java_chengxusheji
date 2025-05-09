package cn.yd.corejava.day17;

import cn.yd.corejava.day14.Dog;
import cn.yd.corejava.day15.Student;

public class TestMyStack {
	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push(1);
		stack.push("2");
		stack.push('3');
		stack.push(new Student());
		stack.push(new Dog());
		stack.push(1);
		stack.push("2");
		stack.push('3');
		stack.push(new Student());
		stack.push(new Dog());
		stack.push(1);
		stack.push("2");
		stack.push('3');
		stack.push(new Student());
		stack.push(new Dog());
		
		System.out.println(stack.getSize());
		//System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
		System.out.println(stack.getSize());
	}
}
