package August17;

public class leaderElement {

	public static void main(String[] args) {
		int[]a= {0,-2,12,2,33,2,3,-6};
		for (int i = 0; i < a.length; i++) 
		{
		int num=a[i];
		int count=0;
		for (int j = i+1; j < a.length; j++)
		{
			if(num<=a[j])
				count++;
			//break;
		}
		if(count==0)
			System.out.println(num);
		}
	}

}
