package com.kh.homework.person.view;

import java.util.Scanner;

import com.kh.homework.person.controller.PersonController;
import com.kh.homework.person.model.vo.Student;

public class PersonMenu {

	private Scanner sc = new Scanner(System.in);
	private PersonController pc = new PersonController();

	public void mainMenu() {

		while (true) {
			System.out.println("�л��� �ִ� 3����� ������ �� �ֽ��ϴ�.");
			System.out.println("���� ����� �л���" + pc.personCount()[0] + "���Դϴ�.");
			System.out.println("����� �ִ� 10����� ������ �� �ֽ��ϴ�.");
			System.out.println("���� ����� �����" + pc.personCount()[1] + "���Դϴ�.");
			System.out.println();

			System.out.println("1. �л� �޴�");
			System.out.println("2. ��� �޴�");
			System.out.println("9. ������");
			System.out.print("�޴� ��ȣ : ");
			int menuNum = Integer.parseInt(sc.nextLine());

			switch (menuNum) {
			case 1:
				studentMenu();
				break;
			case 2:
				employeeMenu();
				break;
			case 9:
				System.out.println("�����մϴ�");
				return;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
		}
	}

	public void studentMenu() {

		int menu = 0;
		do {
			System.out.println("1. �л� �߰�");
			System.out.println("2. �л� ����");
			System.out.println("9. ������");
			if (pc.personCount()[0] == 3) {
				System.out.println("�л��� ���� �� �ִ� ������ �� á�� ������ �л� �߰� �޴��� �� �̻� Ȱ��ȭ ���� �ʽ��ϴ�.");
			}
			System.out.print("�޴� ��ȣ : ");
			menu = Integer.parseInt(sc.nextLine());

			switch (menu) {
			case 1:
				if (pc.personCount()[0] == 3) {
					System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
				} else {
					insertStudent();
					break;
				}
			case 2:
				printStudent();
				break;
			case 9:
				System.out.println("�������� ���ư��ϴ�.");
				return;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
		} while (menu != 9);
	}

	public void employeeMenu() {

		int menu = 0;

		do {
			System.out.println("1. ��� �߰�");
			System.out.println("2. ��� ����");
			System.out.println("9. ��������");
			if (pc.personCount()[1] == 10) {
				System.out.println("����� ���� �� �ִ� ������ �� á�� ������ ��� �߰� �޴��� �� �̻� Ȱ��ȭ ���� �ʽ��ϴ�.");
			}
			System.out.print("�޴� ��ȣ : ");
			menu = sc.nextInt();

			switch (menu) {
			case 1:
				if (pc.personCount()[1] == 10) {
					System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
				} else {
					insertEmployee();
					break;
				}
			case 2:
				pc.printEmployee();
				break;
			case 9:
				System.out.println("�������� ���ư��ϴ�.");
				return;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
		} while (menu != 9);
	}

	public void insertStudent() {

		String user = " ";

		do {
			System.out.print("�л� �̸� : ");
			String name = sc.nextLine();
			System.out.print("�л� ���� : ");
			int age = Integer.parseInt(sc.nextLine());
			System.out.print("�л� Ű : ");
			double height = Double.parseDouble(sc.nextLine());
			System.out.print("�л� ������ : ");
			double weight = Double.parseDouble(sc.nextLine());
			System.out.print("�л� �г� : ");
			int grade = Integer.parseInt(sc.nextLine());
			System.out.print("�л� ���� : ");
			String major = sc.nextLine();

			pc.insertStudent(name, age, height, weight, grade, major);

			if (pc.personCount()[0] == 3) {
				System.out.println("�л��� ���� �� �ִ� ������ �� á�� ������ �л� �߰��� �����ϰ� �л� �޴��� ���ư��ϴ�");
				return;
			} else {
				System.out.print("�׸��Ͻ÷��� N(�Ǵ� n), �̾��Ͻ÷��� �ƹ� Ű�� �������� :");
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
