package july1ConstructorCWQ5;

public class Student {

	public static void main(String[] args)
	{
		Object o=new Object(10,"Mahesh",46);
		o.disp();
		//System.out.println(o);
		Object o1=new Object(o);
		//System.out.println(o1);
		o1.disp();


	}

}
