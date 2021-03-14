package com.kh.practice6.snack.view;

import java.util.Scanner;

import com.kh.practice6.snack.controller.SnackController;

public class SnackMenu {

	Scanner sc = new Scanner(System.in);
	SnackController scr = new SnackController();
	
	public void menu() {
		
		System.out.println("�������� �Է��ϼ���.");
		System.out.printf("���� : ");
		String kind = sc.nextLine();
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("�� : ");
		String flavor = sc.nextLine();
		System.out.print("���� : ");
		int numOf = Integer.parseInt(sc.nextLine());
		System.out.print("���� : ");
		int price = Integer.parseInt(sc.nextLine());
		
		scr.saveData(kind, name, flavor, numOf, price);
		System.out.println("���� �Ϸ�Ǿ����ϴ�.");
		System.out.print("������ ������ Ȯ���Ͻðڽ��ϱ�?(y/n) : ");
		String yn = sc.nextLine();
		
		if(yn.toLowerCase().equals("y")) {
			System.out.println(scr.confirmData());
		}
		
	}
}
