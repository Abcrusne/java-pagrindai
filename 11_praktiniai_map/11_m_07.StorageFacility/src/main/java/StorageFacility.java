import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StorageFacility {

	private Map<String, ArrayList<String>> hashmap = new HashMap<>();

	public StorageFacility() {

	}

	public void add(String unit, String item) {
		if (!hashmap.containsKey(unit)) {
			hashmap.put(unit, new ArrayList<String>());
		}
		hashmap.get(unit).add(item);

	}

	public ArrayList<String> contents(String storageUnit) {
		if (hashmap.containsKey(storageUnit)) {
			ArrayList<String> items = new ArrayList<String>(hashmap.get(storageUnit));
			return items;
		}

		else {
			ArrayList<String> emptyList = new ArrayList<>();
			return emptyList;
		}
	}

	public void remove(String storageUnit, String item) {
//		removinti value, o jei value tuscia panaikinti ir key
		if (hashmap.containsKey(storageUnit)) {
			hashmap.get(storageUnit).remove(item);
			if (hashmap.get(storageUnit).isEmpty()) {
				hashmap.remove(storageUnit);
			}
		}
	}

	public ArrayList<String> storageUnits() {
		ArrayList<String> items = new ArrayList<String>();
		if (hashmap.keySet() != null) {
			items.addAll(hashmap.keySet());
		}
		return items;
	}

}
