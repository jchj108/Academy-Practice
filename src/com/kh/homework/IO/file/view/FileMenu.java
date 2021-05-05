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
			System.out.println("1. ��Ʈ ���� �����");
			System.out.println("2. ��Ʈ ����");
			System.out.println("3. ��Ʈ ��� �����ϱ�");
			System.out.println("9. ������");
			System.out.print("�޴� ��ȣ : ");
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
				System.out.println("���α׷��� �����մϴ�");
				break;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
		} while (menuNum == 9);
	}

	public void fileSave() {

		StringBuilder sb = new StringBuilder();
		String user = "";

		do {
			System.out.println("���Ͽ� ������ ������ �Է��ϼ���.");
			System.out.println("ex��it�̶�� �Է��ϸ� ����˴ϴ�.");
			System.out.print("���� :");
			user = sc.nextLine();
			if (!user.equalsIgnoreCase("ex��it")) {
				sb.append(user + "\n");
			}
		} while (!user.equalsIgnoreCase("ex��it"));

		boolean check = false;
		String file = null;

		do {
			System.out.print("������ ���� ���� �Է����ּ���(ex. myFile.txt) : ");
			file = sc.nextLine();
			check = fc.checkName(file);

			if (check) {
				System.out.println("�̹� �����ϴ� �����Դϴ�. ����ðڽ��ϱ�?(y/n)");
				String yn = sc.nextLine();
				if (yn.equalsIgnoreCase("y")) {
					fc.fileSave(file, sb);
					check = false;
				} else {
					System.out.println("������ ���� ���� �Է����ּ��� ~");
					check = true;
				}
			} else {
				fc.fileSave(file, sb);
			}
		} while (check);
	}

	public void fileOpen() {
		System.out.print("�� ���� �� : ");
		String file = sc.nextLine();
		boolean check = fc.checkName(file);
		
		if(check) {
			System.out.println(fc.fileOpen(file));
		} else {
			System.out.println("���� �����Դϴ�.");
		}
	}

	public void fileEdit() {
		System.out.println("������ ���� �� : ");
		String file = sc.nextLine();
		boolean check = fc.checkName(file);
		
		if(check) {
			
		}
	}

}
