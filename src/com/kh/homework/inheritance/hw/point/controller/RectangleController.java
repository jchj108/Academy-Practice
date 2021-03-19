package com.kh.homework.inheritance.hw.point.controller;

import com.kh.homework.inheritance.hw.point.model.vo.Rectangle;

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
