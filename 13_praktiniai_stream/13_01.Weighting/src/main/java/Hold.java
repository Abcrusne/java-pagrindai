
import java.util.ArrayList;

public class Hold {

	private ArrayList<Suitcase> suitcases;
	private int maximumWeight;

	public Hold(int maximumWeight) {
		this.maximumWeight = maximumWeight;
		this.suitcases = new ArrayList<>();
	}

	public void addSuitcase(Suitcase Suitcase) {
		if (this.totalWeight() + Suitcase.totalWeight() > maximumWeight) {
			return;
		}

		this.suitcases.add(Suitcase);
	}

	public int totalWeight() {

		return suitcases.stream().mapToInt(weight -> weight.totalWeight()).sum();

	}

	public void printItems() {
		suitcases.stream().map(suitcase -> suitcase.getItems()).forEach(thing -> System.out.println(thing));
//		suitcases.stream().map(suitcase -> suitcase.toString()).forEach(thing -> System.out.println(thing));

	}

	@Override
	public String toString() {
		if (this.suitcases.isEmpty()) {
			return "no suitcases (0 kg)";
		}

		if (this.suitcases.size() == 1) {
			return "1 suitcase (" + this.totalWeight() + " kg)";
		}

		return this.suitcases.size() + " suitcases (" + this.totalWeight() + " kg)";
	}
}
