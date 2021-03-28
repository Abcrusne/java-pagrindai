
import java.util.Scanner;

public class Story {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("I will tell you a story, but I need some information first.");
        System.out.println("What is the main character called?");
        String character =  scanner.nextLine();
        System.out.println("What is their job?");
        // Write your program here
        Scanner sc = new Scanner(System.in);
        String job = sc.nextLine();
        String start = "Here is the story:";
        String a = "Once upon a time there was ";
        String b = ", who was ";
        String c = ".";
        String d = "On the way to work, ";
        String e = " reflected on life.";
        String f = "Perhaps ";
        String g = " will not be ";
        String h = " forever.";
        System.out.println(start);
        System.out.println(a + character + b + job + c);
        System.out.println(d + character + e);
        System.out.println(f + character + g + job +h);
        		
//        System.out.println("Here is the story:");
//        System.out.println("Once upon a time there was " + character + ", who was " + job + ".");
//        System.out.println("On the way to work, " + character +" reflected on life.");
//        System.out.print("Perhaps " + character +" will not be " + job +" forever.");
//        
    }
}
