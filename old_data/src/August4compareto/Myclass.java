package August4compareto;

import java.util.ArrayList;
import java.util.Collections;

public class Myclass {

	public static void main(String[] args) {
		ArrayList<Student> list2=new ArrayList<Student> ();
		list2.add(new Student(1,"a",40));
		list2.add(new Student(12,"a",41));
		list2.add(new Student(4,"a",43));
		list2.add(new Student(3,"a",41));
		Collections.sort(list2);
		System.out.println(list2);
	}

}
