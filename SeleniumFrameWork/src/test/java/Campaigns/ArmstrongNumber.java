package Campaigns;
import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int count=0;
		int sum=0;
		for(int i=1;i<1000;i++)
		{
		int a=i;
		int b=a;
		int arms=a;
		while(a>0)
		{
			a=a/10;
			count++;
		}
		//System.out.println("count of a numer="+count);
		for(;b>0;b=b/10)
		{
			int rem=b%10;
			int x=count;
			int multi=1;
			while(x>0)
			{
				multi=multi*rem;
				x--;
			}
			sum=sum+multi;
		}
		//System.out.println(sum);
		if(arms==sum)
		{
			System.out.println("It is armstrong number"+sum);
		}
		count=0;
		sum=0;
	}
	
		
	}

}

	  
	  
		

	
