package com.kh.homework.inheritance.hw.point.controller;

import com.kh.homework.inheritance.hw.point.model.vo.Circle;

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
