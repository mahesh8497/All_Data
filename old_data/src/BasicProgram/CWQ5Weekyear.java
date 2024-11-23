
package BasicProgram;
import java.util.Scanner;
public class CWQ5Weekyear {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
int num=sc.nextInt();
int y=num/365;
int r=num%365;
System.out.println(y+" year");
int m=r/30;
int r1=r%30;
System.out.println(m+" month");
int w=r1/7;
int d=r1%7;
System.out.println(w+" week");
System.out.println(d+" day");
	}

}
