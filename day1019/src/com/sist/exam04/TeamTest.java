//���̵� ���

package com.sist.exam04;

import java.util.Scanner;

public class TeamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String email;
		System.out.print("�̸����� �Է��ϼ��� ==>");
		email = sc.next();
		
		
		String id = email.substring(0,email.lastIndexOf("@"));
		System.out.println("���̵��"+id+"�Դϴ�."); 
		

	}

}
