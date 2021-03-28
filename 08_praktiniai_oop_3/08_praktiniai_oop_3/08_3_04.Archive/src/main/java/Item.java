
public class Item {
	private String name;
	private String identifier;

	public Item(String name, String identifier) {
		super();
		this.name = name;
		this.identifier = identifier;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public boolean equals(Object other) {
		Item item = (Item) other;
		return this.identifier.equals(item.identifier);
	}

	@Override
	public String toString() {
		return identifier + ": " + name;
	}
}
