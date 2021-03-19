package com.kh.homework.inheritance.hw.point.model.vo;

public class Rectangle extends Point {
	
	private int width;
	private int height;
	
	public Rectangle() {
		
	}
	
	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", " + width + ", " + height;
	}
}
