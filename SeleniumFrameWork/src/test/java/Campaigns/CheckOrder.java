package Campaigns;

public class CheckOrder {

	public static void main(String[] args) 
	{
		int[] num= {5,0,0,0,0};
		for(int i=0;i<num.length-1;i++)
		{
			int val = num[0];
			for(int j=i+i;j<num.length;j++)
			{
				if(val>num[j])
				{
					int temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
				else
					System.out.println("Its in own place");
			}
		}
		
		
		
		{
			
		}

	}

}
