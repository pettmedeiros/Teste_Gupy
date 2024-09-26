import java.util.Scanner;
import java.util.Locale;
public class Main1008 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		double hora = sc.nextDouble();
		
		double salario = hora * b;
		
		System.out.println("NUMBER = " + a);
		System.out.printf("SALARY = U$ %.2f\n", salario);
		
		sc.close();		
		
	}

}
