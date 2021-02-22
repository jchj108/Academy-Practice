package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice3 {
	public void q3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("가로 : ");
		double height = sc.nextDouble();
		System.out.println("세로 : ");
		double width = sc.nextDouble();
		
		final double area = height * width;
		final double round = (height + width) * 2;
				
		System.out.println("면적 : " + area);
		System.out.println("둘레 : " + round);
		
	}
}
