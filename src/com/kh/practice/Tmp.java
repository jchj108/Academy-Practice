package com.kh.practice;

import java.util.Scanner;

public class Tmp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("값을 입력하세요 : ");
		int num = sc.nextInt();
		int i = 1;
		if (num > 1) {
			while (num >= i) {
				System.out.print(i + " ");
				i++;
			while(num < 1) {
				System.out.print("1 이상의 숫자를 입력하세요 : ");
				num = sc.nextInt();
					if (num>1) {
						while(num>=i) {
							System.out.print(i + " ");
							i++;
						}
					}
				}
			}
		}
	}
}
