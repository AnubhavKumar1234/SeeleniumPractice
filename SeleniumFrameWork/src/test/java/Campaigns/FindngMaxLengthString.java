package Campaigns;

public class FindngMaxLengthString {

	public static void main(String[] args) 
	{
		String s[]= {"environment","happy","healthy","bewakoof"};
		
		String len=s[0];
		for(int i=1;i<s.length;i++)
		{
			if( len.length()>s[i].length())
			{
				len=s[i];
			}
		}
		System.out.println(len);
		

	}

}
