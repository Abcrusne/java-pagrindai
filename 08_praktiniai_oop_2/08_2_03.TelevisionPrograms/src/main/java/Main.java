import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// implement here your program that uses the TelevisionProgram class

		ArrayList<TelevisionProgram> programs = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("Name: ");
			String name = scanner.nextLine();
			if (name.isEmpty()) {
				break;
			}
			System.out.print("Duration: ");
			int duration = Integer.parseInt(scanner.nextLine());
			TelevisionProgram televisionProgram = new TelevisionProgram(name, duration);
			programs.add(televisionProgram);
		}
		System.out.print("Program's maximum duration?");
		int max = Integer.parseInt(scanner.nextLine());
		for (TelevisionProgram televisionProgram : programs) {
			if (max >= televisionProgram.getDuration()) {
				System.out.println(televisionProgram.getName() + ", " + televisionProgram.getDuration());
			}
		}

	}

}
