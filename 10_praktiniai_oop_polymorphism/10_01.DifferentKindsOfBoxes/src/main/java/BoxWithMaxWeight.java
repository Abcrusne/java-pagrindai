import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {

	private int capacity;
	ArrayList<Item> items;

	public BoxWithMaxWeight(int capacity) {
		super();
		this.capacity = capacity;
		this.items = new ArrayList<Item>();
	}

	@Override
	public void add(Item item) {
		int totalWeight = 0;
		if (item.getWeight() + totalWeight <= this.capacity) {
			for (Item elements : items) {
				totalWeight = totalWeight + elements.getWeight();
			}
			this.items.add(item);
		}
	}

	@Override
	public boolean isInBox(Item item) {
		// TODO Auto-generated method stub
		return items.contains(item);
	}
}
