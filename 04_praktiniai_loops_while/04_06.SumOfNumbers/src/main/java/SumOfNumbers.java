
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number: ");
        int number = Integer.parseInt(scanner.nextLine());
        int i = 0;
        int sum = 0;
        while (number > 0) {
        	System.out.println("Give a number: ");
        	sum += number;
        	number = 0;
        	number = Integer.parseInt(scanner.nextLine());
        	if (number < 0) {
        		System.out.println("Give a number: ");
            	sum += number;
            	number = 0;
            	number = Integer.parseInt(scanner.nextLine());
        	}
        	if (number == 0) {
        		System.out.println("Sum of the numbers: " + sum);
        	}
        }
        while (number < 0) {
        	System.out.println("Give a number: ");
        	sum += number;
        	number = 0;
        	number = Integer.parseInt(scanner.nextLine());
        	if (number > 0) {
        		System.out.println("Give a number: ");
        		sum += number;
            	number = 0;
            	number = Integer.parseInt(scanner.nextLine());
        	}
        	if (number == 0) {
        		System.out.println("Sum of the numbers: " + sum);
        	}
        }

    }
}
