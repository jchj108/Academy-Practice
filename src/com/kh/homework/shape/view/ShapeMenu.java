package com.kh.homework.shape.view;

import java.util.Scanner;

import com.kh.homework.shape.controller.ShapeController;

public class ShapeMenu {

	private Scanner sc = new Scanner(System.in);
	private ShapeController spr = new ShapeController();

	public void inputMenu() {
		int num = 0;

		do {
			System.out.println("==== ���� ���α׷� ====");
			System.out.println("3. �ﰢ��");
			System.out.println("4. �簢��");
			System.out.println("9. ���α׷� ����");
			System.out.print("�޴� ��ȣ : ");
			num = Integer.parseInt(sc.nextLine());

			switch (num) {
			case 3:
				triangleMenu();
				break;
			case 4:
				squareMenu();
				break;
			case 9:
				System.out.println("���α׷� ����");
				break;
			default:
				System.out.println("�߸��� ��ȣ�Դϴ�. �ٽ� �Է����ּ���.");
			}

		} while (num != 9);
	}

	public void triangleMenu() {

		int num = 0;

		do {
			System.out.println("==== �ﰢ�� ====");
			System.out.println("1. �ﰢ��");
			System.out.println("2. �ﰢ�� ��ĥ");
			System.out.println("3. �ﰢ�� ����");
			System.out.println("9. ��������");
			System.out.print("�޴� ��ȣ : ");
			num = Integer.parseInt(sc.nextLine());

			switch (num) {
			case 1:
				inputData(3, 1);
				break;
			case 2:
				inputData(3, 2);
				break;
			case 3:
				printInformation(3);
				break;
			case 9:
				System.out.println("�������� ���ư��ϴ�");
				return;
			default:
				System.out.println("�߸��� ��ȣ�Դϴ�. �ٽ� �Է����ּ���.");
			}
		} while (num != 9);
	}

	public void squareMenu() {

		int num = 0;

		do {
			System.out.println("==== �簢�� ====");
			System.out.println("1. �簢�� �ѷ�");
			System.out.println("2. �簢�� ����");
			System.out.println("3. �簢�� ��ĥ");
			System.out.println("4. �簢�� ����");
			System.out.print("�޴� ��ȣ : ");
			num = Integer.parseInt(sc.nextLine());
			
			switch (num) {
			case 1:
				inputData(4, 1);
				break;
			case 2:
				inputData(4, 2);
				break;
			case 3:
				inputData(4, 3);
				break;
			case 4:
				printInformation(4);
				break;
			case 9:
				System.out.println("�������� ���ư��ϴ�");
//				inputMenu();
//				break;
				return;
			default:
				System.out.println("�߸��� ��ȣ�Դϴ�. �ٽ� �Է����ּ���.");
			}
		} while (num != 9);

	}

	public void inputData(int type, int menuNum) {
		if (type == 3) {
			switch (menuNum) {
			case 1:
				System.out.print("���� : ");
				double height = Double.parseDouble(sc.nextLine());
				System.out.print("�ʺ� : ");
				double width = Double.parseDouble(sc.nextLine());

				double area = spr.calcArea(type, height, width);
				System.out.println("���� : " + area);
				break;

			case 2:
				System.out.print("������ �Է��ϼ��� : ");
				String color = sc.nextLine();
				spr.paintColor(color);
				System.out.println("���� �����Ǿ����ϴ�");
				break;
			}
		} else {
			switch (menuNum) {
			case 1:
				System.out.print("���� : ");
				double height = Double.parseDouble(sc.nextLine());
				System.out.print("�ʺ� : ");
				double width = Double.parseDouble(sc.nextLine());
				
				double perimeter = spr.calcPerimeter(type, height, width);
				System.out.println("�ѷ� : " + perimeter);
				break;
			case 2:
				System.out.print("���� : ");
				height = Double.parseDouble(sc.nextLine());
				System.out.print("�ʺ� : ");
				width = Double.parseDouble(sc.nextLine());
				
				double area = spr.calcArea(type, height, width);
				System.out.println("���� : " + area);
				break;
			case 3:
				System.out.print("���� : ");
				String color = sc.nextLine();
				spr.paintColor(color);
				System.out.println("���� �����Ǿ����ϴ�");
				break;
			}
		}
	}
	
	public void printInformation(int type) {
		System.out.println(spr.print(type));
	}
}
