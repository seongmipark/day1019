package com.sist.exam04;

public class StringBufferTest {
	
	public static void pro(String str) { //�Ű������� string
		System.out.println("ó���ϴ� ���ڿ���"+str+"�Դϴ�.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer data = new StringBuffer("hello");  //A
		data.append("Korea");                           //B
		System.out.println(data);
		
		//A�� data�� B�� data�� ���� �޸𸮸� ����
		//StringBuffer�� ������ �ٲٴ��� ���ο� �޸𸮸� �������ʰ�
		//���� ��ü�� ������ ����ȴ�.
		//���� ���ϴ� ���ڿ� ó������ StringBuffer Ȥ�� StringBuilder�� ����ϴ� ���� ����.
	
		//�׷��� ���� �̷��� ó���� StringBuffer�� �Ű������� �����Ͽ�
		//� �޼ҵ带 ����� ������ �ٽ� String���� ��ȯ�ؾ��ϴ� ��찡 ����.
		//���ڿ��� �Ű������� �޾� ó���ϴ� �޼ҵ�� ��κ� String�� �޵��� �Ǿ��ֱ� �����̴�.
		
		//pro(data);
		//pro�޼ҵ�� String�� �Ű������� ���� ������ StringBuffer�� ������ �� ����.
		
		//String������ �� StringBuffer�� �Ű������� ���� �����ڸ� �̿��Ѵ�.

		String r = new String(data);
		pro(r);
		
		//�� ������ ��ɾ ���ٷ� ǥ��
		pro(new String(data));	
	
	}

}
