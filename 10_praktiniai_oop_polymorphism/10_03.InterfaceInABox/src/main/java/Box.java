import java.util.ArrayList;

public class Box implements Packable {

	private final double maxCapacity;
	private final ArrayList<Packable> items;

	public Box(double maxCapacity) {

		this.maxCapacity = maxCapacity;
		this.items = new ArrayList<>();
	}

	public void add(Packable item) {
		if (maxCapacity >= item.weight() + this.weight()) {
			items.add(item);
		}
	}

	@Override
	public String toString() {
		return "Box: " + items.size() + " items, total weight " + weight() + " kg";
	}

	@Override
	public double weight() {
		double totalWeight = 0;
		for (Packable elements : items) {
			totalWeight = totalWeight + elements.weight();
		}

		return totalWeight;
	}

}
