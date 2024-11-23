package Lect14;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class AllinOne {
public static void main(String[] args) {
	Predicate<Integer>pre=x->x%2==0;
	Function<Integer, Integer> function=x->x*x;
	Consumer<Integer>consum=x->System.out.println(x);
	Supplier<Integer>supplier=()->100;
	if(pre.test(supplier.get())) {
		consum.accept(function.apply(supplier.get()));
	}
}
}
