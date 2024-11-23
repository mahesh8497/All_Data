package August19Student;

public class Myclass {

	public static void main(String[] args) {
		Student s1=new Student(1,"ram",40);
		Student s2=new Student(2,"sham",44);
		Student s3=new Student(3,"ramu",43);
		Student s4=new Student(4,"gomu",41);
		Student[]s={s1,s2,s3,s4};
		for (int i = 0; i < s.length; i++) 
		{
		for (int j = 0; j < s.length; j++) 
		{
		if(i<j && s[i].mark>s[j].mark)
		{
			//swapping
			Student	temp=s[i];
			s[i]=s[j];
			s[j]=temp;
		}
		}
		s[i].rn=i+1;
		}
		for (int i = 0; i < s.length; i++) 
		{
			System.out.println(s[i].rn+" "+s[i].name+" "+s[i].mark);
		}
	}

}
