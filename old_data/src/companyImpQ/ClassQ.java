package companyImpQ;

public class ClassQ {

	public static void main(String[] args) {
		
		ClassQ c=new ClassQ();
		c.a(new StringBuffer("asd"));
	}
	void a(StringBuffer s)
	{
		System.out.println("string buffer");
	}
	void a(String s)
	{
		System.out.println("string");
	}

	

}
