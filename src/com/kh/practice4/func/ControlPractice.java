package com.kh.practice4.func;

import java.util.Scanner;

public class ControlPractice {

	public void practice1() {

		Scanner sc = new Scanner(System.in);

		System.out.println("1. �Է�");
		System.out.println("2. ����");
		System.out.println("3. ��ȸ");
		System.out.println("4. ����");
		System.out.println("7. ����");
		System.out.printf("�޴� ��ȣ�� �Է��ϼ��� : ");
		int num = sc.nextInt();

		switch (num) {
		case 1:
			System.out.println("�Է� �޴��Դϴ�.");
			break;
		case 2:
			System.out.println("���� �޴��Դϴ�.");
			break;
		case 3:
			System.out.println("��ȸ �޴��Դϴ�.");
			break;
		case 4:
			System.out.println("���� �޴��Դϴ�.");
			break;
		case 7:
			System.out.println("���α׷��� �����մϴ�");
			break;
		}
	}

	public void practice2() {

		Scanner sc = new Scanner(System.in);

		System.out.print("���� �Է� : ");
		int num = sc.nextInt();

		if (num > 0) {
			if (num % 2 == 0) {
				System.out.println("¦����");
			} else {
				System.out.println("Ȧ����");
			}
		} else {
			System.out.println("����� �Է����ּ���.");
		}
	}

	public void practice3() {

		Scanner sc = new Scanner(System.in);
		System.out.print("�������� : ");
		int kor = sc.nextInt();
		System.out.print("�������� : ");
		int eng = sc.nextInt();
		System.out.print("�������� : ");
		int math = sc.nextInt();
		int average = (kor + eng + math) / 3;
		int sum = kor + eng + math;

		if (math >= 40 && kor >= 40 && eng >= 40) {
			if (average >= 60) {
				System.out.println("���� : " + kor);
				System.out.println("���� : " + math);
				System.out.println("���� : " + eng);
				System.out.println("�հ� : " + sum);
				System.out.println("��� : " + average);
				System.out.println("�����մϴ�," + " �հ��Դϴ�!");
			} else {
				System.out.println("���� : " + kor);
				System.out.println("���� : " + math);
				System.out.println("���� : " + eng);
				System.out.println("�հ� : " + sum);
				System.out.println("��� : " + average);
				System.out.println("���հ��Դϴ�.");
			}
		} else {
			System.out.println("���� : " + kor);
			System.out.println("���� : " + math);
			System.out.println("���� : " + eng);
			System.out.println("�հ� : " + sum);
			System.out.println("��� : " + average);
			System.out.println("���հ��Դϴ�.");
		}
	}

	public void practice4() {
//		28 : 2
//		29 : 
//		30 : 4 6 9 11
//		31 : 1 3 5 7 8 10 12 

		Scanner sc = new Scanner(System.in);
		System.out.print("1~12 ������ ���� �Է� : ");
		int month = sc.nextInt();
		String spring = "��";
		String summer = "����";
		String autumn = "����";
		String winter = "�ܿ�";
		String result = null;

		switch (month) {
		case 12:
		case 1:
		case 2:
			result = winter;
			break;
		case 3:
		case 4:
		case 5:
			result = spring;
			break;
		case 6:
		case 7:
		case 8:
			result = summer;
			break;
		case 9:
		case 10:
		case 11:
			result = autumn;
			break;
		default:
			System.out.println(month + "���� �߸� �Էµ� ���Դϴ�.");
		}
		if (month > 0 && month <= 12)
			System.out.println(month + "���� " + result + "�Դϴ�.");
	}

	public void practice5() {

		Scanner sc = new Scanner(System.in);
		System.out.print("���̵� : ");
		String id = sc.nextLine();
		System.out.print("��й�ȣ : ");
		String pw = sc.nextLine();

		if (id.equals("myId") && pw.equals("myPassword12")) {
			System.out.println("�α��� ����");
		} else if (id.equals("myId")) {
			System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
		} else if (pw.equals("myPassword12")) {
			System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
		}

	}

	public void practice6() {

		Scanner sc = new Scanner(System.in);
		System.out.print("������ Ȯ���ϰ��� �ϴ� ȸ�� ��� : ");
		String client = sc.nextLine();

		switch (client) {
		case "������":
			System.out.print("ȸ������, �Խñ� ����, �Խñ� �ۼ�, ��� �ۼ�, �Խñ� ��ȸ");
			break;
		case "ȸ��":
			System.out.print("�Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ�");
			break;
		case "��ȸ��":
			System.out.print("�Խñ� ��ȸ");
			break;
		}
	}

