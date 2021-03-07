package com.kh.hw1.controller;

import java.util.Scanner;

public class Function {

	public void calculator() {

		Scanner sc = new Scanner(System.in);

		System.out.print("ù ��° ���� : ");
		int num1 = sc.nextInt();
		System.out.print("�� ��° ���� : ");
		int num2 = sc.nextInt();
		System.out.print("������(+, -, x, /) : ");
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
				System.out.println("0���� ���� �� �����ϴ�.");
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

		System.out.print("ù ��° ���� : ");
		int num1 = sc.nextInt();
		System.out.print("�� ��° ���� : ");
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
		System.out.printf("%d���� %d���� �������� �� : %d%n", min, max, sum);
	}

	public void printProfile() {

		String name = "��â��";
		int age = 28;
		String gender = "male";
		String character = "Introspective";

		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("���� : " + gender);
		System.out.println("���� : " + character);
	}

	public void printScore() {

		Scanner sc = new Scanner(System.in);
		String strgender = " ";
		char gradePoint = ' ';

		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("�г� : ");
		int grade = sc.nextInt();
		System.out.print("�� : ");
		int cla = sc.nextInt();
		System.out.print("�� : ");
		int num = sc.nextInt();
		System.out.print("����(M/F) : ");
		char gender = sc.next().charAt(0);
		System.out.print("���� : ");
		double score = sc.nextDouble();

		switch (gender) {
		case ('F'):
			strgender = "���л�";
			break;
		case ('M'):
			strgender = "���л�";
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
		System.out.printf("%d�г� %d�� %d�� %s %s�� ������ %.2f�̰� %s�����Դϴ�%n", grade, cla, num, strgender, name, score,
				gradePoint);
	}

	public void printStarNumber() {

		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
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
			System.out.println("����� �ƴմϴ�.");
		}

	}

	public void sumRandom() {

		int random = (int) (Math.random() * 100 + 1);
		int sum = 0;

		for (int i = 1; i <= random; i++) {
			sum += i;
		}
		System.out.println("1���� " + random + "������ �� : " + sum);
	}

	public void exceptGugu() {

		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int input = sc.nextInt();

		if (input > 0) {
			for (int i = 1; i < 10; i++) {
				if (i % input != 0) {
					System.out.printf("%d * %d = %d%n", input, i, i * input);
				}
			}
		}
	}

	public void diceGame() {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("�ֻ��� �� ���� ���� ���纸����(1~12�Է�) : ");
			int random = sc.nextInt();
			int dice = (int) (Math.random() * 6 + 1) + (int) (Math.random() * 6 + 1);

			if (random == dice) {
				System.out.println("�����Դϴ�");
				System.out.println("�ֻ����� �� : " + dice);
				System.out.print("��� �Ͻðڽ��ϱ�? (y/n) : ");

				char cont = sc.next().charAt(0);

				while (true) {
					if (cont == 'y') {
						break;
					} else if (cont == 'n') {
						break;
					} else {
						System.out.println("�߸� �Է��ϼ̽��ϴ�.");
						System.out.print("��� �Ͻðڽ��ϱ�? (y/n) : ");
						cont = sc.next().charAt(0);
					}
				}
				if (cont == 'n') {
					System.out.println("�����մϴ�");
					break;
				}

			} else {
				System.out.println("Ʋ�Ƚ��ϴ�");
			}
		}
	}
}
