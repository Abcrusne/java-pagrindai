
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Last number?");
        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 1; i < number + 1 ; i++) {
        	sum = sum + i;
        }
        System.out.println(sum);

    }
}
