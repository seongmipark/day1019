package com.sist.exam04;

public class StringTestTrim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "   java   ";
		int n = data.length();
		System.out.println(n);  //���鵵 ���ڷ� ����ؼ� 10���
		
		String data2 = data.trim();//�����������ִ� �޼ҵ�
		int n2 = data2.length();		
		System.out.println(n2); //���������ϰ�����Ǽ� 4
		System.out.println("|"+data+"|");
		//String�� �������ʴ� ���ڿ��̹Ƿ� 
		//data���� �״�� ������ ���Ե� ���ڿ��� ��µȴ�
		
		data = data.trim();
		System.out.println("|"+data+"|");
	}

}
