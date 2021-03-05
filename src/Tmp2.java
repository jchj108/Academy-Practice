import java.util.Scanner;

public class Tmp2 {

	public static void main(String[] args) {

		
	
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int num =  sc.nextInt();
		int result = num;
	
		for (int k = 0; k < num; k++) {
			for (int l = 0; l<k*2-1; l++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
