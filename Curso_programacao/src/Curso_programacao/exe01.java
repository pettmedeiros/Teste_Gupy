// Fazer um programa para ler as medidas da largura e comprimento de um terreno
//retangular com uma casa decimal, bem como o valor do metro quadrado do terreno
//com duas casas decimais. Em seguida, o programa deve mostrar o valor da área do
//terreno, bem como o valor do preço do terreno, ambos com duas casas decimais,

package Curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class exe01 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual é a largura do terreno ?");
		double largura = sc.nextDouble();
		System.out.println("Qual é o comprimento do terreno?");
		double comprimento = sc.nextDouble();
		System.out.println("Qual é o valor do metro quadrado?");
		double metroquadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double precof = area * metroquadrado;
		System.out.printf("Area = %.2f %n",area);
		System.out.printf("Preço final é %.2f %n", precof);
		
			
		sc.close();
	
		
		
		
	}

}
