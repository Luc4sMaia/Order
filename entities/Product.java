package entities;

import java.util.List;
import java.util.ArrayList;

public class Product {

	private String name;
	private Double price;
	
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}
	
	public Product() {
		
	}
	
	List <Product> listProduct = new ArrayList<>();
	
	public void listProducts(Product products) {
		listProduct.add(products);
	}
	
	public List<Product> getListProduct() {
		return listProduct;
	}
	
	public String toString() {
 
		return name + ", $" + price;
	}
}
