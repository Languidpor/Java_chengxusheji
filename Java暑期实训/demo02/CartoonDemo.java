package edu.yz.demo02;

/**
 * 	窗体&画布的实例化
 * @author tarena
 *
 */
public class CartoonDemo {
	
	public static void main(String[] args) {
//		创建窗体对象
		MyStarFrame frame = new MyStarFrame();
//		创建画布对象
		MyStarPanel panel = new MyStarPanel();
//		将画布对象添加到窗体上
		frame.add(panel);
//		显示窗体以及画布
		frame.showMe();
	}

}
