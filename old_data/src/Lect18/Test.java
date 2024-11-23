package Lect18;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
public static void main(String[] args) {
	List<String>names=Arrays.asList("sham","mahesh","ram");
	List<Student>student=names.stream().map(Student::new).collect(Collectors.toList());
	System.out.println();
}

}
