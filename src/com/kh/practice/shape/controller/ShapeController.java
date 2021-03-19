package com.kh.practice.shape.controller;

import com.kh.practice.shape.model.vo.Shape;

public class ShapeController {
	private Shape s = new Shape();

	public double calcPerimeter(int type, double height, double width) {
		s.setType(type);
		s.setHeight(height);
		s.setWidth(width);

		return 2 * (height + width);
	}
	
	public double calcArea(int type, double height, double width) {
		s.setType(type);
		s.setHeight(height);
		s.setWidth(width);
		
		double result = 0.0;
		if(type == 3) {
			result = height * width * 0.5;
		} else {
			result = height * width;
		}
		
		return result;
	}
	
	public void paintColor(String color) {
		s.SetColor(color);
	}
	
	public String print(int type) {
		String result = null;
		String shape = type == 3 ? "삼각형" : "사각형";
		
		if(type != s.getType() || s.getHeight() == 0.0 || s.getWidth() == 0.0) {
			result = shape + "의 높이 또는 너비가 설정되지 않았습니다.";
			if(type != s.getType()) {
				s.SetColor("White");
			}
		} else {
			result = s.inform();
		}
		
		return result;
	}
}
