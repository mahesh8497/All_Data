package Lect10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Launch {
public static void main(String[] args) {
	//List<Integer>ls= new ArrayList<>();
	Set<Integer>s=new TreeSet<>();
	s.add(1);
	s.add(25);
	s.add(13);
	System.out.println("Before: "+s);
	System.out.println();
	Set<Integer>ts=new TreeSet<>((a,b)->b-a);//b-a means descending order
	ts.add(1);
	ts.add(25);
	ts.add(13);
	System.out.println("After descending: "+ts);
	//Collections.sort(ls,(a,b)->b-a);
	//System.out.println(ls);
	
	
}
}
