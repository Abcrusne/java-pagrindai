
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int answer= Integer.parseInt(scanner.nextLine());
        while (answer != 4) {
        	System.out.println("Give a number:");
        	 answer= Integer.parseInt(scanner.nextLine());
        	if (answer == 4) {
        		break;
        	}
        }
       
        scanner.close();
    }
}
