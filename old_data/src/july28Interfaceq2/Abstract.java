package july28Interfaceq2;

public abstract class Abstract implements interface2 
{

	@Override
	public void add(int a, int b) {
		System.out.println("addition= "+(a+b));
	}

	@Override
	public void sub(int a, int b) {
		System.out.println("substractions= "+(a-b));		
	}

	@Override
	public abstract void mult(int a, int b); 
		
	@Override
	public abstract void div(int a, int b);


	

}
