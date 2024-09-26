
//2) Escreva um programa que verifique, em uma string, a existência da letra ‘a’, 
//seja maiúscula ou minúscula, além de informar a quantidade de vezes em que ela ocorre.

import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite uma palavra: ");
		String n = sc.next();
		
		int c = 0;
		
		for (int i =0; i<n.length(); i++) {
			char letra = n.charAt(i);
			
			if (letra == 'a' | letra == 'A') {
				c++; 
			}
			
		}
		if (c == 0) {
		System.out.println("A palavra " + n + " não possui nenhuma letra a");
		}
		else {
			System.out.println("A palavra " + n + " possui " + c + " letras a.");
		}
		sc.close();
	}

}
