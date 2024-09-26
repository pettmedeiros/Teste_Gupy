import java.util.Locale;
import java.util.Scanner;

public class Main1002 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		double area, raio, n, r ;
		n = 3.14159;
		raio = sc.nextDouble();
		r = Math.pow(raio, 2);
		area = n * r ;
		System.out.printf("A=%.4f\n",area);		
		
		sc.close();
		
		

	}

}
