package com.kh.practice4.func;

import java.util.Scanner;

public class ControlPractice {

	public void practice1() {

		Scanner sc = new Scanner(System.in);

		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		System.out.printf("메뉴 번호를 입력하세요 : ");
		int num = sc.nextInt();

		switch (num) {
		case 1:
			System.out.println("입력 메뉴입니다.");
			break;
		case 2:
			System.out.println("수정 메뉴입니다.");
			break;
		case 3:
			System.out.println("조회 메뉴입니다.");
			break;
		case 4:
			System.out.println("삭제 메뉴입니다.");
			break;
		case 7:
			System.out.println("프로그램을 종료합니다");
			break;
		}
	}

	public void practice2() {

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();

		if (num > 0) {
			if (num % 2 == 0) {
				System.out.println("짝수다");
			} else {
				System.out.println("홀수다");
			}
		} else {
			System.out.println("양수만 입력해주세요.");
		}
	}

	public void practice3() {

		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		int average = (kor + eng + math) / 3;
		int sum = kor + eng + math;

		if (math >= 40 && kor >= 40 && eng >= 40) {
			if (average >= 60) {
				System.out.println("국어 : " + kor);
				System.out.println("수학 : " + math);
				System.out.println("영어 : " + eng);
				System.out.println("합계 : " + sum);
				System.out.println("평균 : " + average);
				System.out.println("축하합니다," + " 합격입니다!");
			} else {
				System.out.println("국어 : " + kor);
				System.out.println("수학 : " + math);
				System.out.println("영어 : " + eng);
				System.out.println("합계 : " + sum);
				System.out.println("평균 : " + average);
				System.out.println("불합격입니다.");
			}
		} else {
			System.out.println("국어 : " + kor);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + eng);
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + average);
			System.out.println("불합격입니다.");
		}
	}

	public void practice4() {
//		28 : 2
//		29 : 
//		30 : 4 6 9 11
//		31 : 1 3 5 7 8 10 12 

		Scanner sc = new Scanner(System.in);
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		String spring = "봄";
		String summer = "여름";
		String autumn = "가을";
		String winter = "겨울";
		String result = null;

		switch (month) {
		case 12:
		case 1:
		case 2:
			result = winter;
			break;
		case 3:
		case 4:
		case 5:
			result = spring;
			break;
		case 6:
		case 7:
		case 8:
			result = summer;
			break;
		case 9:
		case 10:
		case 11:
			result = autumn;
			break;
		default:
			System.out.println(month + "월은 잘못 입력된 달입니다.");
		}
		if (month > 0 && month <= 12)
			System.out.println(month + "월은 " + result + "입니다.");
	}

	public void practice5() {

		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String pw = sc.nextLine();

		if (id.equals("myId") && pw.equals("myPassword12")) {
			System.out.println("로그인 성공");
		} else if (id.equals("myId")) {
			System.out.println("비밀번호가 틀렸습니다.");
		} else if (pw.equals("myPassword12")) {
			System.out.println("아이디가 틀렸습니다.");
		}

	}

	public void practice6() {

		Scanner sc = new Scanner(System.in);
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String client = sc.nextLine();

		switch (client) {
		case "관리자":
			System.out.print("회원관리, 게시글 관리, 게시글 작성, 댓글 작성, 게시글 조회");
			break;
		case "회원":
			System.out.print("게시글 작성, 게시글 조회, 댓글 작성");
			break;
		case "비회원":
			System.out.print("게시글 조회");
			break;
		}
	}

	public void practice7() {

		Scanner sc = new Scanner(System.in);
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();

		final double BMI = weight / (height * height);
		String fat = null;

		if (BMI >= 30) {
			fat = "고도 비만";
		} else if (BMI >= 25) {
			fat = "비만";
		} else if (BMI >= 23) {
			fat = "과체중";
		} else if (BMI >= 18.5) {
			fat = "정상체중";
		} else {
			fat = "저체중";
		}

		System.out.println("BMI 지수 : " + BMI);
		System.out.println(fat);
	}

	public void practice8() {

		Scanner sc = new Scanner(System.in);
		System.out.print("피연산자1 입력 : ");
		double num1 = sc.nextDouble();
		System.out.print("피연산자2 입력 : ");
		double num2 = sc.nextDouble();
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		char sign = sc.next().charAt(0);
		double result = 0;

		if (num1 > 0 && num2 > 0) {
			switch (sign) {
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			case '/':
				result = num1 / num2;
				break;
			case '%':
				result = num1 % num2;
				break;
			default :
				System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다");
			}
		} else {
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다");
		}
		if (num1 > 0 && num2 > 0 && (sign=='+'||sign=='-'||sign=='*'||sign=='/'||sign=='%'))
			System.out.println(num1 + " " + sign + " " + num2 + " = " + result);
	}

	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("중간 고사 점수 : ");
		double mid = sc.nextDouble();
		System.out.print("기말 고사 점수 : ");
		double fin = sc.nextDouble();
		System.out.print("과제 점수 : ");
		double asi = sc.nextDouble();
		System.out.print("출석 회수 : ");
		double att = sc.nextDouble();
		String result = null;
		double rate = mid * 0.2 + fin * 0.3 + asi * 0.3 + att;

		if (att > 14) {
			if (rate >= 70) {
				result = "Pass";
				System.out.println("중간고사 점수(20) : " + mid*0.2);
				System.out.println("기말고사 점수(30) : " + fin*0.3);
				System.out.println("과제 점수(30) : " + asi*0.3);
				System.out.println("출석 점수(20) : " + att);
				System.out.println("총점 : " + rate);
			} else {
				result = "Fail[점수 미달]";
				System.out.println("중간고사 점수(20) : " + mid*0.2);
				System.out.println("기말고사 점수(30) : " + fin*0.3);
				System.out.println("과제 점수(30) : " + asi*0.3);
				System.out.println("출석 점수(20) : " + att);
				System.out.println("총점 : " + rate);
			}
		} else {
			result = "Fail[출석 회수 부족" + "(" + att + "/20)]";
		}

		System.out.println(result);
	}

	public void practice10() {

		Scanner sc = new Scanner(System.in);

		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. P/F");
		System.out.print("선택 : ");
		int input = sc.nextInt();

		switch (input) {
		case 1:
			practice1();
			break;
		case 2:
			practice2();
			break;
		case 3:
			practice3();
			break;
		case 4:
			practice4();
			break;
		case 5:
			practice5();
			break;
		case 6:
			practice6();
			break;
		case 7:
			practice7();
			break;
		case 8:
			practice8();
			break;
		case 9:
			practice9();
			break;
		default:
			System.out.println("잘못 입력했습니다.");
			break;
		}

	}
} // end of class
