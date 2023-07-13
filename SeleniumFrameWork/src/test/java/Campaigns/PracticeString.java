package Campaigns;

public class PracticeString {

	public static void main(String[] args) 
	{
		String s="1a2c3d5e7";
		int sum=0;
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>'0' && s.charAt(i)<'9')
			{
				int val=s.charAt(i)-48;
				sum=sum+val;
			}
		}
		System.out.println(sum);

	}

}
