import java.util.Scanner;

public class WHILE_1113 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		while (a != b) {
			if (a < b) {
				System.out.println("Crescente");
			}
			else {
				System.out.println("Decrescente");
			}
			a = sc.nextInt();
			b = sc.nextInt();
		}
		
		
		
		sc.close();
	}

}
