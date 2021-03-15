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

		System.out.print("양의 정수 : ");
		int num = sc.nextInt();

		int[] iArr = new int[num];

		for (int i = 0; i < iArr.length; i++) {
			iArr[i] = i + 1;
			System.out.print(iArr[i] + " ");
		}

	}

	public void practice4() {

		String[] sArr = new String[5];

		sArr[0] = "사과";
		sArr[1] = "귤";
		sArr[2] = "포도";
		sArr[3] = "복숭아";
		sArr[4] = "참외";

		System.out.println(sArr[1]);
	}

	public void practice5() {

		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);

		char[] chArr = new char[str.length()];
		int count = 0;
		int i = 0;

		System.out.print(str + "에 " + ch + "가 존재하는 위치(인덱스) : ");
		for (i = 0; i < str.length(); i++) {
			chArr[i] = str.charAt(i);

			if (chArr[i] == ch) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println();
		System.out.println("i 개수 : " + count);

	}

	public void practice6() {

		Scanner sc = new Scanner(System.in);

		String[] sArr = new String[] { "월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일" };

		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();

		if (num >= 0 && num <= 6) {
			System.out.println(sArr[num]);
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}

	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 : ");
		int num = sc.nextInt();
		int[] iArr = new int[num];
		int sum = 0;

		for (int i = 0; i < num; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			iArr[i] = sc.nextInt();
		}

		for (int i = 0; i < iArr.length; i++) {
			System.out.print(iArr[i] + " ");
			sum += iArr[i];
		}
		System.out.println();
		System.out.println("총 합 : " + sum);
	}

	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 : ");

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
				System.out.println("다시 입력하세요.");
			}
		}
	}
	public void practice9() {
		
		String[] chicken = new String[] {"양념", "파닭", "후라이드", "간장", };
		
		Scanner sc = new Scanner(System.in);
		System.out.println("치킨 이름을 입력하세요.");
		
		
		
		
		
		
		
		
		
		
		
	}
}
