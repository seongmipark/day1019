package com.sist.exam04;

public class StringTestEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data1 =new String("ȫ�浿");
		String data2 =new String("ȫ�浿");
		
		/*
		if(data1 == data2) {
			System.out.println("���� ���ƿ�");
		}else {
			System.out.println("���� �޶��"); 
		}*/
		
		if(data1.equals(data2)) {
			System.out.println("���� ���ƿ�");
		}else {
			System.out.println("���� �޶��"); 
		}		
		
		System.out.println("----------------------------------");
		String name1 = new String("tiger");
		String name2 = new String("Tiger");
		
		if(name1.equals(name2)) { // 
			System.out.println("�̸��� tiger�� ���ƿ�");
		}else {
			System.out.println("�̸��� ���� �ʾƿ�");
		}
		//equals�� ��ҹ��� �����ϹǷ� ���� �ʴٰ� ��µ�
		
		
		if(name1.equalsIgnoreCase(name2)) { // 
			System.out.println("�̸��� tiger�� ���ƿ�");
		}else {
			System.out.println("�̸��� ���� �ʾƿ�");
		}
		//equalsIgnoreCase�� ��ҹ��ڸ� �������� �ʰ� �������Ǻ�

	}

}
