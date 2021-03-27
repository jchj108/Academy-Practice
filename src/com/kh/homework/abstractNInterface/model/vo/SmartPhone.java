package com.kh.homework.abstractNInterface.model.vo;

public abstract class SmartPhone implements Phone, TouchDisplay {

	private String maker;

	public SmartPhone() {
	}


	public void setMaker(String maker) {
		this.maker = maker;
	}

	public String getMaker() {
		return maker;
	}
	public abstract String printInformation();

}
