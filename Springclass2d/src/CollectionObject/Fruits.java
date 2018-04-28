package CollectionObject;

public class Fruits {
	String fruitname;
	Integer price;
	public Fruits(String fruitname, Integer price) {
		super();
		this.fruitname = fruitname;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Fruits [fruitname=" + fruitname + ", price=" + price + "]";
	}
	

}
