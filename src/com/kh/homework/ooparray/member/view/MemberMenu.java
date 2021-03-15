package com.kh.homework.ooparray.member.view;

import java.util.Scanner;

import com.kh.homework.ooparray.member.controller.MemberController;
import com.kh.homework.ooparray.member.model.vo.Member;

public class MemberMenu {

	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();

	public MemberMenu() {
	}

	public void mainMenu() {
		int menuNum = 0;
		do {
			System.out.println("�ִ� ��� ������ ȸ�� ���� " + MemberController.SIZE + "���Դϴ�.");
			System.out.println("���� ��ϵ� ȸ�� ���� " + mc.existMemberNum() + "���Դϴ�.");

			if (mc.existMemberNum() != 10) {
				System.out.println("1. �� ȸ�� ���");
				System.out.println("2. ȸ�� �˻�");
				System.out.println("3. ȸ�� ���� ����");
				System.out.println("4. ȸ�� ����");
				System.out.println("5. ��� ���");
				System.out.println("9. ������");
				System.out.print("�޴� ��ȣ : ");
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
					System.out.println("���α׷��� �����մϴ�.");
					break;
				default:
					System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
				}
			} else {
				System.out.println("ȸ�� ���� ��� �� á�� ������ �Ϻ� �޴��� ���µ˴ϴ�.");
				System.out.println("2. ȸ�� �˻�");
				System.out.println("3. ȸ�� ���� ����");
				System.out.println("4. ȸ�� ����");
				System.out.println("5. ��� ���");
				System.out.println("9. ������");
				System.out.print("�޴� ��ȣ : ");
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
					System.out.println("���α׷��� �����մϴ�.");
					break;
				default:
					System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
				}
			}
		} while (menuNum != 9);

	}

	public void insertMember() {
		System.out.println("�� ȸ���� ����մϴ�.");
		boolean check = false;
		String id = null;
		do {
			System.out.print("���̵� : ");
			String inputId = sc.next();
			check = mc.checkId(inputId);
			if (check) {
				id = inputId;
			} else {
				System.out.println("�ߺ��� ���̵��Դϴ�. �ٽ� �Է����ּ���.");
			}
		} while (!check);
		System.out.print("�̸� : ");
		String name = sc.next();
		System.out.print("��й�ȣ : ");
		String password = sc.next();
		System.out.print("�̸��� : ");
		String email = sc.next();

		String genderStr = null;
		char gender = ' ';

		do {
			System.out.print("����(M/F) : ");
			genderStr = sc.next();
			if (genderStr.toUpperCase().equals("M") || genderStr.toUpperCase().equals("F")) {
				gender = genderStr.charAt(0);
			} else {
				System.out.println("������ �ٽ� �Է����ּ���.");
			}
		} while (!genderStr.toUpperCase().equals("M") && !genderStr.toUpperCase().equals("F"));
		// M�� ���� �����鼭 ���ÿ� F�� ���� ������ �����Ѵ�. && �̹Ƿ� �� �� �ϳ��� �����Ǿ false�� �ȴ�

		System.out.print("���� : ");
		int age = sc.nextInt();

		mc.insertMember(id, name, password, email, gender, age);
		System.out.println();
	}

	public void searchMember() {

		System.out.println("1. ���̵�� �˻��ϱ�");
		System.out.println("2. �̸����� �˻��ϱ�");
		System.out.println("3. �̸��Ϸη� �˻��ϱ�");
		System.out.println("9. �������� ���ư���");
		System.out.print("�޴� ��ȣ : ");
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
			System.out.println("�������� ���ư��ϴ�.");
			break;
		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
		System.out.println();
	}

	public void searchId() {

		System.out.println("�˻��� ���̵� : ");
		String id = sc.next();
		String result = mc.searchId(id);

		if (result == null) {
			System.out.println("�˻� ����� �����ϴ�");
		} else {
			System.out.println("ã���� ȸ�� ��ȸ ����Դϴ�.");
			System.out.println(result);
		}
		System.out.println();
	}

	public void searchName() {
		System.out.print("�˻��� �̸� : ");
		String name = sc.next();
		Member[] result = mc.searchName(name);
		int count = 0;
		for (int i = 0; i < result.length; i++) {
			if (result[i] != null) {
				count++;
				break;
			}
		}

		if (count == 0) {
			System.out.println("�˻� ����� �����ϴ�.");
		} else {
			System.out.println("ã���� ȸ�� ��ȸ ����Դϴ�.");
			for (int i = 0; i < result.length; i++) {
				if (result[i] != null) {
					System.out.println(result[i].inform());
				}
			}
		}
		System.out.println();
	}

	public void searchEmail() {
		System.out.print("�˻��� �̸��� : ");
		String email = sc.next();
		Member[] result = mc.searchEmail(email);
		int count = 0;
		for (int i = 0; i < result.length; i++) {
			if (result[i] != null) {
				count++;
				break;
			}
		}

		if (count == 0) {
			System.out.println("�˻� ����� �����ϴ�.");
		} else {
			System.out.println("ã���� ȸ�� ��ȸ ����Դϴ�.");
			for (int i = 0; i < result.length; i++) {
				if (result[i] != null) {
					System.out.println(result[i].inform());
				}
			}
		}
		System.out.println();
	}

}