import java.util.Locale;
import java.util.Scanner;

public class VetoresEx4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double [] vet = new double[n];
		
		for (int i=0; i<n; i++) {
			vet[i] = sc.nextDouble();
		}
		
		double soma = 0.0;
		for (int i=0; i<n; i++) {
			 soma = soma + vet[i]; 
		}
		
		double media = soma / n ;
		System.out.printf("A soma é: %.3f\n",soma);
		System.out.printf("A media é: %.3f\n", media);
		for (int i=0; i<n; i++) {
			if (vet[i] < media) {
			System.out.printf("Os valores menor que a media é: %.1f\n", vet[i]);
			}
		}
		
		
		
		
		
		
		sc.close();
	}

}
