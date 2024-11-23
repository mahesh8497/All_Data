package Arraypractice;
//first subarray with leasts average in single loop
public class arrayq26 {
	public static void main(String[] args) {
int[] a= {5,7,1,4,9,8,0,1};
int k=3;
int minavg=Integer.MAX_VALUE;
int minIndex=0;
int sum=0;
int i=0;
for (int j = 0; j < a.length; j++) 
{
	if(j<i+k)
	{
		sum=sum+a[j];
//		System.out.println(sum);
	}
	else
	{
		if(sum<minavg)
		{
			minavg=sum;
			minIndex=i;
		}
		j=i;
		i++;
		sum=0;
	}
}
System.out.println(minIndex);
System.out.println(minavg/k);
	}
}


//int k=3;
//int minavg=Integer.MAX_VALUE;
