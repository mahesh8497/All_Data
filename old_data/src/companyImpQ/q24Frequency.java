package companyImpQ;
public class q24Frequency {
	public static void main(String[] args) {
		String s="asdasdertsdaassssdwesfws";
int max=Integer.MIN_VALUE;
int min=Integer.MAX_VALUE;
char minChar='x';
char maxChar='y';
for (int i = 0; i <s.length(); i++) 
{
	int k = 0;
for (; k <i; k++) 
{
	if(s.charAt(k)==s.charAt(i))
		break;
}
if(k==i)
{
	int cnt=1;
	for (int j = i+1; j <s.length(); j++)
	{
	if(s.charAt(i)==s.charAt(j))	
		cnt++;
	}
	if(cnt>max)
	{
		max=cnt;
		maxChar =  s.charAt(i);
	}
	if(cnt<min)
	{	min=cnt;
		minChar = s.charAt(i);	
	}
	System.out.println(s.charAt(i)+" "+cnt);	
}}	
System.out.println("maximum character is " +maxChar+" "+max+" times");
System.out.println("manimum character is " +minChar+" "+min+" times");
}}

//char[]a1=s.toCharArray();
//int dupliCount=0;
//for (int i = 0; i < a1.length; i++) 
//{
//	for (int j = i+1; j < a1.length; j++)
//	{
//		if(a1[i]==a1[j])
//		{
//			dupliCount++;
//		break;
//		}
//	}
//}
//System.out.println(dupliCount);
//char[]a2=new char[a1.length-dupliCount];
//int[]a3=new int[a2.length];
//int index=0;
//for (int i = 0; i < a1.length; i++)
//{
//	int count=0;
//for (int j = 0; j < a2.length; j++) 
//{
//	if(a1[i]==a2[j])
//		count++;	
//}
//if(count==0)
//	a2[index++]=a1[i];
//}
//for (int i = 0; i < a2.length; i++)
//{
//	int count=0;
//for (int j = 0; j < a1.length; j++)
//{
//	if(a1[j]==a2[i])
//		count++;
//}	
//a3[i]=count;
//}
//for (int i = 0; i < a3.length; i++) 
//{
//for (int j = 0; j < a3.length; j++)
//{
//	if(i<j && a3[i]>a3[j])
//	{
//		int temp=a3[i];
//		a3[i]=a3[j];
//		a3[j]=temp;
//		char  temp1=a2[i];
//		a2[i]=a2[j];
//		a2[j]=temp1;
//	}
//
//}	 
//}
//for (int i = 0; i < a3.length; i++) 
//{
//System.out.println(a2[i]+" "+a3[i]);	
//}
//}
//
//}