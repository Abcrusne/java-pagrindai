
import java.util.Scanner;

public class CountingToHundred {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = Integer.parseInt(scanner.nextLine());
		for (int i = number; i < 101; i++)
			System.out.println(i);
	}
}
//int i = 0 ; i< 100; i++;
//int i = number; i < 101; i++