package FunctionalInterface;

public class Launch {
public static void main(String[] args) {
	Employee sd = ()->"Software Enginner";
	System.out.println(sd.getNmae());
	Employee ed= ()->"edit";
	System.out.println(ed.getNmae());
	
}
}
