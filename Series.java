package practise;

public class Series 
{
	int logicOfSequence(int N)
	{
	    if (N % 2 == 0)
	        N = N * N;   
	    else
	        N = N * N * N;  
	    return N;
	}
	 
	// Driver Method
	public static void main(String[] args)
	{
	    int N = 6;
	    System.out.println(N);
	    
	}
}


	
	


