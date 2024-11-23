package companyImpQ;

public class SumOfNaturalNumber {
	public static void main(String[] args) {
	      
	    int sum = 0;
	    int n = 10;

	    for (int i = 1; i <= n; ++i) {
	    //for (int i = n; i >= 1; --i) {
	      //sum += i;     
	    	sum = sum + i;
	    }
	       
	    System.out.println("Sum = " + sum);
	  }
	}