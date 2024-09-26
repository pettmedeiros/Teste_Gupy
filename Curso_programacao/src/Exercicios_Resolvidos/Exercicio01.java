package Exercicios_Resolvidos;

import java.util.Locale;
import java.util.Scanner;

import entities.RectangleEx1;

public class Exercicio01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		RectangleEx1 width, heigth; 
		RectangleEx1 rectangle = new RectangleEx1();
		
		
		
		System.out.println("Enter rectangle width and heigth: ");
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		
		
		System.out.printf("AREA = %.2f\n", rectangle.area());
		System.out.printf("PERIMETER = %.2f\n", rectangle.perimeter());
		System.out.printf("DIAGONAL = %.2f\n", rectangle.diagonal());
		
		

		
		
		
		sc.close();
	}

}
