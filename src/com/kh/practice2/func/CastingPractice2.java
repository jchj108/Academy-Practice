package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice2 {
	public void q2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� : ");
		Double kor = sc.nextDouble();
		System.out.println("���� : ");
		Double eng = sc.nextDouble();
		System.out.println("���� : ");
		Double math = sc.nextDouble();
		
		int sum = (int)(kor+eng+math);
		int average = (int)((kor+eng+math)/3);
		
		System.out.printf("���� : %d\n", sum);
		System.out.printf("��� : %d\n", average);
		
	}
}
