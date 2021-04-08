package com.kh.homework.API.view;

import java.util.Scanner;

import com.kh.homework.API.controller.TokenController;

public class TokenMenu {

	private Scanner sc = new Scanner(System.in);
	private TokenController tc = new TokenController();

	public void mainMenu() {
		int menuNum = 0;
		
		do {
			System.out.println("1. ���� ���ڿ�");
			System.out.println("2. �Է� ���ڿ�");
			System.out.println("9. ���α׷� ������");
			System.out.print("�޴� ��ȣ");
			menuNum = sc.nextInt();
						
			switch (menuNum) {
			case 1 : tokenMenu(); break;
			case 2 : inputMenu(); break;
			case 9 : System.out.println("���α׷��� �����մϴ�.");
			break;
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
			
		} while (menuNum != 9);
		
	}

	public void tokenMenu() {
		String str = "J a v a P r o g r a m";
		System.out.println("��ū ó�� �� ���� : " + str);
		System.out.println("��ū ó�� �� ���� : " + str.length());
		String result = tc.afterToken(str);
		System.out.println("��ū ó�� �� ���� : " + result);
		System.out.println("��ū ó�� �� ���� : " + result.length());
		System.out.println("��� �빮�ڷ� ��ȯ : " + result.toUpperCase());
	}

	public void inputMenu() {
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		String input = sc.next();
		System.out.println("ù ���� �빮�� : " + tc.firstCap(input));
		System.out.print("ã�� ���� �ϳ��� �Է��ϼ��� : ");
		char one = sc.next().charAt(0);
		System.out.println(one + " ���ڰ� �� ���� : " + tc.findChar(input, one));
	}
}
