package companyImpQ;

public class q3SecondMax {

	public static void main(String[] args) {
		 int a[] = {9,8,9,7,4,3,32,6,12,5};
		    int largest = Integer.MIN_VALUE;
		    int secondLargest = Integer.MIN_VALUE;
		    for (int i = 0; i < a.length; i++) {
		        if (a[i] > largest) 
		        {
		        	secondLargest = largest;
		            largest = a[i];
		        } 
		        else if (a[i] > secondLargest && a[i] < largest) 
		        {
		            secondLargest = a[i];
		        }
		    }
		    System.out.println(secondLargest);
	}

}
