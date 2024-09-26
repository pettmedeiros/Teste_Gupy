import java.util.Scanner;

public class Main1044 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int n1 = leitor.nextInt();
		int n2 = leitor.nextInt();

		if (n2 % n1 == 0 || n1 % n2 == 0) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao sao Multiplos");
		}

	}

}