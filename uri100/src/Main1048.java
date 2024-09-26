import java.util.Scanner;
import java.util.Locale;

public class Main1048 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salario = sc.nextDouble();
		double aumento;

		if (salario <= 400.0) {
			aumento = salario + ((salario * 15) / 100);
			System.out.printf("Novo salario: %.2f\n", aumento);
			System.out.printf("Reajuste ganho: %.2f\n", ((salario * 15) / 100));
			System.out.println("Em percentual: 15 %");
		}
		if (salario > 400.0 && salario <= 800.00) {
			aumento = salario + ((salario * 12) / 100);
			System.out.printf("Novo salario: %.2f\n", aumento);
			System.out.printf("Reajuste ganho: %.2f\n", ((salario * 12) / 100));
			System.out.println("Em percentual: 12 %");
		}
		if (salario > 800.0 && salario <= 1200.0) {
			aumento = salario + ((salario * 10) / 100);
			System.out.printf("Novo salario: %.2f\n", aumento);
			System.out.printf("Reajuste ganho: %.2f\n", ((salario * 10) / 100));
			System.out.println("Em percentual: 10 %");
		}
		if (salario > 1200.0 && salario <= 2000.0) {
			aumento = salario + ((salario * 7) / 100);
			System.out.printf("Novo salario: %.2f\n", aumento);
			System.out.printf("Reajuste ganho: %.2f\n", ((salario * 7) / 100));
			System.out.println("Em percentual: 7 %");
		}
		if (salario > 2000.0) {
			aumento = salario + ((salario * 4) / 100);
			System.out.printf("Novo salario: %.2f\n", aumento);
			System.out.printf("Reajuste ganho: %.2f\n", ((salario * 4) / 100));
			System.out.println("Em percentual: 4 %");
		}
		
		
		
		
		
		sc.close();
	}

}
