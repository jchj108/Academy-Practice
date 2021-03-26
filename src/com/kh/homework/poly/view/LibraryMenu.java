package com.kh.homework.poly.view;

import java.util.Scanner;

import com.kh.homework.poly.controller.LibraryController;
import com.kh.homework.poly.model.vo.Book;
import com.kh.homework.poly.model.vo.Member;

public class LibraryMenu {

	private LibraryController lc = new LibraryController();
	private Scanner sc = new Scanner(System.in);

	public void mainMenu() {
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("���� : ");
		int age = Integer.parseInt(sc.nextLine());
		System.out.print("���� : ");
		char gender = sc.nextLine().charAt(0);

		Member mem = new Member(name, age, gender);
		lc.insertMember(mem);
		int menu = 0;

		while (menu != 9) {

			System.out.println("1. ����������");
			System.out.println("2. ���� ��ü ��ȸ");
			System.out.println("3. ���� �˻�");
			System.out.println("4. ���� �뿩�ϱ�");
			System.out.println("9. ���α׷� �����ϱ�");
			System.out.print("�޴� ��ȣ : ");
			menu = sc.nextInt();
			switch (menu) {
			case 1:
				lc.myInfo();
				break;
			case 2:
				selectAll();
				break;
			case 3:
				searchBook();
				break;
			case 4:
				rentBook();
				break;
			case 9:
				break;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}
	}

	public void selectAll() {
		Book[] bList = lc.selectAll();
		for(int i = 0; i< bList.length; i++) {
			System.out.println(i + "������ : " + bList[i]);
		}
	}

	public void searchBook() {
		System.out.print("�˻��� ���� Ű���� : ");
		String keyword = sc.nextLine();
		lc.searchBook(keyword);
		
	}

	public void rentBook() {
		selectAll();
		System.out.print("�뿩�� ���� ��ȣ ���� : ");
		int index = sc.nextInt();
		int result = lc.rentBook(index);
		
		if (result==0) {
			System.out.println("���������� �뿩�Ǿ����ϴ�.");
		} else if (result == 1) {
			System.out.println("���� �������� �뿩 �Ұ����Դϴ�.");
		} else {
			System.out.println("���������� �뿩�Ǿ����ϴ�. �丮�п� ������ �߱޵Ǿ����� �������������� Ȯ���ϼ���");
		}
	}

}
