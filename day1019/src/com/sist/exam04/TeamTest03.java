package com.sist.exam04;

import java.util.Scanner;

class Admin{
	private String id = "tiger";
	private String pwd = "tiger1234";
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Admin(String id, String pwd) {
		super();
		this.id = id;
		this.pwd = pwd;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}


}

public class TeamTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String id,pwd;
		System.out.print("���̵� �Է��ϼ��� ==>");
		id = scanner.next();
		System.out.print("��й�ȣ�� �Է��ϼ��� ==>");
		pwd = scanner.next();
		
		Admin admin = new Admin();
				
		if(admin.getID().equals(id) && admin.getPwd().equals(pwd)) {
			System.out.println("�α����߽��ϴ�.");
			}else {
			System.out.println("�α��ο� �����߽��ϴ�.");	
			}
	
	}

}
