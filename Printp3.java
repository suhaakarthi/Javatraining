package Add;

public class Printp3 
{public static void main(String[] args)
   {
	for(int row=1; row<=5; row++)
	{

		for(int col= 1; col<=5-row; col++)
			{
			System.out.print(col+" "); 
			}
		for(int col=1; col<=row;col++)
			System.out.print(1+ " "); 
	System.out.println(); 
	} 
}
}
