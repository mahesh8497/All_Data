package companyImpQ;
import java.util.*;
public class AnagramString {
	public static void main(String[] args) {
		String a="mahesh ma i";
		String b="i am mahesh";	
boolean isanagram=false;
boolean visited[]=new boolean[b.length()];
if(a.length()==b.length())
{
for (int i = 0; i <a.length(); i++)
{
char c=a.charAt(i);
 isanagram=false;
for (int j = 0; j <b.length(); j++)
{
if(b.charAt(j)==c && !visited[j]) 
{
	visited[j]=true;
	isanagram=true;
break;
}}
if(!isanagram)
{
	break;
}}}
if(isanagram)
{
	System.out.println("anagram");
}
else
{
	System.out.println("not amagram");
}
}}
//}
	
	
//	boolean isanagram=true;
//	int [] al=new int[256];
//	for(char c:a.toCharArray())
//	{
//		int index=(int)c;
//		al[index]++;
//	}
//	for(char c:b.toCharArray())
//	{
//		int index=(int)c;
//		al[index]--;
//	}
//	for (int i = 0; i <256; i++)
//	{
//	if(al[i]!=0)
//	{
//		isanagram=false;
//	}
//	}
//	
//	if(isanagram)
//	{
//		System.out.println("anagram");
//	}
//	else
//	{
//		System.out.println("not anagram");
//	}
//
//}
//	}



//third way

//s1=s1.toLowerCase();
//s2=s2.toLowerCase();
//String s3="";
//String s4="";
//for (int i = 0; i < s1.length(); i++) 
//{
//	if(s1.charAt(i)!=' ')
//		s3=s3+s1.charAt(i);
//}
//for (int i = 0; i < s2.length(); i++) 
//{
//	if(s2.charAt(i)!=' ')
//		s4=s4+s2.charAt(i);
//}
//System.out.println(s3);
//System.out.println(s4);
//int count=0;
//int b[]=new int[s4.length()];
//if(s3.length()==s4.length())
//{
//for (int i = 0; i < s3.length(); i++) 
//{
//	for (int j = 0; j < s4.length(); j++) 
//	{
//		if(s3.charAt(i)==s4.charAt(j) && b[j]==0 )
//		{
//			b[j]=1;
//			count++;
//			break;
//		}
//	}
//}
//}
//else
//	System.out.println("not anagram");
//System.out.println(Arrays.toString(b));
//if(count==s4.length())
//	System.out.println("Anagram");
//else
//	System.out.println("not Anagram");
//}
//}

