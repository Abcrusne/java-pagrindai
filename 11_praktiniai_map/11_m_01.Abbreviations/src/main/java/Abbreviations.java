import java.util.HashMap;
import java.util.Map;

public class Abbreviations implements Map.Entry<String, String> {

	Map<String, String> map = new HashMap<>();

//	ArrayList<HashMap<String, String>> list = new ArrayList<>();

	public Abbreviations() {

	}

	public void addAbbreviation(String abbreviation, String explanation) {
		map.put(abbreviation, explanation);
//list.add(HashMap <abbreviation, explanation> );

	}

	public boolean hasAbbreviation(String abbreviation) {
		if (map.containsKey(abbreviation)) {
			return true;
		} else {
			return false;
		}
	}

	public String findExplanationFor(String abbreviation) {

		if (map.containsKey(abbreviation)) {
			String value = map.get(abbreviation);
			return value;
		}
		return null;

	}

	@Override
	public String getKey() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String setValue(String value) {
		// TODO Auto-generated method stub
		return null;
	}

}
