package Campaigns;

import java.util.HashSet;

public class CountWords {

	public static void main(java.lang.String[] args) 
	{ 
		
		String str="I am learning learning java java java programming";
		String[] s = str.split(" ");
		
		HashSet<String> st=new HashSet<String>();
		
		for(int i=0; i<s.length;i++)
		{
			
			st.add(s[i]);
		}
		
		for(String e:st)
		{ int count=0;
			for(int i=0;i<s.length;i++)
			{
				if(e.equals(s[i]))
				{
					
					count++;
				}
			}
			if(count>=1)
			{
				
				System.out.println(e+" "+count);
			}
		}
		
		
		

	}

}
