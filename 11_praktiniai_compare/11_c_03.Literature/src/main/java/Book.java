import java.util.Comparator;

public class Book implements Comparable<Book> {

	private final String name;
	private int age;

	public Book(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return name + " (recommended for " + age + " year-olds or older)";
	}

	public int compareTo(Book o) {
		return this.getName().compareTo(o.getName());
	}

	public static Comparator<Book> ages = new Comparator<Book>() {

		public int compare(Book o1, Book o2) {
			if (o1.getAge() == o2.getAge()) {
				return o1.getName().compareTo(o2.getName());
			} else if (o1.getAge() > o2.getAge()) {
				return 1;
			} else {
				return -1;
			}
		}
	};

}
//	public static Comparator<Book> ages = new Comparator<Book>() {

//public int compare(Book o1, Book o2) {
//	if (o1.getAge() == o2.getAge()) {
//		return 0;
//	} else if (o1.getAge() > o2.getAge()) {
//		return 1;
//	} else {
//		return -1;
//	}
//}
//};

//implements Comparable<Book>
////public int compareTo(Book o) {
////
////	if (!this.name.equalsIgnorecase(o.name)) {
////		return this.name.compareTo(o.name);
////	} 
//if (!this.name.equalsIgnorecase(o.name)) {
////return this.name.compareTo(o.name);
////}
////		return -1;
////	}
////}
