package cn.yd.corejava.day18;
//�ⲿ��
public class ѧУ {
	//����
	public String name;//У��
	public String id;
	//��̬����,������Բ�����ѧУ�������༶���
	public static String �����־ֳ�;
	/**����*/
	public void ��ʼ����() {
		
	}
	//��Ա�ڲ���
	public class �༶{
		public String id;//�༶���
		
		public void �����() {
			System.out.println(ѧУ.this.id);
		}
	}
	
	/**ѧУ������һ������*/
	public void �����ѧ¥() {
		final int area = 20000;//���Խ����ѧ¥�ĳ������������˵2Wƽ��
		int שͷ������ = 200000;//�����שͷ�������ٲ�
		//�ֲ��ڲ���
		class ������{
			
			public void m1() {
				//area=10000;//�ֲ��ڲ��಻�����޸ķ�����final�������������
				System.out.println(area);//�ֲ��ڲ�����Է��ʷ�����final����
				
				//שͷ������ = 300000;//�ֲ��ڲ��಻�����޸ķ����ķ�final����
				System.out.println(שͷ������);//�ֲ��ڲ�����Է��ʷ����ķ�final����
			}
			
		}


	}
	/**��̬�ڲ���*/
	static class Teacher{
		public void m1() {
			//�������name����Teacher�Ķ������У������ΪTeacher�Ķ���������ѧУ�����Բ��ܷ���ѧУ
			//System.out.println(name);
			System.out.println(new ѧУ().name);
			//
			System.out.println(�����־ֳ�);
		}
	}
	
	
	
	
	
}
