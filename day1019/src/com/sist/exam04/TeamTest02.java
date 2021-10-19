//사용자로부터 영문문장 입력받아
//소문자 'o'의 개수를 파악하여 출력
package com.sist.exam04;

import java.util.Scanner;

public class TeamTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String data;
		System.out.print("영문 문장을 입력하세요 ==>");
		data = sc.nextLine(); //공백까지..
		
		char ch;
		int cnt=0;
		
		for(int i=0;i<data.length();i++){
			  ch = data.charAt(i);
			if (ch == 'o')
			cnt = cnt +1;
			}
		System.out.print("소문자 o의 갯수는 "+cnt+" 입니다");		
	}

}
