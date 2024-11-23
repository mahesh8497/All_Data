package companyImpQ;

class A
{
	void add()
	{
		System.out.println("Parent class");
	}
}
class B extends A
{
	void sub()
	{
		System.out.println("B class");
	}
	void sub(String name)
	{
		System.out.println(name);
	}
}
interface C 
{
	 public void mul();
}
class d implements C
{

	@Override
	public void mul() {
		System.out.println("multipliucattion is in abstraction");
		
	}
	 
}
class Encapsulation
{
	  private String name;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	  
}
public class AllOOPs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A b=new B();
		b.add();
		

	}

}
