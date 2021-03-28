
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static double averageMore(ArrayList<Integer> grades) {
		int passSum = 0;
		int count = 0;
		for (int j = 0; j < grades.size(); j++) {
			if (grades.get(j) > 49) {
				passSum += grades.get(j);
				count++;
			}
		}
		return ((double) passSum) / count;
	}

	public static double count(ArrayList<Integer> grades) {
		int passSum = 0;
		double count = 0;
		for (int j = 0; j < grades.size(); j++) {
			if (grades.get(j) > 49) {
				passSum += grades.get(j);
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> grades = new ArrayList<Integer>();

		System.out.println("Write a grade: ");
		int input = 0;
		while (input != -1) {
			input = Integer.valueOf(scanner.nextInt());
			if (input != -1 && input <= 101 && input > 0) {
				grades.add(input);
			}
		}
		int sum = 0;
		for (int i = 0; i < grades.size(); i++)
			sum += grades.get(i);

//		System.out.println(grades.toString());
		System.out.println("Point average (all): " + ((double) sum) / grades.size());
		System.out.println("Point average (passing): " + averageMore(grades));
		System.out.println("Pass percentage: " + (100 * count(grades)) / grades.size());
		System.out.println("Grades distribution: ");

		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		int count5 = 0;
		int count6 = 0;

		for (int num : grades) {
			if (num > 0 && num < 50) {
				count1++;
			}
			if (num > 50 && num < 60) {
				count2++;
			}
			if (num >= 60 && num < 70) {
				count3++;
			}
			if (num >= 70 && num < 80) {
				count4++;
			}
			if (num >= 80 && num < 90) {
				count5++;
			}
			if (num >= 90 && num < 101) {
				count6++;
			}
		}
		System.out.print("5: ");
		for (int i = 0; i < count6; i++) {
			System.out.print("*");
		}
		System.out.println("");
		System.out.print("4: ");
		for (int i = 0; i < count5; i++) {
			System.out.print("*");
		}
		System.out.println("");
		System.out.print("3: ");
		for (int i = 0; i < count4; i++) {
			System.out.print("*");
		}
		System.out.println("");
		System.out.print("2: ");
		for (int i = 0; i < count3; i++) {
			System.out.print("*");
		}
		System.out.println("");
		System.out.print("1: ");
		for (int i = 0; i < count2; i++) {
			System.out.print("*");
		}
		System.out.println("");
		System.out.print("0: ");
		for (int i = 0; i < count1; i++) {
			System.out.print("*");
		}

	}

}
