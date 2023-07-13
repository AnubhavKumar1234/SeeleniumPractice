package Campaigns;

public class Pattern2 {

	public static void main(String[] args) 
	{
		int l=5;
		for(int i=1;i<=l;i++)
		{
			for(int j=1;j<=l;j++)
			{
				if(i<=j)
				{
					System.out.print(" *");
				}
			}
			System.out.println(" ");
		}

	}

}
