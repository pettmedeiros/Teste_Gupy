import java.util.Scanner;
import java.util.Locale;

public class Ex_IF_Else {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();
		
		double notafinal = (nota1 + nota2);
		System.out.printf("NOTA FINAL = %.1f%n");
		
		if (notafinal < 60) {
			System.out.println("REPROVADO!");
		}
		
		
		sc.close();

	}

}
