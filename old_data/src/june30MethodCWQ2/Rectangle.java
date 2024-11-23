package june30MethodCWQ2;


public class Rectangle {
	int length=12;
	int width=10;

	Rectangle()
	{}
	Rectangle(int length,int width)
	{
		super();
		this.length=length;
		this.width=width;
	}
	void rectangleArea()
	{
	int a=length*width;
			System.out.println("Area of Rectangle= "+a);
}
	  void rectanglePerimeter()
	{
		int b=2*(length+width);
		System.out.println("Perimeter of Rectangle= "+b);
		
	}
}
