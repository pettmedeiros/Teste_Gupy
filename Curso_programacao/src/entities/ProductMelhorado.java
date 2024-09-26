package entities;

public class ProductMelhorado {
	private String name;  // quando coloco os atributos em private, eles não poderam ser acessados por outra classe
	private double price;
	private int quantity;
	
	public ProductMelhorado(String name, double price, int quantity) { // aqui é chamado de Construtor, onde já coloca os nome,
		this.name = name;												//  preco e quantidade;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String getName() { // permite buscar o nome e que possa ser alterado depois de digitador pelo operador
		return name;			// isso quando esta private e não mais publico 
	}

	public void setName(String name) { // permite alterar o nome depois de digitado pelo operador
		this.name = name;
	}

	public double getPrice() { // permite buscar o preço e que possa ser alterado depois de digitador pelo operador
		return price;
	}

	public void setPrice(double price) { // permite  possa ser alterado depois de digitador pelo operador
		this.price = price;
	}
	
	public int getQuantity() { // permite buscar a quantidade e que possa ser alterado depois de digitador pelo operador
		return quantity;
	}


	public double totalValueInStock() { // aqui foi feito total do estoque em $$ valores 
		return price * quantity;
	}
	
	public void addProducts(int quantity) { // aqui quero adicionar produtos no estoque 
		this.quantity += quantity;          // this.quantitity foi para indicar que o quantity usado é o la de cima. 
	}										// entao somou quantity que já tinha com mais o que esta colocado pelo operador
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	public String toString() {    // aqui fazendo toString prepara para ser usado no print
		return name                 // return libera a função para que posssa ser usado no print
				+ ", $ "
				+ String.format("%.2f", price) // String.format é usado para poder fazer a formatação de valor com '400,00'
				+ ", "
				+ quantity
				+ " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
	
	
	
	
}

