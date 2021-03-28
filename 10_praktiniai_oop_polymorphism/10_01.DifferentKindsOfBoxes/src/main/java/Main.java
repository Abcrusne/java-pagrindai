
public class Main {

	public static void main(String[] args) {
		BoxWithMaxWeight coffeeBox = new BoxWithMaxWeight(10);
		coffeeBox.add(new Item("Saludo", 5));
		coffeeBox.add(new Item("Pirkka", 5));
		coffeeBox.add(new Item("Kopi", 5));

//		OneItemBox box = new OneItemBox();
//		box.add(new Item("a", 5));
//		box.add(new Item("b", 5));
		MisplacingBox box = new MisplacingBox();
		box.add(new Item("a", 5));
		box.add(new Item("b", 5));

		System.out.println(box.isInBox(new Item("a")));
		System.out.println(box.isInBox(new Item("b")));
//		System.out.println(coffeeBox.isInBox(new Item("Saludo")));
//		System.out.println(coffeeBox.isInBox(new Item("Pirkka")));
//		System.out.println(coffeeBox.isInBox(new Item("Kopi")));
//		System.out.println(coffeeBox.isInBox(new Item("K")));
	}
}
