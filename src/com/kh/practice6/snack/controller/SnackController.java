package com.kh.practice6.snack.controller;

import com.kh.practice6.snack.model.vo.Snack;

public class SnackController {

	Snack s = new Snack();

	public SnackController() {
	}

	public String saveData(String kind, String name, String flavor, int numOf, int price) {
		s.setKind(kind);
		s.setName(name);
		s.setFlavor(flavor);
		s.setNumOf(numOf);
		s.setPrice(price);
		
		return "���� �Ϸ�Ǿ����ϴ�.";
	}
	
	public String confirmData() {
		return s.information();
	}

}
