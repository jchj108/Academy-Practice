package com.kh.homework.employee.view;

import java.util.Scanner;

import com.kh.homework.employee.controller.Employeecontroller;

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
				default : 
					System.out.println("�߸��� ���� �Է��ϼ̽��ϴ�.");
				}
				
				
			} while (num != 9);
		}
		
		public void insertEmp() {
		
			do {
				System.out.print("��� ��ȣ : ");
				int empNo = Integer.parseInt(sc.nextLine());
				System.out.print("��� �̸� : ");
				String name = sc.nextLine();
				System.out.print("����(��/��) : ");
				char gender = sc.nextLine().charAt(0);
				System.out.print("��ȭ��ȣ(-����) : ");
				String phone = sc.nextLine();
				
				
				
			} while 
		}
		
		public void updateEmp() {
			
		}
		
		public void deleteEmp() {
			
		}
		
		public void printEmp() {
			
		}
}
