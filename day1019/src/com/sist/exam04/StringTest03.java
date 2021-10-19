package com.sist.exam04;

public class StringTest03 {

	public static void main(String[] args) {
		
		String data = new String("hello");  //A
		data = data + "korea";              //B
		System.out.println(data);
		
		//A에서 data가 참조하는 객체와
		//B에서 data가 참조하는 객체는 다른다.
		//String에 내용을 변경시키면 새로운 메모리를 잡는다
		//그래서 String의 데이터를 변경할때마다 가비지가 생성되므로
		//변하는 문자열을 처리할때는 String이 적합하지 않다.
		//변하는 문자열을 처리할땐 StringBuffer나 StringBuilder를 사용
		
	}

}
