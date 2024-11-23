package july28Abstract;

public abstract class devOne {
	void add(int a,int b)
	{
		System.out.println("addition is "+(a+b));
	}
	void sub(int a,int b)
	{
		System.out.println("Substraction is "+(a-b));
	}
	abstract void mult(int a,int b);
	abstract void div(int a,int b);

}
