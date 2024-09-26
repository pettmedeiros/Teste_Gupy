import java.util.Locale;
import java.util.Scanner;

public class Vetores_RESOLVIDOS_2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] vet = new double[n];
		
		for (int i=0; i<n; i++) {
			vet[i] = sc.nextDouble();
		}
		for (int i=0; i<n; i++) {
		System.out.printf(vet[i] + " ");
		}
		System.out.println();
		
		double soma = 0;
		for (int i=0; i<n; i++) {
			soma = soma + vet[i];
		}
		
		System.out.printf("%.2f\n", soma);
		
		double media = soma / n;
		
		System.out.println(media);
		
	}

}
