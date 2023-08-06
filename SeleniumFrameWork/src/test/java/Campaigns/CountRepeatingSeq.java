package Campaigns;

public class CountRepeatingSeq {

	public static void main(String[] args) 
	{
		String s="AABnABAAB";
		char[] arr = s.toCharArray();
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			
			if(arr[i]=='A' && arr[i+1]=='A' && arr[i+2]=='B')
			{
				count++;
			}
			
				
		}
		System.out.println(count);
		
		

	}

}
