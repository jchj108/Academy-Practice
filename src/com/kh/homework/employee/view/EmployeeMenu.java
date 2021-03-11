package com.kh.homework.employee.view;

import java.util.Scanner;

import com.kh.homework.employee.controller.Employeecontroller;
import com.kh.homework.employee.model.vo.Employee;

public class EmployeeMenu {

	private Scanner sc = new Scanner(System.in);
	private Employeecontroller ec = new Employeecontroller();

	public EmployeeMenu() {

		int num = 0;

		do {
			System.out.println("1. ��� �߰�");
			System.out.println("2. ��� ����");
			System.out.println("3. ��� ����");
			System.out.println("4. ��� ���");
			System.out.println("9. ���α׷� ����");
			System.out.print("�޴� ��ȣ�� �������� : ");
			num = Integer.parseInt(sc.nextLine());

			switch (num) {
			case 1:
				insertEmp();
				break;
			case 2:
				updateEmp();
				break;
			case 3:
				deleteEmp();
				break;
			case 4:
				printEmp();
				break;
			case 9:
				System.out.println("���α׷��� �����մϴ�");
				break;
			default:
				System.out.println("�߸��� ���� �Է��ϼ̽��ϴ�.");
			}

		} while (num != 9);
	}

	public void insertEmp() {

		System.out.print("��� ��ȣ : ");
		int empNo = Integer.parseInt(sc.nextLine());
		System.out.print("��� �̸� : ");
		String name = sc.nextLine();
		System.out.print("����(��/��) : ");
		char gender = sc.nextLine().charAt(0);
		System.out.print("��ȭ��ȣ(-����) : ");
		String phone = sc.nextLine();

		String yn = null;
		do {
			System.out.println("�߰����� ������ �� �Է��Ͻðڽ��ϱ�?(y/n)");
			yn = sc.nextLine();
			if (yn.equals("y") || yn.equals("n")) {
				if (yn.equals("n")) {
					ec.add(empNo, name, gender, phone);
				} else {
					System.out.print("��� �μ� : ");
					String dept = sc.nextLine();
					System.out.print("��� ���� : ");
					int salary = Integer.parseInt(sc.nextLine());
					System.out.print("��� ���ʽ��� : ");
					double bonus = Double.parseDouble(sc.nextLine());
					ec.add(empNo, name, gender, phone, dept, salary, bonus);
				}
				System.out.println("������ ���Կ� �����Ͽ����ϴ�.");
				break;
			} else {
				System.out.println("�߰� ���� ���ο� ���� ����� Ʋ�Ƚ��ϴ�. �ٽ� �Է����ּ���.");
			}
		} while (!yn.equals("n"));
	}

	public void updateEmp() {

		int menuNum = 0;

		do {
			System.out.println("���� �ֽ��� ��� ������ �����ϰ� �˴ϴ�.");
			System.out.println("����� � ������ �����Ͻðڽ��ϱ�?");
			System.out.println("1. ��ȭ ��ȣ");
			System.out.println("2. ��� ����");
			System.out.println("3. ���ʽ� ��");
			System.out.println("9. ���ư���");
			System.out.print("�޴� ��ȣ�� �������� : ");
			menuNum = Integer.parseInt(sc.nextLine());

			switch (menuNum) {

			case 1:
				System.out.print("������ ��ȭ��ȣ :");
				String phone = sc.nextLine();
				ec.modify(phone);
				break;
			case 2:
				System.out.print("������ ��� ���� :");
				int salary = Integer.parseInt(sc.nextLine());
				ec.modify(salary);
				break;
			case 3:
				System.out.print("������ ��ȭ��ȣ :");
				double bonus = Double.parseDouble(sc.nextLine());
				ec.modify(bonus);
				break;
			case 9:
				System.out.println("���� �޴��� ���ư��ϴ�");
				return; // �ڽ��� ȣ���� �޼ҵ�� ���ư���
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		} while (menuNum != 9);
	}

	public void deleteEmp() {
		String yn = null;

		do {
			System.out.print("���� �����Ͻðڽ��ϱ�?(y/n) : ");
			yn = sc.nextLine().toLowerCase();
			if (yn.equals("y")) {
				Employee result = ec.remove();
				if (result == null) {
					System.out.println("������ ������ �����Ͽ����ϴ�.");
				} else {
					System.out.println("������ ������ �����Ͽ����ϴ�.");
				}
			} else {
				System.out.println("�߸��� ����Դϴ�. �ٽ� �Է����ּ���.");
			}
		} while (!(yn.equals("y") || yn.equals("n")));
	}

	public void printEmp() {
		String result = ec.inform();

		if (result == null) {
			System.out.println("�����ϴ� ��� �����Ͱ� �����ϴ�.");
		} else {
			System.out.println("���\t�̸�\t����\t�ڵ�����ȣ\t�μ�\t�޿�\t���ʽ�");

			System.out.println(result);
		}
	}
}
