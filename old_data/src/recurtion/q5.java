package recurtion;

public class q5 {
//coppy array
	public static void main(String[] args) {
		int[] a= {2,3,4,5,6,7,8};
		System.out.println("coppy array");
		int[] b=new int [a.length];
		get(a,b,0);
		print(b,0);
	}
	
	private static void print(int[] b, int i) {
		System.out.println(b[i]);
		i++;
		if(i<b.length)
			print(b,i);		
	}

	private static void get(int[] a, int[] b, int i)
	{
	b[i]=a[i];
	i++;
	if(i<a.length)
		get(a,b,i);
	}

}
