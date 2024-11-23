package August18;

public class qBubbleSort {
	
	public static void main(String[] args) {
		 int[]a= {4,5,2,9,8,7,6,1};
		 for (int i = 0; i < a.length-1; i++) 
		 {
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j]>a[j+1]) {
					//swap 
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		 bubbleSort(a);

	}

	private static void bubbleSort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		
	}
}







//
//Complexity Analysis of Bubble Sort:
//Time Complexity: O(n^2)
//Auxiliary Space: O(1)



