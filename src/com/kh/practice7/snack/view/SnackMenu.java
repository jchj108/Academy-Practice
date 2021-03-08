package com.kh.practice7.snack.view;

import java.util.Scanner;

import com.kh.practice7.snack.cotroller.SnackController;

public class SnackMenu {

	private Scanner sc = new Scanner(System.in);
	private SnackController scr = new SnackController();
	
	
	public void menu() {
		System.out.println("스낵류를 입력하세요");
		System.out.print("종류 : ");
		String kind = sc.nextLine();
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("맛 : ");
		String flavor = sc.nextLine();
		System.out.print("개수 : ");
		int numOf = Integer.parseInt(sc.nextLine()); // parseInt의 코드 체이닝
		System.out.print("가격 : ");
		String strPrice = sc.nextLine();
		int price = Integer.parseInt(strPrice);
		
		String result = scr.saveData(kind, name, flavor, numOf, price);
		System.out.println(result);
		
		System.out.print("저장한 정보를 확인하시겠습니까?(y/n) : ");
		String answer = sc.nextLine();
		if(answer.equals("y") || answer.equals("Y")) {
			System.out.println(scr.confirmData());
		}
	}
}
