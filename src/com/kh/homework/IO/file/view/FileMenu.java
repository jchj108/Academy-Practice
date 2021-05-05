package com.kh.homework.IO.file.view;

import java.util.Scanner;

import com.kh.homework.IO.file.controller.FileController;

public class FileMenu {
	private Scanner sc = new Scanner(System.in);
	private FileController fc = new FileController();

	public void mainMenu() {

		int menuNum = 0;

		do {
			System.out.println("***** My Note *****");
			System.out.println("1. 노트 새로 만들기");
			System.out.println("2. 노트 열기");
			System.out.println("3. 노트 열어서 수정하기");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			menuNum = sc.nextInt();

			switch (menuNum) {
			case 1:
				fileSave();
				break;
			case 2:
				fileOpen();
				break;
			case 3:
				fileEdit();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다");
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		} while (menuNum == 9);
	}

	public void fileSave() {

		StringBuilder sb = new StringBuilder();
		String user = "";

		do {
			System.out.println("파일에 저장할 내용을 입력하세요.");
			System.out.println("ex끝it이라고 입력하면 종료됩니다.");
			System.out.print("내용 :");
			user = sc.nextLine();
			if (!user.equalsIgnoreCase("ex끝it")) {
				sb.append(user + "\n");
			}
		} while (!user.equalsIgnoreCase("ex끝it"));

		boolean check = false;
		String file = null;

		do {
			System.out.print("저장할 파일 명을 입력해주세요(ex. myFile.txt) : ");
			file = sc.nextLine();
			check = fc.checkName(file);

			if (check) {
				System.out.println("이미 존재하는 파일입니다. 덮어쓰시겠습니까?(y/n)");
				String yn = sc.nextLine();
				if (yn.equalsIgnoreCase("y")) {
					fc.fileSave(file, sb);
					check = false;
				} else {
					System.out.println("저장할 파일 명을 입력해주세요 ~");
					check = true;
				}
			} else {
				fc.fileSave(file, sb);
			}
		} while (check);
	}

	public void fileOpen() {
		System.out.print("열 파일 명 : ");
		String file = sc.nextLine();
		boolean check = fc.checkName(file);
		
		if(check) {
			System.out.println(fc.fileOpen(file));
		} else {
			System.out.println("없는 파일입니다.");
		}
	}

	public void fileEdit() {
		System.out.println("수정할 파일 명 : ");
		String file = sc.nextLine();
		boolean check = fc.checkName(file);
		
		if(check) {
			
		}
	}

}