	public void practice7() {

		Scanner sc = new Scanner(System.in);
		System.out.print("Ű(m)�� �Է��� �ּ��� : ");
		double height = sc.nextDouble();
		System.out.print("������(kg)�� �Է��� �ּ��� : ");
		double weight = sc.nextDouble();

		final double BMI = weight / (height * height);
		String fat = null;

		if (BMI >= 30) {
			fat = "�� ��";
		} else if (BMI >= 25) {
			fat = "��";
		} else if (BMI >= 23) {
			fat = "��ü��";
		} else if (BMI >= 18.5) {
			fat = "����ü��";
		} else {
			fat = "��ü��";
		}

		System.out.println("BMI ���� : " + BMI);
		System.out.println(fat);
	}

	public void practice8() {

		Scanner sc = new Scanner(System.in);
		System.out.print("�ǿ�����1 �Է� : ");
		double num1 = sc.nextDouble();
		System.out.print("�ǿ�����2 �Է� : ");
		double num2 = sc.nextDouble();
		System.out.print("�����ڸ� �Է�(+,-,*,/,%) : ");
		char sign = sc.next().charAt(0);
		double result = 0;

		if (num1 > 0 && num2 > 0) {
			switch (sign) {
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			case '/':
				result = num1 / num2;
				break;
			case '%':
				result = num1 % num2;
				break;
			default :
				System.out.println("�߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�");
			}
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�");
		}
		if (num1 > 0 && num2 > 0 && (sign=='+'||sign=='-'||sign=='*'||sign=='/'||sign=='%'))
			System.out.println(num1 + " " + sign + " " + num2 + " = " + result);
	}

	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�߰� ��� ���� : ");
		double mid = sc.nextDouble();
		System.out.print("�⸻ ��� ���� : ");
		double fin = sc.nextDouble();
		System.out.print("���� ���� : ");
		double asi = sc.nextDouble();
		System.out.print("�⼮ ȸ�� : ");
		double att = sc.nextDouble();
		String result = null;
		double rate = mid * 0.2 + fin * 0.3 + asi * 0.3 + att;

		if (att > 14) {
			if (rate >= 70) {
				result = "Pass";
				System.out.println("�߰���� ����(20) : " + mid*0.2);
				System.out.println("�⸻��� ����(30) : " + fin*0.3);
				System.out.println("���� ����(30) : " + asi*0.3);
				System.out.println("�⼮ ����(20) : " + att);
				System.out.println("���� : " + rate);
			} else {
				result = "Fail[���� �̴�]";
				System.out.println("�߰���� ����(20) : " + mid*0.2);
				System.out.println("�⸻��� ����(30) : " + fin*0.3);
				System.out.println("���� ����(30) : " + asi*0.3);
				System.out.println("�⼮ ����(20) : " + att);
				System.out.println("���� : " + rate);
			}
		} else {
			result = "Fail[�⼮ ȸ�� ����" + "(" + att + "/20)]";
		}

		System.out.println(result);
	}

	public void practice10() {

		Scanner sc = new Scanner(System.in);

		System.out.println("������ ����� �����ϼ���.");
		System.out.println("1. �޴� ���");
		System.out.println("2. ¦��/Ȧ��");
		System.out.println("3. �հ�/���հ�");
		System.out.println("4. ����");
		System.out.println("5. �α���");
		System.out.println("6. ���� Ȯ��");
		System.out.println("7. BMI");
		System.out.println("8. ����");
		System.out.println("9. P/F");
		System.out.print("���� : ");
		int input = sc.nextInt();

		switch (input) {
		case 1:
			practice1();
			break;
		case 2:
			practice2();
			break;
		case 3:
			practice3();
			break;
		case 4:
			practice4();
			break;
		case 5:
			practice5();
			break;
		case 6:
			practice6();
			break;
		case 7:
			practice7();
			break;
		case 8:
			practice8();
			break;
		case 9:
			practice9();
			break;
		default:
			System.out.println("�߸� �Է��߽��ϴ�.");
			break;
		}

	}
} // end of class
