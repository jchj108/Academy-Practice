package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice3 {
	public void q3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� : ");
		double height = sc.nextDouble();
		System.out.println("���� : ");
		double width = sc.nextDouble();
		
		final double area = height * width;
		final double round = (height + width) * 2;
				
		System.out.println("���� : " + area);
		System.out.println("�ѷ� : " + round);
		
	}
}
