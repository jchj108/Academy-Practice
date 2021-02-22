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
	
	public void method7() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		double kor = sc.nextDouble();
		System.out.print("���� : ");
		double eng = sc.nextDouble();
		System.out.print("���� : ");
		double math = sc.nextDouble();
		
		double sum = kor + eng + math;
		double average = sum / 3;

		String result = 60<=average && (40<=kor && 40<=eng && 40<=math) ? "�հ��Դϴ�" : "���հ��Դϴ�";
		
		System.out.println(result);
	}
	
	public void method8() {
		
		System.out.print("�ֹι�ȣ�� �Է��ϼ���(- ����) : ");
		Scanner sc = new Scanner(System.in);
		String personNo = sc.nextLine();
		char genderNo = personNo.charAt(7);
		
		String result = genderNo == '1' || genderNo == '3' ? "�����Դϴ�" : (genderNo == '2' || genderNo == '4' ? "�����Դϴ�" : "�ùٸ� ���� �Է��ϼ���");
		System.out.println(result);
	}
	
	public void method9() {
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("����1 : ");
		int num1 = sc.nextInt();
		System.out.printf("����2 : ");
		int num2 = sc.nextInt();
		System.out.printf("�Է� : ");
		int tmp = sc.nextInt();
		
//		String result = num1 > num2 ? "num1�� num2���� ���� ������ �մϴ�" : (num1 >= tmp || tmp > num2 ? "true" : "false");
		boolean result = (num1 >= tmp || tmp > num2) && num1<num2;
		System.out.println(result);
	}
	
	public void method10() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Է�1 : ");
		int num1 = sc.nextInt();
		System.out.print("�Է�2 : ");
		int num2 = sc.nextInt();
		System.out.print("�Է�3 : ");
		int num3 = sc.nextInt();
		
		boolean result = (num1 == num2 && num2 == num3);
		System.out.println(result);
		
	}
	
	public void method11() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A��� ���� : ");
		int as = sc.nextInt();
		System.out.printf("B��� ���� : ");
		int bs = sc.nextInt();
		System.out.printf("C��� ���� : ");
		int cs = sc.nextInt();
		
		Double fas = as * 1.4;
		Double fbs = (double)bs;
		Double fcs = (double)cs * 1.15;
		
		
		System.out.println("A��� ����/����+a : " + as + "/" + fas);
		System.out.println(fas>=3000 ? "3000 �̻�" : "3000 �̸�");
		System.out.println("B��� ����/����+a : " + bs + "/" + fbs);
		System.out.println(fbs>=3000 ? "3000 �̻�" : "3000 �̸�");
		System.out.println("C��� ����/����+a : " + cs + "/" + fcs);
		System.out.println(fcs>=3000 ? "3000 �̻�" : "3000 �̸�");
	
	}
}
