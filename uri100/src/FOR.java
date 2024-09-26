import java.util.Scanner;

public class FOR {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int soma = 0;
		
		for (int i = 0; i<N; i=i+1) {   // i = 0 é o inicio; depois vem a condição, e nesse caso foi que o inicio era menor que o N
			int x = sc.nextInt();       // digitado pelo algoritmo. i ++ ou o i=i+1 é o encremento para seguir funcionando o programa.
			
			soma = soma + x;
		}
		System.out.println(soma);
		
		sc.close();
	}
}
			