package August20;

public class q36 {

	public static void main(String[] args) {
		int[]a= {1,2,3,-4,6,-5,4,3,8};
		for (int i = 0; i < a.length; i++)
		{
		for (int j =i+1; j < a.length; j++) 
		{
			if(a[i]!=a[j])
			{
				System.out.println("distance between "+a[i]+"and "+a[j]+" is "+(j-i));
		}	
		}
				
		}
	}

}
