import java.util.Scanner;

public class MatrizExResolvido {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] mat = new int [n][n]; // são iguais pq pedi uma matriz quadrada
		
		for (int i = 0; i<n; i++) {
			for (int j = 0; j<n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("DIAGONAL PRINCIPAL:");
		for (int i=0; i<n; i++) {
			System.out.print(mat[i][i] + " "); //diagonal principal é o mesmo numero de linha e da coluna (1,1)(2,2)(3,3) ...
		}
		System.out.println();
		
		int cont = 0; // vamos contar quantos numero negativos tem
		
		for (int i = 0; i<n; i++) {
			for (int j = 0; j<n; j++) {
				if (mat[i][j] < 0) {
					cont = cont + 1;
				}
			}
			
			
	}
		System.out.println("QUANTIDADE DE NEGATIVOS =  " + cont);
		sc.close();
}
}
