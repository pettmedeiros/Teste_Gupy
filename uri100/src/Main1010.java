import java.util.Scanner;
import java.util.Locale;
public class Main1010 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int prod1 = sc.nextInt();
		int quant1 = sc.nextInt();
		double preco1 = sc.nextDouble();
		int prod2 = sc.nextInt();
		int quant2 = sc.nextInt();
		double preco2 = sc.nextDouble();
		double valor = (quant1 * preco1) + (quant2 * preco2); 
		
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", valor);
			
		
		
		sc.close();

	}

}
