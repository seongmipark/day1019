//����ڷκ��� �������� �Է¹޾�
//�ҹ��� 'o'�� ������ �ľ��Ͽ� ���
package com.sist.exam04;

import java.util.Scanner;

public class TeamTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String data;
		System.out.print("���� ������ �Է��ϼ��� ==>");
		data = sc.nextLine(); //�������..
		
		char ch;
		int cnt=0;
		
		for(int i=0;i<data.length();i++){
			  ch = data.charAt(i);
			if (ch == 'o')
			cnt = cnt +1;
			}
		System.out.print("�ҹ��� o�� ������ "+cnt+" �Դϴ�");		
	}

}
