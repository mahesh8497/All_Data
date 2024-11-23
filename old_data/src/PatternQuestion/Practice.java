package PatternQuestion;

class Foo{
	static String t="Foo";
}
class Bar extends Foo{
	void p() {
		System.out.println(Foo.t);
	}
}

public class Practice {
	public static void main(String[] args) {
		System.out.println(Bar.t);

		
	}

}
