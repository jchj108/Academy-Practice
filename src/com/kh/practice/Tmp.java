package com.kh.practice;

import java.util.Scanner;

public class Tmp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int user = sc.nextInt();
		
		for(int i = user, j = 1 ; i > 0 ; i--, j+=2) {
			for(int k = 0 ; k < i ; k++) {
				System.out.print(" ");
			}
			
			for(int k = 0 ; k < j ; k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}