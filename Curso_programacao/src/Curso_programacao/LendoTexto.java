package Curso_programacao;
import java.util.Scanner;

public class LendoTexto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1, s2, s3;
		System.out.println("Qual é o seu nome:");
		s1 = sc.nextLine();
		System.out.println("Qual é o seu sobrenome?");
		s2 = sc.nextLine();
		System.out.println("Qual o nome de seu pet?");
		s3 = sc.nextLine();
		System.out.printf("Seu nome completo é %s %s e o nome de seu pet é %s.", s1, s2, s3);
		
		sc.close();
	}
}
	


