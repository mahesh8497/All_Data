package ArraysPractice;

public class Arraysq2 {

	public static void main(String[] args) {
		int[]a= {1,2,3,4,5,6,7};
		int num=12;
		boolean presentNumber=false;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]==num)
				presentNumber=true;
		}
		if(presentNumber)
			System.out.println("Present ");
		else 
			System.out.println("not present");
		
	}

}