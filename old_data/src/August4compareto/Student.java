package August4compareto;

public class Student implements Comparable <Student> {
	int rn;
	String name;
	int marks;
	public Student(int re, String name, int marks) {
		super();
		this.rn = re;
		this.name = name;
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return "Student [rn=" + rn + ", name=" + name + ", marks=" + marks + "]";
	}

	public int compareTo(Student s2)
	{
		if(marks<s2.marks)
			return 1;
		else if(marks==s2.marks)
			return 0;
		else
			return-1;
	}
	

}
