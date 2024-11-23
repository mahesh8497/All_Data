package August17;

public class outrandinnerEle {

	public static void main(String[] args) {
		int[][]a= {{1,2,3,8},{1,8,7,6},{8,7,6,4}};
		int sum=0;
		for (int i = 0; i < a.length; i++) 
		{		
			for (int j = 0; j < a[i].length; j++) 
			{
			//if(j==0 || j==3||i==0||i==3)//outer
				if(j!=0 &&  j!=3 && i!=0 && i!=3)//inner 
				sum=sum+a[i][j];
				
			}
		}
		System.out.println(sum);
	}

}
