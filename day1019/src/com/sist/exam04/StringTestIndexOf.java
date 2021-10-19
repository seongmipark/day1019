package com.sist.exam04;

public class StringTestIndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = new String("Returns the index within this string of the first occurrence of the specified substring.");
		int index = data.indexOf("the");
		//해당되는 문자열이 여러개 있을시 처음에있는 인덱스번호를 출력
		System.out.println(index); 
		//처음에 있는 the가있는 인덱스번호 8이 출력됨
		
		int index2 = data.indexOf("the",9);
		//인덱스 9번째이후부터 the를 찾아달라는 명령어 -> 40 출력
		System.out.println(index2); 	
		
		int index3 = data.indexOf("hello");
		System.out.println(index3);
		//해당되는 문자열이없으면 -1을 출력
		
		int index4 = data.indexOf('e'); //문자로
		System.out.println(index4);
		
		int index5 = data.indexOf("e"); //문자열로 
		System.out.println(index5);
	}

}
