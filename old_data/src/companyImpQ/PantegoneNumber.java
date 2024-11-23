package companyImpQ;
import java.util.*;
class Pentagonal {int pentagonl(int n) 
	{
   return (3*n*n - n)/2; 
} 
}
public class PantegoneNumber 
{ 
public static void main(String[] args) 
{ 
	Pentagonal obj = new Pentagonal(); 
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number ");
    int n = sc.nextInt();     
    System.out.printf(" petagonal number is = "+ obj.pentagonl(n)); 
} 

}


