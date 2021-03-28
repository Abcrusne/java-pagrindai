import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {

	private HashMap<LicensePlate, String> hashmap = new HashMap<>();

	public boolean add(LicensePlate licensePlate, String owner) {
		if (hashmap.get(licensePlate) == null) {
			hashmap.put(licensePlate, owner);
			return true;
		}
		return false;
	}

	public String get(LicensePlate licensePlate) {

		return hashmap.get(licensePlate);
	}

	public boolean remove(LicensePlate licensePlate) {
		if (hashmap.get(licensePlate) != null) {
			hashmap.remove(licensePlate);
			return true;
		}
		return false;
	}

	public void printLicensePlates() {
//		print key, kurie object yra
		for (LicensePlate k : hashmap.keySet()) {
			System.out.println(k);
		}
	}

	public void printOwners() {
//		print values, kurie yra String. Susikurti arraylist, 
//		ten patalpinti string ( kad nesikartotu), String gauti per key
		ArrayList<String> owners = new ArrayList<String>();
		for (LicensePlate k : hashmap.keySet()) {
			String owner = hashmap.get(k);
			if (!owners.contains(owner)) {
				owners.add(owner);
			}
		}
		for (String owner : owners) {
			System.out.println(owner);
		}

	}

}
