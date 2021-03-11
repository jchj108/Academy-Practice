package com.kh.homework.ooparray.student.view;

import com.kh.homework.ooparray.student.controller.StudentController;
import com.kh.homework.ooparray.student.model.vo.Student;

public class StudentMenu {

	private StudentController ssm = new StudentController();

	public StudentMenu() {

		System.out.println("======== 학생 정보 출력 ========");
		Student[] sArr = ssm.printStudent();
		for (int i = 0; i < sArr.length; i++) {
			System.out.println(sArr[i].inform());
		}

		System.out.println();

		System.out.println("======== 학생 정보 출력 ========");
		double[] result = ssm.avgScore();
		System.out.print("학생 점수 합계 : ");
		System.out.println(result[0]);

		System.out.print("학생 점수 평균 : ");
		System.out.println(result[1]);
		
		System.out.println();
		System.out.println("======== 학생 정보 출력 ========");
		for(int i = 0; i<sArr.length; i++) {
			if(sArr[i].getScore() < ssm.CUT_LINE) {
				System.out.println(sArr[i].getName() + "학생은 재시험 대상입니다");
			} else {
				System.out.println(sArr[i].getName() + "학생은 통과입니다.");
			}
		}
	}

}
