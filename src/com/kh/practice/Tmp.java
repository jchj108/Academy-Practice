package com.kh.practice;

import java.util.Scanner;

public class Tmp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է��ϼ��� : ");
		int num = sc.nextInt();
		int i = 1;
		if (num > 1) {
			while (num >= i) {
				System.out.print(i + " ");
				i++;
			while(num < 1) {
				System.out.print("1 �̻��� ���ڸ� �Է��ϼ��� : ");
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
