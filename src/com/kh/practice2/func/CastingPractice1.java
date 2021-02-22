package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice1 {
	public void q1() {
		
		// 문자를 유니코드로 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자 : ");
		
		String str = sc.nextLine();
		char ch = str.charAt(0);
		
		System.out.println(ch + " unicode : " + (int)ch);
		
		
	}
}
