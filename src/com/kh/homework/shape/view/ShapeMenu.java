package com.kh.homework.shape.view;

import java.util.Scanner;

import com.kh.homework.shape.controller.ShapeController;

public class ShapeMenu {

	private Scanner sc = new Scanner(System.in);
	private ShapeController spr = new ShapeController();

	public void inputMenu() {
		int num = 0;

		do {
			System.out.println("==== 도형 프로그램 ====");
			System.out.println("3. 삼각형");
			System.out.println("4. 사각형");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 번호 : ");
			num = Integer.parseInt(sc.nextLine());

			switch (num) {
			case 3:
				triangleMenu();
				break;
			case 4:
				squareMenu();
				break;
			case 9:
				System.out.println("프로그램 종료");
				break;
			default:
				System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
			}

		} while (num != 9);
	}

	public void triangleMenu() {

		int num = 0;

		do {
			System.out.println("==== 삼각형 ====");
			System.out.println("1. 삼각형");
			System.out.println("2. 삼각형 색칠");
			System.out.println("3. 삼각형 정보");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
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
				System.out.println("메인으로 돌아갑니다");
				return;
			default:
				System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
			}
		} while (num != 9);
	}

	public void squareMenu() {

		int num = 0;

		do {
			System.out.println("==== 사각형 ====");
			System.out.println("1. 사각형 둘레");
			System.out.println("2. 사각형 면적");
			System.out.println("3. 사각형 색칠");
			System.out.println("4. 사각형 정보");
			System.out.print("메뉴 번호 : ");
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
				System.out.println("메인으로 돌아갑니다");
//				inputMenu();
//				break;
				return;
			default:
				System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
			}
		} while (num != 9);

	}

	public void inputData(int type, int menuNum) {
		if (type == 3) {
			switch (menuNum) {
			case 1:
				System.out.print("높이 : ");
				double height = Double.parseDouble(sc.nextLine());
				System.out.print("너비 : ");
				double width = Double.parseDouble(sc.nextLine());

				double area = spr.calcArea(type, height, width);
				System.out.println("면적 : " + area);
				break;

			case 2:
				System.out.print("색깔을 입력하세요 : ");
				String color = sc.nextLine();
				spr.paintColor(color);
				System.out.println("색이 수정되었습니다");
				break;
			}
		} else {
			switch (menuNum) {
			case 1:
				System.out.print("높이 : ");
				double height = Double.parseDouble(sc.nextLine());
				System.out.print("너비 : ");
				double width = Double.parseDouble(sc.nextLine());
				
				double perimeter = spr.calcPerimeter(type, height, width);
				System.out.println("둘레 : " + perimeter);
				break;
			case 2:
				System.out.print("높이 : ");
				height = Double.parseDouble(sc.nextLine());
				System.out.print("너비 : ");
				width = Double.parseDouble(sc.nextLine());
				
				double area = spr.calcArea(type, height, width);
				System.out.println("넓이 : " + area);
				break;
			case 3:
				System.out.print("색깔 : ");
				String color = sc.nextLine();
				spr.paintColor(color);
				System.out.println("색이 수정되었습니다");
				break;
			}
		}
	}
	
	public void printInformation(int type) {
		System.out.println(spr.print(type));
	}
}
