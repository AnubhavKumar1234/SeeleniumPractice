package Campaigns;

import java.util.Scanner;

public class PrintVr {

	public static void main(String[] args) 
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.println("******Enter any number******");
		int n= sc.nextInt();
		int count=1;
		int x=n&(n-1);
		
		while(x!=0)
		{
			count++;
			x=x&(x-1);
		}
		System.out.println(count);
	}

}
