package Java_8_Stram;

import java.util.stream.Stream;

public class Example {
public static void main(String[] args) {
	Stream<?> item = Stream.of(3,4,5,79,"a");
	item.map(i->i + " :S")
	.forEach(System.out::println);
	
}
}
