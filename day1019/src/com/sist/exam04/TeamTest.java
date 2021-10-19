//아이디 출력

package com.sist.exam04;

import java.util.Scanner;

public class TeamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String email;
		System.out.print("이메일을 입력하세요 ==>");
		email = sc.next();
		
		
		String id = email.substring(0,email.lastIndexOf("@"));
		System.out.println("아이디는"+id+"입니다."); 
		

	}

}
