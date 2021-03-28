
public class Main {

	public static void main(String[] args) {
		// write experimental code here to check how your program functions
		HealthStation childrensHospital = new HealthStation();

		Person ethan = new Person("Ethan", 1, 110, 7);
		Person pether = new Person("Pether", 33, 176, 85);
//
//		System.out.println(ethan.getName() + " weight: " + childrensHospital.weigh(ethan) + " kilos");
//		System.out.println(pether.getName() + " weight: " + childrensHospital.weigh(pether) + " kilos");
//		childrensHospital.feed(ethan);
//		childrensHospital.feed(ethan);
//		childrensHospital.feed(ethan);
//
//		System.out.println(" ");
//
//		System.out.println(ethan.getName() + " weight: " + childrensHospital.weigh(ethan) + " kilos");
//		System.out.println(pether.getName() + " weight: " + childrensHospital.weigh(pether) + " kilos");

		childrensHospital.weigh(ethan);
		System.out.println("weighings performed: " + childrensHospital.weighings());
	}
}
