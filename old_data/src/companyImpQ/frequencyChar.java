package companyImpQ;
import java.util.*;
public class frequencyChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the statement");
		String s = sc.nextLine();
		
		String s1="";
		
		for (int i = 0; i < s.length(); i++) {
				char temp=s.charAt(i);
				for (int j = 0; j < s1.length(); j++) {
					if(!s.contains(s1))
					{
						s1=s1+s.charAt(i);
					}
					
				}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int i = 0;
//		char s[]=str.toCharArray();
//		do
//		{
//			try {
//				
//				for (; i < s.length; i++) {
//					char temp=s[i];
//					int count=0;
//					for (int j = i; j < s.length; j++)
//					{
//					if((temp==s[j]))
//						count++;
//					}
//					if(count!=0)
//					{
//						System.out.println(temp+" "+count+" times");
//						
//					}
//				}
//				
////				str=str.replace(" "+s[0], "");
//				
//			}
//			catch (Exception e) 
//			{
//				// TODO: handle exception
//				System.out.println(e);
//			}
//		}
//		while(i!=s.length);
//	
//	

	}

}
