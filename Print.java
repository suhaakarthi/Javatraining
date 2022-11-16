package Add;

public class Print
{
	public static void main(String[] args)
	{
		for(int row=1; row<=5; row++)
		{
		for(int num=1; num<=6-row; num++)
		{	
			System.out.print(num + " "); 
		}
		System.out.println();
		} 
	}
}
