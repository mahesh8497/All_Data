package Lect13;

import java.util.function.Function;

public class FunctionChaining {
public static void main(String[] args) {
	Function<String , String> fun1=x->x.toUpperCase();
	Function<String , String > fun2=s->s.substring(0,3);
	Function<String, String> stringFunction=fun1.andThen(fun2);
	System.out.println(stringFunction.apply("vipul"));
	
	
	//other way
	System.out.println(fun1.andThen(fun2).apply("Vipul"));
}
}
