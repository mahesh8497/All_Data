package August4compareatorto;

public class Student {
	int rn;
	String name;
	int marks;
	public Student(int rn, String name, int marks) {
		super();
		this.rn = rn;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [rn=" + rn + ", name=" + name + ", marks=" + marks + "]";
	}
	
}
