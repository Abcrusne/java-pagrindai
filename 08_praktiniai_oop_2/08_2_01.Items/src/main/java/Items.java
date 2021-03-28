
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

	public static void main(String[] args) {
		// implement here your program that uses the class Item

		ArrayList<Item> items = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			String name = scanner.nextLine();
			if (name.isEmpty()) {
				break;
			} else {
//        		to create a new item
//        		add new item to the items list
				Item item = new Item(name);
				items.add(item);
			}
//        	 for all names print all the items 
			for (Item item : items) {
				System.out.println(item.toString());
			}

		}
		scanner.close();

	}
}
