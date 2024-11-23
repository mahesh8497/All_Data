package Lect14;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class consumer_java8 {
	public static void main(String[] args) {
		Consumer<String >consum=s->System.out.println(s);
		consum.accept("mahesh");
		Consumer<List<Integer>>listconsume1=li->{
			for(Integer i: li) {
				System.out.println(i+100);
			}
		};
		Consumer<List<Integer>>lisconsume2=lil->{
			for(Integer i :lil) {
				System.out.println(i);
			}
		};
		Consumer<List<Integer>>listconsumer=lisconsume2.andThen(listconsume1);
		listconsumer.accept(Arrays.asList(1,2,3));
	}

}
