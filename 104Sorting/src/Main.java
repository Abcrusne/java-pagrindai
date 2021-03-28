import java.util.ArrayList;
import java.util.Arrays;

//implement a method smallest which returns the smallest value
//in the array
public class Main {
	public static void main(String[] args) {
		// write testcode here
		int[] array = new int[] { -1, 11, 9, 8, 5, 4, 3 };
		int smallest = smallest(array);
		System.out.println("Smallest: " + smallest);
		int value = indexofTheSmallest(array);
		System.out.println("Index of the smallest: " + value);
		int index = indexOfTheSmallestStartingFrom(array, 4);
		System.out.println("Index Of The Smallest Starting From: " + index);
		System.out.println("Original: " + Arrays.toString(array));
		System.out.println("Swaped: ");
		swap(array, 0, 4);
		sort(array);
	}

	public static int smallest(int[] array) {
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}

	public static int indexofTheSmallest(int[] array) {
		int smallest = smallest(array);
		int value = 0;
		for (int i = 0; i < array.length; i++) {
			if (smallest == array[i]) {
				value = i;
			}
		}
		return value;
	}
//like previous method, but takes consideration the end 
//	of array starting from certain index.

	public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
		int min = index;
		for (int i = index; i < array.length; i++) {
			if (array[i] < array[min]) {
				min = i;
			}
		}
		return min;
	}

//	method for swapping two values at index1 with index2
	public static void swap(int[] array, int index1, int index2) {
//		array = new int[] { -1, 6, 9, 8, 12 };
//		Collections.swap(array, index1, index2);
//		System.out.println(array);
		ArrayList<Integer> newArray = new ArrayList<Integer>();

		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
		int index = 0;
//		System.out.println("Swaped: ");
		while (index < array.length) {
			newArray.add(array[index]);
			index++;

		}
		System.out.println(" " + newArray);
	}

	public static void sort(int[] array) {
		int min = 0;
		System.out.println("Sort: ");
		for (int i = 0; i < array.length; i++) {
			min = indexOfTheSmallestStartingFrom(array, i);
//			System.out.println(array[i]);
//			System.out.println(array[min]);
			if (array[min] < array[i]) {
				swap(array, i, min);
				System.out.println(Arrays.toString(array));
			}
		}
	}

}
