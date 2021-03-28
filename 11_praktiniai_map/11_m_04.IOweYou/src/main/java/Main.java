
public class Main {

	public static void main(String[] args) {
		// Test your program here

		IOU a1 = new IOU();
		a1.setSum("a", 51.5);
		a1.setSum("b", 30);
		a1.setSum("a", 10.5);

		System.out.println(a1.howMuchDoIOweTo("a"));
		System.out.println(a1.howMuchDoIOweTo("b"));
		System.out.println(a1.howMuchDoIOweTo("c"));
	}
}
