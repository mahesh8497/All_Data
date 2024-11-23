package july1ConstructorCWQ5;

public class Object {
	int rollNo=10;
	String name="Mahesh";
	int mark=46;
	public Object(Object o)
	{}
	public Object(int rollNo, String name, int mark)
	{
		this.rollNo = rollNo;
		this.name = name;
		this.mark = mark;
		System.out.println();
	}
	public void disp()
	{
		System.out.println(rollNo);
		System.out.println(name);
		System.out.println(mark);
	}
	
	

}
