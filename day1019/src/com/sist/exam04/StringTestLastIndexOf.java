package com.sist.exam04;

public class StringTestLastIndexOf {

	public static void main(String[] args) {
		String url = new String("https://docs.oracle.com/javase/8/docs/api/index.html");
		
		//위의 url로부터 맨끝에 있는 "/"의 인덱스를 찾아 출력
		int index = url.lastIndexOf("/");
		System.out.println(index); 
	}
}
