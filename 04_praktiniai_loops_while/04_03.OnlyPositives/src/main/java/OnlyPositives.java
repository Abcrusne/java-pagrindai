
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int answer= Integer.parseInt(scanner.nextLine());
        while (answer > 0) {
        	double power = Math.pow(answer, 2);
        	System.out.println(power);
        	System.out.println("Give a number:");
        	answer = Integer.parseInt(scanner.nextLine());
        	if (answer < 0) {
        		System.out.println("Unsuitable number");
        		System.out.println("Give a number:");
        		answer = Integer.parseInt(scanner.nextLine());
        	}
        		if (answer == 0) {
        		break;
        	}
        }
        while (answer < 0) {
    		System.out.println("Unsuitable number");
    		System.out.println("Give a number:");
    		answer = Integer.parseInt(scanner.nextLine());
        	if (answer > 0) {
            	double power = Math.pow(answer, 2);
            	System.out.println(power);
            	System.out.println("Give a number:");
            	answer = Integer.parseInt(scanner.nextLine());
        	} if (answer == 0) {
        		break;
        	}
        }
        scanner.close();

        }
}
