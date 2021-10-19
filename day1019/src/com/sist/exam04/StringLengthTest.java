//사용자한테 암호와 암호확인을 입력받아서 (암호는 8자 이상 12자 이하)
//암호와 암호확인이 동일한 지 판별하여 적합한 메세지 출력하는 프로그램

package com.sist.exam04;

import java.util.Scanner;

public class StringLengthTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String password;
		System.out.print("암호를 입력하세요 ==>");
		password = sc.next();
		String passwordck;
		System.out.print("암호를 다시한번 입력하세요==>");
		passwordck = sc.next();
		
		if(password.equals(passwordck) && password.length() >= 8  && password.length() <= 12 ) {
			System.out.print("바람직한 암호입니다.");			
		}else {
			System.out.print("바람직한 암호가 아닙니다.");			
		}
	}
}


