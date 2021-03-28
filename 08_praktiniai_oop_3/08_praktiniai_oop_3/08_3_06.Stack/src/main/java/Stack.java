import java.util.ArrayList;

public class Stack {
	private ArrayList<String> list;

	public Stack() {
		this.list = new ArrayList<>();
	}

	public boolean isEmpty() {
		if (!this.list.isEmpty()) {
			return false;
		} else {
			return true;
		}
	}

	public void add(String value) {
//		ArrayList<String> stack = new ArrayList<String>();
		this.list.add(value);
	}

	public ArrayList<String> values() {
//		ArrayList<String> list = new ArrayList<String>();
		return this.list;
	}

	public String take() {
		String removed = list.get(list.size() - 1);
		this.list.remove(removed);
		return removed;

	}

}
