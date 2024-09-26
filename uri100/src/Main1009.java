import java.util.Scanner;
import java.util.Locale;
public class Main1009 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		double salario = sc.nextDouble();
		double venda = sc.nextDouble();
		double sal = salario + ((venda * 15) /100);
		System.out.printf("TOTAL = R$ %.2f\n", sal);
		
		
		sc.close();
		
		
	
	}

}
