package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice2 {
	public void q2() {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("ù ��° ���� : ");
		int num1 = sc.nextInt();
		System.out.println("�� ��° ���� : ");
		int num2 = sc.nextInt();
		
		System.out.println("���ϱ� ��� : " + (num1+num2));
		System.out.println("���� ��� : " + (num1-num2));
		System.out.println("���ϱ� ��� : " + num1*num2);
		System.out.println("������ ��� : " + num1/num2);
	}
}
