
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a string: ");
        String word = scan.nextLine();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Give an integer:");
        int number = Integer.valueOf(sc.nextLine());
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Give a double:");
        double num = Double.valueOf(reader.nextLine());
        
        Scanner read = new Scanner(System.in);
        System.out.println("Give a boolean:");
        boolean bool = Boolean.valueOf(read.nextLine());
        
       
        
        System.out.println("You gave the string "+ word);
        System.out.println("You gave the integer "+ number);
        System.out.println("You gave the double "+ num);
        System.out.println("You gave the boolean "+ bool);
        

        // Write your program here

    }
}
