package Campaigns;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i=2;i<=num;i++)
		{
			for(int j=1;j<=10;j++)
			{
				System.out.println(i+"*"+j+"="+i*j);
			}
			System.out.println("------------");
		}

	}

}
