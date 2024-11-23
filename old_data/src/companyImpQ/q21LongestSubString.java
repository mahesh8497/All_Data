package companyImpQ;

public class q21LongestSubString {

	public static void main(String[] args) {
		String s = "maheshtakale";
		//String s1 = "";
		int index = 0;
		int len = 0;
		for (int i = 0; i < s.length(); i++) 
		{
			int j = i + 1;
			for (; j < s.length(); j++)
			{
				boolean presentelement = false;
				for (int k = i; k < j; k++) 
				{
					if (s.charAt(k) == s.charAt(j))
					{
						presentelement = true;
						break;
					}
				}
				if (presentelement)
					break;
			}
			if (j - i > len) {
				index = i;
				len = j - i;
			}

		}
		System.out.println(len);
		for (int i = index; i < index + len; i++) 
		{
			System.out.print( s.charAt(i));
		}
	}

}
