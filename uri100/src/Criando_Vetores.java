import java.util.Locale;
import java.util.Scanner;

public class Criando_Vetores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		double [] vet = new double [N]; // ao fazer double [] vet -> significa que estou declarando que é um vetor
										// ao fazer new double [] está criando o vetor.
		for (int i=0; i<N; i++) {		// para acessar vet[3] = 20, ou seja na posição 3 vale 20
			vet[i] = sc.nextDouble();
		}
		for (int i=0; i<N; i++) {
			System.out.printf("%.2f\n", vet[i]);
		}

		sc.close();
	}

}
