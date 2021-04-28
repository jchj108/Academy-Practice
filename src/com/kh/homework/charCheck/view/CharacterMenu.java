package com.kh.homework.charCheck.view;

import java.util.Scanner;

import com.kh.homework.charCheck.controller.CharacterController;
import com.kh.homework.charCheck.exception.CharCheckException;

public class CharacterMenu {

	public static void menu() {

		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		int result = 0;
		
		
		try {
			result = new CharacterController().countAlpha(input);
		} catch (CharCheckException e) {
			e.printStackTrace();
		}
		
		System.out.println(result);
	}

}
