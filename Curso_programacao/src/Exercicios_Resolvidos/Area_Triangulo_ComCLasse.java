/*
Fazer um programa para ler as medidas dos lados de dois triângulos X e Y (suponha medidas
válidas). Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos
possui a maior área.
A fórmula para calcular a área de um triângulo a partir das medidas de seus lados a, b e c é a
seguinte (fórmula de Heron): */


package Exercicios_Resolvidos;
import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;


public class Area_Triangulo_ComCLasse {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;   // foi feita a importação de classe TRIANGLE
		x = new Triangle(); // os dados serão armazenados dentro da classe trinagulo x e y
		y = new Triangle();
		
		System.out.println("Enter the meansur of triangule X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Enter the meansur of triangule Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area(); // calculo importado da class TRIANGULE (.area())
		double areaY = y.area();
		
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