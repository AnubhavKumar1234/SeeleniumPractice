package dynamic;

import java.util.Scanner;

public class PallindromeNumber {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number1");
		int num = sc.nextInt();
		int nam = num;
		int rev=0;
		while(num>0)
		{
			int rem = num%10;
			rev=rev*10+rem;
			num=num/10;
			
		}
		if(rev==nam)
			System.out.println("It is a pallindrome number");
		else
			System.out.println("It is not a pallindome number");

	}

}
