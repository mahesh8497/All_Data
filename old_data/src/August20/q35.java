package August20;

public class q35 {

	public static void main(String[] args) {
		int[]a= {1,2,3,4};
		int[]b= {5,6,7,8};
		int[]c=new int[a.length+b.length];
		int aIndex=0;
		int bIndex=0;
		for (int i = 0; i < c.length; i++)
		{
		if(i<a.length)
			c[i]=a[aIndex++];
		else
			
			c[i]=b[bIndex++];
		}
		for (int i = 0; i < c.length; i++) 
		{
		System.out.print(c[i]+" ");	
		}
	}

}
