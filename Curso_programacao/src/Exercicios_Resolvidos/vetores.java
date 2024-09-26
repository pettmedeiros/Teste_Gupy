package Exercicios_Resolvidos;

import java.util.Locale;
import java.util.Scanner;

import entities.VectProducts;

public class vetores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		VectProducts[] vect = new VectProducts[n];
		
		for(int i=0; i<n; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new VectProducts(name, price);
		}
		double sum = 0;
		for (int i=0; i<n; i++) {
			sum += vect[i].getPrice();
		}
		double avg = sum / n; 
		
		System.out.printf("AVARAGE PRICE = %.2f\n", avg);

		sc.close();
	}

}
