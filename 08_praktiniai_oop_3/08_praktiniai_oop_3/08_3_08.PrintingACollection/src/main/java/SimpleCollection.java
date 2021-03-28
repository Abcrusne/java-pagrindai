
import java.util.ArrayList;

public class SimpleCollection {

	private String name;
	private ArrayList<String> elements;

	public SimpleCollection(String name) {
		this.name = name;
		this.elements = new ArrayList<>();
	}

	public void add(String element) {
		this.elements.add(element);
	}

	public ArrayList<String> getElements() {
		return this.elements;
	}

	public String toString() {
		String list = "";
		String list2 = "";
		for (String element : elements) {
			list = list + element + "\n";
		}
		for (String element : elements) {
			list2 = list2 + element;
		}

		if (elements.isEmpty()) {
			return "The collection " + name + " is empty.";
		} else if (this.elements.size() == 1) {
			return "The collection " + name + " has " + elements.size() + " element:" + "\n" + list2;
		} else {
			return "The collection " + name + " has " + elements.size() + " elements:" + "\n" + list;
		}

	}

}
