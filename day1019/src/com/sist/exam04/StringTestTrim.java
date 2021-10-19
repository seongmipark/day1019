package com.sist.exam04;

public class StringTestTrim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "   java   ";
		int n = data.length();
		System.out.println(n);  //공백도 글자로 취급해서 10출력
		
		String data2 = data.trim();//공백제외해주는 메소드
		int n2 = data2.length();		
		System.out.println(n2); //공백제외하고출려되서 4
		System.out.println("|"+data+"|");
		//String은 변하지않는 문자열이므로 
		//data에는 그대로 공백이 포함된 문자열이 출력된다
		
		data = data.trim();
		System.out.println("|"+data+"|");
	}

}
