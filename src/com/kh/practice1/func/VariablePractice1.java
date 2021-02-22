package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice1 {
	public void q1() {

	Scanner sc = new Scanner(System.in);
	
	System.out.println("이름을 입력하세요");
	String name = sc.nextLine();
	System.out.println("성별을 입력하세요(남/여)");
	String strsex = sc.nextLine();
	char sex = strsex.charAt(0);
	System.out.println("나이를 입력하세요");
	int age = sc.nextInt();
	System.out.println("키를 입력하세요(cm)");
	double height = sc.nextDouble();
	
	System.out.printf("키 %.1f인 %d살 %s자 %s님 반갑습니다^^", height, age, sex, name);
	}
}
	

