package cn.yd.corejava.day11;

public class Test {
	public static void main(String[] args) {
		/**
		 *  �����������������Աȥɾ���ڶ�������
 			����.deletePost(�ڶ�������)
		 */
		//��������¼��ʱ�򣬴�������
		Manager zhangsan  = new Manager();
		//�ڶ������ӣ���������ӱ�����Ĵ�����
		Post secondPost = new Post();
		
		zhangsan.deletePost(secondPost);
	}
}
