
public class Student extends Person {

	private int credit = 0;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, String address) {
		super(name, address);
		// TODO Auto-generated constructor stub
	}

	public Student(int credit) {
		super();
		this.credit = credit;
	}

	public void study() {
		credit++;
	}

	public int credits() {
		return credit;
	}

	@Override
	public String toString() {
		return (super.getName() + "\n" + "   " + super.getAddress() + "\n" + "  Study credits " + credit);
	}

}
