
import java.util.HashMap;

public class Program {

	public static void main(String[] args) {
		HashMap<String, Book> hashmap = new HashMap<>();
		hashmap.put("sense", new Book("Sense ans Sensibility", 1811, ".."));
		printValues(hashmap);
		System.out.println("---");
		printValueIfNameContains(hashmap, "ens");
	}

	public static void printValues(HashMap<String, Book> hashmap) {
		System.out.println((hashmap.values()).toString());
//		for (String k : hashmap.keySet()) {
//			System.out.println(hashmap.get(k));
//		}

	}

	public static void printValueIfNameContains(HashMap<String, Book> hashmap, String text) {
//print only Books which contains in name 'text'
		for (String k : hashmap.keySet()) {
			if (hashmap.get(k).getName().contains(text)) {
				System.out.println(hashmap.get(k));
			}
		}
	}
}
