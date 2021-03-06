import java.util.Scanner;

public class Tmp2 {

	public static void main(String[] args) {
		
	

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();

		if (num > 0) {
			for (int i = 0; i < num; i++) {
				for (int j = 0; j <= i; j++) {
					if (i == j) {
						System.out.print(i+1);
					} else {
						System.out.print("*");
					}
				}
				System.out.println();
			}
		} else {
			System.out.println("양수가 아닙니다.");
		}

	}
}
