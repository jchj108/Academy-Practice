package com.kh.practice3.func;

import java.util.Scanner;

public class OperatorPractice {
	public void method1() {
		
		System.out.print("���� : ");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		String result = num > 0 ? "�����" : (num==0 ? "0�̴�" : "����� �ƴϴ�");
		System.out.println(result);
	}
	
	public void method2() {
		System.out.print("���� : ");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		String result = num > 0 ? "�����" : (num==0 ? "0�̴�" : "������");
		System.out.println(result);
	}

	public void method3() {
		System.out.print("���� : ");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		String result = num%2==0 ? "¦����" : "Ȧ����";
		System.out.println(result);
	}
	
	public void method4() {

		Scanner sc = new Scanner(System.in);

		System.out.print("�ο� �� : ");
		int member = sc.nextInt();
		System.out.print("���� ���� : ");
		int candy = sc.nextInt();
		
		int candyperperson = candy / member;
		int restcandy = candy % member;

		System.out.println("1�δ� ���� ���� : " + candyperperson);
		System.out.println("���� ���� ���� : " + restcandy);
	}
	
	public void method5() {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("�г�(���ڸ�) : ");
		String stryear = sc.nextLine();
		int year = Integer.parseInt(stryear);
		System.out.print("��(���ڸ�) : ");
		String strcla = sc.nextLine();
		int cla = Integer.parseInt(strcla);
		System.out.print("��ȣ(���ڸ�) : ");
		String strnum = sc.nextLine();
		int num = Integer.parseInt(strnum);
		System.out.print("����(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		System.out.print("����(�Ҽ��� �Ʒ� ��°�ڸ�����) ");
		double grade = sc.nextDouble();
		
		String kgender = gender == 'M' ? "��" : "��";
		
		
		System.out.printf("%d�г� %d�� %d�� %s %s�л��� ������ %.2f�̴�.", year, cla, num, name, kgender, grade);
	}
	
	public void method6() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int age = sc.nextInt();
		String result = age>19 ? "����" : (age>13 ? "û�ҳ�" : "���");
		System.out.println(result);
	}
}
