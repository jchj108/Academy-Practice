import java.util.Scanner;

public class Tmp2 {

	public static void main(String[] args) {

		
	
		Scanner sc = new Scanner(System.in);
		int num =  sc.nextInt();
		int result = num;
		int j = 0;
	
			
		
		if(num>=2) {	
			for(int i = 2; i<num; i++) {
				result = num % i;
	
				if (num % i == 0) {
					j++;
				} 
			}
			if (j==0) {
				System.out.println("�Ҽ��Դϴ�");
			} else {
				System.out.println("�Ҽ��� �ƴմϴ�");
			}
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}
}

