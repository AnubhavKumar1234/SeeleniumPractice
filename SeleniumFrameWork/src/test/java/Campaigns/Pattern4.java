package Campaigns;

public class Pattern4 {

	public static void main(String[] args) 
	{
		int l=5;
		for(int i=0;i<l;i++)
		{
			for(int j=0;j<l;j++)
			{
				if( j==0 || i==0 ||  i==4)
				{
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println(" ");
		}
		
		System.out.println("----------------------");
		for(int i=0;i<l;i++)
		{
			for(int j=0;j<l;j++)
			{
				if( j==4 || j==0 ||  i==2)
				{
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println(" ");
		}
		
		System.out.println("----------------------");
		for(int i=0;i<l;i++)
		{
			for(int j=0;j<l;j++)
			{
				if( j==4 || j==0 ||  i==2)
				{
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println(" ");
		}
		
		System.out.println("----------------------");
		for(int i=0;i<l;i++)
		{
			for(int j=0;j<l;j++)
			{
				if( j==4 || j==0 ||  i==4 || i==0)
				{
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println(" ");
		}
		
		System.out.println("----------------------");
		for(int i=0;i<l;i++)
		{
			for(int j=0;j<l;j++)
			{
				if( j==2   || i==0)
				{
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println(" ");
		}
		
		System.out.println("----------------------");
		for(int i=0;i<l;i++)
		{
			for(int j=0;j<l;j++)
			{
				if( j==4   || i==4 || j==0)
				{
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println(" ");
		}

	}

}
