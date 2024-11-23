package staticMethod;

interface A{
	static void say() {
		
	}
}

public class MyClsaa implements A{
public static void main(String[] args) {
		
	MyClsaa obj=new MyClsaa();
	//obj.say(); we can not call static method creating obj 
	A.say();// we can call only create interface obj
}
}
