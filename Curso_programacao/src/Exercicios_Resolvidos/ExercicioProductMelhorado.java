package Exercicios_Resolvidos;

import java.util.Locale;
import java.util.Scanner;

import entities.ProductMelhorado;

public class ExercicioProductMelhorado {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine(); // nesse caso o product está armazenando a variavel name na classe product
		System.out.print("Price: ");  
		double price = sc.nextDouble(); // nesse caso o product está armazenando a variavel price na classe product
		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt(); // nesse caso o product está armazenando a variavel quantity na classe product
		ProductMelhorado product = new ProductMelhorado(name, price, quantity);
		
		System.out.println();
		product.setName("COMPUTER");
		System.out.println("Uppdate name " + product.getName());
		System.out.println();
		System.out.println("Product data: " + product);
		
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		quantity = sc.nextInt(); // nesse eu fiz uma nova entrada atualizando os valores do estoque
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Uppdate data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();  // aqui fiz uma nova entrada atualizando os valores do estoque 
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Uppdate data: " + product);

		
		
		
		
		
		sc.close();

	


	}

}
