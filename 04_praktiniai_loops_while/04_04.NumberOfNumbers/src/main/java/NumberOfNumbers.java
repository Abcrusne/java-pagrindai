
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number: ");
        int number = Integer.parseInt(scanner.nextLine());
        int i = 0;
        while (number != 0) {
        	System.out.println("Give a number: ");
        	i++;
        	number = Integer.parseInt(scanner.nextLine());
        	if (number == 0) {
        		System.out.println("Number of numbers: " + i);
        	}
        }

    }
}
