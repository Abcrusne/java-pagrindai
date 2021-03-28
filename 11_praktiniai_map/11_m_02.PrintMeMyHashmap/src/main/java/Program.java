
import java.util.HashMap;
import java.util.Map;

public class Program {

	Map<String, String> map = new HashMap<>();

	public static void main(String[] args) {

		HashMap<String, String> hashmap = new HashMap<>();
		hashmap.put("f.e", "for example");
		hashmap.put("etc", "and so on");
		hashmap.put("i.e", "more precesily");

		printKeys(hashmap);
		System.out.println("---");
		printKeysWhere(hashmap, "i");
		System.out.println("---");
		printValuesOfKeysWhere(hashmap, ".e");

	}

	public static void printKeys(HashMap<String, String> hashmap) {

		System.out.println(hashmap.keySet());
	}

	public static void printKeysWhere(HashMap<String, String> hashmap, String text) {
		for (String k : hashmap.keySet()) {
			if (k.contains(text)) {
				System.out.println(k);
			}
		}

	}

	public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {
		for (String k : hashmap.keySet()) {
			if (k.contains(text)) {
				System.out.println(hashmap.get(k));
			}

		}

	}
}
