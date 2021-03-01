import java.util.Scanner;

public class tmp {
	public static void main(String[] args) {
		String sign = " ";
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("연산자(+, -, *, /, %) : ");
			sign = sc.nextLine();
			if (sign.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			System.out.print("정수1 : ");
			int num1 = sc.nextInt();
			System.out.print("정수2 : ");
			int num2 = sc.nextInt();
			int result = 0;
			boolean sp = false;
			switch (sign) {
			case "+":
				result = num1 + num2;
				break;
			case "-":
				result = num1 - num2;
				break;
			case "*":
				result = num1 * num2;
				break;
			case "/":
				if (num2 == 0) {
					System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요");
					sp = true;
				} else {
					result = num1 / num2;
				}
			case "%":
				result = num1 % num2;
				break;
			default:
				System.out.println("없는 연산자입니다. 다시 입력해주세요.");
				break;
			}
			if (sign.equals("+") || sign.equals("-") || sign.equals("/") || sign.equals("*") || sign.equals("%")) {
				if (sp == false) {
					System.out.printf("%d %s %d = %d%n", num1, sign, num2, result);
				}
			}
		}
	}
}