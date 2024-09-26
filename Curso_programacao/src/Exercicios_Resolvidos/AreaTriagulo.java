/*
Fazer um programa para ler as medidas dos lados de dois triângulos X e Y (suponha medidas
válidas). Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos
possui a maior área.
A fórmula para calcular a área de um triângulo a partir das medidas de seus lados a, b e c é a
seguinte (fórmula de Heron): */

package Exercicios_Resolvidos;

import java.util.Locale;
import java.util.Scanner;

public class AreaTriagulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double xA, xB, xC, yA, yB, yC; 
		System.out.println("Enter the meansur of triangule X: ");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		System.out.println("Enter the meansur of triangule Y: ");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		double p = (xA + xB + xC) / 2.0;
		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
		
		p = (yA + yB + yC) / 2.0;
		double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
		
		System.out.printf("Triangule X area: %.4f\n", areaX);
		System.out.printf("Triangule Y area: %.4f\n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Larguer area: X");
		}
		else {
				System.out.println("Larguer area: Y");
			}	
		
		
		
		
		sc.close();

	}

}
