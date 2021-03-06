package com.kh.practice.ooparray.student.controller;

import com.kh.practice.ooparray.student.model.vo.Student;

public class StudentController {

	private Student[] sArr = new Student[5];
	public static final int CUT_LINE = 60;

	public StudentController() {
		sArr[0] = new Student("김길동", "자바", 100);
		sArr[1] = new Student("박길동", "디비", 50);
		sArr[2] = new Student("이길동", "화면", 85);
		sArr[3] = new Student("정길동", "서버", 60);
		sArr[4] = new Student("홍길동", "자바", 20);
	}

	public Student[] printStudent() {
		return sArr;
	}

	public int sumScore() {

		int result = 0;

		for (int i = 0; i < sArr.length; i++) {
			result += sArr[i].getScore();
		}
		return result;

	}
	
	public double[] avgScore() {
		
		double[] score = new double[2];
		
		score[0] = sumScore();
		score[1] = sumScore() / sArr.length;
		
		return score;
		
	}

}
