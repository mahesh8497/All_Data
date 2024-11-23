package Java_8_Stram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {
	public static void main(String[] args) {

		//convert list->stream
		List<String>list=Arrays.asList("mahesh","sham","ram");
		Stream<String> myStream = list.stream();
		
		
		//convert String->stream

		String[]array= {"appple","mango","cherry"};
		Stream<String> stream = Arrays.stream(array);
		
		
		Stream<Integer> IntegerStream = Stream.of(1,2,3,4);
		
		Stream<Integer> limit = Stream.iterate(0, n->n+1).limit(100);
		
		Stream<Integer> limit1 = Stream.generate(()->(int)Math.random()*100).limit(100);
	
	}

}
