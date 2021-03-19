package com.kh.practice.inheritance.point.controller;

import com.kh.practice.inheritance.point.model.vo.Circle;

public class CircleController {

	Circle c = new Circle();

	public String calcArea(int x, int y, int radius) {

		c = new Circle(x, y, radius);

		return c + " / " + Math.PI * (radius * radius);

	}

	public String calcCircum(int x, int y, int radius) {

		c = new Circle(x, y, radius);

		return c + " / " + Math.PI * (radius * 2);

	}
}
