package com.kh.homework.abstractNInterface.run;

import com.kh.homework.abstractNInterface.controller.PhoneController;

public class Run {
	public static void main(String[] args) {
		
		PhoneController pc = new PhoneController();
		String[] result = pc.method();
		for(int i = 0; i<result.length; i++) {
			System.out.println(result[i]);
			System.out.println();
		}
		
	}
}
