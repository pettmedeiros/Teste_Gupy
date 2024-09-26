import java.util.Scanner;
import java.util.Locale;
public class exercicioresolvido3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome = sc.next();
		int idade = sc.nextInt();
		String nome2 = sc.next();
		int idade2 = sc.nextInt();
		
		double media = (double)(idade + idade2)/2;
		
		System.out.printf("A media de idade entre %s e %s é de %.1f%n", nome, nome2, media);
		
		sc.close();

	}

}
