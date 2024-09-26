import java.util.Scanner;

public class Main1020 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int ano = n / 365;
		int resto = n % 365;
		int mes = resto / 30;
		int dias = resto % 30;
		
		System.out.println(ano + " ano(s)\n" +
							mes + " mes(es)\n" + 
						   dias + " dia(s)");

		sc.close();
	}

}
