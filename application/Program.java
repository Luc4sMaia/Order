package application;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entities.Client;
import entities.Product;
import java.util.Date;
import java.text.SimpleDateFormat;
import entitiesEnum.OrderStatus;
import entities.OrderItem;
import entities.Order;

public class Program {

	public static void main(String[] args)   throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Order order = new Order();
		
		System.out.println("Enter cliente data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Email: ");
		String email = sc.nextLine();
		
		System.out.print("Birth date: ");
		Date birthDate = sdf.parse(sc.next());
		
		Client client = new Client(name, email, birthDate);

		order.setClient(client);
		
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		OrderStatus orderStatus = OrderStatus.valueOf(sc.next());
		order.setStatus(orderStatus);
		
		System.out.print("How many items to this order? ");
		int loop = sc.nextInt();
		int auxiliarLoop;
		
		for (auxiliarLoop = 0; auxiliarLoop < loop; auxiliarLoop++) {
			System.out.println("Enter #" + (auxiliarLoop + 1)+ " item data:");
			sc.nextLine();
			System.out.print("Product name: ");
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			Double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			Integer quantity = sc.nextInt();
			
			Product product = new Product(productName, productPrice);
			OrderItem orderItem = new OrderItem(quantity, productPrice, product);
		
			order.addItem(orderItem);	
			
		}
		

		System.out.println(order);

		sc.close();
	}


}

