package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities_enums.OrderStatus;

public class Order {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private Date moment;
	private OrderStatus status; 
	
	private Cliente cliente;
	private List<OrderItem> items = new ArrayList<>();
	
	public Order() {
	}
	
	public Order(Date moment, OrderStatus status, Cliente cliente) {
		this.moment = moment;
		this.status = status;
		this.cliente = cliente;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<OrderItem> getItems() {
		return items;
	}

	public void setItems(List<OrderItem> items) {
		this.items = items;
	}

	public List<OrderItem> getItem() {
		return items;
	}
	public void addOrderItem (OrderItem item) {
		items.add(item);
	}
	public void removeOrderItem (OrderItem item) {
		items.remove(item);
	}
	public double total() {
		double soma = 0.0;
		for (OrderItem item : items) {
			soma += item.subTotal();
		}
		return soma;
	}
	
			public String toString() {
				StringBuilder sb = new StringBuilder();
				sb.append("Order moment: ");
				sb.append(sdf.format(moment) + "\n");
				sb.append("Order status: ");
				sb.append(status + "\n");
				sb.append("Client: ");
				sb.append(cliente + "\n");
				sb.append("Order items:\n");
				for (OrderItem item : items) {
					sb.append(item + "\n");
				}
				sb.append("Total price: $");
				sb.append(String.format("%.2f", total()));
				return sb.toString();
	}
 
}
