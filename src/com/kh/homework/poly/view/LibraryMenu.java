package com.kh.homework.poly.view;

import java.util.Scanner;

import com.kh.homework.poly.controller.LibraryController;
import com.kh.homework.poly.model.vo.Book;
import com.kh.homework.poly.model.vo.Member;

public class LibraryMenu {

	private LibraryController lc = new LibraryController();
	private Scanner sc = new Scanner(System.in);

	public void mainMenu() {
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("나이 : ");
		int age = Integer.parseInt(sc.nextLine());
		System.out.print("성별 : ");
		char gender = sc.nextLine().charAt(0);

		Member mem = new Member(name, age, gender);
		lc.insertMember(mem);
		int menu = 0;

		while (menu != 9) {

			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("9. 프로그램 종료하기");
			System.out.print("메뉴 번호 : ");
			menu = sc.nextInt();
			switch (menu) {
			case 1:
				lc.myInfo();
				break;
			case 2:
				lc.selectAll();
				break;
			case 3:
				lc.searchBook();
				break;
			case 4:
				lc.rentBook(index);
				break;
			case 9:
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}

	public void selectAll() {
		Book[] bList = lc.selectAll();
		for(int i = 0; i< bList.length; i++) {
			System.out.println(i + "번도서 : " + bList[i]);
		}
	}

	public void searchBook() {
		System.out.print("검색할 제목 키워드 : ");
		String keyword = sc.nextLine();
		lc.searchBook(keyword);
		
	}

	public void rentBook() {

	}

}
