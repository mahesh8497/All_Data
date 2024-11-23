package companyImpQ;
import java.util.*;
import java.util.Scanner;

public class StringNoAdd {


    public static void main(String[] args)
    {
        Scanner sr = new Scanner(System.in);
        String s ="12as11asd123";
  int temp=0;
  String s1="";
        for(int i=0;i<s.length();i++) 
        { 
                    if(s.charAt(i)>='0' && s.charAt(i)<='9') 
                    {
                        s1=s1+s.charAt(i);
                    }
                    else 
                    { 
                        if(s1.length()>0)
                        	 temp= temp+Integer.parseInt(s1);  
                            s1=""; 
                    } 
            }
            if(s1.length()>0)
            	 temp= temp+Integer.parseInt(s1);  
            System.out.println( temp);
        }
}