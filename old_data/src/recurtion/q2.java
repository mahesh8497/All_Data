package recurtion;

public class q2 {
	//array index and Array element
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		m1(0,a.length,a);
	

	}
	private static void m1(int i, int length, int[] a) 
	{
		System.out.println(a[i]+" "+i);
		i++;
		if(i<length)
			m1(i,length,a);
	}

}
