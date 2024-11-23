package companyImpQ;

public class SecondMaxOneLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {7,134,6,512,8,3,212,6,4,12};
//for min number
//int min1=Integer.MAX_VALUE;
int max1=Integer.MIN_VALUE;
//int min2=Integer.MAX_VALUE;
int max2=Integer.MIN_VALUE;
int j=0;
for (int i = 0; i < a.length; i++) 
{
	//if(a[i]<min1)
		if(a[i]>max1)
		
	{
		//min1=a[i];
			max1=a[i];
	}
	if(j<=i) // or  j<=i
	{
//		if(a[j]>min1 && a[j]<min2)
//			min2=a[j];
		if(a[j]<max1 && a[j]>max2)
			max2=a[j];
		else
		{
			j++;
			i--;
		}
	}
	else
		j=0;
}
//System.out.println(min1);
//System.out.println(max1);
//System.out.println(min2);
System.out.println(max2);

}

}

