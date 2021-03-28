import java.util.ArrayList;
import java.util.Collections;

public class ChangeHistory {

	private ArrayList<Double> history;

	public ChangeHistory() {

		this.history = new ArrayList<>();

	}

	public void add(double status) {
		this.history.add(status);
	}

	public void clear() {
		this.history.clear();
	}

	@Override
	public String toString() {
		return history.toString();
	}

	public double maxValue() {
		if (!history.isEmpty()) {
			return Collections.max(history);
		} else {
			return 0.0;
		}
	}

	public double minValue() {
		if (!history.isEmpty()) {
			return Collections.min(history);
		} else {
			return 0.0;
		}
	}

	public double average() {
		double sum = 0;
		for (double elem : history) {
			sum = sum + elem;
		}
		return sum / this.history.size();
	}

}
