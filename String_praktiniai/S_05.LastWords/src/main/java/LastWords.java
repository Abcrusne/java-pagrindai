
import java.util.Scanner;

public class LastWords {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
//		String[] pieces = text.split(" ");
//		System.out.println("Number: " + pieces.length);
		while (!text.isEmpty()) {
			String[] pieces = text.split(" ");
//			pieces.length -1 <-ilgis bus, pvz array sudasrytas is { labas, vienas du}
//			tai ats bus 3-1 = 2. dar apskliaudziam kad array printintu ta reiksme kuri 
//			stovi index'e = pieces.length - 1 (t.y. paskutineje vietoje)
			System.out.println(pieces[pieces.length - 1]);
			text = scanner.nextLine();
		}

	}
}
