package com.kh.practice3.func;

import java.util.Scanner;

public class OperatorPractice {
	public void method1() {
		
		System.out.print("정수 : ");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		String result = num > 0 ? "양수다" : (num==0 ? "0이다" : "양수가 아니다");
		System.out.println(result);
	}
	
	public void method2() {
		System.out.print("정수 : ");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		String result = num > 0 ? "양수다" : (num==0 ? "0이다" : "음수다");
		System.out.println(result);
	}

	public void method3() {
		System.out.print("정수 : ");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		String result = num%2==0 ? "짝수다" : "홀수다";
		System.out.println(result);
	}
	
	public void method4() {

		Scanner sc = new Scanner(System.in);

		System.out.print("인원 수 : ");
		int member = sc.nextInt();
		System.out.print("사탕 개수 : ");
		int candy = sc.nextInt();
		
		int candyperperson = candy / member;
		int restcandy = candy % member;

		System.out.println("1인당 사탕 개수 : " + candyperperson);
		System.out.println("남는 사탕 개수 : " + restcandy);
	}
	
	public void method5() {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("학년(숫자만) : ");
		String stryear = sc.nextLine();
		int year = Integer.parseInt(stryear);
		System.out.print("반(숫자만) : ");
		String strcla = sc.nextLine();
		int cla = Integer.parseInt(strcla);
		System.out.print("번호(숫자만) : ");
		String strnum = sc.nextLine();
		int num = Integer.parseInt(strnum);
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		System.out.print("성적(소수점 아래 둘째자리까지) ");
		double grade = sc.nextDouble();
		
		String kgender = gender == 'M' ? "남" : "여";
		
		
		System.out.printf("%d학년 %d반 %d번 %s %s학생의 성적은 %.2f이다.", year, cla, num, name, kgender, grade);
	}
	
	public void method6() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 : ");
		int age = sc.nextInt();
		String result = age>19 ? "성인" : (age>13 ? "청소년" : "어린이");
		System.out.println(result);
	}
}
