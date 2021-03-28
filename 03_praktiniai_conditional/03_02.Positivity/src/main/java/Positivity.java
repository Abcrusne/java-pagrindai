
import java.util.Scanner;

public class Positivity {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give the first number:");
        int first = Integer.parseInt(scan.nextLine());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the second number:");
        int second = Integer.parseInt(scanner.nextLine());
        if (first > second) {
        	System.out.println("Greater number is: "+ first);
        } else {
        	System.out.println("Greater number is: "+ second);
        }
    }
}
