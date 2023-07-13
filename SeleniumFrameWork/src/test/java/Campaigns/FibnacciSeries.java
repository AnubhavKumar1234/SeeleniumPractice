package Campaigns;

public class FibnacciSeries {

	public static void main(String[] args) 
	{
		int i=0;
		int j=1;
		int c;
		
		for(int k=1;k<10;k++)
		{
			System.out.println(i);
			c=i+j;
			i=j;
			j=c;
		}

	}

}
