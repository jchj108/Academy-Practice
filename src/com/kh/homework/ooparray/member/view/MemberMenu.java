package com.kh.homework.ooparray.member.view;

import java.util.Scanner;

import com.kh.homework.ooparray.member.controller.MemberController;

public class MemberMenu {

	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();

	public MemberMenu() {
	}

	public void mainMenu() {
		int menuNum = 0;
		do {
			System.out.println("최대 등록 가능한 회원 수는 " + MemberController.SIZE + "명입니다.");
			System.out.println("현재 등록된 회원 수는 " + mc.existMemberNum() + "명입니다.");

			if (mc.existMemberNum() != 10) {
				System.out.println("1. 새 회원 등록");
				System.out.println("2. 회원 검색");
				System.out.println("3. 회원 정보 수정");
				System.out.println("4. 회원 삭제");
				System.out.println("5. 모두 출력");
				System.out.println("9. 끝내기");
				System.out.print("메뉴 번호 : ");
				menuNum = sc.nextInt();

				switch (menuNum) {
				case 1:
					insertMember();
					break;
				case 2:
					searchMember();
					break;
				case 3:
					updateMember();
					break;
				case 4:
					deleteMember();
					break;
				case 5:
					printAll();
					break;
				case 9:
					System.out.println("프로그램을 종료합니다.");
					break;
				default:
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				}
			} else {
				System.out.println("회원 수가 모두 꽉 찼기 때문에 일부 메뉴만 오픈됩니다.");
				System.out.println("2. 회원 검색");
				System.out.println("3. 회원 정보 수정");
				System.out.println("4. 회원 삭제");
				System.out.println("5. 모두 출력");
				System.out.println("9. 끝내기");
				System.out.print("메뉴 번호 : ");
				menuNum = sc.nextInt();

				switch (menuNum) {
				case 2:
					searchMember();
					break;
				case 3:
					updateMember();
					break;
				case 4:
					deleteMember();
					break;
				case 5:
					printAll();
					break;
				case 9:
					System.out.println("프로그램을 종료합니다.");
					break;
				default:
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				}
			}
		} while (menuNum != 9);

	}

	public void insertMember() {
		System.out.println("새 회원을 등록합니다.");
		boolean check = false;
		String id = null;
		do {
			System.out.print("아이디 : ");
			String inputId = sc.next();
			check = mc.checkId(inputId);
			if (check) {
				id = inputId;
			} else {
				System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
			}
		} while (!check);
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("비밀번호 : ");
		String password = sc.next();
		System.out.print("이메일 : ");
		String email = sc.next();

		String genderStr = null;
		char gender = ' ';

		do {
			System.out.print("성별(M/F) : ");
			genderStr = sc.next();
			if (genderStr.toUpperCase().equals("M") || genderStr.toUpperCase().equals("F")) {
				gender = genderStr.charAt(0);
			} else {
				System.out.println("성별을 다시 입력해주세요.");
			}
		} while (!genderStr.toUpperCase().equals("M") && !genderStr.toUpperCase().equals("F"));
		// M과 같지 않으면서 동시에 F와 같지 않으면 실행한다. && 이므로 둘 중 하나만 충족되어도 false가 된다

		System.out.print("나이 : ");
		int age = sc.nextInt();

		mc.insertMember(id, name, password, email, gender, age);
		System.out.println();
	}

	public void searchMember() {

		System.out.println("1. 아이디로 검색하기");
		System.out.println("2. 이름으로 검색하기");
		System.out.println("3. 이메일로로 검색하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 : ");
		int menuNum = sc.nextInt();
		switch (menuNum) {

		case 1:
			searchId();
			break;
		case 2:
			searchName();
			break;
		case 3:
			searchEmail();
			break;
		case 9:
			System.out.println("메인으로 돌아갑니다.");
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
		}
		System.out.println();
	}
	
	public void searchId() {
		
		
		
	}
}