//Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. 
//Cada caso de teste consiste de 3 valores reais, cada um deles com uma casa decimal. 
//Apresente a média ponderada para cada um destes conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, 
//o segundo valor tem peso 3 e o terceiro valor tem peso 5.


import java.util.Locale;
import java.util.Scanner;

public class Main1079 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		float n = sc.nextFloat();
		int contador = 0;
		
		while (contador < n ) {
			float a = sc.nextFloat();
			float b = sc.nextFloat();
			float c = sc.nextFloat();
			float media = ((a * 2) + (b * 3) + (c * 5)) / 10;
			contador = contador + 1;
			
			System.out.printf("%.1f\n", media);
		}

		sc.close();
	}

}
