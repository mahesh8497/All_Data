package Arraypractice;

import java.util.ArrayList;

//duplicate element remove
public class arrayq11duplicateele {

	public static void main(String[] args) {
int[] a= {1,2,3,4,3,2,3,1,3,5,7,8,8};
int count=0;
//System.out.println();
System.out.println("After removing duplicate element ");
for (int i = 0; i < a.length; i++) 
{
	for (int j = i+1; j < a.length; j++) 
	{
		if(a[i]==a[j]) 
		{
			count++;
			break;
		}
	}
}
System.out.println(count);
//System.out.println();
int[] b=new int[a.length-count];//duplicate element remove
int index=0;
for (int i = 0; i < a.length; i++)
{
	int rank=1;
	for (int j = 0; j <i; j++) 
	{
		if(a[i]==a[j])
			rank++;
	}
	if(rank==1)
	{
		b[index++]=a[i];
	}
}
	for (int i = 0; i < b.length; i++)
	{
		System.out.print(b[i]+" ");
	}
	
	
	
	System.out.println();
	System.out.println(">>>>>>>>>>>>ArrayList remove duplicate<<<<<<<<<<<<<<< ");
	ArrayList<Integer>al= new ArrayList<Integer>();
	al.add(12);
	al.add(11);
	al.add(12);
	al.add(13);
	al.add(11);
	al.add(14);
	ArrayList<Integer>uniq=new ArrayList<>();
	for(int v:al) {
		if(!uniq.contains(v))
	{
			uniq.add(v);
			}
	}

	System.out.println(uniq);
	
	
	
	}
}

	


//1.count duplicate element and break 
//2. create new array (new array-count)
//3. take rank=1 