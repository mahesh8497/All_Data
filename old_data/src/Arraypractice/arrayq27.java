package Arraypractice;
import java.util.Iterator;
public class arrayq27 {

	public static void main(String[] args) {
 
 char[]a1= {'a','b','d'};
 char[]a2= {'c','e'};
 char[] a3=new char[a1.length+a2.length];
 int index=0;
 for (int i = 0; i<a1.length|| i<a2.length; i++) 
 {
	if(i<a1.length)
		a3[index++]=a1[i];
	if(i<a2.length)
		a3[index++]=a2[i];
}
 for (int i = 0; i < a3.length; i++)
 {
	System.out.print(a3[i]+" ");
}
	}
}
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
//int[] a1= {1,2,3};
//int[] a2= {4,5};
// int[]a3=new int[a1.length+a2.length];
// int index=0;
// for (int i = 0; i < a1.length||i<a2.length; i++) 
// {
//	 if(i<a1.length)
//		 a3[index++]=a1[i];
//	 if(i<a2.length)
//		 a3[index++]=a2[i];
//}
// for (int i = 0; i < a3.length; i++) 
// {
//System.out.print(a3[i]+" ");	
//}
//	}
//
//}
