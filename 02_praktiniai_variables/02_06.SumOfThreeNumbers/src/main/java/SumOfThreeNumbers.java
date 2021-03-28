
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        int first = Integer.parseInt(scanner.nextLine());
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Give the second number:");
        int second = Integer.parseInt(scan.nextLine());
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Give the third number:");
        int third = Integer.parseInt(reader.nextLine());
        
       int suma = first + second + third;
       System.out.println("The sum of the number is " + suma);

        // Write your program here

    }
}
