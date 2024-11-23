package june30MethodHWQ1;

public class Room
{
	int length;
	int width;
	int height;
	Room()	
	{}
Room(int length,int width,int height)
{
	this.length=length;
	this.width=width;
	this.height=height;
}
 float whiteWashingArea()
 {
	 return((2*length*height)+(2*width*height)+(length*width));
 }
 double whiteWashingCost() 
 {
	 return(2*length*height)+(2*width*height)+(length*width)*80;
 }
 double geometricflooring()
 {
	 return(length*width)*200;
 }
 double cementflooring ()
 {
	 return(length*width)*100;
 }
}
