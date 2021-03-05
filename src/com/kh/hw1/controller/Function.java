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
}
