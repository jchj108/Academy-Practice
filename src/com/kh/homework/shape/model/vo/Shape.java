package com.kh.homework.shape.model.vo;

public class Shape {

	private int type;
	private double height;
	private double width;
	private String color = "White";
	
	public Shape() {
	}
	public Shape(int type, double height, double width) {
		this.type = type;
		this.height = height;
		this.width = width;
	}
	
	public void setType(int type) {
		this.type = type;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public void SetColor(String color) {
		this.color = color;
	}
	public int getType() {
		return type;
	}
	public double getHeight() {
		return height;
	}
	public double getWidth() {
		return width;
	}
	public String getColor() {
		return color;
	}
	
	public String inform() {
		String realType = null;
		if(type == 3) {
			realType = "삼각형";
		} else {
			realType = "사각형";
		}
		return "type : " + realType + " / height : " + height + " / width : " + width + " / color : " + color;  
	}
}
