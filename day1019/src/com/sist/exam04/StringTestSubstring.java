package com.sist.exam04;

public class StringTestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "abcdefghijklmn";
		String data2 = data.substring(3,8); //defgh
		String data3 = data.substring(8);  //ihklmn
		
		System.out.println(data2); 
		System.out.println(data3); 
		
		String url = "https://docs.oracle.com/javase/8/docs/api/index.html";
		//int index = url.lastIndexOf("index");
		
		System.out.println( url.substring(url.lastIndexOf("/")+1));
		
		
		//String data4 = url.substring(url.lastIndexOf("index"));
		//System.out.println(data4); 
	}
}
