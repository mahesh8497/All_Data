package ArraysPractice1;

public class hw2 {

	public static void main(String[] args) {
		int[]a= {1,2,3,4,5,6};
		int num=8;
		boolean Itspresent=true;
		for (int i = 0; i < a.length; i++)
		{
				if(a[i]==num)
			Itspresent=false;
			
		}	
		if(Itspresent)
			System.out.println("not Present");
		else
			System.out.println(" present");
		
	}

}
