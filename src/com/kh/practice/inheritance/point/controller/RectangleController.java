package com.kh.practice.inheritance.point.controller;

import com.kh.practice.inheritance.point.model.vo.Rectangle;

public class RectangleController {

	private Rectangle r = new Rectangle();
	
	public String calcArea(int x, int y, int height, int width) {
		
		r = new Rectangle(x, y, height, width);
		
		return r + " / " + (height * width);
		
	}
	
	public String calcPerimeter(int x, int y, int height, int width) {
		
		r = new Rectangle(x, y, height, width);
		
		return r + " / " + 2 * (height + width);
		
	}
	
	
}
