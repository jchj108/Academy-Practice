package com.kh.practice7.snack.view;

import java.util.Scanner;

import com.kh.practice7.snack.cotroller.SnackController;

public class SnackMenu {

	private Scanner sc = new Scanner(System.in);
	private SnackController scr = new SnackController();
	
	
	public void menu() {
		System.out.println("�������� �Է��ϼ���");
		System.out.print("���� : ");
		String kind = sc.nextLine();
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("�� : ");
		String flavor = sc.nextLine();
		System.out.print("���� : ");
		int numOf = Integer.parseInt(sc.nextLine()); // parseInt�� �ڵ� ü�̴�
		System.out.print("���� : ");
		String strPrice = sc.nextLine();
		int price = Integer.parseInt(strPrice);
		
		String result = scr.saveData(kind, name, flavor, numOf, price);
		System.out.println(result);
		
		System.out.print("������ ������ Ȯ���Ͻðڽ��ϱ�?(y/n) : ");
		String answer = sc.nextLine();
		if(answer.equals("y") || answer.equals("Y")) {
			System.out.println(scr.confirmData());
		}
	}
}
