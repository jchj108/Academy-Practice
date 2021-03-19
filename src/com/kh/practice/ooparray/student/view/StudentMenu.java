package com.kh.practice.ooparray.student.view;

import com.kh.practice.ooparray.student.controller.StudentController;
import com.kh.practice.ooparray.student.model.vo.Student;

public class StudentMenu {

	private StudentController ssm = new StudentController();

	public StudentMenu() {

		System.out.println("======== �л� ���� ��� ========");
		Student[] sArr = ssm.printStudent();
		for (int i = 0; i < sArr.length; i++) {
			System.out.println(sArr[i].inform());
		}

		System.out.println();

		System.out.println("======== �л� ���� ��� ========");
		double[] result = ssm.avgScore();
		System.out.print("�л� ���� �հ� : ");
		System.out.println((int)result[0]);
		System.out.print("�л� ���� ��� : ");
		System.out.println(result[1]);
		
		System.out.println();
		System.out.println("======== �л� ���� ��� ========");
		for(int i = 0; i<sArr.length; i++) {
			if(sArr[i].getScore() < StudentController.CUT_LINE) {
				System.out.println(sArr[i].getName() + "�л��� ����� ����Դϴ�");
			} else {
				System.out.println(sArr[i].getName() + "�л��� ����Դϴ�.");
			}
		}
	}

}
