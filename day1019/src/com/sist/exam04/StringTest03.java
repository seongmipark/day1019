package com.sist.exam04;

public class StringTest03 {

	public static void main(String[] args) {
		
		String data = new String("hello");  //A
		data = data + "korea";              //B
		System.out.println(data);
		
		//A���� data�� �����ϴ� ��ü��
		//B���� data�� �����ϴ� ��ü�� �ٸ���.
		//String�� ������ �����Ű�� ���ο� �޸𸮸� ��´�
		//�׷��� String�� �����͸� �����Ҷ����� �������� �����ǹǷ�
		//���ϴ� ���ڿ��� ó���Ҷ��� String�� �������� �ʴ�.
		//���ϴ� ���ڿ��� ó���Ҷ� StringBuffer�� StringBuilder�� ���
		
	}

}
