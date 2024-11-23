package june30MethodCWQ1;
public class Vehical {
String color="Pink";
int wheelCount=6;
int gearsCount=4;
Vehical()
{
	System.out.println(color+" "+wheelCount+" "+gearsCount+" ");
}
Vehical(String color,int gearsCount)
{
	this();
	this.color=color;
	this.gearsCount=gearsCount;
	System.out.println("Updated= "+color+" "+gearsCount+" ");
}
}
