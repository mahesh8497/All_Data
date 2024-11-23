package August4compareatorto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Myclass {

	public static void main(String[] args) {
		ArrayList<Student> list2=new ArrayList<Student>();
		list2.add(new Student(1,"aa",90));
		list2.add(new Student(5,"ba",50));
		list2.add(new Student(3,"ab",60));
		list2.add(new Student(4,"as",70));
		list2.add(new Student(1,"ea",80));
		Collections.sort(list2,new Abcd());
		System.out.println(list2);

	}

}
