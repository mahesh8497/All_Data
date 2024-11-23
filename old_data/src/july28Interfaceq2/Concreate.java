package july28Interfaceq2;

public class Concreate extends Abstract{

	@Override
	public void mult(int a, int b) {
		System.out.println("multiplication= "+(a*b));
	}

	@Override
	public void div(int a, int b) {
		System.out.println("division= "+(a/b));
		
	}
	

}
