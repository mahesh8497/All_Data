package june28MethodCWQ1;
import java.util.Scanner;
public class StudentInfo 
{
	int Rollnois=0; 
	String name;
	int contactNumberis=0;
	int mark=0;
	public void inputdata()
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Rollnois,name,contactNumberis,mark");
		Rollnois=sc.nextInt();
		sc.nextLine();
		name=sc.nextLine();
		contactNumberis=sc.nextInt();
		mark=sc.nextInt();
		}
	public void display()
	{
		System.out.println("Rollnois ="+Rollnois+ " name ="+name+ " contactNumberis= "+contactNumberis +"mark= "+mark);

		
	}

}
