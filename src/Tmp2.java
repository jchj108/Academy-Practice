import java.util.Scanner;

public class Tmp2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("�ֻ��� �� ���� ���� ���纸����(1~12�Է�) : ");
			int random = sc.nextInt();
			int dice = (int) (Math.random() * 6 + 1);

			if (random == dice) {
				System.out.println("�����Դϴ�");
				System.out.println("�ֻ����� �� : " + dice);
				System.out.print("��� �Ͻðڽ��ϱ�? (y/n) : ");

				char cont = sc.next().charAt(0);

				while (true) {
					if (cont == 'y') {
						break;
					} else if (cont == 'n') {
						break;
					} else {
						System.out.println("�߸� �Է��ϼ̽��ϴ�.");
						System.out.print("��� �Ͻðڽ��ϱ�? (y/n) : ");
						cont = sc.next().charAt(0);
					}
				}
				if (cont == 'n') {
					System.out.println("�����մϴ�");
					break;
				}

			} else {
				System.out.println("Ʋ�Ƚ��ϴ�");
			}
		}
	}
}
