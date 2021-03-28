import java.util.ArrayList;
import java.util.List;

public class University {

	private String name;
	private List<Student> student = new ArrayList<>();

	public University(String name, List<Student> student) {
		super();
		this.name = name;
		this.student = student;
	}

}
