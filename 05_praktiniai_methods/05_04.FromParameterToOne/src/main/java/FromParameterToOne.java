
public class FromParameterToOne {

	public static void main(String[] args) {
		printFromNumberToOne(2);

	}

	public static void printFromNumberToOne(int number) {
		int i = number + 1;
		while (i > 1) {
			i--;
			System.out.println(i);
		}
	}
}
