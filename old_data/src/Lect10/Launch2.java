package Lect10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Launch2 {
public static void main(String[] args) {
	
	Student s1=new Student(1, "Mahesh");
	Student s2=new Student(2, "Mesh");
	Student s3=new Student(5, "Mahh");
	List<Student>ls=new ArrayList<Student>();
	ls.add(s1);
	ls.add(s2);
	ls.add(s3);
	Collections.sort(ls,(a,b)->b.id-a.id);
	System.out.println(ls);
	
	
	
	

}

	static class Student {
		public Integer id;

		public String name;

		public Student(Integer id, String name) {
			this.id = id;
			this.name = name;
		}

		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + "]";
		}

	}

}
