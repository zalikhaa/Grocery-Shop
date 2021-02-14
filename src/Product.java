import java.util.Scanner;

public class Product {
	private String name;
	private double price;
	private int quantity;
	private double total;
	
	public Product(String n, double p, int q) {
		this.name = n;
		this.price = p;
		this.quantity = q;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
	public double calculateTotalPrice() {
		
		return total=this.price*this.quantity;
		
	}

	@Override
	public String toString() {
		return "Product [name= " + name + " , price= " + price + " , quantity= " + quantity + " , total= " + total + "]";
	}
	
}
