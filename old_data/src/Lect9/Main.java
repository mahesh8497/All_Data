package Lect9;

public class Main {
public static void main(String[] args) 
{
//	Myclasss asd=new Myclasss();
//	Thread th=new Thread(asd);
//	th.run();
	
	Runnable runnable=()->{
		for(int i=1;i<=10;i++) {
			System.out.println("Heyy"+i);
		}
	};
	Thread th=new Thread(runnable);
	th.run();

}
}
