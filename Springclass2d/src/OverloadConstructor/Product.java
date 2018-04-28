package OverloadConstructor;

public class Product {
	double pid;
	String name;
	int price;
	public Product(double pid, String name) {
		super();
		this.pid = pid;
		this.name = name;
	}
	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + ", price=" + price + "]";
	}
	public Product() {
		// TODO Auto-generated constructor stub
	}
}
