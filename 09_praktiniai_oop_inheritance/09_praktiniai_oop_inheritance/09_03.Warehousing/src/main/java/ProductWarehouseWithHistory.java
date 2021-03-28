
public class ProductWarehouseWithHistory extends ProductWarehouse {
//	private double initialBalance;
	private ChangeHistory changeHistory;

	public ProductWarehouseWithHistory(String name, double capacity, double initialBalance) {
		super(name, capacity);
		changeHistory = new ChangeHistory();
//		this.initialBalance = initialBalance;
		this.addToWarehouse(initialBalance);

	}

	public void addToWarehouse(double amount) {
		super.addToWarehouse(amount);
		changeHistory.add(getBalance());
	}

	public double takeFromWarehouse(double amount) {
		double received = super.takeFromWarehouse(amount);
		changeHistory.add(getBalance());
		return received;
	}

	public void printAnalysis() {
		System.out.println("Product: " + getName());
		System.out.println("History: " + history());
		System.out.println("Largest amount of product: " + changeHistory.maxValue());
		System.out.println("Smallest amount of product: " + changeHistory.minValue());
		System.out.println("Average: " + changeHistory.average());
	}

	public String history() {
		return changeHistory.toString();
	}

}
