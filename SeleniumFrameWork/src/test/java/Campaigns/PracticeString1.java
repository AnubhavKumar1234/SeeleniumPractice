package Campaigns;

public class PracticeString1 {

	public static void main(String[] args) 
	{
		String s="1a2c3d5";
		int sum=0;
		int tsum=0;
		
		for(int i=0;i<s.length();i++)
			
		{
			if(s.charAt(i)>'0' && s.charAt(i)<'9')
			{
				
				int val=s.charAt(i)-48;
				sum=sum*10+val;
			}
			else
			{
				tsum=tsum+sum;
			
			}
		
		}
		System.out.println(tsum);
		

	}

}
