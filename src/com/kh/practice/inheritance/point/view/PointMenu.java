package com.kh.practice.inheritance.point.view;

import java.util.Scanner;

import com.kh.practice.inheritance.point.controller.CircleController;
import com.kh.practice.inheritance.point.controller.RectangleController;

public class PointMenu {

	Scanner sc = new Scanner(System.in);
	CircleController cc = new CircleController();
	RectangleController rc = new RectangleController();

	public void mainMenu() {

		int menu = 0;
		do {
			System.out.println("===== �޴� =====");
			System.out.println("1. ��");
			System.out.println("2. �簢��");
			System.out.println("9. ������");
			System.out.print("�޴� ��ȣ : ");
			menu = sc.nextInt();
			switch (menu) {
			case 1:
				circleMenu();
				break;
			case 2:
				retangleMenu();
				break;
			case 9:
				System.out.println("�����մϴ�.");
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�");
			}
		} while (menu != 9);
	}

	public void circleMenu() {

		int num = 0;

		System.out.println("===== �� �޴� =====");
		System.out.println("1. �� �ѷ�");
		System.out.println("2. �� ����");
		System.out.println("9. ��������");
		System.out.print("�޴� ��ȣ : ");
		num = sc.nextInt();

		switch (num) {
		case 1:
			calcCircum();
			break;
		case 2:
			calcCircleArea();
			break;
		case 9:
			System.out.println("�������� ���ư��ϴ�");
			break;
		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�");
		}

	}

	public void retangleMenu() {
		int num = 0;

		System.out.println("===== �簢�� �޴� =====");
		System.out.println("1. �簢�� �ѷ�");
		System.out.println("2. �簢�� ����");
		System.out.println("9. ��������");
		System.out.print("�޴� ��ȣ : ");
		num = sc.nextInt();

		switch (num) {
		case 1:
			calcPerimeter();
			break;
		case 2:
			calcRectArea();
			break;
		case 9:
			System.out.println("�������� ���ư��ϴ�");
			break;
		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�");
		}
	}

	public void calcCircum() {

		System.out.print("x ��ǥ : ");
		int x = sc.nextInt();
		System.out.print("y ��ǥ : ");
		int y = sc.nextInt();
		System.out.print("������ : ");
		int radius = sc.nextInt();

		System.out.println("�ѷ� : " + cc.calcCircum(x, y, radius));
	}

	public void calcCircleArea() {

		System.out.print("x ��ǥ : ");
		int x = sc.nextInt();
		System.out.print("y ��ǥ : ");
		int y = sc.nextInt();
		System.out.print("������ : ");
		int radius = sc.nextInt();

		System.out.println("���� : " + cc.calcArea(x, y, radius));
	}

	public void calcPerimeter() {

		System.out.print("x ��ǥ : ");
		int x = sc.nextInt();
		System.out.print("y ��ǥ : ");
		int y = sc.nextInt();
		System.out.print("���� : ");
		int height = sc.nextInt();
		System.out.print("�ʺ� : ");
		int width = sc.nextInt();

		System.out.println("�ѷ� : " + rc.calcPerimeter(x, y, height, width));
	}

	public void calcRectArea() {

		System.out.print("x ��ǥ : ");
		int x = sc.nextInt();
		System.out.print("y ��ǥ : ");
		int y = sc.nextInt();
		System.out.print("���� : ");
		int height = sc.nextInt();
		System.out.print("�ʺ� : ");
		int width = sc.nextInt();

		System.out.println("�ѷ� : " + rc.calcArea(x, y, height, width));
	}
}
