import java.util.Scanner;

public class Main1180 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int posMenor = 0;
		int menor = 0;
		
		int []x = new int[n];
		
		for (int i = 0; i <n; i++) {
			x[i] = sc.nextInt();
			
			if (i == 0) {
				menor = x[i];
				posMenor = i;
			}
			else if (x[i] < menor) {
				menor = x[i];
				posMenor = i;
			}
		}
		System.out.println("Menor valor: " + menor);
		System.out.println("Posicao: " + posMenor);
		
		sc.close();
		
	}

}
