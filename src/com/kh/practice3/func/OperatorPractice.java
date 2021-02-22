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
	
	public void method7() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		double kor = sc.nextDouble();
		System.out.print("영어 : ");
		double eng = sc.nextDouble();
		System.out.print("수학 : ");
		double math = sc.nextDouble();
		
		double sum = kor + eng + math;
		double average = sum / 3;

		String result = 60<=average && (40<=kor && 40<=eng && 40<=math) ? "합격입니다" : "불합격입니다";
		
		System.out.println(result);
	}
	
	public void method8() {
		
		System.out.print("주민번호를 입력하세요(- 포함) : ");
		Scanner sc = new Scanner(System.in);
		String personNo = sc.nextLine();
		char genderNo = personNo.charAt(7);
		
		String result = genderNo == '1' || genderNo == '3' ? "남자입니다" : (genderNo == '2' || genderNo == '4' ? "여자입니다" : "올바른 값을 입력하세요");
		System.out.println(result);
	}
	
	public void method9() {
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("정수1 : ");
		int num1 = sc.nextInt();
		System.out.printf("정수2 : ");
		int num2 = sc.nextInt();
		System.out.printf("입력 : ");
		int tmp = sc.nextInt();
		
//		String result = num1 > num2 ? "num1은 num2보다 작은 수여야 합니다" : (num1 >= tmp || tmp > num2 ? "true" : "false");
		boolean result = (num1 >= tmp || tmp > num2) && num1<num2;
		System.out.println(result);
	}
	
	public void method10() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력1 : ");
		int num1 = sc.nextInt();
		System.out.print("입력2 : ");
		int num2 = sc.nextInt();
		System.out.print("입력3 : ");
		int num3 = sc.nextInt();
		
		boolean result = (num1 == num2 && num2 == num3);
		System.out.println(result);
		
	}
	
	public void method11() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A사원 연봉 : ");
		int as = sc.nextInt();
		System.out.printf("B사원 연봉 : ");
		int bs = sc.nextInt();
		System.out.printf("C사원 연봉 : ");
		int cs = sc.nextInt();
		
		Double fas = as * 1.4;
		Double fbs = (double)bs;
		Double fcs = (double)cs * 1.15;
		
		
		System.out.println("A사원 연봉/연봉+a : " + as + "/" + fas);
		System.out.println(fas>=3000 ? "3000 이상" : "3000 미만");
		System.out.println("B사원 연봉/연봉+a : " + bs + "/" + fbs);
		System.out.println(fbs>=3000 ? "3000 이상" : "3000 미만");
		System.out.println("C사원 연봉/연봉+a : " + cs + "/" + fcs);
		System.out.println(fcs>=3000 ? "3000 이상" : "3000 미만");
	
	}
}
