package recurtion;
//binary search
public class q6 {
	public static void main(String[] args) {
binary b=new binary();
int[] a= {1,2,3,4,5,6};
int n=a.length;
int x=2;
int result=b.binary(a,0,n-1,x);
if(result==-1)
	System.out.println("element not present");
else
	System.out.println("element found "+result);
	}
}
class binary{
	int binary(int a[],int l,int r,int x)
	{
		if(r>=-1)
		{
			int mid=1+(r-1)/2;
			if(a[mid]==x)
				return mid;
			if(a[mid]>x)
				return binary(a,1,mid-1,x);
			return binary(a,mid+1,r,x);
		}
		return -1;
	}
}