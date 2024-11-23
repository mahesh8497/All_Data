package August18;

public class r {

	public static void main(String[] args) {
		int[]a= {1,2,3,4,5};
		int num=3;
		int[]b=new int[a.length-1];
		int index=0;
		for (int i = 0; i < a.length; i++)
		{
			if(a[i]!=num)
				b[index++]=a[i];
		}
		for (int i = 0; i < b.length; i++) 
		{
		System.out.println(b[i]+" ");	
	}

}
}