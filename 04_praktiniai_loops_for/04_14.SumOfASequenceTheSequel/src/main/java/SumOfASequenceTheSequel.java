
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("First number?");
        int first = Integer.parseInt(scanner.nextLine());
        Scanner scan = new Scanner(System.in);
        System.out.print("Last number?");
        int last = Integer.parseInt(scan.nextLine());
        int sum = 0;
        for (int i = first; i < last + 1; i++)
        	sum = sum + i;
        System.out.println("The sum is: " + sum);
    } 
}
