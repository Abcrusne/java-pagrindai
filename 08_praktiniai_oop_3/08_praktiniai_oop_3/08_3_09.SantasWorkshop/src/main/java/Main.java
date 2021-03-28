
public class Main {

	public static void main(String[] args) {
		Gift book = new Gift("Harry Potter", 2);
//
//		System.out.println(book.getName());
//		System.out.println(book.getWeight());
//
//		System.out.println(book);

		Package gifts = new Package();
		gifts.addGift(book);
		System.out.println(gifts.totalWeight());
	}
}
