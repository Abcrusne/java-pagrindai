
public class Main {

	public static void main(String[] args) {

		Book b1 = new Book("Dostoevsky", "Crime", 2);
		Book b2 = new Book("Martin", "Clean Code", 1);

		CD c1 = new CD("Pink Floyd", "Dark", 1973);
		CD c2 = new CD("grupe", "Daina", 1999);

		Box box = new Box(10);
		box.add(b1);
		box.add(b2);
		box.add(c1);
		box.add(c2);
		System.out.println(box.weight());
		System.out.println(box);

		Box bigBox = new Box(20);
		bigBox.add(box);
		System.out.println(bigBox);
//		System.out.println(b1);
//		System.out.println(b2);
//
//		System.out.println(c1);
//		System.out.println(c2);
	}

}
