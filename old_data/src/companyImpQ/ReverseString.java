
package companyImpQ;
import java.util.*;
import java.io.*;

public class ReverseString {

	public static void main(String[] args) {
		String s="asdfgh";
//		char a[]=s.toCharArray();
//		int j=a.length-1;
//		for (int i = 0; i <s.length()/2; i++) 
//		{
//			char temp=a[i];
//			a[i]=a[j];
//			a[j]=temp;
//			j--;
//		}
//		s=new String(a);
//		System.out.println(s);
		
		//second way
		String s1="";
		for (int i =s.length()-1; i >=0; i--)
		{
		  s1=s1+s.charAt(i);
		}
		System.out.println(s1);
			}

}
