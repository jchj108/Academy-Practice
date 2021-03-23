package com.kh.homework.person.view;

import java.util.Scanner;

import com.kh.homework.person.controller.PersonController;
import com.kh.homework.person.model.vo.Student;

public class PersonMenu {

	private Scanner sc = new Scanner(System.in);
	private PersonController pc = new PersonController();

	public void mainMenu() {

		while (true) {
			System.out.println("학생은 최대 3명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 학생은" + pc.personCount()[0] + "명입니다.");
			System.out.println("사원은 최대 10명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 사원은" + pc.personCount()[1] + "명입니다.");
			System.out.println();

			System.out.println("1. 학생 메뉴");
			System.out.println("2. 사원 메뉴");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			int menuNum = Integer.parseInt(sc.nextLine());

			switch (menuNum) {
			case 1:
				studentMenu();
				break;
			case 2:
				employeeMenu();
				break;
			case 9:
				System.out.println("종료합니다");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}

	public void studentMenu() {

		int menu = 0;
		do {
			System.out.println("1. 학생 추가");
			System.out.println("2. 학생 보기");
			System.out.println("9. 끝내기");
			if (pc.personCount()[0] == 3) {
				System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가 메뉴는 더 이상 활성화 되지 않습니다.");
			}
			System.out.print("메뉴 번호 : ");
			menu = Integer.parseInt(sc.nextLine());

			switch (menu) {
			case 1:
				if (pc.personCount()[0] == 3) {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				} else {
					insertStudent();
					break;
				}
			case 2:
				printStudent();
				break;
			case 9:
				System.out.println("메인으로 돌아갑니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		} while (menu != 9);
	}

	public void employeeMenu() {

		int menu = 0;

		do {
			System.out.println("1. 사원 추가");
			System.out.println("2. 사원 보기");
			System.out.println("9. 메인으로");
			if (pc.personCount()[1] == 10) {
				System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에 사원 추가 메뉴는 더 이상 활성화 되지 않습니다.");
			}
			System.out.print("메뉴 번호 : ");
			menu = sc.nextInt();

			switch (menu) {
			case 1:
				if (pc.personCount()[1] == 10) {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				} else {
					insertEmployee();
					break;
				}
			case 2:
				pc.printEmployee();
				break;
			case 9:
				System.out.println("메인으로 돌아갑니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		} while (menu != 9);
	}

	public void insertStudent() {

		String user = " ";

		do {
			System.out.print("학생 이름 : ");
			String name = sc.nextLine();
			System.out.print("학생 나이 : ");
			int age = Integer.parseInt(sc.nextLine());
			System.out.print("학생 키 : ");
			double height = Double.parseDouble(sc.nextLine());
			System.out.print("학생 몸무게 : ");
			double weight = Double.parseDouble(sc.nextLine());
			System.out.print("학생 학년 : ");
			int grade = Integer.parseInt(sc.nextLine());
			System.out.print("학생 전공 : ");
			String major = sc.nextLine();

			pc.insertStudent(name, age, height, weight, grade, major);

			if (pc.personCount()[0] == 3) {
				System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가를 종료하고 학생 메뉴로 돌아갑니다");
				return;
			} else {
				System.out.print("그만하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요 :");
				user = sc.nextLine();
			}
		} while (!user.toUpperCase().equals("N"));

	}

	public void printStudent() {
		Student[] s = pc.printStudent();
		for (int i = 0; i < s.length; i++) {

			if (s[i] == null) {
				break;
			} else {
				System.out.println(s[i]);
			}
			System.out.println();
		}

	}

	public void insertEmployee() {

	}

	public void printEmployee() {

	}

}
