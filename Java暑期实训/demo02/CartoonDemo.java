package edu.yz.demo02;

/**
 * 	����&������ʵ����
 * @author tarena
 *
 */
public class CartoonDemo {
	
	public static void main(String[] args) {
//		�����������
		MyStarFrame frame = new MyStarFrame();
//		������������
		MyStarPanel panel = new MyStarPanel();
//		������������ӵ�������
		frame.add(panel);
//		��ʾ�����Լ�����
		frame.showMe();
	}

}
