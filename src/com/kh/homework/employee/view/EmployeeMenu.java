package com.kh.homework.employee.view;

import java.util.Scanner;

import com.kh.homework.employee.controller.Employeecontroller;

public class EmployeeMenu {

		private Scanner sc = new Scanner(System.in);
		private Employeecontroller ec = new Employeecontroller();
		
		public EmployeeMenu() {
			
		int num = 0;	
			
			do {
				System.out.println("1. 사원 추가");
				System.out.println("2. 사원 수정");
				System.out.println("3. 사원 삭제");
				System.out.println("4. 사원 출력");
				System.out.println("9. 프로그램 종료");
				System.out.print("메뉴 번호를 누르세요 : ");
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
					System.out.println("프로그램을 종료합니다");
					break;
				default : 
					System.out.println("잘못된 값을 입력하셨습니다.");
				}
				
				
			} while (num != 9);
		}
		
		public void insertEmp() {
		
			do {
				System.out.print("사원 번호 : ");
				int empNo = Integer.parseInt(sc.nextLine());
				System.out.print("사원 이름 : ");
				String name = sc.nextLine();
				System.out.print("성별(남/여) : ");
				char gender = sc.nextLine().charAt(0);
				System.out.print("전화번호(-포함) : ");
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
