package dynamic;

import java.util.Scanner;

public class PallindromeString {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Word");
		String ch = sc.next();
		String chac = ch;
		
		String rev="";
		for(int i=ch.length()-1;i>=0;i--)
		{
			rev=rev+ch.charAt(i);
		}
		System.out.println(rev);
		if(rev==chac)
			System.out.println("It is a pallindome");
		else
			System.out.println("It is not a pallindome");

	}

}
