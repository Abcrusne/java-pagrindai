
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Where to?");
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i < number + 1 ; i++) {
        	System.out.println(i);
        }
        Scanner scan = new Scanner(System.in);
        System.out.print("Where to?");
        int to = Integer.parseInt(scan.nextLine());
        Scanner read = new Scanner(System.in);
        System.out.print("Where from?");
        int from = Integer.parseInt(read.nextLine());
        for (int j = from; j < to + 1; j++)
        	System.out.println(j);
    }
}
