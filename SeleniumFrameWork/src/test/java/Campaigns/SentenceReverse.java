package Campaigns;

public class SentenceReverse {

	public static void main(String[] args) 
	{
		String str="Google is my next company";
		String[] st = str.split(" ");
		String rev = "";
		for(int i=st.length-1;i>=0;i--)
		{
			rev=rev+st[i];
		}
		System.out.print(rev);

	}

}
