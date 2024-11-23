package recurtion;

public class q13equalityArray {
//eqility
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		int[] b= {1,2,3,4,5};
		equality(a,b,0);

		}
	private static void equality(int[] a, int[] b, int i) {
		
		if(a.length==b.length)
		{
			
			if(a[i]==b[i]) 
			{
				if(i<a.length-1)
				equality(a, b, i+1);
				else
				{
					System.out.println(true);
					System.exit(0);
				}
			}
			else
			{
				System.out.println("not");
				System.exit(0);
			}
			
		}
		else {
			System.out.println("not");
			System.exit(0);
		}
	}
	}


