
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        int first = Integer.parseInt(scanner.nextLine());
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Give the second number:");
        int second = Integer.parseInt(scan.nextLine());
        
        int suma = first + second;
        int atimtis = first - second;
        int daugyba = first * second;
        double dalyba = first / second;
        System.out.println(first + " + " + second + " = " + suma);
        System.out.println(first + " - " + second + " = " + atimtis);
        System.out.println(first + " * " + second + " = " + daugyba);
        System.out.println(first + " / " + second + " = " + dalyba);
      

    }
}
