package com.sist.exam04;

public class StringTest01 {

	public static void main(String[] args) {
		
		String data = new String("안녕하세요");
		
		String data2 = "안녕하세요";
		//String은 참조자료형이지만 기본자료형처럼 쓸 수 있다. 
		
		System.out.println(data);
		System.out.println(data2);
		
		byte[]arr = data.getBytes();
		for (byte b : arr) {
			System.out.println(b);
		}
		
		String result = new String(arr);
		System.out.println(result);
		//네트워크 통신이나 파일로 자료를 저장할 때 문자열데이터를
		//byte형으로 변환하여 전송한다.
		//이때 전송받은 byte형의 배열을 다시 String으로 만들기 위해
		//byte배열을 매개변수로 갖는 String의 생성자를 이용한다.
		//String데이터를 byte으로 변환하기 위해 
	}
}
