package Lect13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Function_Interface {
public static void main(String[] args) {
	Function<String , Integer> fun1=x->x.length();
	Function<String , String > fun2=s->s.substring(0,2);
	Function<List<Student>,List<Student>> studentwithVipAsPrefix=li->{
		List<Student>result=new ArrayList<>();
		for(Student s:li) {
			if(fun2.apply(s.getName()).equalsIgnoreCase("sha")) {
				result.add(s);
			}
		}
		return result;
		
	};
	Student s1 = new Student(2, "sham");
	Student s2 =new Student(4, "sham");
	Student s3 =new Student(1, "sham");
	Student s4 =new Student(5, "sham");
	List<Student>student=Arrays.asList(s1,s2,s3,s4);
	List<Student>filStudents=studentwithVipAsPrefix.apply(student);
	System.out.println(filStudents);
	
}
private static class Student{
	private int id;
	private String name;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
}
}
