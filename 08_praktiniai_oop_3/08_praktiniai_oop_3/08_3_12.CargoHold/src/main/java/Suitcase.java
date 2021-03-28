import java.util.ArrayList;

public class Suitcase {

	private ArrayList<Item> items;
	private int maxWeight;

	public Suitcase(int maxWeight) {

		this.maxWeight = maxWeight;
		this.items = new ArrayList();
	}

	public void addItem(Item item) {
		if (item.getWeight() + this.totalWeight() <= maxWeight) {
			this.items.add(item);
		}
	}

	private int getWeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void printItems() {
//		for (Item elements : items) {
//			System.out.println(elements.getName() + " (" + elements.getWeight() + " kg)");
//		}
		this.items.stream().forEach(item -> System.out.println(item));

	}

	public int totalWeight() {
//		for (Item elements : items) {
//			totalWeight = totalWeight + elements.getWeight();
//		}
//		return totalWeight;

		int sum = this.items.stream().mapToInt(s -> Integer.valueOf(s.getWeight())).reduce(0,
				(previousSum, element) -> previousSum + element);

		return sum;
	}

	public Item heaviestItem() {
		if (items.isEmpty()) {
			return null;
		}
//		newItem value is the first object on the list
//		Item newItem = this.items.get(0);
//		for (Item elements : items) {
//			if (newItem.getWeight() < elements.getWeight()) {
//				newItem = elements;
//			}
//		}
//		return newItem;
		return this.items.stream().max((t1, t2) -> t1.getWeight() - t2.getWeight()).get();
	}

	public String toString() {
		if (items.isEmpty()) {
			return "no items (0kg)";
		} else if (this.items.size() == 1) {
			return this.items.size() + " item (" + totalWeight() + " kg)";
		} else {
			return this.items.size() + " items (" + totalWeight() + " kg)";
		}
	}
}
