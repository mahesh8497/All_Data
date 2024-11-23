package companyImpQ;

public class RemovedupliCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//remove duplicate character
		String s="aasdfghj";
		String s1="";
		for (int i = 0; i < s.length(); i++) 
		{
		int rank=0;
		for (int j = 0; j <i; j++) 
		{
			if(s.charAt(i)==s.charAt(j))
			{
				rank++;
				break;
			}
		}
		if(rank==0)
			s1=s1+s.charAt(i);
		}
		System.out.println(s1);
	}

}
