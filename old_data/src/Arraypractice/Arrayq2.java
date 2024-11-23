package Arraypractice;
public class Arrayq2 {

	public static void main(String[] args) {
int[]a= {1,2,3,4,5,6};
int num=6;
boolean presentValue=true;
for (int i = 0; i < a.length; i++) 
{
	if (a[i]==num)
		presentValue=false;
}
if (presentValue)
	System.out.println("Given Value is not present in ARRAY");
else 
	System.out.println("Given value is  present in Array");
	
	}
}

//Scanner sc=new Scanner(System.in);
//int[] a= {1,2,3,4,5,6,7};
//System.out.println("Enter the element check presen or not ");
//int num=sc.nextInt();
//boolean presentInArray=false;
//for (int i = 0; i < a.length; i++)
//{
//if(num==a[i])
//	presentInArray=true;
//}
//if (presentInArray)
//	System.out.println("Given Value is Present");
//else 
//	System.out.println("Given value is not present");













//}
//}