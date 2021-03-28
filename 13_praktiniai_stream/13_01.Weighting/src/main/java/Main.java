
public class Main {

	public static void main(String[] args) {
		// Use this main program for testing your classes!

		Item book = new Item("The lord of rings", 2);
		Item phone = new Item("Nokia", 1);
		Item brick = new Item("brick", 4);

		Suitcase suitcase1 = new Suitcase(6);
		suitcase1.addItem(book);
		suitcase1.addItem(phone);

		Suitcase suitcase2 = new Suitcase(9);
		suitcase2.addItem(brick);
//		System.out.println(suitcase1);
		suitcase1.printItems();

	}

}
