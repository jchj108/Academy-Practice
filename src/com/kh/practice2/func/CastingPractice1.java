package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice1 {
	public void q1() {
		
		// ���ڸ� �����ڵ�� ����ϼ���.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� : ");
		
		String str = sc.nextLine();
		char ch = str.charAt(0);
		
		System.out.println(ch + " unicode : " + (int)ch);
		
		
	}
}
