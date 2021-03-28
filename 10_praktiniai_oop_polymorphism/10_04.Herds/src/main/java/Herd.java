import java.util.ArrayList;

public class Herd implements Movable {

	private ArrayList<Movable> items;

	public Herd() {
		this.items = new ArrayList<>();

	}

	public String toString() {
		String herd = "";
		for (int i = 0; i < this.items.size(); i++) {
			herd = herd + this.items.get(i).toString() + "\n";
		}
		return herd;

	}

	public void addToHerd(Movable movable) {
		this.items.add(movable);

	}

	@Override
	public void move(int dx, int dy) {
		for (Movable elements : this.items) {
			elements.move(dx, dy);
		}

	}

}
