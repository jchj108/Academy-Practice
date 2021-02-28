package com.kh.practice5.func;

import java.util.Scanner;

public class Loop {

	public void practice1() {

		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է��ϼ��� : ");
		int num = sc.nextInt();

		if (num >= 1) {
			for (int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���");
		}

	}

	public void practice2() {

		while (true) {

			Scanner sc = new Scanner(System.in);
			System.out.print("���� �Է��ϼ��� : ");
			int num = sc.nextInt();

			if (num >= 1) {
				for (int i = 1; i <= num; i++) {
					System.out.print(i + " ");
				}
				break;
			} else {
				System.out.println("1 �̻��� ���ڸ� �Է����ּ���");
			}
		}
	}

	public void practice3() {

		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է��ϼ��� : ");
		int num = sc.nextInt();

		if (num >= 1) {
			for (int i = num; i >= 1; i--) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1 �̻��� ���ڸ� �Է��ϼ���");
		}
	}

	public void practice4() {

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("���� �Է��ϼ��� : ");
			int num = sc.nextInt();

			if (num >= 1) {
				for (int i = num; i >= 1; i--) {
					System.out.print(i + " ");
				}
				break;
			} else {
				System.out.println("1 �̻��� ���ڸ� �Է��ϼ���");
			}
		}
	}

	public void practice5() {

		Scanner sc = new Scanner(System.in);
		System.out.print("������ �ϳ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		int i = 1;
		int sum = 0;

		while (i <= num) {
			sum = sum + i;
			System.out.print(i + " ");
			i++;
		}
		System.out.print("= " + sum);
	}

	public void practice6() {

		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° ���� : ");
		int num1 = sc.nextInt();
		System.out.print("�� ��° ���� : ");
		int num2 = sc.nextInt();

		int max = 0;
		int min = 0;

		if (num1 > num2) {
			max = num1;
			min = num2;
		} else {
			max = num2;
			min = num1;
		}

		if (min >= 1 && max >= 1) {
			for (int i = min; min <= max; min++) {
				System.out.print(min + " ");
			}
		} else {
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
		}
	}

	public void practice7() {

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("ù ��° ���� : ");
			int num1 = sc.nextInt();
			System.out.print("�� ��° ���� : ");
			int num2 = sc.nextInt();

			int max = 0;
			int min = 0;

			if (num1 > num2) {
				max = num1;
				min = num2;
			} else {
				max = num2;
				min = num1;
			}

			if (min >= 1 && max >= 1) {
				for (int i = min; min <= max; min++) {
					System.out.print(min + " ");
				}
				break;
			} else {
				System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
			}
		}
	}

	public void practice8() {

		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int dan = sc.nextInt();
		System.out.printf("==== %d�� ====%n", dan);

		int i = 1;
		while (i <= 9) {
			System.out.printf("%d * %d = %d%n", dan, i, (dan * i));
			i++;
		}
	}

	public void practice9() {

		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int dan = sc.nextInt();

		if (dan <= 9) {
			for (int i = dan; dan < 10; dan++) {
				System.out.printf("=== %d�� ====%n", dan);
				for (int j = 1; j < 10; j++) {
					System.out.printf("%d * %d = %d%n", dan, j, (dan * j));
				}
				System.out.println();
			}
		} else {
			System.out.println("9 ������ ���ڸ� �Է��� �ּ���");
		}
	}

	public void practice10() {

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("���� : ");
			int dan = sc.nextInt();

			if (dan <= 9) {
				for (int i = dan; dan < 10; dan++) {
					System.out.printf("=== %d�� ====%n", dan);
					for (int j = 1; j < 10; j++) {
						System.out.printf("%d * %d = %d%n", dan, j, (dan * j));
					}
					System.out.println();
				}
				break;
			} else {
				System.out.println("9 ������ ���ڸ� �Է��� �ּ���");
			}
		}
	}

	public void practice11() {

		Scanner sc = new Scanner(System.in);

		System.out.print("���� ���� : ");
		int num = sc.nextInt();
		System.out.print("���� : ");
		int add = sc.nextInt();
		int sum = num;

		for (int i = 0; i < 10; i++) {
			System.out.print(sum + " ");
			sum = sum + add;
		}

	}

	public void practice12() {

		String sign = " ";

		while (true) {
			
			Scanner sc = new Scanner(System.in);
			System.out.print("������(+, -, *, /, %) : ");
			sign = sc.nextLine();
			
			if(sign.equals("exit")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			
			System.out.print("����1 : ");
			int num1 = sc.nextInt();
			System.out.print("����2 : ");
			int num2 = sc.nextInt();
			int result = 0;
			boolean special = false;

			if (sign.equals("+")) {
				result = num1 + num2;
			} else if (sign.equals("-")) {
				result = num1 - num2;
			} else if (sign.equals("*")) {
				result = num1 * num2;
			} else if (sign.equals("/")) {
				if (num2 == 0) {
					System.out.println("0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���");
					special = true;
				} else {
					result = num1 / num2;
				}
			} else if (sign.equals("%")) {
				result = num1 % num2;
			} else {
				System.out.println("���� �������Դϴ�. �ٽ� �Է����ּ���.");
			}
				if(sign.equals("+")||sign.equals("-")||sign.equals("/")||
						sign.equals("*")||sign.equals("%")) {
					if(special==false) {
				System.out.printf("%d %s %d = %d%n", num1, sign, num2, result);
					}
				}
			}
		}
	
	public void practice13() {
			
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice14() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			for(int j=num; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

//			switch (sign) {
//	
//			case '+':
//				result = num1 + num2;
//				break;
//			case '-':
//				result = num1 - num2;
//				break;
//			case '*':
//				result = num1 * num2;
//				break;
//			case '/':
//				if (num2!=0) {
//					result = num1 / num2;
//					break;
//				} else {
//					System.out.println("0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���");
//				}
//			case '%':
//				result = num1 % num2;
//				break;
//			default :
//				System.out.println("���� �������Դϴ�. �ٽ� �Է����ּ���.");
//				break;
//			}
//			System.out.printf("%d %s %d = %d%n", num1, sign, num2, result);