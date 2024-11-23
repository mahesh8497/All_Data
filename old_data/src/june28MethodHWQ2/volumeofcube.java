package june28MethodHWQ2;

import java.util.Scanner;

public class volumeofcube {
	int height=0;
	int length=0;
	int width=0;
	public void calculatevolume()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the height, length ,width");
		int a=sc.nextInt();
				int b=sc.nextInt();
		int c=sc.nextInt();
		System.out.println("Volume of Cube is ="+(a*b*c));
	}

}
