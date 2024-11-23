package Lect13;

import java.util.function.Function;

public class Function_int {
public static void main(String[] args) {
	Function<Integer, Integer> fun1=x->2*x;
	Function<Integer, Integer> fun2=x->x*x*x;
	//andThen
	System.out.println(fun1.andThen(fun2).apply(1));
	System.out.println(fun2.andThen(fun1).apply(3));
	
	//compose
	System.out.println(fun1.compose(fun2).apply(3));
	
	//identy
	Function<String , String > identityFun=Function.identity();
	System.out.println(identityFun.apply("vipul"));
}
}
