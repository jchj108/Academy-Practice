package com.kh.homework.numRange.view;

import java.util.Scanner;

import com.kh.homework.numRange.controller.NumberController;
import com.kh.homework.numRange.exception.NumRangeException;

public class NumberMenu {

	NumberController nc = new NumberController();

	public void menu() {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 1 : ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("정수 2 : ");
		int num2 = Integer.parseInt(sc.nextLine());
		
		
		boolean result;
		try {
			result = nc.checkDouble(num1, num2);
			System.out.println(num1 + "은(는) " + num2 + "의 배수인가 ? " + result);
		} catch (NumRangeException e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}
}
