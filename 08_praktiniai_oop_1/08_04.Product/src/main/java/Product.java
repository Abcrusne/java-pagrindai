
public class Product {

	private double price;
	private int quantity;
	private String name;

	public Product(String initialname, double initialPrice, int initialQuantity) {
		this.price = initialPrice;
		this.quantity = initialQuantity;
		this.name = initialname;
	}

	public void printProduct() {
		System.out.println(name + ", " + price + ", " + quantity + " pcs");
	}
}
