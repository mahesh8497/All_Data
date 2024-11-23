package june30MethodHWQ4;

public class Triangle {
	int side1;
	int side2;
	int side3;
	int angle1;
	int angle2;
	int angle3;
	Triangle(int side1,int side2,int side3,int angle1,int angle2,int angle3)
	{
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
		this.angle1=angle1;
		this.angle2=angle2;
		this.angle3=angle3;
	}
	void triangleperimeter()
	{
		System.out.println("Perimeter of Triangle ="+(side1+side2+side3) );
	}
	void trianglearea()
	{
		System.out.println("Area of Triangle = "+(0.5*side1*side2));
	}
	void isoscalesTriangle()
	{
		if(side1==side2&&side2==side3)
		System.out.println("Given Triangle is Equlateral Triangle");
		else if(side1==side2||side2==side3||side3==side1)
			System.out.println("Given Tiangle is Isoscales Triangle");
		else 
			System.out.println("No Isoscales  Triangle");
	}
	void rightangle()
	{
		if(angle1==90||angle2==90||angle3==90)
		
			System.out.println("Given Triangle is Right angle Triangle");
		else
			System.out.println("Not Right angle Triangle");
		
	}

}
