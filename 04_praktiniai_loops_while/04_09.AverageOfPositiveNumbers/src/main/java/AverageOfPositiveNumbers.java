
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number: ");
        int number = Integer.parseInt(scanner.nextLine());
        int i = 0;
        int sum = 0;
        double avg = sum / (double) i;
        while (true) {
        	if (number > 0) {
        		System.out.println("Give a number: ");
            	i++;
            	sum += number;
            	number = 0;
            	number = Integer.parseInt(scanner.nextLine());
        	} else if (number < 0) {
        		System.out.println("Give a number: ");
            	number = Integer.parseInt(scanner.nextLine());
        	}
        	else if (i == 0 && number == 0) {
        		System.out.println("Cannot calculate the average");
             	number = Integer.parseInt(scanner.nextLine());
             }
        	else if (number == 0 ) {
          		 avg = sum / (double) i;
          		System.out.println("Average of the numbers: " + avg);
          		if (avg ==  Double.NaN) {
          			System.out.println("C");
          		}
          		break;
          		}
        }
//        while (number > 0) {
//        	System.out.println("Give a number: ");
//        	i++;
//        	sum += number;
//        	number = 0;
//        	number = Integer.parseInt(scanner.nextLine());
//        	if (number < 0) {
//        		System.out.println("Give a number: ");
//            	number = Integer.parseInt(scanner.nextLine());
//        	}
//        	if (number == 0 ) {
//        		 avg = sum / (double) i;
//        		System.out.println("Average of the numbers: " + avg);
//        		break;} 
//        	
//        }
//        while (number < 0) {
//        	System.out.println("Give a number: ");
//        	number = Integer.parseInt(scanner.nextLine());
//        	if (number > 0) {
//        		System.out.println("Give a number: ");
//        		i++;
//        		sum += number;
//            	number = 0;
//            	number = Integer.parseInt(scanner.nextLine());
//        	}
//        	if (number == 0 ) {
//        		avg = sum / (double) i;
//        		System.out.println("Average of the numbers: " + avg);
//        		break;} 
//  
//        }
//        while (i == 0 && number == 0) {
//        	System.out.println("Cannot calculate the average");
//        	number = Integer.parseInt(scanner.nextLine());
//        }
////        if (avg == Double.NaN) {
////        System.out.println("Cannot");
////        }
////        double avg = sum / (double) i;
////        while (avg == Double.NaN) {
////        	System.out.println("Cannot");
////        }
    }
  }  

