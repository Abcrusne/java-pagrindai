
import java.util.Scanner;

public class MultiplicationFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        int first = Integer.parseInt(scanner.nextLine());
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Give the second number:");
        int second = Integer.parseInt(scan.nextLine());
        
        int suma = first * second ;
       System.out.println( first + " * " + second + " = " + suma);

        // Write your program here

    }
}
