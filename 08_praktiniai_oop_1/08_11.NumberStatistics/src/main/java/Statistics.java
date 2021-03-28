
public class Statistics {

	private int count;
	private int sum;

	public Statistics() {
		this.count = 0;
		this.sum = 0;
	}

//	adds the new number to Statistics
	public void addNumber(int number) {
		this.count++;
		sum += number;

	}

//	returns the number of added numbers
	public int getCount() {
		return this.count;
	}

//	the sum of the numbers added
	public int sum() {
		return this.sum;
	}

//	returns the average of numbers added
	public double average() {
		if (this.count != 0) {
			return ((double) this.sum / (double) this.count);
		}
		return 0;
	}
}
