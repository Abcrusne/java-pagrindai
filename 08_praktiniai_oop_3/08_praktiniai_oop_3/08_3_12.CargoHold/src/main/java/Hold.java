import java.util.ArrayList;

public class Hold {

	private int maxWeight;
//	private int count;
	private ArrayList<Suitcase> suitcases;

	public Hold(int maxWeight) {
		this.maxWeight = maxWeight;
//		this.count = 0;
		this.suitcases = new ArrayList();
	}

	public void addSuitcase(Suitcase suitcase) {
		if (suitcase.totalWeight() + this.totalWeight() <= maxWeight) {

			this.suitcases.add(suitcase);
		}

	}

	public int totalWeight() {
		int sum = this.suitcases.stream().mapToInt(item -> Integer.valueOf(item.totalWeight())).reduce(0,
				(previousSum, element) -> previousSum + element);

		return sum;

	}

	public void printItems() {
		this.suitcases.stream().forEach(suitcase -> suitcase.printItems());

//		for (Suitcase elements : suitcases) {
//			elements.printItems();
//		}
	}

	@Override
	public String toString() {
		return suitcases.size() + " suitcases (" + totalWeight() + " kg)";
	}

}
