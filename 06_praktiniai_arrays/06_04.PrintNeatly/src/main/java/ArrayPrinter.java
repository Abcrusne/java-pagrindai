public class ArrayPrinter {

	public static void main(String[] args) {
		// You can test your method here
		int[] array = { 5, 1, 3, 4, 2 };
		printNeatly(array);
	}

	public static void printNeatly(int[] array) {
		// Write some code in here
		for (int i = 0; i < array.length; i++) {
//			for all values of array except the last one
			if (i != array.length - 1) {
				System.out.print(array[i] + ", ");
//				for the last value of array
			} else {
				System.out.println(array[i]);
			}
		}
	}
}
