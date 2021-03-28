
public class Student {

	private int studentID;
	private String name;
	private University university;

	public Student(int studentID, String name, University university) {
		super();
		this.studentID = studentID;
		this.name = name;
		this.university = university;
	}

	public int getStudentID() {
		return studentID;
	}

	public String getName() {
		return name;
	}

	public University getUniversity() {
		return university;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setUniversity(University university) {
		this.university = university;
	}

}
