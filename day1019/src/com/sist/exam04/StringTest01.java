package com.sist.exam04;

public class StringTest01 {

	public static void main(String[] args) {
		
		String data = new String("�ȳ��ϼ���");
		
		String data2 = "�ȳ��ϼ���";
		//String�� �����ڷ��������� �⺻�ڷ���ó�� �� �� �ִ�. 
		
		System.out.println(data);
		System.out.println(data2);
		
		byte[]arr = data.getBytes();
		for (byte b : arr) {
			System.out.println(b);
		}
		
		String result = new String(arr);
		System.out.println(result);
		//��Ʈ��ũ ����̳� ���Ϸ� �ڷḦ ������ �� ���ڿ������͸�
		//byte������ ��ȯ�Ͽ� �����Ѵ�.
		//�̶� ���۹��� byte���� �迭�� �ٽ� String���� ����� ����
		//byte�迭�� �Ű������� ���� String�� �����ڸ� �̿��Ѵ�.
		//String�����͸� byte���� ��ȯ�ϱ� ���� 
	}
}
