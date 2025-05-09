package cn.yd.corejava.day11;

public class Test {
	public static void main(String[] args) {
		/**
		 *  需求：让张三这个管理员去删除第二个帖子
 			张三.deletePost(第二个帖子)
		 */
		//在张三登录的时候，创建张三
		Manager zhangsan  = new Manager();
		//第二个帖子，在这个帖子被发表的创建的
		Post secondPost = new Post();
		
		zhangsan.deletePost(secondPost);
	}
}
