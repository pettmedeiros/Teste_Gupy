package Exercicios_Resolvidos;

import java.util.Locale;
import java.util.Scanner;

import entities.Calculator_Circunferencia;

public class Circunferencia_ClasseEstatica {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = Calculator_Circunferencia.circumference(radius); // declarei um c para receber a classe que calcula o valor da circunfencia 
		
		double v = Calculator_Circunferencia.volume(radius); //declarei um c para receber a classe que calcula o valor do volume 
		                                                     // nesse modo não precisa importar classe toda 
		System.out.printf("Circumference: %.2f\n", c );
		System.out.printf("Volume: %.2f\n", v);
		System.out.printf("PI value: %.2f\n", Calculator_Circunferencia.PI );
		
		
		
		sc.close();

	}

}
