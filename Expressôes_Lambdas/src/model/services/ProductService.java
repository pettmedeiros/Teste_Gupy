package model.services;

import java.util.List;
import java.util.function.Predicate;

import entities.Product;

public class ProductService {
	
	public double filtreSum (List<Product> list, Predicate<Product> criteria) { //predicate é um critério de filtragem
		double sum = 0.0;
		for (Product p : list) { // for é chamado para percorrer cada produto p da lista
			if (criteria.test(p)) { // o método test do Predicate é chamado para verificar se o produto p atende ao critério
				sum += p.getPrice(); // se retornar true, o preço do p é somado à variavel soma
			}
		}
		return sum;
		
	}

	
}
