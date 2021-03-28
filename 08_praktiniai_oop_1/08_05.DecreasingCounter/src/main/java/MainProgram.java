
public class MainProgram {

	public static void main(String[] args) {
		DecreasingCounter counter = new DecreasingCounter(100);

		counter.printValue();

		counter.printValue();

		counter.decrement();
		counter.decrement();
		counter.decrement();
		counter.reset();
		counter.printValue();
	}
}
