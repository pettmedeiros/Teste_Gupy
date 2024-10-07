//Fazer um programa que, a partir de uma lista de produtos, calcule a
//soma dos preços somente dos produtos cujo nome começa com "T".

package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import model.services.ProductService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		ProductService ps = new ProductService();
		
		double sum = ps.filtreSum(list, p -> p.getName().charAt(0) == 'T');

		System.out.printf("Sum = " + String.format("%.2f", sum));
		
/*O segundo argumento é um Predicate<Product>, que representa um critério de filtragem. 
O critério é p->p.getName().charAt(0)=='T', 
que significa:"somar o preço dos produtos cujo nome começa com a letra'T'*/
		
	}

}
