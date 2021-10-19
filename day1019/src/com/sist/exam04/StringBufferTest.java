package com.sist.exam04;

public class StringBufferTest {
	
	public static void pro(String str) { //매개변수가 string
		System.out.println("처리하는 문자열은"+str+"입니다.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer data = new StringBuffer("hello");  //A
		data.append("Korea");                           //B
		System.out.println(data);
		
		//A의 data와 B의 data는 같은 메모리를 참조
		//StringBuffer의 내용을 바꾸더라도 새로운 메모리를 만들지않고
		//기존 객체의 내용이 변경된다.
		//따라서 변하는 문자열 처리에는 StringBuffer 혹은 StringBuilder를 사용하는 것이 좋다.
	
		//그런데 만약 이렇게 처리된 StringBuffer을 매개변수로 전달하여
		//어떤 메소드를 사용할 때에는 다시 String으로 변환해야하는 경우가 많다.
		//문자열을 매개변수로 받아 처리하는 메소드는 대부분 String을 받도록 되어있기 때문이다.
		
		//pro(data);
		//pro메소드는 String을 매개변수로 갖기 때문에 StringBuffer을 전달할 수 없다.
		
		//String생성자 중 StringBuffer을 매개변수로 갖는 생성자를 이용한다.

		String r = new String(data);
		pro(r);
		
		//위 두줄의 명령어를 한줄로 표현
		pro(new String(data));	
	
	}

}
