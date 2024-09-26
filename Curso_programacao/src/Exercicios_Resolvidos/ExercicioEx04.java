/* Faça um programa para ler a cotação do dolar, e depois um valor de dolares a ser comprado por uma pessoa em reais. 
 * informar quantos reais a pessoa vai pagar pelo dolares, considerando ainda que a pessoa terá que pagar IOF de 6% sobre o valor do dolar.
 *  
 */




package Exercicios_Resolvidos;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverterEx04;

public class ExercicioEx04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is dolar price? ");
		double price = sc.nextDouble();
		System.out.print("How much dollars will be bought? ");
		double dollars = sc.nextDouble();
		
		double paid = CurrencyConverterEx04.converter(price, dollars);
		
		System.out.printf("Amount to be paid in reais = %.2f\n", paid);
		
		
		
		
		
		
		
		sc.close();

	}

}
