package Arraypractice;

public class arrayq34 {

	public static void main(String[] args) {

			int[] a= {1,-2,3,4};
			int pc=0;//positive count
			int nc=0;//negative count
			int ec=0;//even count
			int oc=0;//odd count
			for (int i = 0; i < a.length; i++) 
			{
			if(a[i]>0)	
				pc++;
			else
				nc++;
			}
			for (int i = 0; i < a.length; i++)
			{
				if(a[i]%2==0 )
					ec++;
				else
					oc++;
			}
			System.out.println("positive count "+pc);
			System.out.println("negetive count "+nc);
			System.out.println("even count "+ec);
			System.out.println("odd count "+oc);
	}

}
