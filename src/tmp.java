import java.util.Scanner;

public class tmp {
	public static void main(String[] args) {
		String sign = " ";
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("������(+, -, *, /, %) : ");
			sign = sc.nextLine();
			if (sign.equals("exit")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			System.out.print("����1 : ");
			int num1 = sc.nextInt();
			System.out.print("����2 : ");
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
					System.out.println("0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���");
					sp = true;
				} else {
					result = num1 / num2;
				}
			case "%":
				result = num1 % num2;
				break;
			default:
				System.out.println("���� �������Դϴ�. �ٽ� �Է����ּ���.");
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