package OOPs;

 class A
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
	
	public void add()
	{
		System.out.println("add");
	}
	
}
 class B extends A 
{
	 
	public void sub()
	{
		System.out.println("sub");
	}
	public void add()
	{
		System.out.println("override");
	}
	public void Sub(String name)
	{
		System.out.println(name);
	}
	
	
}
 interface C 
 {
	 public void mul();
	 default void add()
	 {
		 System.out.println("adding...");
	 }
 }
 class d implements C
 {

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		
	}

	

	
 }
// class Encapsulation
// {
//	  private String name;
//
//	/**
//	 * @return the name
//	 */
//	public String getName() {
//		return name;
//	}
//
//	/**
//	 * @param name the name to set
//	 */
//	public void setName(String name) {
//		this.name = name;
//	}
//	  
// }
public class AllOppsConcept {
	public static void main(String[] args)
	{
	     B b=new B();
	     b.add();
	     b.Sub("This is the overload method");
		d D=new d();
		D.mul();
	   //  System.out.println();
		b.setName(" calling Encapsulation ");
		System.out.println(b.getName());
//		Encapsulation E=new Encapsulation();
//		E.setName("Mahesh is in Encapsulation");
//		System.out.println(E.getName());   
	}

}
