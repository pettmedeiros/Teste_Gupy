package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;

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
