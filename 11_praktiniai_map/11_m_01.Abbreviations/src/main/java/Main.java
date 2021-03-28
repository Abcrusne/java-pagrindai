
public class Main {

	public static void main(String[] args) {

		Abbreviations a1 = new Abbreviations();
		a1.addAbbreviation("e.g.", "for example");
		a1.addAbbreviation("etc.", "and so on");
		a1.addAbbreviation("i.e.", "more");

		String text = "e.g. i.e. etc. lol";

		for (String part : text.split(" ")) {
			if (a1.hasAbbreviation(part)) {
				part = a1.findExplanationFor(part);
			}
			System.out.print(part);
			System.out.print(" ");
		}
		System.out.println();

	}

}
