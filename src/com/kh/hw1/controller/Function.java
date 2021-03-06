package com.kh.hw1.controller;

import java.util.Scanner;

public class Function {

	public void calculator() {

		Scanner sc = new Scanner(System.in);

		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();
		System.out.print("연산자(+, -, x, /) : ");
		char ch = sc.next().charAt(0);
		int result = 0;

		switch (ch) {

		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case 'x':
			result = num1 * num2;
			break;
		case '/':
			if (num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
				break;
			} else {
				result = num1 / num2;
				break;
			}
		}
		System.out.printf("%d %c %d = %d%n", num1, ch, num2, result);

	}

	public void totalCalculator() {

		Scanner sc = new Scanner(System.in);

		int max = 0;
		int min = 0;
		int sum = 0;

		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();

		if (num1 > num2) {
			max = num1;
			min = num2;
		} else {
			min = num1;
			max = num2;
		}

		for (int i = min; i <= max; i++) {
			sum += i;
		}
		System.out.printf("%d부터 %d까지 정수들의 합 : %d%n", min, max, sum);
	}

	public void printProfile() {

		String name = "지창진";
		int age = 28;
		String gender = "male";
		String character = "Introspective";

		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + gender);
		System.out.println("성격 : " + character);
	}

	public void printScore() {

		Scanner sc = new Scanner(System.in);
		String strgender = " ";
		char gradePoint = ' ';

		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("학년 : ");
		int grade = sc.nextInt();
		System.out.print("반 : ");
		int cla = sc.nextInt();
		System.out.print("번 : ");
		int num = sc.nextInt();
		System.out.print("성별(M/F) : ");
		char gender = sc.next().charAt(0);
		System.out.print("성적 : ");
		double score = sc.nextDouble();

		switch (gender) {
		case ('F'):
			strgender = "여학생";
			break;
		case ('M'):
			strgender = "남학생";
			break;
		}

		if (score > 90) {
			gradePoint = 'A';
		} else if (score > 80) {
			gradePoint = 'B';
		} else if (score > 70) {
			gradePoint = 'C';
		} else if (score > 60) {
			gradePoint = 'D';
		} else {
			gradePoint = 'F';
		}
		System.out.printf("%d학년 %d반 %d번 %s %s의 점수는 %.2f이고 %s학점입니다%n", grade, cla, num, strgender, name, score,
				gradePoint);
	}

	public void printStarNumber() {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();

		if (num > 0) {
			for (int i = 0; i < num; i++) {
				for (int j = 0; j <= i; j++) {
					if (i == j) {
						System.out.print(i + 1);
					} else {
						System.out.print("*");
					}
				}
				System.out.println();
			}
		} else {
			System.out.println("양수가 아닙니다.");
		}

	}
}
