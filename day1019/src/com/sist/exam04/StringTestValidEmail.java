//사용자한테 이메일을 입력받아 올바른 이메일인지 판별하는 프로그램 작성
//올바른 이메일은 "@"를 포함해야 한다.

package com.sist.exam04;

import java.util.Scanner;

public class StringTestValidEmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String email;
		System.out.print("이메일을 입력하세요 ==>");
		email = scanner.next();

		if(email.indexOf("@") != -1) { // 
			System.out.println("올바른 이메일입니다");
		}else {
			System.out.println("올바르지 않은 이메일입니다");
		}
	}
}
