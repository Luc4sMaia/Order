package entities;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entitiesEnum.OrderStatus;

public class Order { 


	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment = new Date();
	private OrderStatus status;
	OrderItem orderItem;
	private Client client;
	
	private List<OrderItem> listOrderItem = new ArrayList<>();
	
	public Order() {
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

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	public void addItem(OrderItem item) {
		listOrderItem.add(item);
	}
	
	public void removeItem(OrderItem item) {
		listOrderItem.remove(item);
	}
	
	public List<OrderItem> getListOrderItem() {
		return listOrderItem;
	}
	 
	public Double total() {
		Double total = 0.0;
		for(OrderItem o : listOrderItem) {
			total += o.subTotal();
;
		}
		return total;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append("Order moment: " + sdf.format(moment) + "\n");
		sb.append("Order status: " + status + "\n");
		sb.append("Client: " + client + "\n");
		sb.append("Order items: \n");
		sb.append(getListOrderItem() + "\n");
		sb.append("Total price: $" + total());
	return sb.toString();
	}

}
