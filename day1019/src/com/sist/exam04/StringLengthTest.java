//��������� ��ȣ�� ��ȣȮ���� �Է¹޾Ƽ� (��ȣ�� 8�� �̻� 12�� ����)
//��ȣ�� ��ȣȮ���� ������ �� �Ǻ��Ͽ� ������ �޼��� ����ϴ� ���α׷�

package com.sist.exam04;

import java.util.Scanner;

public class StringLengthTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String password;
		System.out.print("��ȣ�� �Է��ϼ��� ==>");
		password = sc.next();
		String passwordck;
		System.out.print("��ȣ�� �ٽ��ѹ� �Է��ϼ���==>");
		passwordck = sc.next();
		
		if(password.equals(passwordck) && password.length() >= 8  && password.length() <= 12 ) {
			System.out.print("�ٶ����� ��ȣ�Դϴ�.");			
		}else {
			System.out.print("�ٶ����� ��ȣ�� �ƴմϴ�.");			
		}
	}
}


