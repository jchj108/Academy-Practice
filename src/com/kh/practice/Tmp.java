package com.kh.practice;

import java.util.Scanner;

public class Tmp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {

				if (i == 0 || i == num - 1) {
					System.out.print("*");
				} else if (j == 0 || j == num - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}