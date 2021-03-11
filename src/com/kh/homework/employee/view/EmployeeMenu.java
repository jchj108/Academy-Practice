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
			default:
				System.out.println("잘못된 값을 입력하셨습니다.");
			}

		} while (num != 9);
	}

	public void insertEmp() {

		System.out.print("사원 번호 : ");
		int empNo = Integer.parseInt(sc.nextLine());
		System.out.print("사원 이름 : ");
		String name = sc.nextLine();
		System.out.print("성별(남/여) : ");
		char gender = sc.nextLine().charAt(0);
		System.out.print("전화번호(-포함) : ");
		String phone = sc.nextLine();

		String yn = null;
		do {
			System.out.println("추가적인 정보를 더 입력하시겠습니까?(y/n)");
			yn = sc.nextLine();
			if (yn.equals("y") || yn.equals("n")) {
				if (yn.equals("n")) {
					ec.add(empNo, name, gender, phone);
				} else {
					System.out.print("사원 부서 : ");
					String dept = sc.nextLine();
					System.out.print("사원 연봉 : ");
					int salary = Integer.parseInt(sc.nextLine());
					System.out.print("사원 보너스율 : ");
					double bonus = Double.parseDouble(sc.nextLine());
					ec.add(empNo, name, gender, phone, dept, salary, bonus);
				}
				System.out.println("데이터 삽입에 성공하였습니다.");
				break;
			} else {
				System.out.println("추가 정보 여부에 대한 대답이 틀렸습니다. 다시 입력해주세요.");
			}
		} while (!yn.equals("n"));
	}

	public void updateEmp() {

		int menuNum = 0;

		do {
			System.out.println("가장 최신의 사원 정보를 수정하게 됩니다.");
			System.out.println("사원의 어떤 정보를 수정하시겠습니까?");
			System.out.println("1. 전화 번호");
			System.out.println("2. 사원 연봉");
			System.out.println("3. 보너스 율");
			System.out.println("9. 돌아가기");
			System.out.print("메뉴 번호를 누르세요 : ");
			menuNum = Integer.parseInt(sc.nextLine());

			switch (menuNum) {

			case 1:
				System.out.print("수정할 전화번호 :");
				String phone = sc.nextLine();
				ec.modify(phone);
				break;
			case 2:
				System.out.print("수정할 사원 연봉 :");
				int salary = Integer.parseInt(sc.nextLine());
				ec.modify(salary);
				break;
			case 3:
				System.out.print("수정할 전화번호 :");
				double bonus = Double.parseDouble(sc.nextLine());
				ec.modify(bonus);
				break;
			case 9:
				System.out.println("메인 메뉴로 돌아갑니다");
				return; // 자신을 호출한 메소드로 돌아간다
			default:
				System.out.println("잘못 입력하셨습니다.");
			}
		} while (menuNum != 9);
	}

	public void deleteEmp() {
		String yn = null;

		do {
			System.out.print("정말 삭제하시겠습니까?(y/n) : ");
			yn = sc.nextLine().toLowerCase();
			if (yn.equals("y")) {
				Employee result = ec.remove();
				if (result == null) {
					System.out.println("데이터 삭제에 성공하였습니다.");
				} else {
					System.out.println("데이터 삭제에 실패하였습니다.");
				}
			} else {
				System.out.println("잘못된 대답입니다. 다시 입력해주세요.");
			}
		} while (!(yn.equals("y") || yn.equals("n")));
	}

	public void printEmp() {
		String result = ec.inform();

		if (result == null) {
			System.out.println("존재하는 사원 데이터가 없습니다.");
		} else {
			System.out.println("사번\t이름\t성별\t핸드폰번호\t부서\t급여\t보너스");

			System.out.println(result);
		}
	}
}
