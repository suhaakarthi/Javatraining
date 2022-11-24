package Add;

public class repeatedelement 
{
	public static void main(String[] args)
	{
		char[] name= {'s' ,'u','h','a','a','s','h','i','n','i'};
		boolean repeat = false; 
		for(int j =0; j<name.length-1; j++)
		{
		char key = name[j]; 
		for(int i=j+1; i<name.length; i++)
			{
		 if(key==name[i])
		 		{	System.out.println("First Repeated Element is "+ name[i]); 
		 			repeat = true; 
		 			break; 
		 		}
			}
		if(repeat == true)
		{
			break; 
		}
		}
	}
}
	
	

