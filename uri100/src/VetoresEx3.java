import java.util.Scanner;

public class VetoresEx3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] vetA = new int[n];
		int[] vetB = new int[n];
		int[] vetC = new int[n];
		
		for (int i=0; i<n; i++) {
			vetA [i]= sc.nextInt();
			
		}
		for (int i=0; i<n; i++) {
			vetB [i] = sc.nextInt();
		}
		
		for (int i=0; i<n; i++) {
			vetC [i] = vetA[i] + vetB[i]; 
			
		}
		for (int i=0; i<n; i++) {
			System.out.print(vetC[i] + " ");
		}
		
		
		
		
		sc.close();

	}

}
