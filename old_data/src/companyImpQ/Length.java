package companyImpQ;

public class Length {
	
	public static void main(String[] args)
	{
		
		String s="this is bizarre and bizarre things happen often";
		
		int max =Integer.MIN_VALUE;
		String s2="";
		int index=0;
		String sa[]=s.split(" ");
		
		for (int i = 0; i < sa.length; i++)
		{
			String s1=sa[i];
			
			if(max<s1.length())
				{
				max=s1.length();
					s2=s1;
					index=i;
				}
		}
		
		System.out.println(s2+" "+index);
		
	}

}
