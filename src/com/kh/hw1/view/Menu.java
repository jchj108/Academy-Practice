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

			System.out.println("1. 간단 계산기");
			System.out.println("2. 작은 수에서 큰 수까지 합계");
			System.out.println("3. 신상 정보 확인");
			System.out.println("4. 학생 정보 확인");
			System.out.println("5. 별과 숫자 출력");
			System.out.println("6. 난수까지의 합계");
			System.out.println("7. 구구단");
			System.out.println("8. 주사위 숫자 알아맞추기 게임");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 번호 : ");
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
				System.out.println("종료합니다.");
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
			}

		}
	}
}
