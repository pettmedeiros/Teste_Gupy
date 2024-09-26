import java.util.Scanner;

public class Main1114 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int senha = 2002;
		
		while (true) {
			int teste = sc.nextInt();
			
			if (teste != senha) {
				System.out.println("Senha invalida");
			}
			else if (teste == senha) {
				System.out.println("Acesso permitido");
				break;
			}
			
		}
		sc.close();

	}

}
