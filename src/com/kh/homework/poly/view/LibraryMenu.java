package com.kh.homework.poly.view;

import java.util.Scanner;

import com.kh.homework.poly.controller.LibraryController;
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
		
		while (menu!=9) {
			
		}
		
	}
	
	public void selectAll() {
		
	}
	
	public void searchBook() {
		
	}
	
	public void rentBook() {
		
	}
	
	
}
