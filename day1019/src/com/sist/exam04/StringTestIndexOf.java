package com.sist.exam04;

public class StringTestIndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = new String("Returns the index within this string of the first occurrence of the specified substring.");
		int index = data.indexOf("the");
		//�ش�Ǵ� ���ڿ��� ������ ������ ó�����ִ� �ε�����ȣ�� ���
		System.out.println(index); 
		//ó���� �ִ� the���ִ� �ε�����ȣ 8�� ��µ�
		
		int index2 = data.indexOf("the",9);
		//�ε��� 9��°���ĺ��� the�� ã�ƴ޶�� ��ɾ� -> 40 ���
		System.out.println(index2); 	
		
		int index3 = data.indexOf("hello");
		System.out.println(index3);
		//�ش�Ǵ� ���ڿ��̾����� -1�� ���
		
		int index4 = data.indexOf('e'); //���ڷ�
		System.out.println(index4);
		
		int index5 = data.indexOf("e"); //���ڿ��� 
		System.out.println(index5);
	}

}
