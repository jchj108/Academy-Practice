package com.kh.hw1.view;

import java.util.Scanner;

import com.kh.hw1.controller.Function;

public class Menu {

	Function f = new Function();

	public void displayMenu() {

		Scanner sc = new Scanner(System.in);
		int input = 0;

		while (true) {
			if (input == 9) {
				break;
			}

			System.out.println("1. ���� ����");
			System.out.println("2. ���� ������ ū ������ �հ�");
			System.out.println("3. �Ż� ���� Ȯ��");
			System.out.println("4. �л� ���� Ȯ��");
			System.out.println("5. ���� ���� ���");
			System.out.println("6. ���������� �հ�");
			System.out.println("7. ������");
			System.out.println("8. �ֻ��� ���� �˾Ƹ��߱� ����");
			System.out.println("9. ���α׷� ����");
			System.out.print("�޴� ��ȣ : ");
			input = sc.nextInt();

			switch (input) {
			case 1:
				f.calculator();
				break;
			case 2:
				f.totalCalculator();
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;
			case 8:
				break;
			case 9:
				System.out.println("�����մϴ�.");
				break;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");
			}

		}
	}
}
