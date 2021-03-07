import java.util.Scanner;

public class Tmp2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("주사위 두 개의 합을 맞춰보세요(1~12입력) : ");
			int random = sc.nextInt();
			int dice = (int) (Math.random() * 6 + 1);

			if (random == dice) {
				System.out.println("정답입니다");
				System.out.println("주사위의 합 : " + dice);
				System.out.print("계속 하시겠습니까? (y/n) : ");

				char cont = sc.next().charAt(0);

				while (true) {
					if (cont == 'y') {
						break;
					} else if (cont == 'n') {
						break;
					} else {
						System.out.println("잘못 입력하셨습니다.");
						System.out.print("계속 하시겠습니까? (y/n) : ");
						cont = sc.next().charAt(0);
					}
				}
				if (cont == 'n') {
					System.out.println("종료합니다");
					break;
				}

			} else {
				System.out.println("틀렸습니다");
			}
		}
	}
}
