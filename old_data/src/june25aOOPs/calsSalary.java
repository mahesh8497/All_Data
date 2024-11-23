package june25aOOPs;

public class calsSalary {
	public void calculateSalary(int sal,int expr)
	{
		if(expr<5)
			System.out.println(1.15*sal);
		else
			System.out.println(1.35*sal);
	}

}
