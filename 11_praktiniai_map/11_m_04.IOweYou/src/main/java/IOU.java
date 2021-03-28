import java.util.HashMap;

public class IOU {

	private HashMap<String, Double> hashmap = new HashMap<>();

	public IOU() {

	}

	public void setSum(String toWhom, double amount) {
		hashmap.put(toWhom, amount);
	}

	public double howMuchDoIOweTo(String toWhom) {
//		for (String k : hashmap.keySet()) {
//			hashmap.get(toWhom);
//		}
//		return hashmap.get(toWhom);
		if (hashmap.containsKey(toWhom)) {
			return hashmap.get(toWhom);
		}
		return 0;
	}

}
