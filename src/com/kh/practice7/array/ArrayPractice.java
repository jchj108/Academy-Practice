package com.kh.practice7.array;

import java.util.Scanner;

public class ArrayPractice {

	public void practice1() {
		int[] iArr = new int[10];

		for (int i = 0; i < iArr.length; i++) {
			iArr[i] = i + 1;

			System.out.print(iArr[i] + " ");
		}

	}

	public void practice2() {
		int[] iArr = new int[10];

		for (int i = 0; i < iArr.length; i++) {
			iArr[i] = iArr.length - i;

			System.out.print(iArr[i] + " ");
		}

	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);

		System.out.print("���� ���� : ");
		int num = sc.nextInt();

		int[] iArr = new int[num];

		for (int i = 0; i < iArr.length; i++) {
			iArr[i] = i + 1;
			System.out.print(iArr[i] + " ");
		}

	}

	public void practice4() {

		String[] sArr = new String[5];

		sArr[0] = "���";
		sArr[1] = "��";
		sArr[2] = "����";
		sArr[3] = "������";
		sArr[4] = "����";

		System.out.println(sArr[1]);
	}

	public void practice5() {

		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ� : ");
		String str = sc.nextLine();
		System.out.print("���� : ");
		char ch = sc.nextLine().charAt(0);

		char[] chArr = new char[str.length()];
		int count = 0;
		int i = 0;

		System.out.print(str + "�� " + ch + "�� �����ϴ� ��ġ(�ε���) : ");
		for (i = 0; i < str.length(); i++) {
			chArr[i] = str.charAt(i);

			if (chArr[i] == ch) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println();
		System.out.println("i ���� : " + count);

	}

	public void practice6() {

		Scanner sc = new Scanner(System.in);

		String[] sArr = new String[] { "������", "ȭ����", "������", "�����", "�ݿ���", "�����", "�Ͽ���" };

		System.out.print("0 ~ 6 ���� ���� �Է� : ");
		int num = sc.nextInt();

		if (num >= 0 && num <= 6) {
			System.out.println(sArr[num]);
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}

	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);

		System.out.print("���� : ");
		int num = sc.nextInt();
		int[] iArr = new int[num];
		int sum = 0;

		for (int i = 0; i < num; i++) {
			System.out.print("�迭 " + i + "��° �ε����� ���� �� : ");
			iArr[i] = sc.nextInt();
		}

		for (int i = 0; i < iArr.length; i++) {
			System.out.print(iArr[i] + " ");
			sum += iArr[i];
		}
		System.out.println();
		System.out.println("�� �� : " + sum);
	}

	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� : ");

		while (true) {
			int num = sc.nextInt();
			int[] iArr;
			if (num >= 3 && num % 2 != 0) {
				iArr = new int[num];
				int div = num / 2;

				for (int i = 0; i <= div; i++) {
					iArr[i] = i + 1;
				}
				for (int i = div; i < iArr.length; i++) {
					iArr[i] = iArr.length - i;
				}
				for (int i = 0; i < num; i++) {
					System.out.print(iArr[i] + " ");
				}
				break;
			} else {
				System.out.println("�ٽ� �Է��ϼ���.");
			}
		}
	}
	public void practice9() {
		
		String[] chicken = new String[] {"���", "�Ĵ�", "�Ķ��̵�", "����", };
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ġŲ �̸��� �Է��ϼ���.");
		
		
		
		
		
		
		
		
		
		
		
	}
}
