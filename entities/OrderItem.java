package entities;

import java.util.List;
import java.util.ArrayList;

public class OrderItem {

	Integer quantity;
	Double price;
	Product product;
	
	
	
	public OrderItem(Integer quantity, Double price, Product product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}
	
	public OrderItem() {
		
	}
	
	public Double subTotal() {
		return price * quantity;
	}

	List <OrderItem> listOrderItem = new ArrayList<>();


	public void addOrderItemList(OrderItem items) {
		listOrderItem.add(items);
	}
	
	public List<OrderItem> getOrderItem() {
		return listOrderItem;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(product + ", Quantity: " + quantity + ", Subtotal: " + subTotal() + "\n");
		return sb.toString();
	}
	
}
