package edu.yz.demo;

import javax.swing.JFrame;

/**
 * 1��һ��.javaԴ�ļ��п�����n��class������ֻ����һ��public class
 * 2�����Ҵ�public class������һ��Ҫ��.javaԴ�ļ�����ͬ
 * 3��eclipse�Ŀ�����ʾ��ݼ���Alt+/
 * @author tarena
 *
 */
public class MyFrameA {
	
//	main����������ִ�е���ڷ���
	public static void main(String[] args) {
//		ʹ��java�ṩ���࣬��Ҫ������ctrl+1�����޸� �� ctrl+shift+O
//		ʵ����-new������������ ������ = new ����();
//		����()��������޲ι��췽��
		JFrame jFrame = new JFrame();
//		���ô�С�����⡢Ĭ�Ϲرյ�
		jFrame.setSize(800, 1000);
		jFrame.setTitle("��һ������");
//		���ô���ɼ���trueΪ��ʾ��falseΪ����ʾ��Ĭ����false
		jFrame.setVisible(true);
	}

}
