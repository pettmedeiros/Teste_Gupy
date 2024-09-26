import java.util.Locale;
import java.util.Scanner;

public class MatrizResolvido2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		double[][] mat = new double[n][m];
		
		for (int i=0; i<n; i++) {
			for (int j=0; j<m; j++){
				mat[i][j] = sc.nextDouble();
			}
		}
		
		double[] vet = new double[m]; 
		for (int i=0; i<n; i++) {
			double soma = 0;
			for (int j=0; j<m; j++){
				soma = soma + mat[i][j];
			}
			vet [i] = soma;
		}
		for (int i=0; i<n; i++) {
			System.out.printf("%.1f\n", vet[i]);
		}

		
		
		sc.close();
	}

}
