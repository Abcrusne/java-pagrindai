
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number: ");
        int number = Integer.parseInt(scanner.nextLine());
        int i = 0;
        int sum = 0;
        while (number > 0) {
        	System.out.println("Give a number: ");
        	i++;
        	sum += number;
        	number = 0;
        	number = Integer.parseInt(scanner.nextLine());
        	if (number < 0) {
        		System.out.println("Give a number: ");
        		i++;
            	sum += number;
            	number = 0;
            	number = Integer.parseInt(scanner.nextLine());
        	}
        	if (number == 0) {
        		float avg = sum / (float) i;
        		System.out.println("Average of the numbers: " + avg);
        	}
        }
        while (number < 0) {
        	System.out.println("Give a number: ");
        	i++;
        	sum += number;
        	number = 0;
        	number = Integer.parseInt(scanner.nextLine());
        	if (number > 0) {
        		System.out.println("Give a number: ");
        		i++;
        		sum += number;
            	number = 0;
            	number = Integer.parseInt(scanner.nextLine());
        	}
        	if (number == 0) {
        		float avg = sum / (float) i;
        		System.out.println("Average of the numbers: " + avg);
        	}
        }

    }
}
