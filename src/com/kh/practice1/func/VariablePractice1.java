package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice1 {
	public void q1() {

	Scanner sc = new Scanner(System.in);
	
	System.out.println("�̸��� �Է��ϼ���");
	String name = sc.nextLine();
	System.out.println("������ �Է��ϼ���(��/��)");
	String strsex = sc.nextLine();
	char sex = strsex.charAt(0);
	System.out.println("���̸� �Է��ϼ���");
	int age = sc.nextInt();
	System.out.println("Ű�� �Է��ϼ���(cm)");
	double height = sc.nextDouble();
	
	System.out.printf("Ű %.1f�� %d�� %s�� %s�� �ݰ����ϴ�^^", height, age, sex, name);
	}
}
	

