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

		String[] chicken = new String[] { "양념", "파닭", "후라이드", "간장", "순살" };

		Scanner sc = new Scanner(System.in);
		System.out.print("치킨 이름을 입력하세요 : ");
		String str = sc.nextLine();

		boolean check = false;

		for (int i = 0; i < chicken.length; i++) {
			if (chicken[i].equals(str)) {
				check = true;
				break;
			}
		}

		if (check) {
			System.out.println(str + "치킨 배달 가능");
		} else {
			System.out.println(str + "치킨은 없는 메뉴입니다.");
		}
	}

	public void practice10() {

		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호(-포함) : ");
		String pNum = sc.nextLine();

		char[] chArr = new char[pNum.length()];

		for (int i = 0; i < chArr.length; i++) {
			chArr[i] = pNum.charAt(i);
		}

		char[] copychArr = new char[chArr.length];

		for (int i = 0; i < chArr.length; i++) {
			if (i > 7) {
				copychArr[i] = '*';
			} else {
				copychArr[i] = chArr[i];
			}
			System.out.print(copychArr[i]);
		}

	}

	public void practice11() {

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);
			System.out.print(arr[i] + " ");
		}

	}

	public void practice12() {

		int[] arr = new int[10];

		int max = 1;
		int min = 10;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10) + 1;
			System.out.print(arr[i] + " ");
			if (arr[i] < min) {
				min = arr[i];
			} else if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println();
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}

	public void practcie13() {

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10) + 1;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public void practice14() {

		// 정렬 알고리즘 숙지

		int[] arr = new int[6];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 45) + 1;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
					break;
				}

				if (arr[i] < arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}

			}

		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public void practice15() {

//		??

		Scanner sc = new Scanner(System.in);

		System.out.print("문자열 : ");
		String str = sc.nextLine();
		char[] arr = new char[str.length()];

		for (int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);

		}

	}

	public void practice16() {

		String yn = null;

		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 크기를 입력하세요 : ");
		int num = Integer.parseInt(sc.nextLine());
		String[] arr = new String[num];

		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + 1 + "번째 문자열 : ");
			arr[i] = sc.nextLine();
		}

		do {
			System.out.print("더 값을 입력하시겠습니까(Y/N)");
			yn = sc.nextLine();

			if (yn.toUpperCase().equals("Y")) {
				System.out.print("더 입력하고 싶은 개수 : ");
				int add = Integer.parseInt(sc.nextLine());
				String[] copyArr = new String[arr.length+add];
				System.arraycopy(arr, 0, copyArr, 0, arr.length);
				
				for(int i = arr.length; i<copyArr.length; i++) {
					System.out.println((i+1) + "번째 문자열 : ");
					copyArr[i] = sc.nextLine();
					
				}
				
				arr=copyArr;
				
				
			}

		} while (!yn.toUpperCase().equals("N"));

		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}