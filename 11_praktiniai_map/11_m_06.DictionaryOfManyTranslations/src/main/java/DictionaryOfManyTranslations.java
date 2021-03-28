import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {

	private HashMap<String, ArrayList<String>> hashmap = new HashMap<>();

	public DictionaryOfManyTranslations() {
	}

	public void add(String word, String translation) {
		if (!hashmap.containsKey(word)) {
			hashmap.put(word, new ArrayList<String>());
		}
		hashmap.get(word).add(translation);

	}

	public ArrayList<String> translate(String word) {

		if (hashmap.containsKey(word)) {
			ArrayList<String> words = new ArrayList<String>(hashmap.get(word));
			ArrayList<String> translations = new ArrayList<>();
			for (String k : words) {
				translations.add(k);
			}
			return translations;
		} else {
			ArrayList<String> emptyList = new ArrayList<>();
			return emptyList;
		}
	}

	public void remove(String word) {
		if (hashmap.containsKey(word)) {
			hashmap.remove(word);
		}
	}

}
