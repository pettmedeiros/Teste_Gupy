import java.util.Locale;
import java.util.Scanner;
public class exercicioresolvido2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double base = sc.nextDouble();
		double altura = sc.nextDouble();
		
		double area = base * altura;
		double diagonal = 2.0 * (area + altura);
		double perimetro = Math.sqrt(base * base + altura * altura);
		
		System.out.printf("Area = %.4f%n", area);
		System.out.printf("Diagonal = %.4f%n", diagonal);
		System.out.printf("Perimento = %.4fn", perimetro);
		
		sc.close();
		

	}

}
