package july1ConstructorHWQ1;

public class Employee {
	int emplyid;
	String name;
	int moNo;
	double salary;
	public Employee(int emplyid, String name, int moNo, double salary) {
		super();
		this.emplyid = emplyid;
		this.name = name;
		this.moNo = moNo;
		this.salary = salary;
	}
	void display()
	{
		System.out.println("emplyid"+emplyid+"name"+"moNo"+moNo+"salary");
	}
double calculateSalary(int days)
{
	return salary*days/26;
}
@Override
public String toString()
{
	return"Employee[emplyid="+emplyid+",name="+name+",moNo="+moNo+",salary="+salary+"]";
}
}
