
public class Main {

	public static void main(String[] args) {
		Item book = new Item("The lord of rings", 2);
		Item phone = new Item("Nokia", 1);
		Item brick = new Item("brick", 4);

		Suitcase suitcase1 = new Suitcase(6);
		suitcase1.addItem(book);
		suitcase1.addItem(phone);

		Suitcase suitcase2 = new Suitcase(9);
		suitcase2.addItem(brick);

//		Suitcase suitcase3 = new Suitcase(10);
//		suitcase3.addItem(brick);
//		suitcase3.addItem(phone);

		Hold hold = new Hold(10);
		hold.addSuitcase(suitcase1);
		hold.addSuitcase(suitcase2);
//		hold.addSuitcase(suitcase3);

		System.out.println(hold);
		hold.printItems();

//		suitcase.printItems();
//		System.out.println("Total weight: " + suitcase.totalWeight());
//		System.out.println(suitcase.heaviestItem());
//		System.out.println(suitcase);
//
//		suitcase.addItem(book);
//		System.out.println(suitcase);
//
//		suitcase.addItem(phone);
//		System.out.println(suitcase);
//
//		suitcase.addItem(brick);
//		System.out.println(suitcase);

//		System.out.println("The book's name: " + book.getName());
//		System.out.println("The phone's name: " + phone.getName());
//
//		System.out.println("Book: " + book);
//		System.out.println("Phone: " + phone);

	}

}
