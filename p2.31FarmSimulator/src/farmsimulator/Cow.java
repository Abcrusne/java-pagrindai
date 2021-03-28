package farmsimulator;

import java.util.Random;

public class Cow implements Milkable, Alive {

	private String name;
	private int udderCapacity;
	private Random random = new Random();
	private double amount;

	private static final String[] NAMES = new String[] { "Anu", "Arpa", "Essi", "Heluna", "Hely", "Hento", "Hilke",
			"Hilsu", "Hymy", "Ihq", "Ilme", "Ilo", "Jaana", "Jami", "Jatta", "Laku", "Liekki", "Mainikki", "Mella",
			"Mimmi", "Naatti", "Nina", "Nyytti", "Papu", "Pullukka", "Pulu", "Rima", "Soma", "Sylkki", "Valpu",
			"Virpi" };

	public Cow() {
		this.name = NAMES[random.nextInt(NAMES.length)];
		this.udderCapacity = 15 + new Random().nextInt(40 - 15 + 1);
		this.amount = 0;
	}

	public Cow(String name) {
		this.name = name;
		this.udderCapacity = 15 + new Random().nextInt(26);
		this.amount = 0;
	}

	public String getName() {
		return this.name;
	}

	public double getAmount() {
		return this.amount;
	}

	public double getCapacity() {
		return this.udderCapacity;
	}

	public static String[] getNames() {
		return NAMES;
	}

	@Override
	public String toString() {
		return name + " " + Math.ceil(this.amount) + "/" + Math.ceil(this.udderCapacity);
	}

	@Override
	public void liveHour() {
		this.amount += (7 + random.nextInt(20 - 7 + 1)) / 10.0;
		if (this.amount > this.udderCapacity) {
			this.amount = this.udderCapacity;
		}
	}

	@Override
	public double milk() {
		double milkTaken = this.amount;
		this.amount = 0;
		return milkTaken;
	}

}
