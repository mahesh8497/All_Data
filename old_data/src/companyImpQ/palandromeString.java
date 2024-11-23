package companyImpQ;
//string palandrome
public class palandromeString {
	public static void main(String[] args) {
		String s="asdd";
		int i = 0;
		int j=s.length()-1;
		for (; i < s.length()/2; i++)
		{
			if(s.charAt(i)!=s.charAt(j))
				break;
			j--;
		}
		if(i==s.length()/2)
			System.out.println("palindrom");
		else
			System.out.println("not");
	}

}
