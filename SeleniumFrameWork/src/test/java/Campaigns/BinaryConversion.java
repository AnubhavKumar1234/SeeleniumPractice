package Campaigns;

import java.util.Scanner;

public class BinaryConversion {

	public static void main(String[] args) 
	{
		int rem=0;
		int rev=0;
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");	
		int a=sc.nextInt();
		
		while(a>0)
		{
			rem=a%2;
			if(rem==1)
			{
				count++;
			}
			rev=rev*10+rem;
			a=a/2;
		}
		System.out.println(rev);
		System.out.println("Display the no of 1 present in Binary="+count);
	}

}
