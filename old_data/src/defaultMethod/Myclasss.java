package defaultMethod;

interface parent {
	default void hello() {
		System.out.println("Hello");
	}

}
class child implements parent
{
	public void hello() {
		System.out.println("child say hello");
	}
}

public class Myclasss {
public static void main(String[] args) {
	parent c=new child();
	c.hello();
}
}
